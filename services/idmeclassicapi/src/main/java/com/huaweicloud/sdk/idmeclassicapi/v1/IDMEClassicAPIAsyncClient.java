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
     * 批量检入M-V模型数据实例
     *
     * 根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 批量检入M-V模型数据实例
     *
     * 根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 批量检出M-V模型数据实例
     *
     * 根据主对象ID批量检出M-V模型数据实例。
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
     * 批量检出M-V模型数据实例
     *
     * 根据主对象ID批量检出M-V模型数据实例。
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
     * 批量检出并更新M-V模型
     *
     * 根据主对象ID批量检出并更新M-V模型数据实例。
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
     * 批量检出并更新M-V模型
     *
     * 根据主对象ID批量检出并更新M-V模型数据实例。
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
     * 批量撤销检出M-V模型数据实例
     *
     * 通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 批量撤销检出M-V模型数据实例
     *
     * 通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 管理员批量撤销检出M-V模型数据实例
     *
     * 管理员通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 管理员批量撤销检出M-V模型数据实例
     *
     * 管理员通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 批量删除最新大版本下的所有小版本
     *
     * 根据主对象ID和父模型ID，批量软删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 批量删除最新大版本下的所有小版本
     *
     * 根据主对象ID和父模型ID，批量软删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 批量软删除最新大版本下的所有小版本
     *
     * 根据主对象ID，批量软删除最新大版本下的所有小版本。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 批量软删除最新大版本下的所有小版本
     *
     * 根据主对象ID，批量软删除最新大版本下的所有小版本。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 批量修订M-V模型数据实例
     *
     * 通过此接口批量修订指定M-V模型实例。修订后，实例的“version.修订版本”会更新为新的修订版本。
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
     * 批量修订M-V模型数据实例
     *
     * 通过此接口批量修订指定M-V模型实例。修订后，实例的“version.修订版本”会更新为新的修订版本。
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
     * 批量更新并检入M-V模型数据实例
     *
     * 通过此接口批量更新指定M-V模型实例，并检入这些实例。
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
     * 批量更新并检入M-V模型数据实例
     *
     * 通过此接口批量更新指定M-V模型实例，并检入这些实例。
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
     * 批量修订并更新M-V模型数据实例
     *
     * 根据主对象ID批量修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 批量修订并更新M-V模型数据实例
     *
     * 根据主对象ID批量修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 管理员批量更新M-V模型数据实例
     *
     * 管理员通过此接口批量更新指定M-V模型的指定实例数据。如果某个实例的唯一编码不存在，则不做任何更新操作。
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
     * 管理员批量更新M-V模型数据实例
     *
     * 管理员通过此接口批量更新指定M-V模型的指定实例数据。如果某个实例的唯一编码不存在，则不做任何更新操作。
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
     * 批量升级M-V模型实例的版本号
     *
     * 根据M-V模型实体的唯一编码，批量将该实体下实例的版本号更新至最新版本。
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
     * 批量升级M-V模型实例的版本号
     *
     * 根据M-V模型实体的唯一编码，批量将该实体下实例的版本号更新至最新版本。
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
     * 检入M-V模型数据实例
     *
     * 根据主对象ID检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 检入M-V模型数据实例
     *
     * 根据主对象ID检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 检出M-V模型数据实例
     *
     * 根据主对象ID检出M-V模型数据实例，检出后会生成一个新的数据实例，该实例会完全复制原实例现有的信息，且状态修改为已检出。
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
     * 检出M-V模型数据实例
     *
     * 根据主对象ID检出M-V模型数据实例，检出后会生成一个新的数据实例，该实例会完全复制原实例现有的信息，且状态修改为已检出。
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
     * 检出并更新M-V模型
     *
     * 根据主对象ID检出并更新M-V模型数据实例，即检出后生成一个新的数据实例的同时，更新该新实例的信息。
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
     * 检出并更新M-V模型
     *
     * 根据主对象ID检出并更新M-V模型数据实例，即检出后生成一个新的数据实例的同时，更新该新实例的信息。
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
     * 撤销检出M-V模型数据实例
     *
     * 通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 撤销检出M-V模型数据实例
     *
     * 通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 管理员撤销检出M-V模型数据实例
     *
     * 管理员通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 管理员撤销检出M-V模型数据实例
     *
     * 管理员通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 对比M-V模型实例
     *
     * 通过此接口可以对比某个M-V模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
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
     * 对比M-V模型实例
     *
     * 通过此接口可以对比某个M-V模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
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
     * 删除最新大版本下的所有小版本
     *
     * 根据父模型ID和版本对象，删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 删除最新大版本下的所有小版本
     *
     * 根据父模型ID和版本对象，删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 软删除M-V模型实例下最新分支的所有小版本数据
     *
     * 根据父模型ID和版本对象，软删除M-V模型实例下最新分支的所有小版本数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除M-V模型实例下最新分支的所有小版本数据
     *
     * 根据父模型ID和版本对象，软删除M-V模型实例下最新分支的所有小版本数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 修订M-V模型数据实例
     *
     * 通过此接口修订指定M-V模型实例。修订后，该实例的“version.修订版本”会更新为新的修订版本。
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
     * 修订M-V模型数据实例
     *
     * 通过此接口修订指定M-V模型实例。修订后，该实例的“version.修订版本”会更新为新的修订版本。
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
     * 获取指定M-V模型实例的版本列表
     *
     * 根据主对象ID，获取对应M-V模型实例的所有版本信息（包含对应版本下的属性信息）。
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
     * 获取指定M-V模型实例的版本列表
     *
     * 根据主对象ID，获取对应M-V模型实例的所有版本信息（包含对应版本下的属性信息）。
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
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列）。
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
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列）。
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
     * 获取指定版本的M-V模型实例数据
     *
     * 根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
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
     * 获取指定版本的M-V模型实例数据
     *
     * 根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
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
     * 更新并检入M-V模型数据实例
     *
     * 通过此接口更新指定M-V模型实例，并检入该实例。
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
     * 更新并检入M-V模型数据实例
     *
     * 通过此接口更新指定M-V模型实例，并检入该实例。
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
     * 修订并更新M-V模型数据实例
     *
     * 根据主对象ID修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 修订并更新M-V模型数据实例
     *
     * 根据主对象ID修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 管理员更新M-V模型数据实例
     *
     * 管理员通过此接口更新指定M-V模型的指定实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
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
     * 管理员更新M-V模型数据实例
     *
     * 管理员通过此接口更新指定M-V模型的指定实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
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
