package com.huaweicloud.sdk.eds.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.eds.v1.model.AddConnectorUserRequest;
import com.huaweicloud.sdk.eds.v1.model.AddConnectorUserResponse;
import com.huaweicloud.sdk.eds.v1.model.CancelContractRequest;
import com.huaweicloud.sdk.eds.v1.model.CancelContractResponse;
import com.huaweicloud.sdk.eds.v1.model.CommitContractRequest;
import com.huaweicloud.sdk.eds.v1.model.CommitContractResponse;
import com.huaweicloud.sdk.eds.v1.model.DeleteConnectorUserRequest;
import com.huaweicloud.sdk.eds.v1.model.DeleteConnectorUserResponse;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceMangerRequest;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceMangerResponse;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceUserRequest;
import com.huaweicloud.sdk.eds.v1.model.ListConnectorsByInstanceUserResponse;
import com.huaweicloud.sdk.eds.v1.model.ListOffersRequest;
import com.huaweicloud.sdk.eds.v1.model.ListOffersResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowAuditLogRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowAuditLogResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowConnectorRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowConnectorResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowContractRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowContractResponse;
import com.huaweicloud.sdk.eds.v1.model.ShowOfferRequest;
import com.huaweicloud.sdk.eds.v1.model.ShowOfferResponse;

public class EdsClient {

    protected HcClient hcClient;

    public EdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdsClient> newBuilder() {
        ClientBuilder<EdsClient> clientBuilder = new ClientBuilder<>(EdsClient::new);
        return clientBuilder;
    }

    /**
     * 终止合约
     *
     * 终止合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelContractRequest 请求对象
     * @return CancelContractResponse
     */
    public CancelContractResponse cancelContract(CancelContractRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.cancelContract);
    }

    /**
     * 终止合约
     *
     * 终止合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CancelContractRequest 请求对象
     * @return SyncInvoker<CancelContractRequest, CancelContractResponse>
     */
    public SyncInvoker<CancelContractRequest, CancelContractResponse> cancelContractInvoker(
        CancelContractRequest request) {
        return new SyncInvoker<CancelContractRequest, CancelContractResponse>(request, EdsMeta.cancelContract,
            hcClient);
    }

    /**
     * 提交合约
     *
     * 提交合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitContractRequest 请求对象
     * @return CommitContractResponse
     */
    public CommitContractResponse commitContract(CommitContractRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.commitContract);
    }

    /**
     * 提交合约
     *
     * 提交合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CommitContractRequest 请求对象
     * @return SyncInvoker<CommitContractRequest, CommitContractResponse>
     */
    public SyncInvoker<CommitContractRequest, CommitContractResponse> commitContractInvoker(
        CommitContractRequest request) {
        return new SyncInvoker<CommitContractRequest, CommitContractResponse>(request, EdsMeta.commitContract,
            hcClient);
    }

    /**
     * 按空间管理员查询连接器列表
     *
     * 按空间管理员查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectorsByInstanceMangerRequest 请求对象
     * @return ListConnectorsByInstanceMangerResponse
     */
    public ListConnectorsByInstanceMangerResponse listConnectorsByInstanceManger(
        ListConnectorsByInstanceMangerRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.listConnectorsByInstanceManger);
    }

    /**
     * 按空间管理员查询连接器列表
     *
     * 按空间管理员查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectorsByInstanceMangerRequest 请求对象
     * @return SyncInvoker<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse>
     */
    public SyncInvoker<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> listConnectorsByInstanceMangerInvoker(
        ListConnectorsByInstanceMangerRequest request) {
        return new SyncInvoker<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse>(request,
            EdsMeta.listConnectorsByInstanceManger, hcClient);
    }

    /**
     * 按空间用户查询连接器列表
     *
     * 按空间用户查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectorsByInstanceUserRequest 请求对象
     * @return ListConnectorsByInstanceUserResponse
     */
    public ListConnectorsByInstanceUserResponse listConnectorsByInstanceUser(
        ListConnectorsByInstanceUserRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.listConnectorsByInstanceUser);
    }

    /**
     * 按空间用户查询连接器列表
     *
     * 按空间用户查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConnectorsByInstanceUserRequest 请求对象
     * @return SyncInvoker<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse>
     */
    public SyncInvoker<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> listConnectorsByInstanceUserInvoker(
        ListConnectorsByInstanceUserRequest request) {
        return new SyncInvoker<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse>(request,
            EdsMeta.listConnectorsByInstanceUser, hcClient);
    }

    /**
     * 查询数据资产的审计日志
     *
     * 查询数据资产的审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return ShowAuditLogResponse
     */
    public ShowAuditLogResponse showAuditLog(ShowAuditLogRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.showAuditLog);
    }

    /**
     * 查询数据资产的审计日志
     *
     * 查询数据资产的审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogInvoker(ShowAuditLogRequest request) {
        return new SyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>(request, EdsMeta.showAuditLog, hcClient);
    }

    /**
     * 查询指定租户的连接器详情
     *
     * 查询指定租户的连接器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectorRequest 请求对象
     * @return ShowConnectorResponse
     */
    public ShowConnectorResponse showConnector(ShowConnectorRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.showConnector);
    }

    /**
     * 查询指定租户的连接器详情
     *
     * 查询指定租户的连接器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConnectorRequest 请求对象
     * @return SyncInvoker<ShowConnectorRequest, ShowConnectorResponse>
     */
    public SyncInvoker<ShowConnectorRequest, ShowConnectorResponse> showConnectorInvoker(ShowConnectorRequest request) {
        return new SyncInvoker<ShowConnectorRequest, ShowConnectorResponse>(request, EdsMeta.showConnector, hcClient);
    }

    /**
     * 查询合约
     *
     * 查询合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowContractRequest 请求对象
     * @return ShowContractResponse
     */
    public ShowContractResponse showContract(ShowContractRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.showContract);
    }

    /**
     * 查询合约
     *
     * 查询合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowContractRequest 请求对象
     * @return SyncInvoker<ShowContractRequest, ShowContractResponse>
     */
    public SyncInvoker<ShowContractRequest, ShowContractResponse> showContractInvoker(ShowContractRequest request) {
        return new SyncInvoker<ShowContractRequest, ShowContractResponse>(request, EdsMeta.showContract, hcClient);
    }

    /**
     * 查询指定连接器下的offer列表
     *
     * 查询指定连接器下的offer列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffersRequest 请求对象
     * @return ListOffersResponse
     */
    public ListOffersResponse listOffers(ListOffersRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.listOffers);
    }

    /**
     * 查询指定连接器下的offer列表
     *
     * 查询指定连接器下的offer列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListOffersRequest 请求对象
     * @return SyncInvoker<ListOffersRequest, ListOffersResponse>
     */
    public SyncInvoker<ListOffersRequest, ListOffersResponse> listOffersInvoker(ListOffersRequest request) {
        return new SyncInvoker<ListOffersRequest, ListOffersResponse>(request, EdsMeta.listOffers, hcClient);
    }

    /**
     * 查询指定offer详情
     *
     * 查询指定offer详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOfferRequest 请求对象
     * @return ShowOfferResponse
     */
    public ShowOfferResponse showOffer(ShowOfferRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.showOffer);
    }

    /**
     * 查询指定offer详情
     *
     * 查询指定offer详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOfferRequest 请求对象
     * @return SyncInvoker<ShowOfferRequest, ShowOfferResponse>
     */
    public SyncInvoker<ShowOfferRequest, ShowOfferResponse> showOfferInvoker(ShowOfferRequest request) {
        return new SyncInvoker<ShowOfferRequest, ShowOfferResponse>(request, EdsMeta.showOffer, hcClient);
    }

    /**
     * 分配子账号
     *
     * 分配子账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddConnectorUserRequest 请求对象
     * @return AddConnectorUserResponse
     */
    public AddConnectorUserResponse addConnectorUser(AddConnectorUserRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.addConnectorUser);
    }

    /**
     * 分配子账号
     *
     * 分配子账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AddConnectorUserRequest 请求对象
     * @return SyncInvoker<AddConnectorUserRequest, AddConnectorUserResponse>
     */
    public SyncInvoker<AddConnectorUserRequest, AddConnectorUserResponse> addConnectorUserInvoker(
        AddConnectorUserRequest request) {
        return new SyncInvoker<AddConnectorUserRequest, AddConnectorUserResponse>(request, EdsMeta.addConnectorUser,
            hcClient);
    }

    /**
     * 账号回收
     *
     * 账号回收
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectorUserRequest 请求对象
     * @return DeleteConnectorUserResponse
     */
    public DeleteConnectorUserResponse deleteConnectorUser(DeleteConnectorUserRequest request) {
        return hcClient.syncInvokeHttp(request, EdsMeta.deleteConnectorUser);
    }

    /**
     * 账号回收
     *
     * 账号回收
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConnectorUserRequest 请求对象
     * @return SyncInvoker<DeleteConnectorUserRequest, DeleteConnectorUserResponse>
     */
    public SyncInvoker<DeleteConnectorUserRequest, DeleteConnectorUserResponse> deleteConnectorUserInvoker(
        DeleteConnectorUserRequest request) {
        return new SyncInvoker<DeleteConnectorUserRequest, DeleteConnectorUserResponse>(request,
            EdsMeta.deleteConnectorUser, hcClient);
    }

}
