package com.ericwamari.mpesapal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;



/**
 * A simple {@link Fragment} subclass.
 */
public class CalcFragment extends Fragment {

    public CalcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View RootView = inflater.inflate(R.layout.fragment_calc, container, false);

        final EditText editTextAmount = RootView.findViewById(R.id.editTextAmount);
        final TextView textViewRegisteredToSendAmt = RootView.findViewById(R.id.textViewRegisteredToSendAmt);
        final TextView textViewUnRegisteredToSendAmt = RootView.findViewById(R.id.textViewUnRegisteredToSendAmt);
        final TextView textViewAgentWithdrawalAmt = RootView.findViewById(R.id.textViewAgentAmt);
        final TextView textViewMinBalRegAmt = RootView.findViewById(R.id.textViewMinBalRegAmt);
        final TextView textViewMinBalUnRegAmt = RootView.findViewById(R.id.textViewMinBalUnRegAmt);
        final TextView textViewMinBalRegSenderAmt= RootView.findViewById(R.id.textViewMinBalRegSenderAmt);
        final TextView textViewMinBalUnRegSenderAmt = RootView.findViewById(R.id.textViewMinBalUnRegSenderAmt);
        final TextView textViewSuggestedAmt = RootView.findViewById(R.id.textViewSuggestedAmt);



        editTextAmount.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String tvValue = editTextAmount.getText().toString();
                int amount = Integer.parseInt(tvValue);
                int transferFeeReg, transferFeeUnReg, agentWithdrawal;
                int minReg, minUnReg, minRegSend, minUnRegSend;
                int suggested;

                    if (amount >=1 && amount<=49) {
                        transferFeeReg = 0;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        transferFeeUnReg = 0;
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 0;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));

                    }else if(amount>=50 && amount<=100){
                        transferFeeReg = 0;
                        transferFeeUnReg = 0;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 10;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if(amount>=101 && amount<=500){
                        transferFeeReg = 11;
                        transferFeeUnReg = 44;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 27;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if (amount>=501 && amount<=1000){
                        transferFeeReg = 15;
                        transferFeeUnReg = 48;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 27;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=1001 && amount<=1500){
                        transferFeeReg = 25;
                        transferFeeUnReg = 58;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal =270;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=1501 && amount<=2500){
                        transferFeeReg = 40;
                        transferFeeUnReg = 73;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 27;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=2501 && amount<=3500){
                        transferFeeReg = 55;
                        transferFeeUnReg = 110;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 49;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=3501 && amount<=5000){
                        transferFeeReg = 60;
                        transferFeeUnReg = 132;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 66;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if(amount>=5001 && amount<=7500){
                        transferFeeReg = 75;
                        transferFeeUnReg = 163;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 82;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=7501 && amount<=10000){
                        transferFeeReg = 85;
                        transferFeeUnReg = 201;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 110;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=10001 && amount<=15000){
                        transferFeeReg = 95;
                        transferFeeUnReg = 260;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 159;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if (amount>=15001 && amount<=20000){
                        transferFeeReg = 100;
                        transferFeeUnReg = 282;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 176;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else if(amount>=20001 && amount<=25000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 187;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if(amount>=25001 && amount<=30000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 187;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if(amount>=30001 && amount<=35000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText(String.valueOf(transferFeeUnReg));
                        agentWithdrawal = 187;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        minUnReg = amount+transferFeeUnReg;
                        textViewMinBalUnRegAmt.setText(String.valueOf(minUnReg));
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        minUnRegSend = amount+transferFeeUnReg+agentWithdrawal;
                        textViewMinBalUnRegSenderAmt.setText(String.valueOf(minUnRegSend));
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));

                    }else if(amount>=35001 && amount<=40000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText("Max is 35,000.00");
                        agentWithdrawal = 275;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        textViewMinBalUnRegAmt.setText("Max is 35,000.00");
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        textViewMinBalUnRegSenderAmt.setText("Max is 35,000.00");
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if(amount>=40001 && amount<=45000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText("Max is 35,000.00");
                        agentWithdrawal = 275;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        textViewMinBalUnRegAmt.setText("Max is 35,000.00");
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        textViewMinBalUnRegSenderAmt.setText("Max is 35,000.00");
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }else if(amount>=45001 && amount<=50000) {
                        transferFeeReg = 110;
                        transferFeeUnReg = 303;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText("Max is 35,000.00");
                        agentWithdrawal = 275;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        textViewMinBalUnRegAmt.setText("Max is 35,000.00");
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        textViewMinBalUnRegSenderAmt.setText("Max is 35,000.00");
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    } else{
                        transferFeeReg = 110;
                        textViewRegisteredToSendAmt.setText(String.valueOf(transferFeeReg));
                        textViewUnRegisteredToSendAmt.setText("Max is 35,000.00");
                        agentWithdrawal = 330;
                        textViewAgentWithdrawalAmt.setText(String.valueOf(agentWithdrawal));
                        minReg = amount+transferFeeReg;
                        textViewMinBalRegAmt.setText(String.valueOf(minReg));
                        textViewMinBalUnRegAmt.setText("Max is 35,000.00");
                        minRegSend = amount+transferFeeReg+agentWithdrawal;
                        textViewMinBalRegSenderAmt.setText(String.valueOf(minRegSend));
                        textViewMinBalUnRegSenderAmt.setText("Max is 35,000.00");
                        suggested = amount+agentWithdrawal;
                        textViewSuggestedAmt.setText(String.valueOf(suggested));
                    }
            }
            @Override
            public void afterTextChanged(Editable s) {

            }
        });

//        String amount = editTextAmount.getText().toString();
//        int amountX = Integer.parseInt(amount);
//
//        if(amountX>=100 && amountX<=1500){
//            textViewRegisteredToSendAmt.setText("27.00");
//        }

       return RootView;



    }

}
