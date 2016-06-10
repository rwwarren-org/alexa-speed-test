package com.wrixton.alexa;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import org.apache.jmeter.JMeter;

import java.util.Timer;
import java.util.TimerTask;

public class SpeedTest implements RequestHandler<Request, Response> {

    public static void main(String[] args) {
        new SpeedTest().handleRequest(new Request(), null);
    }

    public String handler(String myCount, Context context) {
        String awsRequestId = context.getAwsRequestId();
        return "myCount: " + myCount + ". aws: " + awsRequestId;
    }

    public Response handleRequest(Request request, Context context) {
//        SpeedTestSocket speedTestSocket = new SpeedTestSocket();
//        SpeedTestReport liveUploadReport = speedTestSocket.getLiveUploadReport();
//        SpeedTestReport liveDownloadReport = speedTestSocket.getLiveDownloadReport();
//        float uploadTransferRateBit = liveUploadReport.getTransferRateBit();
//        float downloadTransferRateBit = liveDownloadReport.getTransferRateBit();
//        System.out.println("download: " + downloadTransferRateBit);
//        System.out.println("upload: " + uploadTransferRateBit);
        String greetingString = String.format("Hello %s %s.", request.firstName, request.lastName);
//        testing();
//        JMeter jMeter = new JMeter();
        return new Response(greetingString);
    }

//    public void testing() {
//        final Timer timer = new Timer();
//
//        /* instanciate speed test */
//        final SpeedTestSocket speedTestSocket = new SpeedTestSocket();
//
//        /* add a listener to wait for speed test completion and progress */
//        speedTestSocket.addSpeedTestListener(new ISpeedTestListener() {
//
//            public void onDownloadPacketsReceived(long packetSize, float transferRateBitPerSeconds, float transferRateOctetPerSeconds) {
//            }
//
//            public void onDownloadError(SpeedTestError speedTestError, String errorMessage) {
//                if (speedTestError != SpeedTestError.FORCE_CLOSE_SOCKET) {
//                    if (timer != null) {
//                        timer.purge();
//                        timer.cancel();
//                    }
//                }
//            }
//
//            public void onUploadPacketsReceived(long packetSize, float transferRateBitPerSeconds, float transferRateOctetPerSeconds) {
//            }
//
//            public void onUploadError(SpeedTestError speedTestError, String errorMessage) {
//                if (speedTestError != SpeedTestError.FORCE_CLOSE_SOCKET) {
//                    if (timer != null) {
//                        timer.purge();
//                        timer.cancel();
//                    }
//                }
//            }
//
//            public void onDownloadProgress(float percent, SpeedTestReport downloadReport) {
//            }
//
//            public void onUploadProgress(float percent, SpeedTestReport uploadReport) {
//            }
//        });
//
//        TimerTask task = new TimerTask() {
//
//            @Override
//            public void run() {
//
//                if (speedTestSocket.getSpeedTestMode() == SpeedTestMode.UPLOAD) {
//
//                    SpeedTestReport uploadReport = speedTestSocket.getLiveUploadReport();
//                    System.out.println("---------------current upload report--------------------");
//                    System.out.println("progress             : " + uploadReport.getProgressPercent() + "%");
//                    System.out.println("transfer rate bit    : " + uploadReport.getTransferRateBit() + "b/s");
//                    System.out.println("transfer rate octet  : " + uploadReport.getTransferRateOctet() + "B/s");
//                    System.out.println("uploaded for now     : " + uploadReport.getTemporaryPacketSize()
//                            + "/" + uploadReport.getTotalPacketSize());
//                    System.out.println("amount of time       : " +
//                            ((uploadReport.getReportTime() - uploadReport.getStartTime()) / 1000) + "s");
//                    System.out.println("--------------------------------------------------------");
//
//                } else if (speedTestSocket.getSpeedTestMode() == SpeedTestMode.DOWNLOAD) {
//
//                    SpeedTestReport downloadReport = speedTestSocket.getLiveDownloadReport();
//                    System.out.println("---------------current download report--------------------");
//                    System.out.println("progress             : " + downloadReport.getProgressPercent() + "%");
//                    System.out.println("transfer rate bit    : " + downloadReport.getTransferRateBit() + "b/s");
//                    System.out.println("transfer rate octet  : " + downloadReport.getTransferRateOctet() + "B/s");
//                    System.out.println("downloaded for now   : " + downloadReport.getTemporaryPacketSize()
//                            + "/" + downloadReport.getTotalPacketSize());
//                    System.out.println("amount of time       : "
//                            + ((downloadReport.getReportTime() - downloadReport.getStartTime()) / 1000) + "s");
//                }
//            }
//        };
//
//        // scheduling the task at interval
//        timer.scheduleAtFixedRate(task, 0, 400);
//
//        speedTestSocket.startUpload("1.testdebit.info", 80, "/", 100);
//    }
}