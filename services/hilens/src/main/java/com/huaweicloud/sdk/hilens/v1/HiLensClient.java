package com.huaweicloud.sdk.hilens.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.hilens.v1.model.*;

public class HiLensClient {

    protected HcClient hcClient;

    public HiLensClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<HiLensClient> newBuilder() {
        return new ClientBuilder<>(HiLensClient::new);
    }

    /**
     * 获取设备告警列表
     *
     * 获取设备告警列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDeviceAlarmsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDeviceAlarmsRequest 请求对象
     * @return SyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse>
     */
    public SyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse> listDeviceAlarmsInvoker(
        ListDeviceAlarmsRequest request) {
        return new SyncInvoker<ListDeviceAlarmsRequest, ListDeviceAlarmsResponse>(request, HiLensMeta.listDeviceAlarms,
            hcClient);
    }

    /**
     * 获取基础版设备列表
     *
     * 获取基础版设备列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse>
     */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, HiLensMeta.listDevices, hcClient);
    }

}
