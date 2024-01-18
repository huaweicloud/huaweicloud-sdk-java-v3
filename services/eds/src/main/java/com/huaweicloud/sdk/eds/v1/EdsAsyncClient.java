package com.huaweicloud.sdk.eds.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class EdsAsyncClient {

    protected HcClient hcClient;

    public EdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EdsAsyncClient> newBuilder() {
        ClientBuilder<EdsAsyncClient> clientBuilder = new ClientBuilder<>(EdsAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 终止合约
     *
     * 终止合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelContractRequest 请求对象
     * @return CompletableFuture<CancelContractResponse>
     */
    public CompletableFuture<CancelContractResponse> cancelContractAsync(CancelContractRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.cancelContract);
    }

    /**
     * 终止合约
     *
     * 终止合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelContractRequest 请求对象
     * @return AsyncInvoker<CancelContractRequest, CancelContractResponse>
     */
    public AsyncInvoker<CancelContractRequest, CancelContractResponse> cancelContractAsyncInvoker(
        CancelContractRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.cancelContract, hcClient);
    }

    /**
     * 提交合约
     *
     * 提交合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitContractRequest 请求对象
     * @return CompletableFuture<CommitContractResponse>
     */
    public CompletableFuture<CommitContractResponse> commitContractAsync(CommitContractRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.commitContract);
    }

    /**
     * 提交合约
     *
     * 提交合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CommitContractRequest 请求对象
     * @return AsyncInvoker<CommitContractRequest, CommitContractResponse>
     */
    public AsyncInvoker<CommitContractRequest, CommitContractResponse> commitContractAsyncInvoker(
        CommitContractRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.commitContract, hcClient);
    }

    /**
     * 按空间管理员查询连接器列表
     *
     * 按空间管理员查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorsByInstanceMangerRequest 请求对象
     * @return CompletableFuture<ListConnectorsByInstanceMangerResponse>
     */
    public CompletableFuture<ListConnectorsByInstanceMangerResponse> listConnectorsByInstanceMangerAsync(
        ListConnectorsByInstanceMangerRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.listConnectorsByInstanceManger);
    }

    /**
     * 按空间管理员查询连接器列表
     *
     * 按空间管理员查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorsByInstanceMangerRequest 请求对象
     * @return AsyncInvoker<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse>
     */
    public AsyncInvoker<ListConnectorsByInstanceMangerRequest, ListConnectorsByInstanceMangerResponse> listConnectorsByInstanceMangerAsyncInvoker(
        ListConnectorsByInstanceMangerRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.listConnectorsByInstanceManger, hcClient);
    }

    /**
     * 按空间用户查询连接器列表
     *
     * 按空间用户查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorsByInstanceUserRequest 请求对象
     * @return CompletableFuture<ListConnectorsByInstanceUserResponse>
     */
    public CompletableFuture<ListConnectorsByInstanceUserResponse> listConnectorsByInstanceUserAsync(
        ListConnectorsByInstanceUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.listConnectorsByInstanceUser);
    }

    /**
     * 按空间用户查询连接器列表
     *
     * 按空间用户查询连接器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectorsByInstanceUserRequest 请求对象
     * @return AsyncInvoker<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse>
     */
    public AsyncInvoker<ListConnectorsByInstanceUserRequest, ListConnectorsByInstanceUserResponse> listConnectorsByInstanceUserAsyncInvoker(
        ListConnectorsByInstanceUserRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.listConnectorsByInstanceUser, hcClient);
    }

    /**
     * 查询数据资产的审计日志
     *
     * 查询数据资产的审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return CompletableFuture<ShowAuditLogResponse>
     */
    public CompletableFuture<ShowAuditLogResponse> showAuditLogAsync(ShowAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.showAuditLog);
    }

    /**
     * 查询数据资产的审计日志
     *
     * 查询数据资产的审计日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuditLogRequest 请求对象
     * @return AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogAsyncInvoker(
        ShowAuditLogRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.showAuditLog, hcClient);
    }

    /**
     * 查询指定租户的连接器详情
     *
     * 查询指定租户的连接器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorRequest 请求对象
     * @return CompletableFuture<ShowConnectorResponse>
     */
    public CompletableFuture<ShowConnectorResponse> showConnectorAsync(ShowConnectorRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.showConnector);
    }

    /**
     * 查询指定租户的连接器详情
     *
     * 查询指定租户的连接器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectorRequest 请求对象
     * @return AsyncInvoker<ShowConnectorRequest, ShowConnectorResponse>
     */
    public AsyncInvoker<ShowConnectorRequest, ShowConnectorResponse> showConnectorAsyncInvoker(
        ShowConnectorRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.showConnector, hcClient);
    }

    /**
     * 查询合约
     *
     * 查询合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContractRequest 请求对象
     * @return CompletableFuture<ShowContractResponse>
     */
    public CompletableFuture<ShowContractResponse> showContractAsync(ShowContractRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.showContract);
    }

    /**
     * 查询合约
     *
     * 查询合约
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowContractRequest 请求对象
     * @return AsyncInvoker<ShowContractRequest, ShowContractResponse>
     */
    public AsyncInvoker<ShowContractRequest, ShowContractResponse> showContractAsyncInvoker(
        ShowContractRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.showContract, hcClient);
    }

    /**
     * 查询指定连接器下的offer列表
     *
     * 查询指定连接器下的offer列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffersRequest 请求对象
     * @return CompletableFuture<ListOffersResponse>
     */
    public CompletableFuture<ListOffersResponse> listOffersAsync(ListOffersRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.listOffers);
    }

    /**
     * 查询指定连接器下的offer列表
     *
     * 查询指定连接器下的offer列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOffersRequest 请求对象
     * @return AsyncInvoker<ListOffersRequest, ListOffersResponse>
     */
    public AsyncInvoker<ListOffersRequest, ListOffersResponse> listOffersAsyncInvoker(ListOffersRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.listOffers, hcClient);
    }

    /**
     * 查询指定offer详情
     *
     * 查询指定offer详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOfferRequest 请求对象
     * @return CompletableFuture<ShowOfferResponse>
     */
    public CompletableFuture<ShowOfferResponse> showOfferAsync(ShowOfferRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.showOffer);
    }

    /**
     * 查询指定offer详情
     *
     * 查询指定offer详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOfferRequest 请求对象
     * @return AsyncInvoker<ShowOfferRequest, ShowOfferResponse>
     */
    public AsyncInvoker<ShowOfferRequest, ShowOfferResponse> showOfferAsyncInvoker(ShowOfferRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.showOffer, hcClient);
    }

    /**
     * 分配子账号
     *
     * 分配子账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddConnectorUserRequest 请求对象
     * @return CompletableFuture<AddConnectorUserResponse>
     */
    public CompletableFuture<AddConnectorUserResponse> addConnectorUserAsync(AddConnectorUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.addConnectorUser);
    }

    /**
     * 分配子账号
     *
     * 分配子账号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddConnectorUserRequest 请求对象
     * @return AsyncInvoker<AddConnectorUserRequest, AddConnectorUserResponse>
     */
    public AsyncInvoker<AddConnectorUserRequest, AddConnectorUserResponse> addConnectorUserAsyncInvoker(
        AddConnectorUserRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.addConnectorUser, hcClient);
    }

    /**
     * 账号回收
     *
     * 账号回收
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorUserRequest 请求对象
     * @return CompletableFuture<DeleteConnectorUserResponse>
     */
    public CompletableFuture<DeleteConnectorUserResponse> deleteConnectorUserAsync(DeleteConnectorUserRequest request) {
        return hcClient.asyncInvokeHttp(request, EdsMeta.deleteConnectorUser);
    }

    /**
     * 账号回收
     *
     * 账号回收
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectorUserRequest 请求对象
     * @return AsyncInvoker<DeleteConnectorUserRequest, DeleteConnectorUserResponse>
     */
    public AsyncInvoker<DeleteConnectorUserRequest, DeleteConnectorUserResponse> deleteConnectorUserAsyncInvoker(
        DeleteConnectorUserRequest request) {
        return new AsyncInvoker<>(request, EdsMeta.deleteConnectorUser, hcClient);
    }

}
