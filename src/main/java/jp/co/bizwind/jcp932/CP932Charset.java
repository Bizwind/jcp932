package jp.co.bizwind.jcp932;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * <p>Charset class for cp932 encoding and decoding.
 * This class will just delegate the process to 'Windows-31J' charset.</p>
 *
 * @author Ryohei Morita
 */
public class CP932Charset extends Charset {

    private final Charset WIN31J_CHARSET = Charset.forName("Windows-31J");

    public CP932Charset(String canonicalName, String[] aliases) {
        super(canonicalName, aliases);
    }

    public boolean contains(Charset cs) {
        return cs.equals(WIN31J_CHARSET) || WIN31J_CHARSET.contains(cs);
    }

    public CharsetDecoder newDecoder() {
        return WIN31J_CHARSET.newDecoder();
    }

    public CharsetEncoder newEncoder() {
        return WIN31J_CHARSET.newEncoder();
    }

}
