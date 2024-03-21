package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CollectHistoryDataRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CollectHistoryDataResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareBusinessVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateMultiViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteByConditionMultiViewResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DisableDataInstanceRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DisableDataInstanceResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.EnableDataInstanceRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.EnableDataInstanceResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.GenerateBusinessCodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.GenerateBusinessCodeResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListAllVersionsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveTagResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowTagResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowVersionByMasterResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SwitchLifecycleTemplateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.SwitchLifecycleTemplateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateByConditionUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewResponse;

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
     * 添加标签
     *
     * 给模型实例数据添加标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagRequest 请求对象
     * @return AddTagResponse
     */
    public AddTagResponse addTag(AddTagRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.addTag);
    }

    /**
     * 添加标签
     *
     * 给模型实例数据添加标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagRequest 请求对象
     * @return SyncInvoker<AddTagRequest, AddTagResponse>
     */
    public SyncInvoker<AddTagRequest, AddTagResponse> addTagInvoker(AddTagRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.addTag, hcClient);
    }

    /**
     * 批量检入M-V模型数据实例
     *
     * 根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 批量检入M-V模型数据实例
     *
     * 根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 批量检出M-V模型数据实例
     *
     * 根据主对象ID批量检出M-V模型数据实例。
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
     * 批量检出M-V模型数据实例
     *
     * 根据主对象ID批量检出M-V模型数据实例。
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
     * 批量检出并更新M-V模型
     *
     * 根据主对象ID批量检出并更新M-V模型数据实例。
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
     * 批量检出并更新M-V模型
     *
     * 根据主对象ID批量检出并更新M-V模型数据实例。
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
     * 批量撤销检出M-V模型数据实例
     *
     * 通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 批量撤销检出M-V模型数据实例
     *
     * 通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 管理员批量撤销检出M-V模型数据实例
     *
     * 管理员通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 管理员批量撤销检出M-V模型数据实例
     *
     * 管理员通过此接口批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
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
     * 批量创建视图
     *
     * 通过模型版本对象ID和视图对象ID批量创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateViewRequest 请求对象
     * @return BatchCreateViewResponse
     */
    public BatchCreateViewResponse batchCreateView(BatchCreateViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateView);
    }

    /**
     * 批量创建视图
     *
     * 通过模型版本对象ID和视图对象ID批量创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateViewRequest 请求对象
     * @return SyncInvoker<BatchCreateViewRequest, BatchCreateViewResponse>
     */
    public SyncInvoker<BatchCreateViewRequest, BatchCreateViewResponse> batchCreateViewInvoker(
        BatchCreateViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateView, hcClient);
    }

    /**
     * 批量删除最新大版本下的所有小版本
     *
     * 根据主对象ID和父模型ID，批量软删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 批量删除最新大版本下的所有小版本
     *
     * 根据主对象ID和父模型ID，批量软删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 批量软删除最新大版本下的所有小版本
     *
     * 根据主对象ID，批量软删除最新大版本下的所有小版本。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 批量软删除最新大版本下的所有小版本
     *
     * 根据主对象ID，批量软删除最新大版本下的所有小版本。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 批量修订M-V模型数据实例
     *
     * 通过此接口批量修订指定M-V模型实例。修订后，实例的“version.修订版本”会更新为新的修订版本。
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
     * 批量修订M-V模型数据实例
     *
     * 通过此接口批量修订指定M-V模型实例。修订后，实例的“version.修订版本”会更新为新的修订版本。
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
     * 批量更新并检入M-V模型数据实例
     *
     * 通过此接口批量更新指定M-V模型实例，并检入这些实例。
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
     * 批量更新并检入M-V模型数据实例
     *
     * 通过此接口批量更新指定M-V模型实例，并检入这些实例。
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
     * 批量修订并更新M-V模型数据实例
     *
     * 根据主对象ID批量修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 批量修订并更新M-V模型数据实例
     *
     * 根据主对象ID批量修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 管理员批量更新M-V模型数据实例
     *
     * 管理员通过此接口批量更新指定M-V模型的指定实例数据。如果某个实例的唯一编码不存在，则不做任何更新操作。
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
     * 管理员批量更新M-V模型数据实例
     *
     * 管理员通过此接口批量更新指定M-V模型的指定实例数据。如果某个实例的唯一编码不存在，则不做任何更新操作。
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
     * 批量升级M-V模型实例的版本号
     *
     * 根据M-V模型实体的唯一编码，批量将该实体下实例的版本号更新至最新版本。
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
     * 批量升级M-V模型实例的版本号
     *
     * 根据M-V模型实体的唯一编码，批量将该实体下实例的版本号更新至最新版本。
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
     * 检入M-V模型数据实例
     *
     * 根据主对象ID检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 检入M-V模型数据实例
     *
     * 根据主对象ID检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
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
     * 检出M-V模型数据实例
     *
     * 根据主对象ID检出M-V模型数据实例，检出后会生成一个新的数据实例，该实例会完全复制原实例现有的信息，且状态修改为已检出。
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
     * 检出M-V模型数据实例
     *
     * 根据主对象ID检出M-V模型数据实例，检出后会生成一个新的数据实例，该实例会完全复制原实例现有的信息，且状态修改为已检出。
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
     * 检出并更新M-V模型
     *
     * 根据主对象ID检出并更新M-V模型数据实例，即检出后生成一个新的数据实例的同时，更新该新实例的信息。
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
     * 检出并更新M-V模型
     *
     * 根据主对象ID检出并更新M-V模型数据实例，即检出后生成一个新的数据实例的同时，更新该新实例的信息。
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
     * 撤销检出M-V模型数据实例
     *
     * 通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 撤销检出M-V模型数据实例
     *
     * 通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 管理员撤销检出M-V模型数据实例
     *
     * 管理员通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 管理员撤销检出M-V模型数据实例
     *
     * 管理员通过此接口撤销指定M-V模型实例的检出，将实例数据还原至检出前的内容。
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
     * 统计模型历史数据
     *
     * 根据开始时间&amp;结束时间统计这段时间内各操作类型（创建、更新、软删除、硬删除）的数据量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHistoryDataRequest 请求对象
     * @return CollectHistoryDataResponse
     */
    public CollectHistoryDataResponse collectHistoryData(CollectHistoryDataRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.collectHistoryData);
    }

    /**
     * 统计模型历史数据
     *
     * 根据开始时间&amp;结束时间统计这段时间内各操作类型（创建、更新、软删除、硬删除）的数据量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHistoryDataRequest 请求对象
     * @return SyncInvoker<CollectHistoryDataRequest, CollectHistoryDataResponse>
     */
    public SyncInvoker<CollectHistoryDataRequest, CollectHistoryDataResponse> collectHistoryDataInvoker(
        CollectHistoryDataRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.collectHistoryData, hcClient);
    }

    /**
     * 对比M-V模型实例
     *
     * 通过此接口可以对比某个M-V模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
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
     * 对比M-V模型实例
     *
     * 通过此接口可以对比某个M-V模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
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
     * 创建视图对象
     *
     * 通过接口创建多视图MV对象实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiViewRequest 请求对象
     * @return CreateMultiViewResponse
     */
    public CreateMultiViewResponse createMultiView(CreateMultiViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.createMultiView);
    }

    /**
     * 创建视图对象
     *
     * 通过接口创建多视图MV对象实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiViewRequest 请求对象
     * @return SyncInvoker<CreateMultiViewRequest, CreateMultiViewResponse>
     */
    public SyncInvoker<CreateMultiViewRequest, CreateMultiViewResponse> createMultiViewInvoker(
        CreateMultiViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.createMultiView, hcClient);
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
     * 创建视图
     *
     * 通过模型版本对象ID和视图对象ID创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateViewRequest 请求对象
     * @return CreateViewResponse
     */
    public CreateViewResponse createView(CreateViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.createView);
    }

    /**
     * 创建视图
     *
     * 通过模型版本对象ID和视图对象ID创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateViewRequest 请求对象
     * @return SyncInvoker<CreateViewRequest, CreateViewResponse>
     */
    public SyncInvoker<CreateViewRequest, CreateViewResponse> createViewInvoker(CreateViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.createView, hcClient);
    }

    /**
     * 删除最新大版本下的所有小版本
     *
     * 根据父模型ID和版本对象，删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 删除最新大版本下的所有小版本
     *
     * 根据父模型ID和版本对象，删除最新大版本下的所有小版本。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 条件删除模型
     *
     * 条件删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteByConditionMultiViewRequest 请求对象
     * @return DeleteByConditionMultiViewResponse
     */
    public DeleteByConditionMultiViewResponse deleteByConditionMultiView(DeleteByConditionMultiViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteByConditionMultiView);
    }

    /**
     * 条件删除模型
     *
     * 条件删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteByConditionMultiViewRequest 请求对象
     * @return SyncInvoker<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse>
     */
    public SyncInvoker<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse> deleteByConditionMultiViewInvoker(
        DeleteByConditionMultiViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteByConditionMultiView, hcClient);
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
     * 删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
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
     * 软删除M-V模型实例下最新分支的所有小版本数据
     *
     * 根据父模型ID和版本对象，软删除M-V模型实例下最新分支的所有小版本数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除M-V模型实例下最新分支的所有小版本数据
     *
     * 根据父模型ID和版本对象，软删除M-V模型实例下最新分支的所有小版本数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
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
     * 失效模型数据实例
     *
     * 根据对象ID失效对应实例数据，返回失效成功数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataInstanceRequest 请求对象
     * @return DisableDataInstanceResponse
     */
    public DisableDataInstanceResponse disableDataInstance(DisableDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.disableDataInstance);
    }

    /**
     * 失效模型数据实例
     *
     * 根据对象ID失效对应实例数据，返回失效成功数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataInstanceRequest 请求对象
     * @return SyncInvoker<DisableDataInstanceRequest, DisableDataInstanceResponse>
     */
    public SyncInvoker<DisableDataInstanceRequest, DisableDataInstanceResponse> disableDataInstanceInvoker(
        DisableDataInstanceRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.disableDataInstance, hcClient);
    }

    /**
     * 生效模型数据实例
     *
     * 根据对象ID生效对应实例数据，返回生效成功数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataInstanceRequest 请求对象
     * @return EnableDataInstanceResponse
     */
    public EnableDataInstanceResponse enableDataInstance(EnableDataInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.enableDataInstance);
    }

    /**
     * 生效模型数据实例
     *
     * 根据对象ID生效对应实例数据，返回生效成功数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataInstanceRequest 请求对象
     * @return SyncInvoker<EnableDataInstanceRequest, EnableDataInstanceResponse>
     */
    public SyncInvoker<EnableDataInstanceRequest, EnableDataInstanceResponse> enableDataInstanceInvoker(
        EnableDataInstanceRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.enableDataInstance, hcClient);
    }

    /**
     * 修订M-V模型数据实例
     *
     * 通过此接口修订指定M-V模型实例。修订后，该实例的“version.修订版本”会更新为新的修订版本。
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
     * 修订M-V模型数据实例
     *
     * 通过此接口修订指定M-V模型实例。修订后，该实例的“version.修订版本”会更新为新的修订版本。
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
     * 新增模型业务编码
     *
     * 调用接口生成模型业务编码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateBusinessCodeRequest 请求对象
     * @return GenerateBusinessCodeResponse
     */
    public GenerateBusinessCodeResponse generateBusinessCode(GenerateBusinessCodeRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.generateBusinessCode);
    }

    /**
     * 新增模型业务编码
     *
     * 调用接口生成模型业务编码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateBusinessCodeRequest 请求对象
     * @return SyncInvoker<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse>
     */
    public SyncInvoker<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse> generateBusinessCodeInvoker(
        GenerateBusinessCodeRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.generateBusinessCode, hcClient);
    }

    /**
     * 获取指定M-V模型实例的版本列表
     *
     * 根据主对象ID，获取对应M-V模型实例的所有版本信息（包含对应版本下的属性信息）。
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
     * 获取指定M-V模型实例的版本列表
     *
     * 根据主对象ID，获取对应M-V模型实例的所有版本信息（包含对应版本下的属性信息）。
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
     * 分页查询模型历史版本信息
     *
     * 根据对象入参分页查询满足条件的系统版本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDataRequest 请求对象
     * @return ListHistoryDataResponse
     */
    public ListHistoryDataResponse listHistoryData(ListHistoryDataRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listHistoryData);
    }

    /**
     * 分页查询模型历史版本信息
     *
     * 根据对象入参分页查询满足条件的系统版本详细信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDataRequest 请求对象
     * @return SyncInvoker<ListHistoryDataRequest, ListHistoryDataResponse>
     */
    public SyncInvoker<ListHistoryDataRequest, ListHistoryDataResponse> listHistoryDataInvoker(
        ListHistoryDataRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listHistoryData, hcClient);
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
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列）。
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
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列）。
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
     * 删除标签
     *
     * 删除模型实例数据绑定的标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveTagRequest 请求对象
     * @return RemoveTagResponse
     */
    public RemoveTagResponse removeTag(RemoveTagRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.removeTag);
    }

    /**
     * 删除标签
     *
     * 删除模型实例数据绑定的标签数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveTagRequest 请求对象
     * @return SyncInvoker<RemoveTagRequest, RemoveTagResponse>
     */
    public SyncInvoker<RemoveTagRequest, RemoveTagResponse> removeTagInvoker(RemoveTagRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.removeTag, hcClient);
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
     * 查询实例标签详细信息
     *
     * 根据对象ID获取数据实例标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return ShowTagResponse
     */
    public ShowTagResponse showTag(ShowTagRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showTag);
    }

    /**
     * 查询实例标签详细信息
     *
     * 根据对象ID获取数据实例标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return SyncInvoker<ShowTagRequest, ShowTagResponse>
     */
    public SyncInvoker<ShowTagRequest, ShowTagResponse> showTagInvoker(ShowTagRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showTag, hcClient);
    }

    /**
     * 获取指定版本的M-V模型实例数据
     *
     * 根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
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
     * 获取指定版本的M-V模型实例数据
     *
     * 根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
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
     * 切换模型生命周期模板或状态
     *
     * 根据对象ID重新分配生命周期模板&amp;状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLifecycleTemplateRequest 请求对象
     * @return SwitchLifecycleTemplateResponse
     */
    public SwitchLifecycleTemplateResponse switchLifecycleTemplate(SwitchLifecycleTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.switchLifecycleTemplate);
    }

    /**
     * 切换模型生命周期模板或状态
     *
     * 根据对象ID重新分配生命周期模板&amp;状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLifecycleTemplateRequest 请求对象
     * @return SyncInvoker<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse>
     */
    public SyncInvoker<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse> switchLifecycleTemplateInvoker(
        SwitchLifecycleTemplateRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.switchLifecycleTemplate, hcClient);
    }

    /**
     * 更新并检入M-V模型数据实例
     *
     * 通过此接口更新指定M-V模型实例，并检入该实例。
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
     * 更新并检入M-V模型数据实例
     *
     * 通过此接口更新指定M-V模型实例，并检入该实例。
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
     * 修订并更新M-V模型数据实例
     *
     * 根据主对象ID修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 修订并更新M-V模型数据实例
     *
     * 根据主对象ID修订并更新M-V模型数据实例，即修订后实例的“version.修订版本”更新为新的修订版本，并同时更新该实例的信息。
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
     * 管理员更新M-V模型数据实例
     *
     * 管理员通过此接口更新指定M-V模型的指定实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
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
     * 管理员更新M-V模型数据实例
     *
     * 管理员通过此接口更新指定M-V模型的指定实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
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
     * 设置模型生命周期状态
     *
     * 根据对象实例ID设置指定生命周期状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStateRequest 请求对象
     * @return UpdateStateResponse
     */
    public UpdateStateResponse updateState(UpdateStateRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateState);
    }

    /**
     * 设置模型生命周期状态
     *
     * 根据对象实例ID设置指定生命周期状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStateRequest 请求对象
     * @return SyncInvoker<UpdateStateRequest, UpdateStateResponse>
     */
    public SyncInvoker<UpdateStateRequest, UpdateStateResponse> updateStateInvoker(UpdateStateRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateState, hcClient);
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

    /**
     * 批量创建视图
     *
     * 通过模型版本对象ID和视图对象ID批量创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateViewRequest 请求对象
     * @return UpdateViewResponse
     */
    public UpdateViewResponse updateView(UpdateViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateView);
    }

    /**
     * 批量创建视图
     *
     * 通过模型版本对象ID和视图对象ID批量创建模型多视图。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateViewRequest 请求对象
     * @return SyncInvoker<UpdateViewRequest, UpdateViewResponse>
     */
    public SyncInvoker<UpdateViewRequest, UpdateViewResponse> updateViewInvoker(UpdateViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateView, hcClient);
    }

}
