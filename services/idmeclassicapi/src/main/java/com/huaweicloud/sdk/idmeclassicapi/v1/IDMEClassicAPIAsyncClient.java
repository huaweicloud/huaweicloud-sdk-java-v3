package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchReviseUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUndoCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateAndCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateAndCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowBatchUpdateVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCompareBusinessVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCompareBusinessVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteLatestVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteLatestVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetAllVersionsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetAllVersionsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetVersionByMasterUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetVersionByMasterUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteBranchUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteBranchUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteLatestVersionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteLatestVersionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseAndUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseAndUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowReviseUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUndoCheckoutUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateAndCheckinUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateAndCheckinUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByAdminUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByAdminUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowUpdateUsingPostResponse;

import java.util.concurrent.CompletableFuture;

public class IDMEClassicAPIAsyncClient {

    protected HcClient hcClient;

    public IDMEClassicAPIAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IDMEClassicAPIAsyncClient> newBuilder() {
        ClientBuilder<IDMEClassicAPIAsyncClient> clientBuilder = new ClientBuilder<>(IDMEClassicAPIAsyncClient::new);
        return clientBuilder;
    }

    /**
     * XDM_批量检入VersionModel
     *
     * 根据主对象ID批量检入版本对象，小版本升版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckinUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchCheckinUsingPostResponse>
     */
    public CompletableFuture<ShowBatchCheckinUsingPostResponse> showBatchCheckinUsingPostAsync(
        ShowBatchCheckinUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckinUsingPost);
    }

    /**
     * XDM_批量检入VersionModel
     *
     * 根据主对象ID批量检入版本对象，小版本升版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckinUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse> showBatchCheckinUsingPostAsyncInvoker(
        ShowBatchCheckinUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckinUsingPost, hcClient);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutAndUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchCheckoutAndUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowBatchCheckoutAndUpdateUsingPostResponse> showBatchCheckoutAndUpdateUsingPostAsync(
        ShowBatchCheckoutAndUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckoutAndUpdateUsingPost);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutAndUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse> showBatchCheckoutAndUpdateUsingPostAsyncInvoker(
        ShowBatchCheckoutAndUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckoutAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchCheckoutUsingPostResponse>
     */
    public CompletableFuture<ShowBatchCheckoutUsingPostResponse> showBatchCheckoutUsingPostAsync(
        ShowBatchCheckoutUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckoutUsingPost);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse> showBatchCheckoutUsingPostAsyncInvoker(
        ShowBatchCheckoutUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckoutUsingPost, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchCreateUsingPostResponse>
     */
    public CompletableFuture<ShowBatchCreateUsingPostResponse> showBatchCreateUsingPostAsync(
        ShowBatchCreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCreateUsingPost);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse> showBatchCreateUsingPostAsyncInvoker(
        ShowBatchCreateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCreateUsingPost, hcClient);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteBranchUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchDeleteBranchUsingPostResponse>
     */
    public CompletableFuture<ShowBatchDeleteBranchUsingPostResponse> showBatchDeleteBranchUsingPostAsync(
        ShowBatchDeleteBranchUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchDeleteBranchUsingPost);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteBranchUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse> showBatchDeleteBranchUsingPostAsyncInvoker(
        ShowBatchDeleteBranchUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchDeleteBranchUsingPost, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 根据数据实例的唯一编码，批量删除指定数据模型中的多个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchDeleteUsingPostResponse>
     */
    public CompletableFuture<ShowBatchDeleteUsingPostResponse> showBatchDeleteUsingPostAsync(
        ShowBatchDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchDeleteUsingPost);
    }

    /**
     * 批量删除实例
     *
     * 根据数据实例的唯一编码，批量删除指定数据模型中的多个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse> showBatchDeleteUsingPostAsyncInvoker(
        ShowBatchDeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchDeleteUsingPost, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchGetUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchGetUsingPostResponse>
     */
    public CompletableFuture<ShowBatchGetUsingPostResponse> showBatchGetUsingPostAsync(
        ShowBatchGetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchGetUsingPost);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchGetUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse> showBatchGetUsingPostAsyncInvoker(
        ShowBatchGetUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchGetUsingPost, hcClient);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteBranchUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchLogicalDeleteBranchUsingPostResponse>
     */
    public CompletableFuture<ShowBatchLogicalDeleteBranchUsingPostResponse> showBatchLogicalDeleteBranchUsingPostAsync(
        ShowBatchLogicalDeleteBranchUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchLogicalDeleteBranchUsingPost);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteBranchUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse> showBatchLogicalDeleteBranchUsingPostAsyncInvoker(
        ShowBatchLogicalDeleteBranchUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchLogicalDeleteBranchUsingPost, hcClient);
    }

    /**
     * 批量软删除实例
     *
     * 根据数据实例的唯一编码，批量软删除指定数据模型中的多个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchLogicalDeleteUsingPostResponse>
     */
    public CompletableFuture<ShowBatchLogicalDeleteUsingPostResponse> showBatchLogicalDeleteUsingPostAsync(
        ShowBatchLogicalDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchLogicalDeleteUsingPost);
    }

    /**
     * 批量软删除实例
     *
     * 根据数据实例的唯一编码，批量软删除指定数据模型中的多个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse> showBatchLogicalDeleteUsingPostAsyncInvoker(
        ShowBatchLogicalDeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchLogicalDeleteUsingPost, hcClient);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseAndUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchReviseAndUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowBatchReviseAndUpdateUsingPostResponse> showBatchReviseAndUpdateUsingPostAsync(
        ShowBatchReviseAndUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchReviseAndUpdateUsingPost);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseAndUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse> showBatchReviseAndUpdateUsingPostAsyncInvoker(
        ShowBatchReviseAndUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchReviseAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchReviseUsingPostResponse>
     */
    public CompletableFuture<ShowBatchReviseUsingPostResponse> showBatchReviseUsingPostAsync(
        ShowBatchReviseUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchReviseUsingPost);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse> showBatchReviseUsingPostAsyncInvoker(
        ShowBatchReviseUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchReviseUsingPost, hcClient);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUndoCheckoutByAdminUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUndoCheckoutByAdminUsingPostResponse> showBatchUndoCheckoutByAdminUsingPostAsync(
        ShowBatchUndoCheckoutByAdminUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUndoCheckoutByAdminUsingPost);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse> showBatchUndoCheckoutByAdminUsingPostAsyncInvoker(
        ShowBatchUndoCheckoutByAdminUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUndoCheckoutByAdminUsingPost, hcClient);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUndoCheckoutUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUndoCheckoutUsingPostResponse> showBatchUndoCheckoutUsingPostAsync(
        ShowBatchUndoCheckoutUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUndoCheckoutUsingPost);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse> showBatchUndoCheckoutUsingPostAsyncInvoker(
        ShowBatchUndoCheckoutUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUndoCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateAndCheckinUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUpdateAndCheckinUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUpdateAndCheckinUsingPostResponse> showBatchUpdateAndCheckinUsingPostAsync(
        ShowBatchUpdateAndCheckinUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateAndCheckinUsingPost);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateAndCheckinUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse> showBatchUpdateAndCheckinUsingPostAsyncInvoker(
        ShowBatchUpdateAndCheckinUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateAndCheckinUsingPost, hcClient);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateByAdminUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUpdateByAdminUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUpdateByAdminUsingPostResponse> showBatchUpdateByAdminUsingPostAsync(
        ShowBatchUpdateByAdminUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateByAdminUsingPost);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateByAdminUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse> showBatchUpdateByAdminUsingPostAsyncInvoker(
        ShowBatchUpdateByAdminUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateByAdminUsingPost, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUpdateUsingPostResponse> showBatchUpdateUsingPostAsync(
        ShowBatchUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateUsingPost);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse> showBatchUpdateUsingPostAsyncInvoker(
        ShowBatchUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateVersionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowBatchUpdateVersionUsingPostResponse>
     */
    public CompletableFuture<ShowBatchUpdateVersionUsingPostResponse> showBatchUpdateVersionUsingPostAsync(
        ShowBatchUpdateVersionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateVersionUsingPost);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateVersionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse>
     */
    public AsyncInvoker<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse> showBatchUpdateVersionUsingPostAsyncInvoker(
        ShowBatchUpdateVersionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateVersionUsingPost, hcClient);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckinUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCheckinUsingPostResponse>
     */
    public CompletableFuture<ShowCheckinUsingPostResponse> showCheckinUsingPostAsync(
        ShowCheckinUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCheckinUsingPost);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckinUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse>
     */
    public AsyncInvoker<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse> showCheckinUsingPostAsyncInvoker(
        ShowCheckinUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCheckinUsingPost, hcClient);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutAndUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCheckoutAndUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowCheckoutAndUpdateUsingPostResponse> showCheckoutAndUpdateUsingPostAsync(
        ShowCheckoutAndUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCheckoutAndUpdateUsingPost);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutAndUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse> showCheckoutAndUpdateUsingPostAsyncInvoker(
        ShowCheckoutAndUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCheckoutAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCheckoutUsingPostResponse>
     */
    public CompletableFuture<ShowCheckoutUsingPostResponse> showCheckoutUsingPostAsync(
        ShowCheckoutUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCheckoutUsingPost);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse>
     */
    public AsyncInvoker<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse> showCheckoutUsingPostAsyncInvoker(
        ShowCheckoutUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareBusinessVersionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCompareBusinessVersionUsingPostResponse>
     */
    public CompletableFuture<ShowCompareBusinessVersionUsingPostResponse> showCompareBusinessVersionUsingPostAsync(
        ShowCompareBusinessVersionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCompareBusinessVersionUsingPost);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareBusinessVersionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse>
     */
    public AsyncInvoker<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse> showCompareBusinessVersionUsingPostAsyncInvoker(
        ShowCompareBusinessVersionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCompareBusinessVersionUsingPost, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCountUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCountUsingPostResponse>
     */
    public CompletableFuture<ShowCountUsingPostResponse> showCountUsingPostAsync(ShowCountUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCountUsingPost);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCountUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCountUsingPostRequest, ShowCountUsingPostResponse>
     */
    public AsyncInvoker<ShowCountUsingPostRequest, ShowCountUsingPostResponse> showCountUsingPostAsyncInvoker(
        ShowCountUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCountUsingPost, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowCreateUsingPostResponse>
     */
    public CompletableFuture<ShowCreateUsingPostResponse> showCreateUsingPostAsync(ShowCreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showCreateUsingPost);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse>
     */
    public AsyncInvoker<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse> showCreateUsingPostAsyncInvoker(
        ShowCreateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showCreateUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteBranchUsingPostRequest 请求对象
     * @return CompletableFuture<ShowDeleteBranchUsingPostResponse>
     */
    public CompletableFuture<ShowDeleteBranchUsingPostResponse> showDeleteBranchUsingPostAsync(
        ShowDeleteBranchUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteBranchUsingPost);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteBranchUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse>
     */
    public AsyncInvoker<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse> showDeleteBranchUsingPostAsyncInvoker(
        ShowDeleteBranchUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteBranchUsingPost, hcClient);
    }

    /**
     * 根据指定条件删除实例
     *
     * 通过此接口，删除指定条件查询返回的实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowDeleteByConditionUsingPostResponse>
     */
    public CompletableFuture<ShowDeleteByConditionUsingPostResponse> showDeleteByConditionUsingPostAsync(
        ShowDeleteByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteByConditionUsingPost);
    }

    /**
     * 根据指定条件删除实例
     *
     * 通过此接口，删除指定条件查询返回的实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse>
     */
    public AsyncInvoker<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse> showDeleteByConditionUsingPostAsyncInvoker(
        ShowDeleteByConditionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteByConditionUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteLatestVersionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowDeleteLatestVersionUsingPostResponse>
     */
    public CompletableFuture<ShowDeleteLatestVersionUsingPostResponse> showDeleteLatestVersionUsingPostAsync(
        ShowDeleteLatestVersionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteLatestVersionUsingPost);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteLatestVersionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse>
     */
    public AsyncInvoker<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse> showDeleteLatestVersionUsingPostAsyncInvoker(
        ShowDeleteLatestVersionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteLatestVersionUsingPost, hcClient);
    }

    /**
     * 删除实例
     *
     * 根据数据实例的唯一编码，删除指定数据模型中的一个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<ShowDeleteUsingPostResponse>
     */
    public CompletableFuture<ShowDeleteUsingPostResponse> showDeleteUsingPostAsync(ShowDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteUsingPost);
    }

    /**
     * 删除实例
     *
     * 根据数据实例的唯一编码，删除指定数据模型中的一个数据实例。
     * 
     * 请您谨慎使用删除操作，实例删除后将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse>
     */
    public AsyncInvoker<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse> showDeleteUsingPostAsyncInvoker(
        ShowDeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteUsingPost, hcClient);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindUsingPostRequest 请求对象
     * @return CompletableFuture<ShowFindUsingPostResponse>
     */
    public CompletableFuture<ShowFindUsingPostResponse> showFindUsingPostAsync(ShowFindUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showFindUsingPost);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse>
     */
    public AsyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPostAsyncInvoker(
        ShowFindUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showFindUsingPost, hcClient);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetAllVersionsUsingPostRequest 请求对象
     * @return CompletableFuture<ShowGetAllVersionsUsingPostResponse>
     */
    public CompletableFuture<ShowGetAllVersionsUsingPostResponse> showGetAllVersionsUsingPostAsync(
        ShowGetAllVersionsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetAllVersionsUsingPost);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetAllVersionsUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse>
     */
    public AsyncInvoker<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse> showGetAllVersionsUsingPostAsyncInvoker(
        ShowGetAllVersionsUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetAllVersionsUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyUsingPostRequest 请求对象
     * @return CompletableFuture<ShowGetByUniqueKeyUsingPostResponse>
     */
    public CompletableFuture<ShowGetByUniqueKeyUsingPostResponse> showGetByUniqueKeyUsingPostAsync(
        ShowGetByUniqueKeyUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetByUniqueKeyUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse>
     */
    public AsyncInvoker<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse> showGetByUniqueKeyUsingPostAsyncInvoker(
        ShowGetByUniqueKeyUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetByUniqueKeyUsingPost, hcClient);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetUsingPostRequest 请求对象
     * @return CompletableFuture<ShowGetUsingPostResponse>
     */
    public CompletableFuture<ShowGetUsingPostResponse> showGetUsingPostAsync(ShowGetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetUsingPost);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse>
     */
    public AsyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPostAsyncInvoker(
        ShowGetUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetUsingPost, hcClient);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetVersionByMasterUsingPostRequest 请求对象
     * @return CompletableFuture<ShowGetVersionByMasterUsingPostResponse>
     */
    public CompletableFuture<ShowGetVersionByMasterUsingPostResponse> showGetVersionByMasterUsingPostAsync(
        ShowGetVersionByMasterUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetVersionByMasterUsingPost);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetVersionByMasterUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse>
     */
    public AsyncInvoker<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse> showGetVersionByMasterUsingPostAsyncInvoker(
        ShowGetVersionByMasterUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetVersionByMasterUsingPost, hcClient);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListUsingPostRequest 请求对象
     * @return CompletableFuture<ShowListUsingPostResponse>
     */
    public CompletableFuture<ShowListUsingPostResponse> showListUsingPostAsync(ShowListUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showListUsingPost);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowListUsingPostRequest, ShowListUsingPostResponse>
     */
    public AsyncInvoker<ShowListUsingPostRequest, ShowListUsingPostResponse> showListUsingPostAsyncInvoker(
        ShowListUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showListUsingPost, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteBranchUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteBranchUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteBranchUsingPostResponse> showLogicalDeleteBranchUsingPostAsync(
        ShowLogicalDeleteBranchUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteBranchUsingPost);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteBranchUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse> showLogicalDeleteBranchUsingPostAsyncInvoker(
        ShowLogicalDeleteBranchUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteBranchUsingPost, hcClient);
    }

    /**
     * 根据指定条件软删除实例
     *
     * 通过此接口，软删除指定条件查询返回的实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteByConditionUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPostAsync(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost);
    }

    /**
     * 根据指定条件软删除实例
     *
     * 通过此接口，软删除指定条件查询返回的实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPostAsyncInvoker(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteLatestVersionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteLatestVersionUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteLatestVersionUsingPostResponse> showLogicalDeleteLatestVersionUsingPostAsync(
        ShowLogicalDeleteLatestVersionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteLatestVersionUsingPost);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteLatestVersionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse> showLogicalDeleteLatestVersionUsingPostAsyncInvoker(
        ShowLogicalDeleteLatestVersionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteLatestVersionUsingPost, hcClient);
    }

    /**
     * 软删除实例
     *
     * 根据数据实例的唯一编码，软删除指定数据模型中的一个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<ShowLogicalDeleteUsingPostResponse>
     */
    public CompletableFuture<ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPostAsync(
        ShowLogicalDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteUsingPost);
    }

    /**
     * 软删除实例
     *
     * 根据数据实例的唯一编码，软删除指定数据模型中的一个数据实例。
     * 
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse>
     */
    public AsyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPostAsyncInvoker(
        ShowLogicalDeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteUsingPost, hcClient);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryUsingPostRequest 请求对象
     * @return CompletableFuture<ShowQueryUsingPostResponse>
     */
    public CompletableFuture<ShowQueryUsingPostResponse> showQueryUsingPostAsync(ShowQueryUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showQueryUsingPost);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse>
     */
    public AsyncInvoker<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse> showQueryUsingPostAsyncInvoker(
        ShowQueryUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showQueryUsingPost, hcClient);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseAndUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowReviseAndUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowReviseAndUpdateUsingPostResponse> showReviseAndUpdateUsingPostAsync(
        ShowReviseAndUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showReviseAndUpdateUsingPost);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseAndUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse> showReviseAndUpdateUsingPostAsyncInvoker(
        ShowReviseAndUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showReviseAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseUsingPostRequest 请求对象
     * @return CompletableFuture<ShowReviseUsingPostResponse>
     */
    public CompletableFuture<ShowReviseUsingPostResponse> showReviseUsingPostAsync(ShowReviseUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showReviseUsingPost);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse>
     */
    public AsyncInvoker<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse> showReviseUsingPostAsyncInvoker(
        ShowReviseUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showReviseUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性更新实例数据
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的所有字段数据。如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * 调用此接口时，建议传入该实例的所有字段信息。如果未传入某个字段，该字段的数据将更新为空值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAllUsingPostRequest 请求对象
     * @return CompletableFuture<ShowSaveAllUsingPostResponse>
     */
    public CompletableFuture<ShowSaveAllUsingPostResponse> showSaveAllUsingPostAsync(
        ShowSaveAllUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showSaveAllUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性更新实例数据
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的所有字段数据。如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * 调用此接口时，建议传入该实例的所有字段信息。如果未传入某个字段，该字段的数据将更新为空值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAllUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse>
     */
    public AsyncInvoker<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse> showSaveAllUsingPostAsyncInvoker(
        ShowSaveAllUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showSaveAllUsingPost, hcClient);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAsUsingPostRequest 请求对象
     * @return CompletableFuture<ShowSaveAsUsingPostResponse>
     */
    public CompletableFuture<ShowSaveAsUsingPostResponse> showSaveAsUsingPostAsync(ShowSaveAsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showSaveAsUsingPost);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAsUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse>
     */
    public AsyncInvoker<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse> showSaveAsUsingPostAsyncInvoker(
        ShowSaveAsUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showSaveAsUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性更新实例的指定字段
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的指定字段数据。
     * 
     * 如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveUsingPostRequest 请求对象
     * @return CompletableFuture<ShowSaveUsingPostResponse>
     */
    public CompletableFuture<ShowSaveUsingPostResponse> showSaveUsingPostAsync(ShowSaveUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showSaveUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性更新实例的指定字段
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性的英文名称更新该数据模型中实例的指定字段数据。
     * 
     * 如果更新的实例不存在，系统将自动创建该实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse>
     */
    public AsyncInvoker<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse> showSaveUsingPostAsyncInvoker(
        ShowSaveUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showSaveUsingPost, hcClient);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSelectUsingPostRequest 请求对象
     * @return CompletableFuture<ShowSelectUsingPostResponse>
     */
    public CompletableFuture<ShowSelectUsingPostResponse> showSelectUsingPostAsync(ShowSelectUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showSelectUsingPost);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSelectUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse>
     */
    public AsyncInvoker<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse> showSelectUsingPostAsyncInvoker(
        ShowSelectUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showSelectUsingPost, hcClient);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsUsingPostRequest 请求对象
     * @return CompletableFuture<ShowStaticsUsingPostResponse>
     */
    public CompletableFuture<ShowStaticsUsingPostResponse> showStaticsUsingPostAsync(
        ShowStaticsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showStaticsUsingPost);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse>
     */
    public AsyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPostAsyncInvoker(
        ShowStaticsUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showStaticsUsingPost, hcClient);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUndoCheckoutByAdminUsingPostResponse>
     */
    public CompletableFuture<ShowUndoCheckoutByAdminUsingPostResponse> showUndoCheckoutByAdminUsingPostAsync(
        ShowUndoCheckoutByAdminUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUndoCheckoutByAdminUsingPost);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse>
     */
    public AsyncInvoker<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse> showUndoCheckoutByAdminUsingPostAsyncInvoker(
        ShowUndoCheckoutByAdminUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUndoCheckoutByAdminUsingPost, hcClient);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUndoCheckoutUsingPostResponse>
     */
    public CompletableFuture<ShowUndoCheckoutUsingPostResponse> showUndoCheckoutUsingPostAsync(
        ShowUndoCheckoutUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUndoCheckoutUsingPost);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse>
     */
    public AsyncInvoker<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse> showUndoCheckoutUsingPostAsyncInvoker(
        ShowUndoCheckoutUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUndoCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateAndCheckinUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUpdateAndCheckinUsingPostResponse>
     */
    public CompletableFuture<ShowUpdateAndCheckinUsingPostResponse> showUpdateAndCheckinUsingPostAsync(
        ShowUpdateAndCheckinUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateAndCheckinUsingPost);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateAndCheckinUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse>
     */
    public AsyncInvoker<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse> showUpdateAndCheckinUsingPostAsyncInvoker(
        ShowUpdateAndCheckinUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateAndCheckinUsingPost, hcClient);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByAdminUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUpdateByAdminUsingPostResponse>
     */
    public CompletableFuture<ShowUpdateByAdminUsingPostResponse> showUpdateByAdminUsingPostAsync(
        ShowUpdateByAdminUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateByAdminUsingPost);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByAdminUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse>
     */
    public AsyncInvoker<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse> showUpdateByAdminUsingPostAsyncInvoker(
        ShowUpdateByAdminUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateByAdminUsingPost, hcClient);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUpdateByConditionUsingPostResponse>
     */
    public CompletableFuture<ShowUpdateByConditionUsingPostResponse> showUpdateByConditionUsingPostAsync(
        ShowUpdateByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateByConditionUsingPost);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse>
     */
    public AsyncInvoker<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse> showUpdateByConditionUsingPostAsyncInvoker(
        ShowUpdateByConditionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateByConditionUsingPost, hcClient);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<ShowUpdateUsingPostResponse>
     */
    public CompletableFuture<ShowUpdateUsingPostResponse> showUpdateUsingPostAsync(ShowUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateUsingPost);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse>
     */
    public AsyncInvoker<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse> showUpdateUsingPostAsyncInvoker(
        ShowUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateUsingPost, hcClient);
    }

}
