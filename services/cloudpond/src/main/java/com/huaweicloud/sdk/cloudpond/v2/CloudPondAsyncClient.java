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
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CloudPondAsyncClient {

    protected HcClient hcClient;

    public CloudPondAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CloudPondAsyncClient> newBuilder() {
        ClientBuilder<CloudPondAsyncClient> clientBuilder =
            new ClientBuilder<>(CloudPondAsyncClient::new, "GlobalCredentials");
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
     * @return CompletableFuture<ListNetworkDevicesResponse>
     */
    public CompletableFuture<ListNetworkDevicesResponse> listNetworkDevicesAsync(ListNetworkDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listNetworkDevices);
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
     * @return AsyncInvoker<ListNetworkDevicesRequest, ListNetworkDevicesResponse>
     */
    public AsyncInvoker<ListNetworkDevicesRequest, ListNetworkDevicesResponse> listNetworkDevicesAsyncInvoker(
        ListNetworkDevicesRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listNetworkDevices, hcClient);
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
     * @return CompletableFuture<ShowNetworkDeviceResponse>
     */
    public CompletableFuture<ShowNetworkDeviceResponse> showNetworkDeviceAsync(ShowNetworkDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showNetworkDevice);
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
     * @return AsyncInvoker<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse>
     */
    public AsyncInvoker<ShowNetworkDeviceRequest, ShowNetworkDeviceResponse> showNetworkDeviceAsyncInvoker(
        ShowNetworkDeviceRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.showNetworkDevice, hcClient);
    }

    /**
     * 查询网络设备商品列表
     *
     * 查询网络设备商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDeviceOfferingsRequest 请求对象
     * @return CompletableFuture<ListNetworkDeviceOfferingsResponse>
     */
    public CompletableFuture<ListNetworkDeviceOfferingsResponse> listNetworkDeviceOfferingsAsync(
        ListNetworkDeviceOfferingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listNetworkDeviceOfferings);
    }

    /**
     * 查询网络设备商品列表
     *
     * 查询网络设备商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNetworkDeviceOfferingsRequest 请求对象
     * @return AsyncInvoker<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse>
     */
    public AsyncInvoker<ListNetworkDeviceOfferingsRequest, ListNetworkDeviceOfferingsResponse> listNetworkDeviceOfferingsAsyncInvoker(
        ListNetworkDeviceOfferingsRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listNetworkDeviceOfferings, hcClient);
    }

    /**
     * 查询服务器商品列表
     *
     * 查询服务器销售商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerOfferingsRequest 请求对象
     * @return CompletableFuture<ListServerOfferingsResponse>
     */
    public CompletableFuture<ListServerOfferingsResponse> listServerOfferingsAsync(ListServerOfferingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listServerOfferings);
    }

    /**
     * 查询服务器商品列表
     *
     * 查询服务器销售商品列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServerOfferingsRequest 请求对象
     * @return AsyncInvoker<ListServerOfferingsRequest, ListServerOfferingsResponse>
     */
    public AsyncInvoker<ListServerOfferingsRequest, ListServerOfferingsResponse> listServerOfferingsAsyncInvoker(
        ListServerOfferingsRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listServerOfferings, hcClient);
    }

    /**
     * 查询可购买的销售周期
     *
     * 查询可购买的销售周期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSaleCyclesRequest 请求对象
     * @return CompletableFuture<ListSaleCyclesResponse>
     */
    public CompletableFuture<ListSaleCyclesResponse> listSaleCyclesAsync(ListSaleCyclesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listSaleCycles);
    }

    /**
     * 查询可购买的销售周期
     *
     * 查询可购买的销售周期
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSaleCyclesRequest 请求对象
     * @return AsyncInvoker<ListSaleCyclesRequest, ListSaleCyclesResponse>
     */
    public AsyncInvoker<ListSaleCyclesRequest, ListSaleCyclesResponse> listSaleCyclesAsyncInvoker(
        ListSaleCyclesRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listSaleCycles, hcClient);
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
     * @return CompletableFuture<ListServersResponse>
     */
    public CompletableFuture<ListServersResponse> listServersAsync(ListServersRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listServers);
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
     * @return AsyncInvoker<ListServersRequest, ListServersResponse>
     */
    public AsyncInvoker<ListServersRequest, ListServersResponse> listServersAsyncInvoker(ListServersRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listServers, hcClient);
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
     * @return CompletableFuture<ShowServerResponse>
     */
    public CompletableFuture<ShowServerResponse> showServerAsync(ShowServerRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showServer);
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
     * @return AsyncInvoker<ShowServerRequest, ShowServerResponse>
     */
    public AsyncInvoker<ShowServerRequest, ShowServerResponse> showServerAsyncInvoker(ShowServerRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.showServer, hcClient);
    }

    /**
     * 查询存储计费档位
     *
     * 该接口仅返回支持的存储计费档位，实际可购买的存储容量单独定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageGearsRequest 请求对象
     * @return CompletableFuture<ListStorageGearsResponse>
     */
    public CompletableFuture<ListStorageGearsResponse> listStorageGearsAsync(ListStorageGearsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listStorageGears);
    }

    /**
     * 查询存储计费档位
     *
     * 该接口仅返回支持的存储计费档位，实际可购买的存储容量单独定义。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageGearsRequest 请求对象
     * @return AsyncInvoker<ListStorageGearsRequest, ListStorageGearsResponse>
     */
    public AsyncInvoker<ListStorageGearsRequest, ListStorageGearsResponse> listStorageGearsAsyncInvoker(
        ListStorageGearsRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listStorageGears, hcClient);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePoolsRequest 请求对象
     * @return CompletableFuture<ListStoragePoolsResponse>
     */
    public CompletableFuture<ListStoragePoolsResponse> listStoragePoolsAsync(ListStoragePoolsRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listStoragePools);
    }

    /**
     * 查询存储池列表
     *
     * 查询存储池列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStoragePoolsRequest 请求对象
     * @return AsyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse>
     */
    public AsyncInvoker<ListStoragePoolsRequest, ListStoragePoolsResponse> listStoragePoolsAsyncInvoker(
        ListStoragePoolsRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listStoragePools, hcClient);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoragePoolRequest 请求对象
     * @return CompletableFuture<ShowStoragePoolResponse>
     */
    public CompletableFuture<ShowStoragePoolResponse> showStoragePoolAsync(ShowStoragePoolRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.showStoragePool);
    }

    /**
     * 查询存储池详情
     *
     * 查询存储池详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStoragePoolRequest 请求对象
     * @return AsyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse>
     */
    public AsyncInvoker<ShowStoragePoolRequest, ShowStoragePoolResponse> showStoragePoolAsyncInvoker(
        ShowStoragePoolRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.showStoragePool, hcClient);
    }

    /**
     * 查询存储类型列表
     *
     * 查询支持的存储类型列表，包括步长等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, CloudPondMeta.listStorageTypes);
    }

    /**
     * 查询存储类型列表
     *
     * 查询支持的存储类型列表，包括步长等信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<>(request, CloudPondMeta.listStorageTypes, hcClient);
    }

}
