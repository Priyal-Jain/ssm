package com.esoft.smartstudentmanagement.network;


/**
 * Created by priyal on 03-07-2017.
 */

class ApiUtils {


    private ApiUtils() {}

    public static NetworkInterface getAPIService() {

        return NetworkClient.getClient().create(NetworkInterface.class);
    }


}
