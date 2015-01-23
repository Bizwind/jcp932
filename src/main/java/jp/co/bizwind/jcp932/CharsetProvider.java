package jp.co.bizwind.jcp932;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Charset service-provider class used for cp932 charset.</p>
 *
 * @author Ryohei Morita
 */
public class CharsetProvider extends java.nio.charset.spi.CharsetProvider {

    private static final String CHARSET_NAME = "CP932";
    private final Charset cp932_charset = new CP932Charset("CP932", new String[]{});
    private final List charsets;

    public CharsetProvider() {
        charsets = Arrays.asList(new Object[] { cp932_charset });
    }

    /**
	 * {@inheritDoc}
	 */
	public Charset charsetForName(String charsetName) {
	    if (charsetName.equalsIgnoreCase(CHARSET_NAME)) {
	        return cp932_charset;
	    }
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	public Iterator charsets() {
		return charsets.iterator();
	}

}
