package com.huaweicloud.sdk.hilens.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsResponse;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesResponse;

import java.util.concurrent.CompletableFuture;

public class HiLensAsyncClient {

    protected HcClient hcClient;

    public HiLensAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensAsyncClient> newBuilder() {
        ClientBuilder<HiLensAsyncClient> clientBuilder = new ClientBuilder<>(HiLensAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 获取设备告警列表
     *
     * 获取设备告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceAlarmsRequest 请求对象
     * @return CompletableFuture<ListDeviceAlarmsResponse>
     */
    public CompletableFuture<ListDeviceAlarmsResponse> listDeviceAlarmsAsync(ListDeviceAlarmsRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listDeviceAlarms);
    }

    /**
     * 获取设备告警列表
     *
     * 获取设备告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceAlarmsRequest 请求对象
     * @return AsyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse>
     */
    public AsyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> listDeviceAlarmsAsyncInvoker(
        ListDeviceAlarmsRequest request) {
        return new AsyncInvoker<>(request, HiLensMeta.listDeviceAlarms, hcClient);
    }

    /**
     * 获取基础版设备列表
     *
     * 获取基础版设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse>
     */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, HiLensMeta.listDevices);
    }

    /**
     * 获取基础版设备列表
     *
     * 获取基础版设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<>(request, HiLensMeta.listDevices, hcClient);
    }

}
