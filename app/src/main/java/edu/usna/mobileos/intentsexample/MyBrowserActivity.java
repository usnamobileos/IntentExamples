package edu.usna.mobileos.intentsexample;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by pepin on 2/19/15.
 */

public class MyBrowserActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browser);

        Uri url = getIntent().getData();
        WebView webView = (WebView) findViewById(R.id.WebView01);
        webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading (WebView view, String url){
                    return (false);
                }
            }
        );
        webView.loadUrl(url.toString());
    }

}
