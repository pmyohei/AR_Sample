package com.ar.ar_programming.process;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import com.ar.ar_programming.R;


/*
 * 開始処理ブロック
 */
public class StartBlock extends ProcessBlock {

    //---------------------------
    // 定数
    //----------------------------

    //---------------------------
    // フィールド変数
    //----------------------------

    /*
     * コンストラクタ
     */
    public StartBlock(Context context) {
        this(context, (AttributeSet)null);
    }
    public StartBlock(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }
    public StartBlock(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        View.inflate(context, R.layout.process_block_start, this);

        // 初期化
        init();
    }

    /*
     * 初期化処理
     */
    private void init() {
        // ロングクリック無効
        setOnLongClickListener( null );

        // onDragリスナーの設定
        setDragAndDropListerner();
    }


}