package com.huaweicloud.sdk.hilens.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hilens.v1.model.*;

import java.util.concurrent.CompletableFuture;

public class HiLensAsyncClient {

    protected HcClient hcClient;

    public HiLensAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensAsyncClient> newBuilder() {
        return new ClientBuilder<>(HiLensAsyncClient::new);
    }

    /** 获取设备告警列表 获取设备告警列表
     *
     * @param ListDeviceAlarmsRequest 请求对象
     * @return CompletableFuture<ListDeviceAlarmsResponse> */
    public CompletableFuture<ListDeviceAlarmsResponse> listDeviceAlarmsAsync(ListDeviceAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listDeviceAlarms);
    }

    /** 获取设备告警列表 获取设备告警列表
     *
     * @param ListDeviceAlarmsRequest 请求对象
     * @return AsyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> */
    public AsyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> listDeviceAlarmsAsyncInvoker(
        ListDeviceAlarmsRequest request) {
        return new AsyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse>(request, HiLensMeta.listDeviceAlarms,
            hcClient);
    }

    /** 获取设备列表 获取设备列表
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse> */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listDevices);
    }

    /** 获取设备列表 获取设备列表
     *
     * @param ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse> */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, HiLensMeta.listDevices, hcClient);
    }

}
