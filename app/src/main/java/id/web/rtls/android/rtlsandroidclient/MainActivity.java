package id.web.rtls.android.rtlsandroidclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private String rtlsUrl = "https://medium.com/";
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.rtls_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(rtlsUrl);
        webView.setHorizontalScrollBarEnabled(false);
    }
}
