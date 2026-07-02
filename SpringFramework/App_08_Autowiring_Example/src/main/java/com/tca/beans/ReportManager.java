package com.tca.beans;

public class ReportManager {

    public ReportCreator reportCreator;


    public void setReportCreator(ReportCreator reportCreator) {
        this.reportCreator = reportCreator;
    }

    public ReportCreator getReportCreator() {
        return reportCreator;
    }


    public void createReport() {

        try {
            reportCreator.createReport();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
