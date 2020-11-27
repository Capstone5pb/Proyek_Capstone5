package com.example.proyekcapstone;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.example.berita.R;


public class OpenNewsActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;

    private TextView tvTitleDetail;
    private TextView tvContentDetail;
    private TextView tvPublishedDetail;
    private TextView tvAuthorDetail;
    private ImageView ivImageDetail;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_news);

        setupToolbar();

        mProgressBar = findViewById(R.id.progress_bar);
        mProgressBar.setMax(100);

        tvTitleDetail = findViewById(R.id.tv_title_detail);
        tvContentDetail = findViewById(R.id.tv_content_detail);
        tvPublishedDetail = findViewById(R.id.tv_published_detail);
        tvAuthorDetail = findViewById(R.id.tv_author_detail);
        ivImageDetail = findViewById(R.id.iv_image_detail);

        tvTitleDetail.setText(getIntent().getStringExtra("title"));
        tvContentDetail.setText(getIntent().getStringExtra("content"));
        tvPublishedDetail.setText(getIntent().getStringExtra("published"));
        tvAuthorDetail.setText(getIntent().getStringExtra("author"));
        Glide.with(  OpenNewsActivity.this).load(getIntent().getStringExtra( "image"))
                .into(ivImageDetail);

        mProgressBar.setVisibility(View.GONE);
    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.tbOpenNews);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (mWebView.canGoBack()) {
//                    mWebView.goBack();
//                } else {
//                    finish();
//                }
//            }
//        });
    }
}