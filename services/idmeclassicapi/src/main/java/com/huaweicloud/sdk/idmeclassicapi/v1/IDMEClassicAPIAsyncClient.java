package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutAndUpdateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CheckoutUndoResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteLogicalLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAllUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveAsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SaveUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowFindUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetByUniqueKeyResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowLogicalDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;

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
     * @param request BatchCheckinRequest 请求对象
     * @return CompletableFuture<BatchCheckinResponse>
     */
    public CompletableFuture<BatchCheckinResponse> batchCheckinAsync(BatchCheckinRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckin);
    }

    /**
     * XDM_批量检入VersionModel
     *
     * 根据主对象ID批量检入版本对象，小版本升版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckinRequest 请求对象
     * @return AsyncInvoker<BatchCheckinRequest, BatchCheckinResponse>
     */
    public AsyncInvoker<BatchCheckinRequest, BatchCheckinResponse> batchCheckinAsyncInvoker(
        BatchCheckinRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckin, hcClient);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutRequest 请求对象
     * @return CompletableFuture<BatchCheckoutResponse>
     */
    public CompletableFuture<BatchCheckoutResponse> batchCheckoutAsync(BatchCheckoutRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckout);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutRequest 请求对象
     * @return AsyncInvoker<BatchCheckoutRequest, BatchCheckoutResponse>
     */
    public AsyncInvoker<BatchCheckoutRequest, BatchCheckoutResponse> batchCheckoutAsyncInvoker(
        BatchCheckoutRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckout, hcClient);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutAndUpdateRequest 请求对象
     * @return CompletableFuture<BatchCheckoutAndUpdateResponse>
     */
    public CompletableFuture<BatchCheckoutAndUpdateResponse> batchCheckoutAndUpdateAsync(
        BatchCheckoutAndUpdateRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutAndUpdate);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutAndUpdateRequest 请求对象
     * @return AsyncInvoker<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse>
     */
    public AsyncInvoker<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> batchCheckoutAndUpdateAsyncInvoker(
        BatchCheckoutAndUpdateRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutAndUpdate, hcClient);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoRequest 请求对象
     * @return CompletableFuture<BatchCheckoutUndoResponse>
     */
    public CompletableFuture<BatchCheckoutUndoResponse> batchCheckoutUndoAsync(BatchCheckoutUndoRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutUndo);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoRequest 请求对象
     * @return AsyncInvoker<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse>
     */
    public AsyncInvoker<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> batchCheckoutUndoAsyncInvoker(
        BatchCheckoutUndoRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutUndo, hcClient);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoByAdminRequest 请求对象
     * @return CompletableFuture<BatchCheckoutUndoByAdminResponse>
     */
    public CompletableFuture<BatchCheckoutUndoByAdminResponse> batchCheckoutUndoByAdminAsync(
        BatchCheckoutUndoByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutUndoByAdmin);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoByAdminRequest 请求对象
     * @return AsyncInvoker<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse>
     */
    public AsyncInvoker<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> batchCheckoutUndoByAdminAsyncInvoker(
        BatchCheckoutUndoByAdminRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutUndoByAdmin, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsingPostRequest 请求对象
     * @return CompletableFuture<BatchCreateUsingPostResponse>
     */
    public CompletableFuture<BatchCreateUsingPostResponse> batchCreateUsingPostAsync(
        BatchCreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateUsingPost);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse>
     */
    public AsyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPostAsyncInvoker(
        BatchCreateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateUsingPost, hcClient);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return CompletableFuture<BatchDeleteBranchResponse>
     */
    public CompletableFuture<BatchDeleteBranchResponse> batchDeleteBranchAsync(BatchDeleteBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteBranch);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse>
     */
    public AsyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranchAsyncInvoker(
        BatchDeleteBranchRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteBranch, hcClient);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalBranchRequest 请求对象
     * @return CompletableFuture<BatchDeleteLogicalBranchResponse>
     */
    public CompletableFuture<BatchDeleteLogicalBranchResponse> batchDeleteLogicalBranchAsync(
        BatchDeleteLogicalBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalBranch);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalBranchRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse>
     */
    public AsyncInvoker<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> batchDeleteLogicalBranchAsyncInvoker(
        BatchDeleteLogicalBranchRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalBranch, hcClient);
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
     * @param request BatchDeleteLogicalUsingPostRequest 请求对象
     * @return CompletableFuture<BatchDeleteLogicalUsingPostResponse>
     */
    public CompletableFuture<BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPostAsync(
        BatchDeleteLogicalUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalUsingPost);
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
     * @param request BatchDeleteLogicalUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse>
     */
    public AsyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPostAsyncInvoker(
        BatchDeleteLogicalUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalUsingPost, hcClient);
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
     * @param request BatchDeleteUsingPostRequest 请求对象
     * @return CompletableFuture<BatchDeleteUsingPostResponse>
     */
    public CompletableFuture<BatchDeleteUsingPostResponse> batchDeleteUsingPostAsync(
        BatchDeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteUsingPost);
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
     * @param request BatchDeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse>
     */
    public AsyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPostAsyncInvoker(
        BatchDeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteUsingPost, hcClient);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteReviseRequest 请求对象
     * @return CompletableFuture<BatchExecuteReviseResponse>
     */
    public CompletableFuture<BatchExecuteReviseResponse> batchExecuteReviseAsync(BatchExecuteReviseRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchExecuteRevise);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteReviseRequest 请求对象
     * @return AsyncInvoker<BatchExecuteReviseRequest, BatchExecuteReviseResponse>
     */
    public AsyncInvoker<BatchExecuteReviseRequest, BatchExecuteReviseResponse> batchExecuteReviseAsyncInvoker(
        BatchExecuteReviseRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchExecuteRevise, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowGetUsingPostRequest 请求对象
     * @return CompletableFuture<BatchShowGetUsingPostResponse>
     */
    public CompletableFuture<BatchShowGetUsingPostResponse> batchShowGetUsingPostAsync(
        BatchShowGetUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchShowGetUsingPost);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowGetUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse>
     */
    public AsyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPostAsyncInvoker(
        BatchShowGetUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchShowGetUsingPost, hcClient);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndCheckinRequest 请求对象
     * @return CompletableFuture<BatchUpdateAndCheckinResponse>
     */
    public CompletableFuture<BatchUpdateAndCheckinResponse> batchUpdateAndCheckinAsync(
        BatchUpdateAndCheckinRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateAndCheckin);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndCheckinRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse>
     */
    public AsyncInvoker<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> batchUpdateAndCheckinAsyncInvoker(
        BatchUpdateAndCheckinRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateAndCheckin, hcClient);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndReviseRequest 请求对象
     * @return CompletableFuture<BatchUpdateAndReviseResponse>
     */
    public CompletableFuture<BatchUpdateAndReviseResponse> batchUpdateAndReviseAsync(
        BatchUpdateAndReviseRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateAndRevise);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndReviseRequest 请求对象
     * @return AsyncInvoker<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse>
     */
    public AsyncInvoker<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> batchUpdateAndReviseAsyncInvoker(
        BatchUpdateAndReviseRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateAndRevise, hcClient);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateByAdminRequest 请求对象
     * @return CompletableFuture<BatchUpdateByAdminResponse>
     */
    public CompletableFuture<BatchUpdateByAdminResponse> batchUpdateByAdminAsync(BatchUpdateByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateByAdmin);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateByAdminRequest 请求对象
     * @return AsyncInvoker<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse>
     */
    public AsyncInvoker<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> batchUpdateByAdminAsyncInvoker(
        BatchUpdateByAdminRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateByAdmin, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUsingPostRequest 请求对象
     * @return CompletableFuture<BatchUpdateUsingPostResponse>
     */
    public CompletableFuture<BatchUpdateUsingPostResponse> batchUpdateUsingPostAsync(
        BatchUpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateUsingPost);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse>
     */
    public AsyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPostAsyncInvoker(
        BatchUpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionRequest 请求对象
     * @return CompletableFuture<BatchUpdateVersionResponse>
     */
    public CompletableFuture<BatchUpdateVersionResponse> batchUpdateVersionAsync(BatchUpdateVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateVersion);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionRequest 请求对象
     * @return AsyncInvoker<BatchUpdateVersionRequest, BatchUpdateVersionResponse>
     */
    public AsyncInvoker<BatchUpdateVersionRequest, BatchUpdateVersionResponse> batchUpdateVersionAsyncInvoker(
        BatchUpdateVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateVersion, hcClient);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckinRequest 请求对象
     * @return CompletableFuture<CheckinResponse>
     */
    public CompletableFuture<CheckinResponse> checkinAsync(CheckinRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.checkin);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckinRequest 请求对象
     * @return AsyncInvoker<CheckinRequest, CheckinResponse>
     */
    public AsyncInvoker<CheckinRequest, CheckinResponse> checkinAsyncInvoker(CheckinRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.checkin, hcClient);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutRequest 请求对象
     * @return CompletableFuture<CheckoutResponse>
     */
    public CompletableFuture<CheckoutResponse> checkoutAsync(CheckoutRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.checkout);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutRequest 请求对象
     * @return AsyncInvoker<CheckoutRequest, CheckoutResponse>
     */
    public AsyncInvoker<CheckoutRequest, CheckoutResponse> checkoutAsyncInvoker(CheckoutRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.checkout, hcClient);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutAndUpdateRequest 请求对象
     * @return CompletableFuture<CheckoutAndUpdateResponse>
     */
    public CompletableFuture<CheckoutAndUpdateResponse> checkoutAndUpdateAsync(CheckoutAndUpdateRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.checkoutAndUpdate);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutAndUpdateRequest 请求对象
     * @return AsyncInvoker<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse>
     */
    public AsyncInvoker<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> checkoutAndUpdateAsyncInvoker(
        CheckoutAndUpdateRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.checkoutAndUpdate, hcClient);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoRequest 请求对象
     * @return CompletableFuture<CheckoutUndoResponse>
     */
    public CompletableFuture<CheckoutUndoResponse> checkoutUndoAsync(CheckoutUndoRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.checkoutUndo);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoRequest 请求对象
     * @return AsyncInvoker<CheckoutUndoRequest, CheckoutUndoResponse>
     */
    public AsyncInvoker<CheckoutUndoRequest, CheckoutUndoResponse> checkoutUndoAsyncInvoker(
        CheckoutUndoRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.checkoutUndo, hcClient);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoByAdminRequest 请求对象
     * @return CompletableFuture<CheckoutUndoByAdminResponse>
     */
    public CompletableFuture<CheckoutUndoByAdminResponse> checkoutUndoByAdminAsync(CheckoutUndoByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.checkoutUndoByAdmin);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoByAdminRequest 请求对象
     * @return AsyncInvoker<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse>
     */
    public AsyncInvoker<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> checkoutUndoByAdminAsyncInvoker(
        CheckoutUndoByAdminRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.checkoutUndoByAdmin, hcClient);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareBusinessVersionRequest 请求对象
     * @return CompletableFuture<CompareBusinessVersionResponse>
     */
    public CompletableFuture<CompareBusinessVersionResponse> compareBusinessVersionAsync(
        CompareBusinessVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.compareBusinessVersion);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareBusinessVersionRequest 请求对象
     * @return AsyncInvoker<CompareBusinessVersionRequest, CompareBusinessVersionResponse>
     */
    public AsyncInvoker<CompareBusinessVersionRequest, CompareBusinessVersionResponse> compareBusinessVersionAsyncInvoker(
        CompareBusinessVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.compareBusinessVersion, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountUsingPostRequest 请求对象
     * @return CompletableFuture<CountUsingPostResponse>
     */
    public CompletableFuture<CountUsingPostResponse> countUsingPostAsync(CountUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.countUsingPost);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountUsingPostRequest 请求对象
     * @return AsyncInvoker<CountUsingPostRequest, CountUsingPostResponse>
     */
    public AsyncInvoker<CountUsingPostRequest, CountUsingPostResponse> countUsingPostAsyncInvoker(
        CountUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.countUsingPost, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsingPostRequest 请求对象
     * @return CompletableFuture<CreateUsingPostResponse>
     */
    public CompletableFuture<CreateUsingPostResponse> createUsingPostAsync(CreateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.createUsingPost);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsingPostRequest 请求对象
     * @return AsyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse>
     */
    public AsyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPostAsyncInvoker(
        CreateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.createUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return CompletableFuture<DeleteBranchResponse>
     */
    public CompletableFuture<DeleteBranchResponse> deleteBranchAsync(DeleteBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteBranch);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return AsyncInvoker<DeleteBranchRequest, DeleteBranchResponse>
     */
    public AsyncInvoker<DeleteBranchRequest, DeleteBranchResponse> deleteBranchAsyncInvoker(
        DeleteBranchRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteBranch, hcClient);
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
     * @param request DeleteByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<DeleteByConditionUsingPostResponse>
     */
    public CompletableFuture<DeleteByConditionUsingPostResponse> deleteByConditionUsingPostAsync(
        DeleteByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteByConditionUsingPost);
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
     * @param request DeleteByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse>
     */
    public AsyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPostAsyncInvoker(
        DeleteByConditionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteByConditionUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLatestVersionRequest 请求对象
     * @return CompletableFuture<DeleteLatestVersionResponse>
     */
    public CompletableFuture<DeleteLatestVersionResponse> deleteLatestVersionAsync(DeleteLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteLatestVersion);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLatestVersionRequest 请求对象
     * @return AsyncInvoker<DeleteLatestVersionRequest, DeleteLatestVersionResponse>
     */
    public AsyncInvoker<DeleteLatestVersionRequest, DeleteLatestVersionResponse> deleteLatestVersionAsyncInvoker(
        DeleteLatestVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteLatestVersion, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalBranchRequest 请求对象
     * @return CompletableFuture<DeleteLogicalBranchResponse>
     */
    public CompletableFuture<DeleteLogicalBranchResponse> deleteLogicalBranchAsync(DeleteLogicalBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteLogicalBranch);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalBranchRequest 请求对象
     * @return AsyncInvoker<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse>
     */
    public AsyncInvoker<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> deleteLogicalBranchAsyncInvoker(
        DeleteLogicalBranchRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteLogicalBranch, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalLatestVersionRequest 请求对象
     * @return CompletableFuture<DeleteLogicalLatestVersionResponse>
     */
    public CompletableFuture<DeleteLogicalLatestVersionResponse> deleteLogicalLatestVersionAsync(
        DeleteLogicalLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteLogicalLatestVersion);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalLatestVersionRequest 请求对象
     * @return AsyncInvoker<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse>
     */
    public AsyncInvoker<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> deleteLogicalLatestVersionAsyncInvoker(
        DeleteLogicalLatestVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteLogicalLatestVersion, hcClient);
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
     * @param request DeleteUsingPostRequest 请求对象
     * @return CompletableFuture<DeleteUsingPostResponse>
     */
    public CompletableFuture<DeleteUsingPostResponse> deleteUsingPostAsync(DeleteUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteUsingPost);
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
     * @param request DeleteUsingPostRequest 请求对象
     * @return AsyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse>
     */
    public AsyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPostAsyncInvoker(
        DeleteUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteUsingPost, hcClient);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReviseRequest 请求对象
     * @return CompletableFuture<ExecuteReviseResponse>
     */
    public CompletableFuture<ExecuteReviseResponse> executeReviseAsync(ExecuteReviseRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.executeRevise);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReviseRequest 请求对象
     * @return AsyncInvoker<ExecuteReviseRequest, ExecuteReviseResponse>
     */
    public AsyncInvoker<ExecuteReviseRequest, ExecuteReviseResponse> executeReviseAsyncInvoker(
        ExecuteReviseRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.executeRevise, hcClient);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionsRequest 请求对象
     * @return CompletableFuture<ListAllVersionsResponse>
     */
    public CompletableFuture<ListAllVersionsResponse> listAllVersionsAsync(ListAllVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listAllVersions);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionsRequest 请求对象
     * @return AsyncInvoker<ListAllVersionsRequest, ListAllVersionsResponse>
     */
    public AsyncInvoker<ListAllVersionsRequest, ListAllVersionsResponse> listAllVersionsAsyncInvoker(
        ListAllVersionsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listAllVersions, hcClient);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryUsingPostRequest 请求对象
     * @return CompletableFuture<ListQueryUsingPostResponse>
     */
    public CompletableFuture<ListQueryUsingPostResponse> listQueryUsingPostAsync(ListQueryUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryUsingPost);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryUsingPostRequest 请求对象
     * @return AsyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse>
     */
    public AsyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPostAsyncInvoker(
        ListQueryUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryUsingPost, hcClient);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSelectUsingPostRequest 请求对象
     * @return CompletableFuture<ListSelectUsingPostResponse>
     */
    public CompletableFuture<ListSelectUsingPostResponse> listSelectUsingPostAsync(ListSelectUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listSelectUsingPost);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSelectUsingPostRequest 请求对象
     * @return AsyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse>
     */
    public AsyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPostAsyncInvoker(
        ListSelectUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listSelectUsingPost, hcClient);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingPostRequest 请求对象
     * @return CompletableFuture<ListUsingPostResponse>
     */
    public CompletableFuture<ListUsingPostResponse> listUsingPostAsync(ListUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listUsingPost);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingPostRequest 请求对象
     * @return AsyncInvoker<ListUsingPostRequest, ListUsingPostResponse>
     */
    public AsyncInvoker<ListUsingPostRequest, ListUsingPostResponse> listUsingPostAsyncInvoker(
        ListUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listUsingPost, hcClient);
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
     * @param request SaveAllUsingPostRequest 请求对象
     * @return CompletableFuture<SaveAllUsingPostResponse>
     */
    public CompletableFuture<SaveAllUsingPostResponse> saveAllUsingPostAsync(SaveAllUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveAllUsingPost);
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
     * @param request SaveAllUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse>
     */
    public AsyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPostAsyncInvoker(
        SaveAllUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.saveAllUsingPost, hcClient);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsUsingPostRequest 请求对象
     * @return CompletableFuture<SaveAsUsingPostResponse>
     */
    public CompletableFuture<SaveAsUsingPostResponse> saveAsUsingPostAsync(SaveAsUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveAsUsingPost);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse>
     */
    public AsyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPostAsyncInvoker(
        SaveAsUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.saveAsUsingPost, hcClient);
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
     * @param request SaveUsingPostRequest 请求对象
     * @return CompletableFuture<SaveUsingPostResponse>
     */
    public CompletableFuture<SaveUsingPostResponse> saveUsingPostAsync(SaveUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.saveUsingPost);
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
     * @param request SaveUsingPostRequest 请求对象
     * @return AsyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse>
     */
    public AsyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPostAsyncInvoker(
        SaveUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.saveUsingPost, hcClient);
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
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyRequest 请求对象
     * @return CompletableFuture<ShowGetByUniqueKeyResponse>
     */
    public CompletableFuture<ShowGetByUniqueKeyResponse> showGetByUniqueKeyAsync(ShowGetByUniqueKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetByUniqueKey);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyRequest 请求对象
     * @return AsyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse>
     */
    public AsyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKeyAsyncInvoker(
        ShowGetByUniqueKeyRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetByUniqueKey, hcClient);
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
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionByMasterRequest 请求对象
     * @return CompletableFuture<ShowVersionByMasterResponse>
     */
    public CompletableFuture<ShowVersionByMasterResponse> showVersionByMasterAsync(ShowVersionByMasterRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showVersionByMaster);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionByMasterRequest 请求对象
     * @return AsyncInvoker<ShowVersionByMasterRequest, ShowVersionByMasterResponse>
     */
    public AsyncInvoker<ShowVersionByMasterRequest, ShowVersionByMasterResponse> showVersionByMasterAsyncInvoker(
        ShowVersionByMasterRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showVersionByMaster, hcClient);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndCheckinRequest 请求对象
     * @return CompletableFuture<UpdateAndCheckinResponse>
     */
    public CompletableFuture<UpdateAndCheckinResponse> updateAndCheckinAsync(UpdateAndCheckinRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateAndCheckin);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndCheckinRequest 请求对象
     * @return AsyncInvoker<UpdateAndCheckinRequest, UpdateAndCheckinResponse>
     */
    public AsyncInvoker<UpdateAndCheckinRequest, UpdateAndCheckinResponse> updateAndCheckinAsyncInvoker(
        UpdateAndCheckinRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateAndCheckin, hcClient);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndReviseRequest 请求对象
     * @return CompletableFuture<UpdateAndReviseResponse>
     */
    public CompletableFuture<UpdateAndReviseResponse> updateAndReviseAsync(UpdateAndReviseRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateAndRevise);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndReviseRequest 请求对象
     * @return AsyncInvoker<UpdateAndReviseRequest, UpdateAndReviseResponse>
     */
    public AsyncInvoker<UpdateAndReviseRequest, UpdateAndReviseResponse> updateAndReviseAsyncInvoker(
        UpdateAndReviseRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateAndRevise, hcClient);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByAdminRequest 请求对象
     * @return CompletableFuture<UpdateByAdminResponse>
     */
    public CompletableFuture<UpdateByAdminResponse> updateByAdminAsync(UpdateByAdminRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateByAdmin);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByAdminRequest 请求对象
     * @return AsyncInvoker<UpdateByAdminRequest, UpdateByAdminResponse>
     */
    public AsyncInvoker<UpdateByAdminRequest, UpdateByAdminResponse> updateByAdminAsyncInvoker(
        UpdateByAdminRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateByAdmin, hcClient);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByConditionUsingPostRequest 请求对象
     * @return CompletableFuture<UpdateByConditionUsingPostResponse>
     */
    public CompletableFuture<UpdateByConditionUsingPostResponse> updateByConditionUsingPostAsync(
        UpdateByConditionUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateByConditionUsingPost);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByConditionUsingPostRequest 请求对象
     * @return AsyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse>
     */
    public AsyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPostAsyncInvoker(
        UpdateByConditionUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateByConditionUsingPost, hcClient);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUsingPostRequest 请求对象
     * @return CompletableFuture<UpdateUsingPostResponse>
     */
    public CompletableFuture<UpdateUsingPostResponse> updateUsingPostAsync(UpdateUsingPostRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateUsingPost);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUsingPostRequest 请求对象
     * @return AsyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse>
     */
    public AsyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPostAsyncInvoker(
        UpdateUsingPostRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateUsingPost, hcClient);
    }

}
