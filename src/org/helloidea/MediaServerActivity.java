package org.helloidea;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MediaServerActivity extends Activity implements OnClickListener {


	private Button button;
	private LinearLayout mainlayout;
	private MediaPlayer mp;

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * メインレイアウト生成
         */
        mainlayout = new LinearLayout(this);

        /*
         * レイアウト登録
         */
        setContentView(mainlayout);

        mainlayout.setOrientation(LinearLayout.VERTICAL);		// 縦向き
        mainlayout.setGravity(Gravity.LEFT);

        /*
         * ボタン生成
         */
        button = new Button(this);
        button.setText("Hello!!");
        button.setOnClickListener(this);

        mainlayout.addView(button);

    }

	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

		mainlayout.addView(makeLabel("HAHAHA"));

		mp = MediaPlayer.create(this, R.raw.test);
		mp.start();

	}

	private TextView makeLabel(String string) {

		TextView label = new TextView(this);
		label.setText(string);

		return label;

	}


}
