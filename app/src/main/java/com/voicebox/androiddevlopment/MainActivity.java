package com.voicebox.androiddevlopment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputMessage;
    private EditText keywordEntry;
    private TextView resultMessage;
    private RadioGroup encodeGroup;
    private RadioButton encodeOption;
    private RadioButton decodeOption;
    private Button buttonCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Init UI Component
        initUiComponents();

        //Calculate Result
        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Perform Encoding / Decoding Operation
                executeEncodeDecodeOperation();
            }
        });
    }


    private void initUiComponents() {
        inputMessage = (EditText) findViewById(R.id.inputMessage);
        keywordEntry = (EditText) findViewById(R.id.keywordEntry);
        resultMessage = (TextView) findViewById(R.id.resultMessage);
        encodeGroup = (RadioGroup) findViewById(R.id.encodeGroup);
        encodeOption = (RadioButton) findViewById(R.id.encodeOption);
        decodeOption = (RadioButton) findViewById(R.id.decodeOption);
        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);
    }

    private void executeEncodeDecodeOperation() {
        boolean isValidMessage = validateInputField(inputMessage.getText().toString());
        if (!isValidMessage){
            inputMessage.setError(getString(R.string.strErrorInputMessage));
        }

        boolean isValidKeyword = validateInputField(keywordEntry.getText().toString());
        if (!isValidKeyword){
            keywordEntry.setError(getString(R.string.strErrorInputKeyword));
        }

        if (isValidMessage && isValidKeyword) {

            //TODO: perform Encoding / Decoding Operation
        }
    }

    private boolean validateInputField(String inputString) {
        return !TextUtils.isEmpty(inputString);
    }
}
