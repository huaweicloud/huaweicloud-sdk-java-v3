package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class IDMEClassicAPIClient {

    protected HcClient hcClient;

    public IDMEClassicAPIClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IDMEClassicAPIClient> newBuilder() {
        ClientBuilder<IDMEClassicAPIClient> clientBuilder = new ClientBuilder<>(IDMEClassicAPIClient::new);
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
     * @return BatchCheckinResponse
     */
    public BatchCheckinResponse batchCheckin(BatchCheckinRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckin);
    }

    /**
     * XDM_批量检入VersionModel
     *
     * 根据主对象ID批量检入版本对象，小版本升版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckinRequest 请求对象
     * @return SyncInvoker<BatchCheckinRequest, BatchCheckinResponse>
     */
    public SyncInvoker<BatchCheckinRequest, BatchCheckinResponse> batchCheckinInvoker(BatchCheckinRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckin, hcClient);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutRequest 请求对象
     * @return BatchCheckoutResponse
     */
    public BatchCheckoutResponse batchCheckout(BatchCheckoutRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckout);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutRequest 请求对象
     * @return SyncInvoker<BatchCheckoutRequest, BatchCheckoutResponse>
     */
    public SyncInvoker<BatchCheckoutRequest, BatchCheckoutResponse> batchCheckoutInvoker(BatchCheckoutRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckout, hcClient);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutAndUpdateRequest 请求对象
     * @return BatchCheckoutAndUpdateResponse
     */
    public BatchCheckoutAndUpdateResponse batchCheckoutAndUpdate(BatchCheckoutAndUpdateRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutAndUpdate);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutAndUpdateRequest 请求对象
     * @return SyncInvoker<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse>
     */
    public SyncInvoker<BatchCheckoutAndUpdateRequest, BatchCheckoutAndUpdateResponse> batchCheckoutAndUpdateInvoker(
        BatchCheckoutAndUpdateRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutAndUpdate, hcClient);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoRequest 请求对象
     * @return BatchCheckoutUndoResponse
     */
    public BatchCheckoutUndoResponse batchCheckoutUndo(BatchCheckoutUndoRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutUndo);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoRequest 请求对象
     * @return SyncInvoker<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse>
     */
    public SyncInvoker<BatchCheckoutUndoRequest, BatchCheckoutUndoResponse> batchCheckoutUndoInvoker(
        BatchCheckoutUndoRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutUndo, hcClient);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoByAdminRequest 请求对象
     * @return BatchCheckoutUndoByAdminResponse
     */
    public BatchCheckoutUndoByAdminResponse batchCheckoutUndoByAdmin(BatchCheckoutUndoByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCheckoutUndoByAdmin);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCheckoutUndoByAdminRequest 请求对象
     * @return SyncInvoker<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse>
     */
    public SyncInvoker<BatchCheckoutUndoByAdminRequest, BatchCheckoutUndoByAdminResponse> batchCheckoutUndoByAdminInvoker(
        BatchCheckoutUndoByAdminRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCheckoutUndoByAdmin, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsingPostRequest 请求对象
     * @return BatchCreateUsingPostResponse
     */
    public BatchCreateUsingPostResponse batchCreateUsingPost(BatchCreateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateUsingPost);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateUsingPostRequest 请求对象
     * @return SyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse>
     */
    public SyncInvoker<BatchCreateUsingPostRequest, BatchCreateUsingPostResponse> batchCreateUsingPostInvoker(
        BatchCreateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateUsingPost, hcClient);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return BatchDeleteBranchResponse
     */
    public BatchDeleteBranchResponse batchDeleteBranch(BatchDeleteBranchRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteBranch);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return SyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse>
     */
    public SyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranchInvoker(
        BatchDeleteBranchRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteBranch, hcClient);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalBranchRequest 请求对象
     * @return BatchDeleteLogicalBranchResponse
     */
    public BatchDeleteLogicalBranchResponse batchDeleteLogicalBranch(BatchDeleteLogicalBranchRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalBranch);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalBranchRequest 请求对象
     * @return SyncInvoker<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse>
     */
    public SyncInvoker<BatchDeleteLogicalBranchRequest, BatchDeleteLogicalBranchResponse> batchDeleteLogicalBranchInvoker(
        BatchDeleteLogicalBranchRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalBranch, hcClient);
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
     * @return BatchDeleteLogicalUsingPostResponse
     */
    public BatchDeleteLogicalUsingPostResponse batchDeleteLogicalUsingPost(BatchDeleteLogicalUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalUsingPost);
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
     * @return SyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse>
     */
    public SyncInvoker<BatchDeleteLogicalUsingPostRequest, BatchDeleteLogicalUsingPostResponse> batchDeleteLogicalUsingPostInvoker(
        BatchDeleteLogicalUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalUsingPost, hcClient);
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
     * @return BatchDeleteUsingPostResponse
     */
    public BatchDeleteUsingPostResponse batchDeleteUsingPost(BatchDeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteUsingPost);
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
     * @return SyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse>
     */
    public SyncInvoker<BatchDeleteUsingPostRequest, BatchDeleteUsingPostResponse> batchDeleteUsingPostInvoker(
        BatchDeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteUsingPost, hcClient);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteReviseRequest 请求对象
     * @return BatchExecuteReviseResponse
     */
    public BatchExecuteReviseResponse batchExecuteRevise(BatchExecuteReviseRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchExecuteRevise);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchExecuteReviseRequest 请求对象
     * @return SyncInvoker<BatchExecuteReviseRequest, BatchExecuteReviseResponse>
     */
    public SyncInvoker<BatchExecuteReviseRequest, BatchExecuteReviseResponse> batchExecuteReviseInvoker(
        BatchExecuteReviseRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchExecuteRevise, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowGetUsingPostRequest 请求对象
     * @return BatchShowGetUsingPostResponse
     */
    public BatchShowGetUsingPostResponse batchShowGetUsingPost(BatchShowGetUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchShowGetUsingPost);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowGetUsingPostRequest 请求对象
     * @return SyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse>
     */
    public SyncInvoker<BatchShowGetUsingPostRequest, BatchShowGetUsingPostResponse> batchShowGetUsingPostInvoker(
        BatchShowGetUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchShowGetUsingPost, hcClient);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndCheckinRequest 请求对象
     * @return BatchUpdateAndCheckinResponse
     */
    public BatchUpdateAndCheckinResponse batchUpdateAndCheckin(BatchUpdateAndCheckinRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateAndCheckin);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndCheckinRequest 请求对象
     * @return SyncInvoker<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse>
     */
    public SyncInvoker<BatchUpdateAndCheckinRequest, BatchUpdateAndCheckinResponse> batchUpdateAndCheckinInvoker(
        BatchUpdateAndCheckinRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateAndCheckin, hcClient);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndReviseRequest 请求对象
     * @return BatchUpdateAndReviseResponse
     */
    public BatchUpdateAndReviseResponse batchUpdateAndRevise(BatchUpdateAndReviseRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateAndRevise);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateAndReviseRequest 请求对象
     * @return SyncInvoker<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse>
     */
    public SyncInvoker<BatchUpdateAndReviseRequest, BatchUpdateAndReviseResponse> batchUpdateAndReviseInvoker(
        BatchUpdateAndReviseRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateAndRevise, hcClient);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateByAdminRequest 请求对象
     * @return BatchUpdateByAdminResponse
     */
    public BatchUpdateByAdminResponse batchUpdateByAdmin(BatchUpdateByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateByAdmin);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateByAdminRequest 请求对象
     * @return SyncInvoker<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse>
     */
    public SyncInvoker<BatchUpdateByAdminRequest, BatchUpdateByAdminResponse> batchUpdateByAdminInvoker(
        BatchUpdateByAdminRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateByAdmin, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUsingPostRequest 请求对象
     * @return BatchUpdateUsingPostResponse
     */
    public BatchUpdateUsingPostResponse batchUpdateUsingPost(BatchUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateUsingPost);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse>
     */
    public SyncInvoker<BatchUpdateUsingPostRequest, BatchUpdateUsingPostResponse> batchUpdateUsingPostInvoker(
        BatchUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionRequest 请求对象
     * @return BatchUpdateVersionResponse
     */
    public BatchUpdateVersionResponse batchUpdateVersion(BatchUpdateVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateVersion);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateVersionRequest 请求对象
     * @return SyncInvoker<BatchUpdateVersionRequest, BatchUpdateVersionResponse>
     */
    public SyncInvoker<BatchUpdateVersionRequest, BatchUpdateVersionResponse> batchUpdateVersionInvoker(
        BatchUpdateVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateVersion, hcClient);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckinRequest 请求对象
     * @return CheckinResponse
     */
    public CheckinResponse checkin(CheckinRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.checkin);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckinRequest 请求对象
     * @return SyncInvoker<CheckinRequest, CheckinResponse>
     */
    public SyncInvoker<CheckinRequest, CheckinResponse> checkinInvoker(CheckinRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.checkin, hcClient);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutRequest 请求对象
     * @return CheckoutResponse
     */
    public CheckoutResponse checkout(CheckoutRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.checkout);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutRequest 请求对象
     * @return SyncInvoker<CheckoutRequest, CheckoutResponse>
     */
    public SyncInvoker<CheckoutRequest, CheckoutResponse> checkoutInvoker(CheckoutRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.checkout, hcClient);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutAndUpdateRequest 请求对象
     * @return CheckoutAndUpdateResponse
     */
    public CheckoutAndUpdateResponse checkoutAndUpdate(CheckoutAndUpdateRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.checkoutAndUpdate);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutAndUpdateRequest 请求对象
     * @return SyncInvoker<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse>
     */
    public SyncInvoker<CheckoutAndUpdateRequest, CheckoutAndUpdateResponse> checkoutAndUpdateInvoker(
        CheckoutAndUpdateRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.checkoutAndUpdate, hcClient);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoRequest 请求对象
     * @return CheckoutUndoResponse
     */
    public CheckoutUndoResponse checkoutUndo(CheckoutUndoRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.checkoutUndo);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoRequest 请求对象
     * @return SyncInvoker<CheckoutUndoRequest, CheckoutUndoResponse>
     */
    public SyncInvoker<CheckoutUndoRequest, CheckoutUndoResponse> checkoutUndoInvoker(CheckoutUndoRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.checkoutUndo, hcClient);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoByAdminRequest 请求对象
     * @return CheckoutUndoByAdminResponse
     */
    public CheckoutUndoByAdminResponse checkoutUndoByAdmin(CheckoutUndoByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.checkoutUndoByAdmin);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckoutUndoByAdminRequest 请求对象
     * @return SyncInvoker<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse>
     */
    public SyncInvoker<CheckoutUndoByAdminRequest, CheckoutUndoByAdminResponse> checkoutUndoByAdminInvoker(
        CheckoutUndoByAdminRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.checkoutUndoByAdmin, hcClient);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareBusinessVersionRequest 请求对象
     * @return CompareBusinessVersionResponse
     */
    public CompareBusinessVersionResponse compareBusinessVersion(CompareBusinessVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.compareBusinessVersion);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareBusinessVersionRequest 请求对象
     * @return SyncInvoker<CompareBusinessVersionRequest, CompareBusinessVersionResponse>
     */
    public SyncInvoker<CompareBusinessVersionRequest, CompareBusinessVersionResponse> compareBusinessVersionInvoker(
        CompareBusinessVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.compareBusinessVersion, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountUsingPostRequest 请求对象
     * @return CountUsingPostResponse
     */
    public CountUsingPostResponse countUsingPost(CountUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.countUsingPost);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CountUsingPostRequest 请求对象
     * @return SyncInvoker<CountUsingPostRequest, CountUsingPostResponse>
     */
    public SyncInvoker<CountUsingPostRequest, CountUsingPostResponse> countUsingPostInvoker(
        CountUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.countUsingPost, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsingPostRequest 请求对象
     * @return CreateUsingPostResponse
     */
    public CreateUsingPostResponse createUsingPost(CreateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.createUsingPost);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUsingPostRequest 请求对象
     * @return SyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse>
     */
    public SyncInvoker<CreateUsingPostRequest, CreateUsingPostResponse> createUsingPostInvoker(
        CreateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.createUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return DeleteBranchResponse
     */
    public DeleteBranchResponse deleteBranch(DeleteBranchRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteBranch);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return SyncInvoker<DeleteBranchRequest, DeleteBranchResponse>
     */
    public SyncInvoker<DeleteBranchRequest, DeleteBranchResponse> deleteBranchInvoker(DeleteBranchRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteBranch, hcClient);
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
     * @return DeleteByConditionUsingPostResponse
     */
    public DeleteByConditionUsingPostResponse deleteByConditionUsingPost(DeleteByConditionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteByConditionUsingPost);
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
     * @return SyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse>
     */
    public SyncInvoker<DeleteByConditionUsingPostRequest, DeleteByConditionUsingPostResponse> deleteByConditionUsingPostInvoker(
        DeleteByConditionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteByConditionUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLatestVersionRequest 请求对象
     * @return DeleteLatestVersionResponse
     */
    public DeleteLatestVersionResponse deleteLatestVersion(DeleteLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteLatestVersion);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLatestVersionRequest 请求对象
     * @return SyncInvoker<DeleteLatestVersionRequest, DeleteLatestVersionResponse>
     */
    public SyncInvoker<DeleteLatestVersionRequest, DeleteLatestVersionResponse> deleteLatestVersionInvoker(
        DeleteLatestVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteLatestVersion, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalBranchRequest 请求对象
     * @return DeleteLogicalBranchResponse
     */
    public DeleteLogicalBranchResponse deleteLogicalBranch(DeleteLogicalBranchRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteLogicalBranch);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalBranchRequest 请求对象
     * @return SyncInvoker<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse>
     */
    public SyncInvoker<DeleteLogicalBranchRequest, DeleteLogicalBranchResponse> deleteLogicalBranchInvoker(
        DeleteLogicalBranchRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteLogicalBranch, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalLatestVersionRequest 请求对象
     * @return DeleteLogicalLatestVersionResponse
     */
    public DeleteLogicalLatestVersionResponse deleteLogicalLatestVersion(DeleteLogicalLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteLogicalLatestVersion);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLogicalLatestVersionRequest 请求对象
     * @return SyncInvoker<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse>
     */
    public SyncInvoker<DeleteLogicalLatestVersionRequest, DeleteLogicalLatestVersionResponse> deleteLogicalLatestVersionInvoker(
        DeleteLogicalLatestVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteLogicalLatestVersion, hcClient);
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
     * @return DeleteUsingPostResponse
     */
    public DeleteUsingPostResponse deleteUsingPost(DeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteUsingPost);
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
     * @return SyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse>
     */
    public SyncInvoker<DeleteUsingPostRequest, DeleteUsingPostResponse> deleteUsingPostInvoker(
        DeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteUsingPost, hcClient);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReviseRequest 请求对象
     * @return ExecuteReviseResponse
     */
    public ExecuteReviseResponse executeRevise(ExecuteReviseRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.executeRevise);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteReviseRequest 请求对象
     * @return SyncInvoker<ExecuteReviseRequest, ExecuteReviseResponse>
     */
    public SyncInvoker<ExecuteReviseRequest, ExecuteReviseResponse> executeReviseInvoker(ExecuteReviseRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.executeRevise, hcClient);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionsRequest 请求对象
     * @return ListAllVersionsResponse
     */
    public ListAllVersionsResponse listAllVersions(ListAllVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listAllVersions);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAllVersionsRequest 请求对象
     * @return SyncInvoker<ListAllVersionsRequest, ListAllVersionsResponse>
     */
    public SyncInvoker<ListAllVersionsRequest, ListAllVersionsResponse> listAllVersionsInvoker(
        ListAllVersionsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listAllVersions, hcClient);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryUsingPostRequest 请求对象
     * @return ListQueryUsingPostResponse
     */
    public ListQueryUsingPostResponse listQueryUsingPost(ListQueryUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryUsingPost);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryUsingPostRequest 请求对象
     * @return SyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse>
     */
    public SyncInvoker<ListQueryUsingPostRequest, ListQueryUsingPostResponse> listQueryUsingPostInvoker(
        ListQueryUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryUsingPost, hcClient);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSelectUsingPostRequest 请求对象
     * @return ListSelectUsingPostResponse
     */
    public ListSelectUsingPostResponse listSelectUsingPost(ListSelectUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listSelectUsingPost);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSelectUsingPostRequest 请求对象
     * @return SyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse>
     */
    public SyncInvoker<ListSelectUsingPostRequest, ListSelectUsingPostResponse> listSelectUsingPostInvoker(
        ListSelectUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listSelectUsingPost, hcClient);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingPostRequest 请求对象
     * @return ListUsingPostResponse
     */
    public ListUsingPostResponse listUsingPost(ListUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listUsingPost);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUsingPostRequest 请求对象
     * @return SyncInvoker<ListUsingPostRequest, ListUsingPostResponse>
     */
    public SyncInvoker<ListUsingPostRequest, ListUsingPostResponse> listUsingPostInvoker(ListUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listUsingPost, hcClient);
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
     * @return SaveAllUsingPostResponse
     */
    public SaveAllUsingPostResponse saveAllUsingPost(SaveAllUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.saveAllUsingPost);
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
     * @return SyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse>
     */
    public SyncInvoker<SaveAllUsingPostRequest, SaveAllUsingPostResponse> saveAllUsingPostInvoker(
        SaveAllUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.saveAllUsingPost, hcClient);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsUsingPostRequest 请求对象
     * @return SaveAsUsingPostResponse
     */
    public SaveAsUsingPostResponse saveAsUsingPost(SaveAsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.saveAsUsingPost);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveAsUsingPostRequest 请求对象
     * @return SyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse>
     */
    public SyncInvoker<SaveAsUsingPostRequest, SaveAsUsingPostResponse> saveAsUsingPostInvoker(
        SaveAsUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.saveAsUsingPost, hcClient);
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
     * @return SaveUsingPostResponse
     */
    public SaveUsingPostResponse saveUsingPost(SaveUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.saveUsingPost);
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
     * @return SyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse>
     */
    public SyncInvoker<SaveUsingPostRequest, SaveUsingPostResponse> saveUsingPostInvoker(SaveUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.saveUsingPost, hcClient);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindUsingPostRequest 请求对象
     * @return ShowFindUsingPostResponse
     */
    public ShowFindUsingPostResponse showFindUsingPost(ShowFindUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showFindUsingPost);
    }

    /**
     * 分页查询实例
     *
     * 分页查询指定数据模型中的所有实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindUsingPostRequest 请求对象
     * @return SyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse>
     */
    public SyncInvoker<ShowFindUsingPostRequest, ShowFindUsingPostResponse> showFindUsingPostInvoker(
        ShowFindUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showFindUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyRequest 请求对象
     * @return ShowGetByUniqueKeyResponse
     */
    public ShowGetByUniqueKeyResponse showGetByUniqueKey(ShowGetByUniqueKeyRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetByUniqueKey);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyRequest 请求对象
     * @return SyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse>
     */
    public SyncInvoker<ShowGetByUniqueKeyRequest, ShowGetByUniqueKeyResponse> showGetByUniqueKeyInvoker(
        ShowGetByUniqueKeyRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetByUniqueKey, hcClient);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetUsingPostRequest 请求对象
     * @return ShowGetUsingPostResponse
     */
    public ShowGetUsingPostResponse showGetUsingPost(ShowGetUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetUsingPost);
    }

    /**
     * 查询实例
     *
     * 根据一个数据实例的唯一编码，查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetUsingPostRequest 请求对象
     * @return SyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse>
     */
    public SyncInvoker<ShowGetUsingPostRequest, ShowGetUsingPostResponse> showGetUsingPostInvoker(
        ShowGetUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetUsingPost, hcClient);
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
     * @return ShowLogicalDeleteByConditionUsingPostResponse
     */
    public ShowLogicalDeleteByConditionUsingPostResponse showLogicalDeleteByConditionUsingPost(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost);
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
     * @return SyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse>
     */
    public SyncInvoker<ShowLogicalDeleteByConditionUsingPostRequest, ShowLogicalDeleteByConditionUsingPostResponse> showLogicalDeleteByConditionUsingPostInvoker(
        ShowLogicalDeleteByConditionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteByConditionUsingPost, hcClient);
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
     * @return ShowLogicalDeleteUsingPostResponse
     */
    public ShowLogicalDeleteUsingPostResponse showLogicalDeleteUsingPost(ShowLogicalDeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteUsingPost);
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
     * @return SyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse>
     */
    public SyncInvoker<ShowLogicalDeleteUsingPostRequest, ShowLogicalDeleteUsingPostResponse> showLogicalDeleteUsingPostInvoker(
        ShowLogicalDeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteUsingPost, hcClient);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsUsingPostRequest 请求对象
     * @return ShowStaticsUsingPostResponse
     */
    public ShowStaticsUsingPostResponse showStaticsUsingPost(ShowStaticsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showStaticsUsingPost);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 根据指定函数，统计指定数据模型的实例信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsUsingPostRequest 请求对象
     * @return SyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse>
     */
    public SyncInvoker<ShowStaticsUsingPostRequest, ShowStaticsUsingPostResponse> showStaticsUsingPostInvoker(
        ShowStaticsUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showStaticsUsingPost, hcClient);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionByMasterRequest 请求对象
     * @return ShowVersionByMasterResponse
     */
    public ShowVersionByMasterResponse showVersionByMaster(ShowVersionByMasterRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showVersionByMaster);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVersionByMasterRequest 请求对象
     * @return SyncInvoker<ShowVersionByMasterRequest, ShowVersionByMasterResponse>
     */
    public SyncInvoker<ShowVersionByMasterRequest, ShowVersionByMasterResponse> showVersionByMasterInvoker(
        ShowVersionByMasterRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showVersionByMaster, hcClient);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndCheckinRequest 请求对象
     * @return UpdateAndCheckinResponse
     */
    public UpdateAndCheckinResponse updateAndCheckin(UpdateAndCheckinRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateAndCheckin);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndCheckinRequest 请求对象
     * @return SyncInvoker<UpdateAndCheckinRequest, UpdateAndCheckinResponse>
     */
    public SyncInvoker<UpdateAndCheckinRequest, UpdateAndCheckinResponse> updateAndCheckinInvoker(
        UpdateAndCheckinRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateAndCheckin, hcClient);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndReviseRequest 请求对象
     * @return UpdateAndReviseResponse
     */
    public UpdateAndReviseResponse updateAndRevise(UpdateAndReviseRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateAndRevise);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAndReviseRequest 请求对象
     * @return SyncInvoker<UpdateAndReviseRequest, UpdateAndReviseResponse>
     */
    public SyncInvoker<UpdateAndReviseRequest, UpdateAndReviseResponse> updateAndReviseInvoker(
        UpdateAndReviseRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateAndRevise, hcClient);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByAdminRequest 请求对象
     * @return UpdateByAdminResponse
     */
    public UpdateByAdminResponse updateByAdmin(UpdateByAdminRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateByAdmin);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByAdminRequest 请求对象
     * @return SyncInvoker<UpdateByAdminRequest, UpdateByAdminResponse>
     */
    public SyncInvoker<UpdateByAdminRequest, UpdateByAdminResponse> updateByAdminInvoker(UpdateByAdminRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateByAdmin, hcClient);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByConditionUsingPostRequest 请求对象
     * @return UpdateByConditionUsingPostResponse
     */
    public UpdateByConditionUsingPostResponse updateByConditionUsingPost(UpdateByConditionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateByConditionUsingPost);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateByConditionUsingPostRequest 请求对象
     * @return SyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse>
     */
    public SyncInvoker<UpdateByConditionUsingPostRequest, UpdateByConditionUsingPostResponse> updateByConditionUsingPostInvoker(
        UpdateByConditionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateByConditionUsingPost, hcClient);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUsingPostRequest 请求对象
     * @return UpdateUsingPostResponse
     */
    public UpdateUsingPostResponse updateUsingPost(UpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateUsingPost);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUsingPostRequest 请求对象
     * @return SyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse>
     */
    public SyncInvoker<UpdateUsingPostRequest, UpdateUsingPostResponse> updateUsingPostInvoker(
        UpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateUsingPost, hcClient);
    }

}
