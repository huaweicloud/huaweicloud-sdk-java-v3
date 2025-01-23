package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddTagResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddToCategoryRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.AddToCategoryResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchAddChildNodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchAddChildNodeResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchCreateViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalBranchResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalLatestVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalLatestVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteLogicalUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteStructuredDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteStructuredDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchDeleteUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchExecuteReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchRemoveChildNodeRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchRemoveChildNodeResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchShowGetUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndCheckinResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateAndReviseResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateByAdminResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.BatchUpdateDocumentResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareVersionRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CompareVersionResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CountUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.CreateDocumentResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteMultiViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteMultiViewResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteTargetRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.DeleteTargetResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListBatchQueryRelatedObjectsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListBatchQueryRelatedObjectsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetAllParentListRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetAllParentListResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetChildListRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListGetChildListResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListHistoryDataResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryDocumentsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryDocumentsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelatedObjectsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelatedObjectsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelationshipRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryRelationshipResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryShareDocsRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryShareDocsResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryTargetRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryTargetResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListQueryUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListSelectUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ListUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RefreshRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RefreshResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveFromCategoryRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.RemoveFromCategoryResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetParentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetParentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetRootRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetRootResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetTokensRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowGetTokensResponse;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateDocumentRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateDocumentResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateStateResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateUsingPostResponse;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.UpdateViewResponse;

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
     * 绑定标签
     *
     * 调用该接口为指定模型的数据实例绑定标签。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagRequest 请求对象
     * @return CompletableFuture<AddTagResponse>
     */
    public CompletableFuture<AddTagResponse> addTagAsync(AddTagRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.addTag);
    }

    /**
     * 绑定标签
     *
     * 调用该接口为指定模型的数据实例绑定标签。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTagRequest 请求对象
     * @return AsyncInvoker<AddTagRequest, AddTagResponse>
     */
    public AsyncInvoker<AddTagRequest, AddTagResponse> addTagAsyncInvoker(AddTagRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.addTag, hcClient);
    }

    /**
     * 添加数据分类
     *
     * 将数据分类对象数据实例添加至数据分类数据实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToCategoryRequest 请求对象
     * @return CompletableFuture<AddToCategoryResponse>
     */
    public CompletableFuture<AddToCategoryResponse> addToCategoryAsync(AddToCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.addToCategory);
    }

    /**
     * 添加数据分类
     *
     * 将数据分类对象数据实例添加至数据分类数据实例中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToCategoryRequest 请求对象
     * @return AsyncInvoker<AddToCategoryRequest, AddToCategoryResponse>
     */
    public AsyncInvoker<AddToCategoryRequest, AddToCategoryResponse> addToCategoryAsyncInvoker(
        AddToCategoryRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.addToCategory, hcClient);
    }

    /**
     * 批量添加实例的子节点
     *
     * 调用该接口批量为指定数据实例添加子节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddChildNodeRequest 请求对象
     * @return CompletableFuture<BatchAddChildNodeResponse>
     */
    public CompletableFuture<BatchAddChildNodeResponse> batchAddChildNodeAsync(BatchAddChildNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchAddChildNode);
    }

    /**
     * 批量添加实例的子节点
     *
     * 调用该接口批量为指定数据实例添加子节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddChildNodeRequest 请求对象
     * @return AsyncInvoker<BatchAddChildNodeRequest, BatchAddChildNodeResponse>
     */
    public AsyncInvoker<BatchAddChildNodeRequest, BatchAddChildNodeResponse> batchAddChildNodeAsyncInvoker(
        BatchAddChildNodeRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchAddChildNode, hcClient);
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
     * 批量创建分享结构化文档
     *
     * 批量创建分享结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateShareDocsRequest 请求对象
     * @return CompletableFuture<BatchCreateShareDocsResponse>
     */
    public CompletableFuture<BatchCreateShareDocsResponse> batchCreateShareDocsAsync(
        BatchCreateShareDocsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateShareDocs);
    }

    /**
     * 批量创建分享结构化文档
     *
     * 批量创建分享结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateShareDocsRequest 请求对象
     * @return AsyncInvoker<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse>
     */
    public AsyncInvoker<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse> batchCreateShareDocsAsyncInvoker(
        BatchCreateShareDocsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateShareDocs, hcClient);
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
     * 批量创建多维视图
     *
     * 调用该接口批量创建指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateViewRequest 请求对象
     * @return CompletableFuture<BatchCreateViewResponse>
     */
    public CompletableFuture<BatchCreateViewResponse> batchCreateViewAsync(BatchCreateViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateView);
    }

    /**
     * 批量创建多维视图
     *
     * 调用该接口批量创建指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateViewRequest 请求对象
     * @return AsyncInvoker<BatchCreateViewRequest, BatchCreateViewResponse>
     */
    public AsyncInvoker<BatchCreateViewRequest, BatchCreateViewResponse> batchCreateViewAsyncInvoker(
        BatchCreateViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateView, hcClient);
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
     * 批量删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，批量删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLatestVersionRequest 请求对象
     * @return CompletableFuture<BatchDeleteLatestVersionResponse>
     */
    public CompletableFuture<BatchDeleteLatestVersionResponse> batchDeleteLatestVersionAsync(
        BatchDeleteLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLatestVersion);
    }

    /**
     * 批量删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，批量删除版本对象下最新分支的最新版本实例数据。请您谨慎使用删除操作，删除后该数据将无法恢复。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLatestVersionRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse>
     */
    public AsyncInvoker<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse> batchDeleteLatestVersionAsyncInvoker(
        BatchDeleteLatestVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLatestVersion, hcClient);
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
     * 批量软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，批量软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalLatestVersionRequest 请求对象
     * @return CompletableFuture<BatchDeleteLogicalLatestVersionResponse>
     */
    public CompletableFuture<BatchDeleteLogicalLatestVersionResponse> batchDeleteLogicalLatestVersionAsync(
        BatchDeleteLogicalLatestVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalLatestVersion);
    }

    /**
     * 批量软删除版本对象下最新分支的最新版本实例数据
     *
     * 根据主对象ID，批量软删除版本对象下最新分支的最新版本实例数据。通过此接口进行删除操作时，系统会将当前删除的实例数据转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalLatestVersionRequest 请求对象
     * @return AsyncInvoker<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse>
     */
    public AsyncInvoker<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse> batchDeleteLogicalLatestVersionAsyncInvoker(
        BatchDeleteLogicalLatestVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalLatestVersion, hcClient);
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
     * 批量删除结构化文档分享权限
     *
     * 批量删除结构化文档分享权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteShareDocsRequest 请求对象
     * @return CompletableFuture<BatchDeleteShareDocsResponse>
     */
    public CompletableFuture<BatchDeleteShareDocsResponse> batchDeleteShareDocsAsync(
        BatchDeleteShareDocsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteShareDocs);
    }

    /**
     * 批量删除结构化文档分享权限
     *
     * 批量删除结构化文档分享权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteShareDocsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse>
     */
    public AsyncInvoker<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse> batchDeleteShareDocsAsyncInvoker(
        BatchDeleteShareDocsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteShareDocs, hcClient);
    }

    /**
     * 批量删除结构化文档
     *
     * 批量删除结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteStructuredDocumentRequest 请求对象
     * @return CompletableFuture<BatchDeleteStructuredDocumentResponse>
     */
    public CompletableFuture<BatchDeleteStructuredDocumentResponse> batchDeleteStructuredDocumentAsync(
        BatchDeleteStructuredDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteStructuredDocument);
    }

    /**
     * 批量删除结构化文档
     *
     * 批量删除结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteStructuredDocumentRequest 请求对象
     * @return AsyncInvoker<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse>
     */
    public AsyncInvoker<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse> batchDeleteStructuredDocumentAsyncInvoker(
        BatchDeleteStructuredDocumentRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteStructuredDocument, hcClient);
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
     * 批量移除实例的子节点
     *
     * 调用该接口批量移除指定数据实例的所有子节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveChildNodeRequest 请求对象
     * @return CompletableFuture<BatchRemoveChildNodeResponse>
     */
    public CompletableFuture<BatchRemoveChildNodeResponse> batchRemoveChildNodeAsync(
        BatchRemoveChildNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchRemoveChildNode);
    }

    /**
     * 批量移除实例的子节点
     *
     * 调用该接口批量移除指定数据实例的所有子节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveChildNodeRequest 请求对象
     * @return AsyncInvoker<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse>
     */
    public AsyncInvoker<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse> batchRemoveChildNodeAsyncInvoker(
        BatchRemoveChildNodeRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchRemoveChildNode, hcClient);
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
     * 批量更新结构化文档
     *
     * 批量更新结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDocumentRequest 请求对象
     * @return CompletableFuture<BatchUpdateDocumentResponse>
     */
    public CompletableFuture<BatchUpdateDocumentResponse> batchUpdateDocumentAsync(BatchUpdateDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateDocument);
    }

    /**
     * 批量更新结构化文档
     *
     * 批量更新结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDocumentRequest 请求对象
     * @return AsyncInvoker<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse>
     */
    public AsyncInvoker<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse> batchUpdateDocumentAsyncInvoker(
        BatchUpdateDocumentRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateDocument, hcClient);
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
     * 获取模型的统计信息
     *
     * 输入指定模型的统计时间区间（开始时间和结束时间），即可获取该模型的统计数据，包含创建实例、删除实例、软删除实例和更新实例的数据。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHistoryDataRequest 请求对象
     * @return CompletableFuture<CollectHistoryDataResponse>
     */
    public CompletableFuture<CollectHistoryDataResponse> collectHistoryDataAsync(CollectHistoryDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.collectHistoryData);
    }

    /**
     * 获取模型的统计信息
     *
     * 输入指定模型的统计时间区间（开始时间和结束时间），即可获取该模型的统计数据，包含创建实例、删除实例、软删除实例和更新实例的数据。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CollectHistoryDataRequest 请求对象
     * @return AsyncInvoker<CollectHistoryDataRequest, CollectHistoryDataResponse>
     */
    public AsyncInvoker<CollectHistoryDataRequest, CollectHistoryDataResponse> collectHistoryDataAsyncInvoker(
        CollectHistoryDataRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.collectHistoryData, hcClient);
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
     * 对比数据实例
     *
     * 通过此接口可以对比某个模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareVersionRequest 请求对象
     * @return CompletableFuture<CompareVersionResponse>
     */
    public CompletableFuture<CompareVersionResponse> compareVersionAsync(CompareVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.compareVersion);
    }

    /**
     * 对比数据实例
     *
     * 通过此接口可以对比某个模型数据实例的不同版本的属性和关系。建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison和instance-relation-comparison接口，更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareVersionRequest 请求对象
     * @return AsyncInvoker<CompareVersionRequest, CompareVersionResponse>
     */
    public AsyncInvoker<CompareVersionRequest, CompareVersionResponse> compareVersionAsyncInvoker(
        CompareVersionRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.compareVersion, hcClient);
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
     * 创建结构化文档
     *
     * 创建结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return CompletableFuture<CreateDocumentResponse>
     */
    public CompletableFuture<CreateDocumentResponse> createDocumentAsync(CreateDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.createDocument);
    }

    /**
     * 创建结构化文档
     *
     * 创建结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return AsyncInvoker<CreateDocumentRequest, CreateDocumentResponse>
     */
    public AsyncInvoker<CreateDocumentRequest, CreateDocumentResponse> createDocumentAsyncInvoker(
        CreateDocumentRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.createDocument, hcClient);
    }

    /**
     * 创建视图对象
     *
     * 通过接口创建多视图MV对象实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiViewRequest 请求对象
     * @return CompletableFuture<CreateMultiViewResponse>
     */
    public CompletableFuture<CreateMultiViewResponse> createMultiViewAsync(CreateMultiViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.createMultiView);
    }

    /**
     * 创建视图对象
     *
     * 通过接口创建多视图MV对象实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMultiViewRequest 请求对象
     * @return AsyncInvoker<CreateMultiViewRequest, CreateMultiViewResponse>
     */
    public AsyncInvoker<CreateMultiViewRequest, CreateMultiViewResponse> createMultiViewAsyncInvoker(
        CreateMultiViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.createMultiView, hcClient);
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
     * 创建多维视图
     *
     * 调用该接口创建指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateViewRequest 请求对象
     * @return CompletableFuture<CreateViewResponse>
     */
    public CompletableFuture<CreateViewResponse> createViewAsync(CreateViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.createView);
    }

    /**
     * 创建多维视图
     *
     * 调用该接口创建指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateViewRequest 请求对象
     * @return AsyncInvoker<CreateViewRequest, CreateViewResponse>
     */
    public AsyncInvoker<CreateViewRequest, CreateViewResponse> createViewAsyncInvoker(CreateViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.createView, hcClient);
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
     * 条件删除模型
     *
     * 条件删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteByConditionMultiViewRequest 请求对象
     * @return CompletableFuture<DeleteByConditionMultiViewResponse>
     */
    public CompletableFuture<DeleteByConditionMultiViewResponse> deleteByConditionMultiViewAsync(
        DeleteByConditionMultiViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteByConditionMultiView);
    }

    /**
     * 条件删除模型
     *
     * 条件删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteByConditionMultiViewRequest 请求对象
     * @return AsyncInvoker<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse>
     */
    public AsyncInvoker<DeleteByConditionMultiViewRequest, DeleteByConditionMultiViewResponse> deleteByConditionMultiViewAsyncInvoker(
        DeleteByConditionMultiViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteByConditionMultiView, hcClient);
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
     * 删除模型
     *
     * 删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiViewRequest 请求对象
     * @return CompletableFuture<DeleteMultiViewResponse>
     */
    public CompletableFuture<DeleteMultiViewResponse> deleteMultiViewAsync(DeleteMultiViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteMultiView);
    }

    /**
     * 删除模型
     *
     * 删除多视图对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiViewRequest 请求对象
     * @return AsyncInvoker<DeleteMultiViewRequest, DeleteMultiViewResponse>
     */
    public AsyncInvoker<DeleteMultiViewRequest, DeleteMultiViewResponse> deleteMultiViewAsyncInvoker(
        DeleteMultiViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteMultiView, hcClient);
    }

    /**
     * 通过目标模型删除关系实体的数据实例
     *
     * 调用该接口输入源模型的数据实例ID和目标模型的英文名称，删除对应关系实体的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTargetRequest 请求对象
     * @return CompletableFuture<DeleteTargetResponse>
     */
    public CompletableFuture<DeleteTargetResponse> deleteTargetAsync(DeleteTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.deleteTarget);
    }

    /**
     * 通过目标模型删除关系实体的数据实例
     *
     * 调用该接口输入源模型的数据实例ID和目标模型的英文名称，删除对应关系实体的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTargetRequest 请求对象
     * @return AsyncInvoker<DeleteTargetRequest, DeleteTargetResponse>
     */
    public AsyncInvoker<DeleteTargetRequest, DeleteTargetResponse> deleteTargetAsyncInvoker(
        DeleteTargetRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.deleteTarget, hcClient);
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
     * 失效模型数据实例
     *
     * 调用该接口失效指定模型的数据实例，同时返回失效成功的实例数量。在调用该接口前请确保数据模型具有“失效管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataInstanceRequest 请求对象
     * @return CompletableFuture<DisableDataInstanceResponse>
     */
    public CompletableFuture<DisableDataInstanceResponse> disableDataInstanceAsync(DisableDataInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.disableDataInstance);
    }

    /**
     * 失效模型数据实例
     *
     * 调用该接口失效指定模型的数据实例，同时返回失效成功的实例数量。在调用该接口前请确保数据模型具有“失效管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDataInstanceRequest 请求对象
     * @return AsyncInvoker<DisableDataInstanceRequest, DisableDataInstanceResponse>
     */
    public AsyncInvoker<DisableDataInstanceRequest, DisableDataInstanceResponse> disableDataInstanceAsyncInvoker(
        DisableDataInstanceRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.disableDataInstance, hcClient);
    }

    /**
     * 生效模型数据实例
     *
     * 调用该接口生效指定模型的数据实例，同时返回生效成功的实例数量。在调用该接口前请确保数据模型具有“失效管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataInstanceRequest 请求对象
     * @return CompletableFuture<EnableDataInstanceResponse>
     */
    public CompletableFuture<EnableDataInstanceResponse> enableDataInstanceAsync(EnableDataInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.enableDataInstance);
    }

    /**
     * 生效模型数据实例
     *
     * 调用该接口生效指定模型的数据实例，同时返回生效成功的实例数量。在调用该接口前请确保数据模型具有“失效管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDataInstanceRequest 请求对象
     * @return AsyncInvoker<EnableDataInstanceRequest, EnableDataInstanceResponse>
     */
    public AsyncInvoker<EnableDataInstanceRequest, EnableDataInstanceResponse> enableDataInstanceAsyncInvoker(
        EnableDataInstanceRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.enableDataInstance, hcClient);
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
     * 新增模型业务编码
     *
     * 调用该接口为指定模型的数据实例生成业务编码。在调用该接口前请确保数据模型具有“业务编码生成器”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateBusinessCodeRequest 请求对象
     * @return CompletableFuture<GenerateBusinessCodeResponse>
     */
    public CompletableFuture<GenerateBusinessCodeResponse> generateBusinessCodeAsync(
        GenerateBusinessCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.generateBusinessCode);
    }

    /**
     * 新增模型业务编码
     *
     * 调用该接口为指定模型的数据实例生成业务编码。在调用该接口前请确保数据模型具有“业务编码生成器”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request GenerateBusinessCodeRequest 请求对象
     * @return AsyncInvoker<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse>
     */
    public AsyncInvoker<GenerateBusinessCodeRequest, GenerateBusinessCodeResponse> generateBusinessCodeAsyncInvoker(
        GenerateBusinessCodeRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.generateBusinessCode, hcClient);
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
     * 批量查询关系实体关联模型的信息
     *
     * 调用该接口批量查询指定关系实体所关联的源/目标模型的所有实例信息，包含具体的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchQueryRelatedObjectsRequest 请求对象
     * @return CompletableFuture<ListBatchQueryRelatedObjectsResponse>
     */
    public CompletableFuture<ListBatchQueryRelatedObjectsResponse> listBatchQueryRelatedObjectsAsync(
        ListBatchQueryRelatedObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listBatchQueryRelatedObjects);
    }

    /**
     * 批量查询关系实体关联模型的信息
     *
     * 调用该接口批量查询指定关系实体所关联的源/目标模型的所有实例信息，包含具体的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchQueryRelatedObjectsRequest 请求对象
     * @return AsyncInvoker<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse>
     */
    public AsyncInvoker<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse> listBatchQueryRelatedObjectsAsyncInvoker(
        ListBatchQueryRelatedObjectsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listBatchQueryRelatedObjects, hcClient);
    }

    /**
     * 获取所有父节点
     *
     * 调用该接口获取指定数据实例的所有父节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetAllParentListRequest 请求对象
     * @return CompletableFuture<ListGetAllParentListResponse>
     */
    public CompletableFuture<ListGetAllParentListResponse> listGetAllParentListAsync(
        ListGetAllParentListRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listGetAllParentList);
    }

    /**
     * 获取所有父节点
     *
     * 调用该接口获取指定数据实例的所有父节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetAllParentListRequest 请求对象
     * @return AsyncInvoker<ListGetAllParentListRequest, ListGetAllParentListResponse>
     */
    public AsyncInvoker<ListGetAllParentListRequest, ListGetAllParentListResponse> listGetAllParentListAsyncInvoker(
        ListGetAllParentListRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listGetAllParentList, hcClient);
    }

    /**
     * 获取子节点
     *
     * 调用该接口获取指定数据实例的子节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetChildListRequest 请求对象
     * @return CompletableFuture<ListGetChildListResponse>
     */
    public CompletableFuture<ListGetChildListResponse> listGetChildListAsync(ListGetChildListRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listGetChildList);
    }

    /**
     * 获取子节点
     *
     * 调用该接口获取指定数据实例的子节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetChildListRequest 请求对象
     * @return AsyncInvoker<ListGetChildListRequest, ListGetChildListResponse>
     */
    public AsyncInvoker<ListGetChildListRequest, ListGetChildListResponse> listGetChildListAsyncInvoker(
        ListGetChildListRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listGetChildList, hcClient);
    }

    /**
     * 分页查询模型历史版本信息
     *
     * 调用该接口输入指定模型的统计时间区间（开始时间和结束时间）后，会以数据实例的最后修改时间作为查询条件，分页查询该实例的历史版本信息。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDataRequest 请求对象
     * @return CompletableFuture<ListHistoryDataResponse>
     */
    public CompletableFuture<ListHistoryDataResponse> listHistoryDataAsync(ListHistoryDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listHistoryData);
    }

    /**
     * 分页查询模型历史版本信息
     *
     * 调用该接口输入指定模型的统计时间区间（开始时间和结束时间）后，会以数据实例的最后修改时间作为查询条件，分页查询该实例的历史版本信息。在调用该接口前请确保数据模型具有“系统版本”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHistoryDataRequest 请求对象
     * @return AsyncInvoker<ListHistoryDataRequest, ListHistoryDataResponse>
     */
    public AsyncInvoker<ListHistoryDataRequest, ListHistoryDataResponse> listHistoryDataAsyncInvoker(
        ListHistoryDataRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listHistoryData, hcClient);
    }

    /**
     * 查询结构化文档
     *
     * 查询结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryDocumentsRequest 请求对象
     * @return CompletableFuture<ListQueryDocumentsResponse>
     */
    public CompletableFuture<ListQueryDocumentsResponse> listQueryDocumentsAsync(ListQueryDocumentsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryDocuments);
    }

    /**
     * 查询结构化文档
     *
     * 查询结构化文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryDocumentsRequest 请求对象
     * @return AsyncInvoker<ListQueryDocumentsRequest, ListQueryDocumentsResponse>
     */
    public AsyncInvoker<ListQueryDocumentsRequest, ListQueryDocumentsResponse> listQueryDocumentsAsyncInvoker(
        ListQueryDocumentsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryDocuments, hcClient);
    }

    /**
     * 查询关系实体关联模型的信息
     *
     * 调用该接口查询指定关系实体所关联的源/目标模型的所有实例信息，包含具体的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelatedObjectsRequest 请求对象
     * @return CompletableFuture<ListQueryRelatedObjectsResponse>
     */
    public CompletableFuture<ListQueryRelatedObjectsResponse> listQueryRelatedObjectsAsync(
        ListQueryRelatedObjectsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryRelatedObjects);
    }

    /**
     * 查询关系实体关联模型的信息
     *
     * 调用该接口查询指定关系实体所关联的源/目标模型的所有实例信息，包含具体的属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelatedObjectsRequest 请求对象
     * @return AsyncInvoker<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse>
     */
    public AsyncInvoker<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse> listQueryRelatedObjectsAsyncInvoker(
        ListQueryRelatedObjectsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryRelatedObjects, hcClient);
    }

    /**
     * 查询关系实体的数据实例
     *
     * 调用该接口输入数据实例的ID和对应的关系角色（源/目标模型），查询并返回对应关系实体的数据实例。
     * 如果对应的关系实体存在“参考对象”类型属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelationshipRequest 请求对象
     * @return CompletableFuture<ListQueryRelationshipResponse>
     */
    public CompletableFuture<ListQueryRelationshipResponse> listQueryRelationshipAsync(
        ListQueryRelationshipRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryRelationship);
    }

    /**
     * 查询关系实体的数据实例
     *
     * 调用该接口输入数据实例的ID和对应的关系角色（源/目标模型），查询并返回对应关系实体的数据实例。
     * 如果对应的关系实体存在“参考对象”类型属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelationshipRequest 请求对象
     * @return AsyncInvoker<ListQueryRelationshipRequest, ListQueryRelationshipResponse>
     */
    public AsyncInvoker<ListQueryRelationshipRequest, ListQueryRelationshipResponse> listQueryRelationshipAsyncInvoker(
        ListQueryRelationshipRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryRelationship, hcClient);
    }

    /**
     * 查询结构化文档分享授权列表
     *
     * 查询结构化文档分享授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryShareDocsRequest 请求对象
     * @return CompletableFuture<ListQueryShareDocsResponse>
     */
    public CompletableFuture<ListQueryShareDocsResponse> listQueryShareDocsAsync(ListQueryShareDocsRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryShareDocs);
    }

    /**
     * 查询结构化文档分享授权列表
     *
     * 查询结构化文档分享授权列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryShareDocsRequest 请求对象
     * @return AsyncInvoker<ListQueryShareDocsRequest, ListQueryShareDocsResponse>
     */
    public AsyncInvoker<ListQueryShareDocsRequest, ListQueryShareDocsResponse> listQueryShareDocsAsyncInvoker(
        ListQueryShareDocsRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryShareDocs, hcClient);
    }

    /**
     * 通过源模型实例ID查询关联的目标模型实例
     *
     * 调用该接口输入源模型的数据实例ID，查询并返回与该实例关联的目标模型数据实例的信息，实例信息包含对应数据实例的“列表属性”。
     * 如果目标模型存在“参考对象”类型的属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryTargetRequest 请求对象
     * @return CompletableFuture<ListQueryTargetResponse>
     */
    public CompletableFuture<ListQueryTargetResponse> listQueryTargetAsync(ListQueryTargetRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.listQueryTarget);
    }

    /**
     * 通过源模型实例ID查询关联的目标模型实例
     *
     * 调用该接口输入源模型的数据实例ID，查询并返回与该实例关联的目标模型数据实例的信息，实例信息包含对应数据实例的“列表属性”。
     * 如果目标模型存在“参考对象”类型的属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryTargetRequest 请求对象
     * @return AsyncInvoker<ListQueryTargetRequest, ListQueryTargetResponse>
     */
    public AsyncInvoker<ListQueryTargetRequest, ListQueryTargetResponse> listQueryTargetAsyncInvoker(
        ListQueryTargetRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.listQueryTarget, hcClient);
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
     * 刷新树形节点
     *
     * 调用该接口刷新指定数据实例对应的节点全路径。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 调用该接口时，如果未指定数据实例或指定的数据实例为父节点，则刷新整棵树的所有节点全路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RefreshRequest 请求对象
     * @return CompletableFuture<RefreshResponse>
     */
    public CompletableFuture<RefreshResponse> refreshAsync(RefreshRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.refresh);
    }

    /**
     * 刷新树形节点
     *
     * 调用该接口刷新指定数据实例对应的节点全路径。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 调用该接口时，如果未指定数据实例或指定的数据实例为父节点，则刷新整棵树的所有节点全路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RefreshRequest 请求对象
     * @return AsyncInvoker<RefreshRequest, RefreshResponse>
     */
    public AsyncInvoker<RefreshRequest, RefreshResponse> refreshAsyncInvoker(RefreshRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.refresh, hcClient);
    }

    /**
     * 移除数据分类
     *
     * 将数据分类数据实例从数据分类对象数据实例中移除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFromCategoryRequest 请求对象
     * @return CompletableFuture<RemoveFromCategoryResponse>
     */
    public CompletableFuture<RemoveFromCategoryResponse> removeFromCategoryAsync(RemoveFromCategoryRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.removeFromCategory);
    }

    /**
     * 移除数据分类
     *
     * 将数据分类数据实例从数据分类对象数据实例中移除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFromCategoryRequest 请求对象
     * @return AsyncInvoker<RemoveFromCategoryRequest, RemoveFromCategoryResponse>
     */
    public AsyncInvoker<RemoveFromCategoryRequest, RemoveFromCategoryResponse> removeFromCategoryAsyncInvoker(
        RemoveFromCategoryRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.removeFromCategory, hcClient);
    }

    /**
     * 解绑标签
     *
     * 调用该接口为指定数据模型的数据实例解绑标签。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveTagRequest 请求对象
     * @return CompletableFuture<RemoveTagResponse>
     */
    public CompletableFuture<RemoveTagResponse> removeTagAsync(RemoveTagRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.removeTag);
    }

    /**
     * 解绑标签
     *
     * 调用该接口为指定数据模型的数据实例解绑标签。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveTagRequest 请求对象
     * @return AsyncInvoker<RemoveTagRequest, RemoveTagResponse>
     */
    public AsyncInvoker<RemoveTagRequest, RemoveTagResponse> removeTagAsyncInvoker(RemoveTagRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.removeTag, hcClient);
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
     * 获取父节点
     *
     * 调用该接口获取指定数据实例的父节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetParentRequest 请求对象
     * @return CompletableFuture<ShowGetParentResponse>
     */
    public CompletableFuture<ShowGetParentResponse> showGetParentAsync(ShowGetParentRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetParent);
    }

    /**
     * 获取父节点
     *
     * 调用该接口获取指定数据实例的父节点，同时返回其列表属性。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetParentRequest 请求对象
     * @return AsyncInvoker<ShowGetParentRequest, ShowGetParentResponse>
     */
    public AsyncInvoker<ShowGetParentRequest, ShowGetParentResponse> showGetParentAsyncInvoker(
        ShowGetParentRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetParent, hcClient);
    }

    /**
     * 获取根节点
     *
     * 调用该接口获取指定数据实例的根节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetRootRequest 请求对象
     * @return CompletableFuture<ShowGetRootResponse>
     */
    public CompletableFuture<ShowGetRootResponse> showGetRootAsync(ShowGetRootRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetRoot);
    }

    /**
     * 获取根节点
     *
     * 调用该接口获取指定数据实例的根节点。在调用该接口前请确保数据模型具有“树形结构”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetRootRequest 请求对象
     * @return AsyncInvoker<ShowGetRootRequest, ShowGetRootResponse>
     */
    public AsyncInvoker<ShowGetRootRequest, ShowGetRootResponse> showGetRootAsyncInvoker(ShowGetRootRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetRoot, hcClient);
    }

    /**
     * 获取Token信息
     *
     * 该接口可以用于通过文档ID和认证类型的方式进行认证来获取结构化文档的Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetTokensRequest 请求对象
     * @return CompletableFuture<ShowGetTokensResponse>
     */
    public CompletableFuture<ShowGetTokensResponse> showGetTokensAsync(ShowGetTokensRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showGetTokens);
    }

    /**
     * 获取Token信息
     *
     * 该接口可以用于通过文档ID和认证类型的方式进行认证来获取结构化文档的Token。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetTokensRequest 请求对象
     * @return AsyncInvoker<ShowGetTokensRequest, ShowGetTokensResponse>
     */
    public AsyncInvoker<ShowGetTokensRequest, ShowGetTokensResponse> showGetTokensAsyncInvoker(
        ShowGetTokensRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showGetTokens, hcClient);
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
     * 查询指定数据实例的标签详情
     *
     * 调用该接口查询指定模型的数据实例对应标签信息。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return CompletableFuture<ShowTagResponse>
     */
    public CompletableFuture<ShowTagResponse> showTagAsync(ShowTagRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.showTag);
    }

    /**
     * 查询指定数据实例的标签详情
     *
     * 调用该接口查询指定模型的数据实例对应标签信息。在调用该接口前请确保数据模型具有“标签管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return AsyncInvoker<ShowTagRequest, ShowTagResponse>
     */
    public AsyncInvoker<ShowTagRequest, ShowTagResponse> showTagAsyncInvoker(ShowTagRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.showTag, hcClient);
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
     * 切换生命周期模板
     *
     * 调用该接口切换指定模型的数据实例绑定的生命周期模板。切换生命周期模板时，需为数据实例指定生命周期的状态。在调用该接口前请确保数据模型具有“生命周期管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLifecycleTemplateRequest 请求对象
     * @return CompletableFuture<SwitchLifecycleTemplateResponse>
     */
    public CompletableFuture<SwitchLifecycleTemplateResponse> switchLifecycleTemplateAsync(
        SwitchLifecycleTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.switchLifecycleTemplate);
    }

    /**
     * 切换生命周期模板
     *
     * 调用该接口切换指定模型的数据实例绑定的生命周期模板。切换生命周期模板时，需为数据实例指定生命周期的状态。在调用该接口前请确保数据模型具有“生命周期管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SwitchLifecycleTemplateRequest 请求对象
     * @return AsyncInvoker<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse>
     */
    public AsyncInvoker<SwitchLifecycleTemplateRequest, SwitchLifecycleTemplateResponse> switchLifecycleTemplateAsyncInvoker(
        SwitchLifecycleTemplateRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.switchLifecycleTemplate, hcClient);
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
     * 更新文档标题
     *
     * 更新文档标题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return CompletableFuture<UpdateDocumentResponse>
     */
    public CompletableFuture<UpdateDocumentResponse> updateDocumentAsync(UpdateDocumentRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateDocument);
    }

    /**
     * 更新文档标题
     *
     * 更新文档标题。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return AsyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse>
     */
    public AsyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse> updateDocumentAsyncInvoker(
        UpdateDocumentRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateDocument, hcClient);
    }

    /**
     * 设置生命周期的状态
     *
     * 调用该接口修改或切换数据实例绑定的生命周期状态。在调用该接口前请确保数据模型具有“生命周期管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStateRequest 请求对象
     * @return CompletableFuture<UpdateStateResponse>
     */
    public CompletableFuture<UpdateStateResponse> updateStateAsync(UpdateStateRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateState);
    }

    /**
     * 设置生命周期的状态
     *
     * 调用该接口修改或切换数据实例绑定的生命周期状态。在调用该接口前请确保数据模型具有“生命周期管理”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStateRequest 请求对象
     * @return AsyncInvoker<UpdateStateRequest, UpdateStateResponse>
     */
    public AsyncInvoker<UpdateStateRequest, UpdateStateResponse> updateStateAsyncInvoker(UpdateStateRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateState, hcClient);
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

    /**
     * 更新多维视图
     *
     * 调用该接口更新指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateViewRequest 请求对象
     * @return CompletableFuture<UpdateViewResponse>
     */
    public CompletableFuture<UpdateViewResponse> updateViewAsync(UpdateViewRequest request) {
        return hcClient.asyncInvokeHttp(request, IDMEClassicAPIMeta.updateView);
    }

    /**
     * 更新多维视图
     *
     * 调用该接口更新指定M-V模型实体的多维视图。在调用该接口前请确保数据模型具有“多维视图&amp;多维分支”功能。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateViewRequest 请求对象
     * @return AsyncInvoker<UpdateViewRequest, UpdateViewResponse>
     */
    public AsyncInvoker<UpdateViewRequest, UpdateViewResponse> updateViewAsyncInvoker(UpdateViewRequest request) {
        return new AsyncInvoker<>(request, IDMEClassicAPIMeta.updateView, hcClient);
    }

}
