package com.huaweicloud.sdk.apm.v1;

import com.huaweicloud.sdk.apm.v1.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class ApmClient {

    protected HcClient hcClient;

    public ApmClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ApmClient> newBuilder() {
        return new ClientBuilder<>(ApmClient::new);
    }

    /** 获取ak-sk 获取该用户创建的aksk列表
     *
     * @param ListAkSkRequest 请求对象
     * @return ListAkSkResponse */
    public ListAkSkResponse listAkSk(ListAkSkRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listAkSk);
    }

    /** 获取ak-sk 获取该用户创建的aksk列表
     *
     * @param ListAkSkRequest 请求对象
     * @return SyncInvoker<ListAkSkRequest, ListAkSkResponse> */
    public SyncInvoker<ListAkSkRequest, ListAkSkResponse> listAkSkInvoker(ListAkSkRequest request) {
        return new SyncInvoker<ListAkSkRequest, ListAkSkResponse>(request, ApmMeta.listAkSk, hcClient);
    }

    /** 查询业务列表 该接口用于查询对应用户下的业务。
     *
     * @param ListBusinessRequest 请求对象
     * @return ListBusinessResponse */
    public ListBusinessResponse listBusiness(ListBusinessRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.listBusiness);
    }

    /** 查询业务列表 该接口用于查询对应用户下的业务。
     *
     * @param ListBusinessRequest 请求对象
     * @return SyncInvoker<ListBusinessRequest, ListBusinessResponse> */
    public SyncInvoker<ListBusinessRequest, ListBusinessResponse> listBusinessInvoker(ListBusinessRequest request) {
        return new SyncInvoker<ListBusinessRequest, ListBusinessResponse>(request, ApmMeta.listBusiness, hcClient);
    }

    /** 查询master地址 根据region名称获取该名称下的master服务podlb地址信息
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return ShowMasterAddressResponse */
    public ShowMasterAddressResponse showMasterAddress(ShowMasterAddressRequest request) {
        return hcClient.syncInvokeHttp(request, ApmMeta.showMasterAddress);
    }

    /** 查询master地址 根据region名称获取该名称下的master服务podlb地址信息
     *
     * @param ShowMasterAddressRequest 请求对象
     * @return SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> */
    public SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse> showMasterAddressInvoker(
        ShowMasterAddressRequest request) {
        return new SyncInvoker<ShowMasterAddressRequest, ShowMasterAddressResponse>(request, ApmMeta.showMasterAddress,
            hcClient);
    }

}
