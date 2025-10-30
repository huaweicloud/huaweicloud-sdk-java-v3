package com.huaweicloud.sdk.cloudpond.v2;

import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDeviceOfferingsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDeviceOfferingsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDevicesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListNetworkDevicesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListSaleCyclesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListSaleCyclesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServerOfferingsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServerOfferingsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServersRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListServersResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageGearsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageGearsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStoragePoolsRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStoragePoolsResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageTypesRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ListStorageTypesResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowNetworkDeviceRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowNetworkDeviceResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowServerRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowServerResponse;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowStoragePoolRequest;
import com.huaweicloud.sdk.cloudpond.v2.model.ShowStoragePoolResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CloudPondClient {

    protected HcClient hcClient;

    public CloudPondClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPondClient> newBuilder() {
        ClientBuilder<CloudPondClient> clientBuilder = new ClientBuilder<>(CloudPondClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 查询网络设备列表
     *
     * 查询网络设备列表。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:listNetworkDevices](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDevicesRequest 请求对象
     * @return ListNetworkDevicesResponse
     */
    public ListNetworkDevicesResponse listNetworkDevices(ListNetworkDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listNetworkDevices);
    }

    /**
     * 查询网络设备列表
     *
     * 查询网络设备列表。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:listNetworkDevices](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDevicesRequest 请求对象
     * @return SyncInvoker<ListNetworkDevicesRequest, ListNetworkDevicesResponse>
     */
    public SyncInvoker<ListNetworkDevicesRequest, ListNetworkDevicesResponse> listNetworkDevicesInvoker(
        ListNetworkDevicesRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listNetworkDevices, hcClient);
    }

    /**
     * 查询网络设备详情
     *
     * 查询网络设备详情。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:getNetworkDevice](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkDeviceRequest 请求对象
     * @return ShowNetworkDeviceResponse
     */
    public ShowNetworkDeviceResponse showNetworkDevice(ShowNetworkDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showNetworkDevice);
    }

    /**
     * 查询网络设备详情
     *
     * 查询网络设备详情。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:getNetworkDevice](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNetworkDeviceRequest 请求对象
     * @return SyncInvoker<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse>
     */
    public SyncInvoker<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse> showNetworkDeviceInvoker(
        ShowNetworkDeviceRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.showNetworkDevice, hcClient);
    }

    /**
     * 查询网络设备商品列表
     *
     * 查询网络设备商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDeviceOfferingsRequest 请求对象
     * @return ListNetworkDeviceOfferingsResponse
     */
    public ListNetworkDeviceOfferingsResponse listNetworkDeviceOfferings(ListNetworkDeviceOfferingsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listNetworkDeviceOfferings);
    }

    /**
     * 查询网络设备商品列表
     *
     * 查询网络设备商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDeviceOfferingsRequest 请求对象
     * @return SyncInvoker<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse>
     */
    public SyncInvoker<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse> listNetworkDeviceOfferingsInvoker(
        ListNetworkDeviceOfferingsRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listNetworkDeviceOfferings, hcClient);
    }

    /**
     * 查询服务器商品列表
     *
     * 查询服务器销售商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerOfferingsRequest 请求对象
     * @return ListServerOfferingsResponse
     */
    public ListServerOfferingsResponse listServerOfferings(ListServerOfferingsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listServerOfferings);
    }

    /**
     * 查询服务器商品列表
     *
     * 查询服务器销售商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerOfferingsRequest 请求对象
     * @return SyncInvoker<ListServerOfferingsRequest, ListServerOfferingsResponse>
     */
    public SyncInvoker<ListServerOfferingsRequest, ListServerOfferingsResponse> listServerOfferingsInvoker(
        ListServerOfferingsRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listServerOfferings, hcClient);
    }

    /**
     * 查询可购买的销售周期
     *
     * 查询可购买的销售周期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSaleCyclesRequest 请求对象
     * @return ListSaleCyclesResponse
     */
    public ListSaleCyclesResponse listSaleCycles(ListSaleCyclesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listSaleCycles);
    }

    /**
     * 查询可购买的销售周期
     *
     * 查询可购买的销售周期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSaleCyclesRequest 请求对象
     * @return SyncInvoker<ListSaleCyclesRequest, ListSaleCyclesResponse>
     */
    public SyncInvoker<ListSaleCyclesRequest, ListSaleCyclesResponse> listSaleCyclesInvoker(
        ListSaleCyclesRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listSaleCycles, hcClient);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:listServers](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return ListServersResponse
     */
    public ListServersResponse listServers(ListServersRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listServers);
    }

    /**
     * 查询服务器列表
     *
     * 查询服务器列表。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:listServers](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServersRequest 请求对象
     * @return SyncInvoker<ListServersRequest, ListServersResponse>
     */
    public SyncInvoker<ListServersRequest, ListServersResponse> listServersInvoker(ListServersRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listServers, hcClient);
    }

    /**
     * 查询服务器详情
     *
     * 查询服务器详情。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:getServer](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return ShowServerResponse
     */
    public ShowServerResponse showServer(ShowServerRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showServer);
    }

    /**
     * 查询服务器详情
     *
     * 查询服务器详情。
     * [- 该接口支持企业项目细粒度权限的校验，具体细粒度请参见 ies:edgeSite:getServer](tag:hws)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServerRequest 请求对象
     * @return SyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public SyncInvoker<ShowServerRequest, ShowServerResponse> showServerInvoker(ShowServerRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.showServer, hcClient);
    }

    /**
     * 查询存储计费档位
     *
     * 该接口仅返回支持的存储计费档位，实际可购买的存储容量单独定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageGearsRequest 请求对象
     * @return ListStorageGearsResponse
     */
    public ListStorageGearsResponse listStorageGears(ListStorageGearsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listStorageGears);
    }

    /**
     * 查询存储计费档位
     *
     * 该接口仅返回支持的存储计费档位，实际可购买的存储容量单独定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageGearsRequest 请求对象
     * @return SyncInvoker<ListStorageGearsRequest, ListStorageGearsResponse>
     */
    public SyncInvoker<ListStorageGearsRequest, ListStorageGearsResponse> listStorageGearsInvoker(
        ListStorageGearsRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listStorageGears, hcClient);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePoolsRequest 请求对象
     * @return ListStoragePoolsResponse
     */
    public ListStoragePoolsResponse listStoragePools(ListStoragePoolsRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listStoragePools);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePoolsRequest 请求对象
     * @return SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>
     */
    public SyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePoolsInvoker(
        ListStoragePoolsRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listStoragePools, hcClient);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoragePoolRequest 请求对象
     * @return ShowStoragePoolResponse
     */
    public ShowStoragePoolResponse showStoragePool(ShowStoragePoolRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.showStoragePool);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoragePoolRequest 请求对象
     * @return SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>
     */
    public SyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePoolInvoker(
        ShowStoragePoolRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.showStoragePool, hcClient);
    }

    /**
     * 查询存储类型列表
     *
     * 查询支持的存储类型列表，包括步长等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse
     */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, CloudPondMeta.listStorageTypes);
    }

    /**
     * 查询存储类型列表
     *
     * 查询支持的存储类型列表，包括步长等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<>(request, CloudPondMeta.listStorageTypes, hcClient);
    }

}
