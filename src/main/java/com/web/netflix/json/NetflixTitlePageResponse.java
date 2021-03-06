package com.web.netflix.json;

import com.web.netflix.json.resource.NetflixTitlePage;

public class NetflixTitlePageResponse {

    private NetflixTitlePage netflixTitlePage;
    private String errorCode;
    private String errorMsg;

    public NetflixTitlePage getNetflixTitlePage() {
        return netflixTitlePage;
    }

    public void setNetflixTitlePage(NetflixTitlePage netflixTitlePage) {
        this.netflixTitlePage = netflixTitlePage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "NetflixTitlePageResponse{" +
                "netflixTitlePage=" + netflixTitlePage +
                ", errorCode='" + errorCode + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                '}';
    }
}
