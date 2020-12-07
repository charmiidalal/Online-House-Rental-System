///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Business.SendSMS;
//
//import com.twilio.sdk.TwilioRestClient;
//import com.twilio.sdk.TwilioRestException;
//import com.twilio.sdk.resource.factory.MessageFactory;
//import com.twilio.sdk.resource.instance.Message;
//import java.util.ArrayList;
//import java.util.List;
//import org.apache.http.NameValuePair;
//import org.apache.http.message.BasicNameValuePair;
//
///**
// *
// * @author charmi
// */
//public class SendSMS {
//
//    public static final String ACCOUNT_SID = "AC0be691496ae4f8904f0577602229fb2a";
//    public static final String AUTH_TOKEN = "57bbcdc7e10da6535ff056ae5e320b79";
//    public final String fromNum = "+12512558071";
//    public String toNum;
//    public String body;
//
//    public SendSMS(String toNum, String body) {
//        this.toNum = toNum;
//        this.body = body;
//        try {
//            TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);
//
//            List<NameValuePair> params = new ArrayList<>();
//            params.add(new BasicNameValuePair("Body", body));
//            params.add(new BasicNameValuePair("To", toNum));
//            params.add(new BasicNameValuePair("From", fromNum));
//
//            MessageFactory messageFactory = client.getAccount().getMessageFactory();
//            Message message = messageFactory.create(params);
//            System.out.println(message);
//        } catch (TwilioRestException e) {
//            System.out.println(e);
//        }
//    }
//
//}
