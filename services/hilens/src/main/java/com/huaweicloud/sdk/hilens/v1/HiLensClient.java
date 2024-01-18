package com.huaweicloud.sdk.hilens.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDeviceAlarmsResponse;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesRequest;
import com.huaweicloud.sdk.hilens.v1.model.ListDevicesResponse;

public class HiLensClient {

    protected HcClient hcClient;

    public HiLensClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensClient> newBuilder() {
        ClientBuilder<HiLensClient> clientBuilder = new ClientBuilder<>(HiLensClient::new);
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
     * @return ListDeviceAlarmsResponse
     */
    public ListDeviceAlarmsResponse listDeviceAlarms(ListDeviceAlarmsRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listDeviceAlarms);
    }

    /**
     * 获取设备告警列表
     *
     * 获取设备告警列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDeviceAlarmsRequest 请求对象
     * @return SyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse>
     */
    public SyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> listDeviceAlarmsInvoker(
        ListDeviceAlarmsRequest request) {
        return new SyncInvoker<>(request, HiLensMeta.listDeviceAlarms, hcClient);
    }

    /**
     * 获取基础版设备列表
     *
     * 获取基础版设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return ListDevicesResponse
     */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, HiLensMeta.listDevices);
    }

    /**
     * 获取基础版设备列表
     *
     * 获取基础版设备列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<>(request, HiLensMeta.listDevices, hcClient);
    }

}
