package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsPageRequest;
import com.huaweicloud.sdk.idmeclassicapi.v1.model.ShowStaticsPageResponse;
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
     * 绑定标签
     *
     * 本接口用于为指定数据模型的数据实例绑定预定义的标签。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在应用运行态的“基础数据管理 &gt; 标签”中创建目标标签。具体操作请参见[标签](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0096.html)。
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
     * 绑定标签
     *
     * 本接口用于为指定数据模型的数据实例绑定预定义的标签。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在应用运行态的“基础数据管理 &gt; 标签”中创建目标标签。具体操作请参见[标签](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0096.html)。
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
     * 添加数据分类
     *
     * 本接口用于将数据实例添加到指定分类。当需要对零部件、设备、物料等数据实例进行归类管理（如按功能模块、产品线、工艺类型等维度分类）时，可调用本接口建立实例与分类的关联关系。
     * - 当实例不存在时，系统将抛出异常。
     * - 当实例与指定分类已存在关联关系时，系统将不重复添加，返回值为0。
     * - 当实例与指定分类首次建立关联时，返回值为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToCategoryRequest 请求对象
     * @return AddToCategoryResponse
     */
    public AddToCategoryResponse addToCategory(AddToCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.addToCategory);
    }

    /**
     * 添加数据分类
     *
     * 本接口用于将数据实例添加到指定分类。当需要对零部件、设备、物料等数据实例进行归类管理（如按功能模块、产品线、工艺类型等维度分类）时，可调用本接口建立实例与分类的关联关系。
     * - 当实例不存在时，系统将抛出异常。
     * - 当实例与指定分类已存在关联关系时，系统将不重复添加，返回值为0。
     * - 当实例与指定分类首次建立关联时，返回值为1。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddToCategoryRequest 请求对象
     * @return SyncInvoker<AddToCategoryRequest, AddToCategoryResponse>
     */
    public SyncInvoker<AddToCategoryRequest, AddToCategoryResponse> addToCategoryInvoker(AddToCategoryRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.addToCategory, hcClient);
    }

    /**
     * 批量添加实例的子节点
     *
     * 本接口用于批量为指定数据实例添加子节点，建立父子层级关联关系。当BOM（物料清单）需要新增子装配节点、组织架构需要新增下属团队或产品分类需要新增下级类目时，可调用本接口批量完成节点挂载。
     * - 调用本接口时，需在parentId中指定父节点实例ID，在childList中传入待添加为子节点的实例ID列表。
     * - 添加操作执行后，子节点将发生以下变更：
     *   - 父节点（parentNode）字段被设置为指定的父节点。
     *   - 根节点（rootNode）字段被设置为父节点所在树的根节点。
     * - 全路径（fullPath）和原始全路径（rawFullPath）字段被更新为包含父节点路径的完整路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddChildNodeRequest 请求对象
     * @return BatchAddChildNodeResponse
     */
    public BatchAddChildNodeResponse batchAddChildNode(BatchAddChildNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchAddChildNode);
    }

    /**
     * 批量添加实例的子节点
     *
     * 本接口用于批量为指定数据实例添加子节点，建立父子层级关联关系。当BOM（物料清单）需要新增子装配节点、组织架构需要新增下属团队或产品分类需要新增下级类目时，可调用本接口批量完成节点挂载。
     * - 调用本接口时，需在parentId中指定父节点实例ID，在childList中传入待添加为子节点的实例ID列表。
     * - 添加操作执行后，子节点将发生以下变更：
     *   - 父节点（parentNode）字段被设置为指定的父节点。
     *   - 根节点（rootNode）字段被设置为父节点所在树的根节点。
     * - 全路径（fullPath）和原始全路径（rawFullPath）字段被更新为包含父节点路径的完整路径。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchAddChildNodeRequest 请求对象
     * @return SyncInvoker<BatchAddChildNodeRequest, BatchAddChildNodeResponse>
     */
    public SyncInvoker<BatchAddChildNodeRequest, BatchAddChildNodeResponse> batchAddChildNodeInvoker(
        BatchAddChildNodeRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchAddChildNode, hcClient);
    }

    /**
     * 批量检入M-V模型数据实例
     *
     * 本接口用于根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID批量检入M-V模型数据实例。已检入的数据实例会生成一个新的迭代版本，并将数据存储至系统中。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）列表，对指定的多个Master-Branch-Version（M-V）模型实例批量执行检出（Check-out）操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）列表，对指定的多个Master-Branch-Version（M-V）模型实例批量执行检出（Check-out）操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）列表，对指定的多个Master-Branch-Version（M-V）模型实例批量执行检出（Check-out）并同步更新（Update）的原子操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）列表，对指定的多个Master-Branch-Version（M-V）模型实例批量执行检出（Check-out）并同步更新（Update）的原子操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量撤销指定M-V模型实例的检出，将实例数据批量还原至检出前的内容。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员批量撤销Master-Branch-Version（M-V）模型实例的检出状态，将实例数据批量还原至检出前的最后检入版本内容。适用于数据治理中大规模清理长期锁定实例、批量处理离职员工未检入数据、系统维护前统一释放编辑锁等管理场景。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员批量撤销Master-Branch-Version（M-V）模型实例的检出状态，将实例数据批量还原至检出前的最后检入版本内容。适用于数据治理中大规模清理长期锁定实例、批量处理离职员工未检入数据、系统维护前统一释放编辑锁等管理场景。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量创建分享结构化文档
     *
     * 本接口用于批量创建结构化文档的分享记录，实现文档的跨用户或跨团队协作共享。当需要将产品设计说明书、工艺卡片、BOM清单等结构化文档共享给团队成员、上下游合作伙伴或全体用户时，可调用本接口一次性完成批量分享配置。
     * - 调用本接口时，需在params数组中传入多个分享记录，每个元素对应一条文档分享配置。
     * - 分享时可指定被分享用户的权限级别：
     *   - 当auth_type为read时，被分享用户仅可查看文档内容。
     *   - 当auth_type为write时，被分享用户可查看和编辑文档内容。
     * - 当shared_user_id和shared_user_name均设置为all时，表示将文档分享给所有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateShareDocsRequest 请求对象
     * @return BatchCreateShareDocsResponse
     */
    public BatchCreateShareDocsResponse batchCreateShareDocs(BatchCreateShareDocsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchCreateShareDocs);
    }

    /**
     * 批量创建分享结构化文档
     *
     * 本接口用于批量创建结构化文档的分享记录，实现文档的跨用户或跨团队协作共享。当需要将产品设计说明书、工艺卡片、BOM清单等结构化文档共享给团队成员、上下游合作伙伴或全体用户时，可调用本接口一次性完成批量分享配置。
     * - 调用本接口时，需在params数组中传入多个分享记录，每个元素对应一条文档分享配置。
     * - 分享时可指定被分享用户的权限级别：
     *   - 当auth_type为read时，被分享用户仅可查看文档内容。
     *   - 当auth_type为write时，被分享用户可查看和编辑文档内容。
     * - 当shared_user_id和shared_user_name均设置为all时，表示将文档分享给所有用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateShareDocsRequest 请求对象
     * @return SyncInvoker<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse>
     */
    public SyncInvoker<BatchCreateShareDocsRequest, BatchCreateShareDocsResponse> batchCreateShareDocsInvoker(
        BatchCreateShareDocsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchCreateShareDocs, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 本接口用于在指定的数据模型（数据实体或关系实体）下，批量创建多个数据实例。调用成功后，将返回所有成功创建的实例信息列表。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于在指定的数据模型（数据实体或关系实体）下，批量创建多个数据实例。调用成功后，将返回所有成功创建的实例信息列表。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量创建多维视图
     *
     * 本接口用于批量为指定的一个或多个M-V模型数据实例创建新的多维视图。多维视图允许用户从不同的预设维度（如设计视图、工艺视图、采购视图等）来观察和管理同一个数据对象。在同一个数据实例下，视图的标识（item）必须是唯一的。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量创建多维视图
     *
     * 本接口用于批量为指定的一个或多个M-V模型数据实例创建新的多维视图。多维视图允许用户从不同的预设维度（如设计视图、工艺视图、采购视图等）来观察和管理同一个数据对象。在同一个数据实例下，视图的标识（item）必须是唯一的。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterIds）列表，批量删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterIds）列表，批量删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量删除版本对象下最新分支的最新版本实例数据
     *
     * 本接口用于根据多个主对象（Master）ID，批量永久删除指定M-V模型实体下最新分支的最新版本数据实例。此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLatestVersionRequest 请求对象
     * @return BatchDeleteLatestVersionResponse
     */
    public BatchDeleteLatestVersionResponse batchDeleteLatestVersion(BatchDeleteLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLatestVersion);
    }

    /**
     * 批量删除版本对象下最新分支的最新版本实例数据
     *
     * 本接口用于根据多个主对象（Master）ID，批量永久删除指定M-V模型实体下最新分支的最新版本数据实例。此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLatestVersionRequest 请求对象
     * @return SyncInvoker<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse>
     */
    public SyncInvoker<BatchDeleteLatestVersionRequest, BatchDeleteLatestVersionResponse> batchDeleteLatestVersionInvoker(
        BatchDeleteLatestVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLatestVersion, hcClient);
    }

    /**
     * 批量软删除最新大版本下的所有小版本
     *
     * 本接口用于根据主对象ID（masterIds）列表，批量软删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 软删除操作并非物理删除，而是将目标分支下的所有版本实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterIds）列表，批量软删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 软删除操作并非物理删除，而是将目标分支下的所有版本实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量软删除版本对象下最新分支的最新版本实例数据
     *
     * 本接口用于根据主对象ID（masterIds）列表，批量软删除指定M-V模型实体下最新分支的最新版本数据实例。
     * 软删除操作并非物理删除，而是将目标实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalLatestVersionRequest 请求对象
     * @return BatchDeleteLogicalLatestVersionResponse
     */
    public BatchDeleteLogicalLatestVersionResponse batchDeleteLogicalLatestVersion(
        BatchDeleteLogicalLatestVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteLogicalLatestVersion);
    }

    /**
     * 批量软删除版本对象下最新分支的最新版本实例数据
     *
     * 本接口用于根据主对象ID（masterIds）列表，批量软删除指定M-V模型实体下最新分支的最新版本数据实例。
     * 软删除操作并非物理删除，而是将目标实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteLogicalLatestVersionRequest 请求对象
     * @return SyncInvoker<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse>
     */
    public SyncInvoker<BatchDeleteLogicalLatestVersionRequest, BatchDeleteLogicalLatestVersionResponse> batchDeleteLogicalLatestVersionInvoker(
        BatchDeleteLogicalLatestVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteLogicalLatestVersion, hcClient);
    }

    /**
     * 批量软删除实例
     *
     * 本接口用于根据数据实例的唯一编码（id）列表，批量对指定数据模型下的多个数据实例执行软删除（逻辑删除）操作。
     * 软删除操作不会从数据库中物理移除数据，而是将所有实例标记为已删除状态，并转存至XDM应用的XDMLogicDeleteData内置模型中。如需彻底删除数据，请使用[批量删除实例 - BatchDeleteUsingPost](BatchDeleteUsingPost.xml)接口。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一编码（id）列表，批量对指定数据模型下的多个数据实例执行软删除（逻辑删除）操作。
     * 软删除操作不会从数据库中物理移除数据，而是将所有实例标记为已删除状态，并转存至XDM应用的XDMLogicDeleteData内置模型中。如需彻底删除数据，请使用[批量删除实例 - BatchDeleteUsingPost](BatchDeleteUsingPost.xml)接口。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量删除结构化文档分享权限
     *
     * 本接口用于批量删除结构化文档的分享权限记录，撤销已共享文档的访问权限。当项目结束、人员岗位变动或文档权限需要回收时，可调用本接口一次性撤销多个用户的文档分享权限。
     * - 调用本接口时，需在ids中传入待删除的分享权限记录ID列表，系统将对列表中的分享记录执行批量删除。
     * - 分享权限删除后，被分享用户将无法再通过原分享渠道访问该文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteShareDocsRequest 请求对象
     * @return BatchDeleteShareDocsResponse
     */
    public BatchDeleteShareDocsResponse batchDeleteShareDocs(BatchDeleteShareDocsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteShareDocs);
    }

    /**
     * 批量删除结构化文档分享权限
     *
     * 本接口用于批量删除结构化文档的分享权限记录，撤销已共享文档的访问权限。当项目结束、人员岗位变动或文档权限需要回收时，可调用本接口一次性撤销多个用户的文档分享权限。
     * - 调用本接口时，需在ids中传入待删除的分享权限记录ID列表，系统将对列表中的分享记录执行批量删除。
     * - 分享权限删除后，被分享用户将无法再通过原分享渠道访问该文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteShareDocsRequest 请求对象
     * @return SyncInvoker<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse>
     */
    public SyncInvoker<BatchDeleteShareDocsRequest, BatchDeleteShareDocsResponse> batchDeleteShareDocsInvoker(
        BatchDeleteShareDocsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteShareDocs, hcClient);
    }

    /**
     * 批量删除结构化文档
     *
     * 本接口用于批量删除指定数据模型下的结构化文档。当产品下线、项目归档或文档批量清理时，可调用本接口一次性删除多个结构化文档，提升数据管理效率。
     * - 调用本接口时，需在ids中传入待删除文档的ID列表，系统将对列表中的文档执行批量删除操作。
     * - 当is_check设置为true时，系统将在删除前检查当前用户是否具备文档删除权限，无权限的文档将被跳过删除。
     * - 当is_check设置为false时，系统将直接执行删除，不做权限检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteStructuredDocumentRequest 请求对象
     * @return BatchDeleteStructuredDocumentResponse
     */
    public BatchDeleteStructuredDocumentResponse batchDeleteStructuredDocument(
        BatchDeleteStructuredDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchDeleteStructuredDocument);
    }

    /**
     * 批量删除结构化文档
     *
     * 本接口用于批量删除指定数据模型下的结构化文档。当产品下线、项目归档或文档批量清理时，可调用本接口一次性删除多个结构化文档，提升数据管理效率。
     * - 调用本接口时，需在ids中传入待删除文档的ID列表，系统将对列表中的文档执行批量删除操作。
     * - 当is_check设置为true时，系统将在删除前检查当前用户是否具备文档删除权限，无权限的文档将被跳过删除。
     * - 当is_check设置为false时，系统将直接执行删除，不做权限检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteStructuredDocumentRequest 请求对象
     * @return SyncInvoker<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse>
     */
    public SyncInvoker<BatchDeleteStructuredDocumentRequest, BatchDeleteStructuredDocumentResponse> batchDeleteStructuredDocumentInvoker(
        BatchDeleteStructuredDocumentRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchDeleteStructuredDocument, hcClient);
    }

    /**
     * 批量删除实例
     *
     * 本接口用于根据数据实例的唯一编码（id）列表，批量删除指定数据模型中的多个数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必确认目标实例ID列表，谨慎操作。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一编码（id）列表，批量删除指定数据模型中的多个数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必确认目标实例ID列表，谨慎操作。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量修订一个或多个指定的M-V模型数据实例。修订操作会基于当前实例创建一个新的修订版本，并自动将新实例的version字段更新为下一个修订版本号（例如从A升级到B）。修订后的新实例默认处于“已检入”状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量修订一个或多个指定的M-V模型数据实例。修订操作会基于当前实例创建一个新的修订版本，并自动将新实例的version字段更新为下一个修订版本号（例如从A升级到B）。修订后的新实例默认处于“已检入”状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量移除实例的子节点
     *
     * 本接口用于批量移除指定数据实例的子节点，解除父子节点间的层级关联关系。当BOM（物料清单）结构发生变更需要拆解某个装配节点、组织架构调整需要撤销某个部门的下属团队归属，或产品分类体系重组需要移除下级类目时，可调用本接口批量解除子节点关联。
     * - 调用本接口时，需在parentId中指定父节点实例ID，在childList中传入待移除的子节点实例ID列表。
     * - 移除操作执行后，被移除的子节点将发生以下变更：
     *   - 父节点（parent）字段被置为空。
     *   - 根节点（root）字段被置为空。
     * - 当父节点的所有子节点均被移除后，该父节点将被置为叶子节点（即不再拥有子节点）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveChildNodeRequest 请求对象
     * @return BatchRemoveChildNodeResponse
     */
    public BatchRemoveChildNodeResponse batchRemoveChildNode(BatchRemoveChildNodeRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchRemoveChildNode);
    }

    /**
     * 批量移除实例的子节点
     *
     * 本接口用于批量移除指定数据实例的子节点，解除父子节点间的层级关联关系。当BOM（物料清单）结构发生变更需要拆解某个装配节点、组织架构调整需要撤销某个部门的下属团队归属，或产品分类体系重组需要移除下级类目时，可调用本接口批量解除子节点关联。
     * - 调用本接口时，需在parentId中指定父节点实例ID，在childList中传入待移除的子节点实例ID列表。
     * - 移除操作执行后，被移除的子节点将发生以下变更：
     *   - 父节点（parent）字段被置为空。
     *   - 根节点（root）字段被置为空。
     * - 当父节点的所有子节点均被移除后，该父节点将被置为叶子节点（即不再拥有子节点）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchRemoveChildNodeRequest 请求对象
     * @return SyncInvoker<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse>
     */
    public SyncInvoker<BatchRemoveChildNodeRequest, BatchRemoveChildNodeResponse> batchRemoveChildNodeInvoker(
        BatchRemoveChildNodeRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchRemoveChildNode, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 本接口用于根据数据实例的系统唯一标识（id）列表，批量查询指定数据模型下多个实例的完整详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的系统唯一标识（id）列表，批量查询指定数据模型下多个实例的完整详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量更新一个或多个指定的M-V模型数据实例，并在更新成功后自动执行检入（Check-in）操作，将实例从“检出”状态切换为“已检入”状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量更新一个或多个指定的M-V模型数据实例，并在更新成功后自动执行检入（Check-in）操作，将实例从“检出”状态切换为“已检入”状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员批量强制更新Master-Branch-Version（M-V）模型数据实例，适用于数据治理中的大规模紧急数据修正、批量版本回滚、全量属性修正等管理场景。对于批量中的每个实例，若其唯一编码不存在，则该实例不做任何更新操作，不影响其他实例的正常更新。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员批量强制更新Master-Branch-Version（M-V）模型数据实例，适用于数据治理中的大规模紧急数据修正、批量版本回滚、全量属性修正等管理场景。对于批量中的每个实例，若其唯一编码不存在，则该实例不做任何更新操作，不影响其他实例的正常更新。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量更新结构化文档
     *
     * 本接口用于批量更新结构化文档的属性信息。
     * - 调用本接口时，需在params数组中传入多个文档的更新信息，每个元素对应一个待更新的文档。
     * - 每个文档更新项中，id为必填参数，用于唯一标识目标文档；其余字段为可选，仅更新传入的字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDocumentRequest 请求对象
     * @return BatchUpdateDocumentResponse
     */
    public BatchUpdateDocumentResponse batchUpdateDocument(BatchUpdateDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.batchUpdateDocument);
    }

    /**
     * 批量更新结构化文档
     *
     * 本接口用于批量更新结构化文档的属性信息。
     * - 调用本接口时，需在params数组中传入多个文档的更新信息，每个元素对应一个待更新的文档。
     * - 每个文档更新项中，id为必填参数，用于唯一标识目标文档；其余字段为可选，仅更新传入的字段。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateDocumentRequest 请求对象
     * @return SyncInvoker<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse>
     */
    public SyncInvoker<BatchUpdateDocumentRequest, BatchUpdateDocumentResponse> batchUpdateDocumentInvoker(
        BatchUpdateDocumentRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.batchUpdateDocument, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 本接口用于批量更新指定数据模型中的多个实例数据。如果请求列表中某个实例的唯一编码（id）在系统中不存在，系统将跳过该实例，不执行任何更新操作，且不会因此导致整个批量请求失败。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量更新指定数据模型中的多个实例数据。如果请求列表中某个实例的唯一编码（id）在系统中不存在，系统将跳过该实例，不执行任何更新操作，且不会因此导致整个批量请求失败。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一标识（id），批量更新/升级指定Master-Branch-Version（M-V）模型实例的版本号信息（包括修订版本version和迭代版本iteration）。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一标识（id），批量更新/升级指定Master-Branch-Version（M-V）模型实例的版本号信息（包括修订版本version和迭代版本iteration）。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），对指定的M-V模型数据实例执行检出（Check-out）操作。
     * 调用本接口后，系统会基于原实例（已检入版本）完全复制生成一个新的数据实例（工作副本），将其状态修改为“工作中”，并对该主对象加锁，阻止其他用户再次检出，直到当前用户执行“检入”或“撤销检出”。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），对指定的M-V模型数据实例执行检出（Check-out）操作。
     * 调用本接口后，系统会基于原实例（已检入版本）完全复制生成一个新的数据实例（工作副本），将其状态修改为“工作中”，并对该主对象加锁，阻止其他用户再次检出，直到当前用户执行“检入”或“撤销检出”。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），对指定的Master-Branch-Version（M-V）模型实例执行检出（Check-out）并同步更新（Update）的原子操作。
     * 本接口将“检出”与“更新”合并为一次网络请求，系统在生成新工作副本并加锁的同时，直接将请求中指定的属性值应用到该工作副本上。这大幅减少了网络交互次数，避免了“先检出空副本，再发请求更新”带来的数据不一致风险与性能开销。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），对指定的Master-Branch-Version（M-V）模型实例执行检出（Check-out）并同步更新（Update）的原子操作。
     * 本接口将“检出”与“更新”合并为一次网络请求，系统在生成新工作副本并加锁的同时，直接将请求中指定的属性值应用到该工作副本上。这大幅减少了网络交互次数，避免了“先检出空副本，再发请求更新”带来的数据不一致风险与性能开销。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于撤销指定M-V模型实例的检出状态。
     * 执行撤销检出后，系统会彻底丢弃当前工作副本中的所有未提交修改，将实例数据还原至最近一次检入（Check-in）的历史版本状态，并释放该对象的并发锁，以便自己或他人重新检出。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于撤销指定M-V模型实例的检出状态。
     * 执行撤销检出后，系统会彻底丢弃当前工作副本中的所有未提交修改，将实例数据还原至最近一次检入（Check-in）的历史版本状态，并释放该对象的并发锁，以便自己或他人重新检出。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员强制撤销Master-Branch-Version（M-V）模型实例的检出状态，将实例数据还原至检出前的最后检入版本内容。适用于数据治理中因用户离职、会话超时、误操作等导致的实例长期锁定场景。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员强制撤销Master-Branch-Version（M-V）模型实例的检出状态，将实例数据还原至检出前的最后检入版本内容。适用于数据治理中因用户离职、会话超时、误操作等导致的实例长期锁定场景。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 根据时间范围获取模型的历史记录数
     *
     * 本接口用于根据指定的时间范围，获取数据模型的历史操作统计记录数，包括创建实例、更新实例、删除实例及软删除实例的数量。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 根据时间范围获取模型的历史记录数
     *
     * 本接口用于根据指定的时间范围，获取数据模型的历史操作统计记录数，包括创建实例、更新实例、删除实例及软删除实例的数量。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（id），获取指定Master-Branch-Version（M-V）模型下两个不同版本实例的完整数据快照，以便进行属性与关系的差异对比。
     * **建议：**
     * 本接口为基础对比功能。为获得更优的对比体验和更细粒度的控制（如仅对比属性或仅对比关系），推荐使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比接口，即instance-attrs-comparison（属性对比）和instance-relation-comparison（关系对比）接口。更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（id），获取指定Master-Branch-Version（M-V）模型下两个不同版本实例的完整数据快照，以便进行属性与关系的差异对比。
     * **建议：**
     * 本接口为基础对比功能。为获得更优的对比体验和更细粒度的控制（如仅对比属性或仅对比关系），推荐使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比接口，即instance-attrs-comparison（属性对比）和instance-relation-comparison（关系对比）接口。更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 数据实例指定版本对比
     *
     * 本接口用于对比指定数据实例两个版本之间的属性差异和关系差异，返回基础版本对象及差异对比结果。
     * 建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison（属性对比）和instance-relation-comparison（关系对比）接口。更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareVersionRequest 请求对象
     * @return CompareVersionResponse
     */
    public CompareVersionResponse compareVersion(CompareVersionRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.compareVersion);
    }

    /**
     * 数据实例指定版本对比
     *
     * 本接口用于对比指定数据实例两个版本之间的属性差异和关系差异，返回基础版本对象及差异对比结果。
     * 建议使用数据建模引擎（xDM Foundation，简称xDM-F）新增的差异对比功能，即使用instance-attrs-comparison（属性对比）和instance-relation-comparison（关系对比）接口。更多内容可在应用运行态的“数据服务管理 &gt; 全量数据服务 &gt; 系统管理API &gt; 属性对比API”中查看。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CompareVersionRequest 请求对象
     * @return SyncInvoker<CompareVersionRequest, CompareVersionResponse>
     */
    public SyncInvoker<CompareVersionRequest, CompareVersionResponse> compareVersionInvoker(
        CompareVersionRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.compareVersion, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 本接口用于根据指定的查询条件，统计指定数据模型中满足条件的实例总数。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的查询条件，统计指定数据模型中满足条件的实例总数。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 创建结构化文档
     *
     * 本接口用于在指定数据模型下创建结构化文档。结构化文档是工业数据管理中用于承载设计说明书、工艺卡片、BOM清单等工业文档的载体，支持目录（directory）、Page文档（pageDocument）、Board文档（boardDocument）、Mind文档（mindDocument）、Draw文档（drawDocument）等多种文档类型。
     * - 创建结构化文档时，需指定文档标题和文档类型。
     * - 如需将文档关联到具体的数据模型实例，可通过instance_id参数指定实例ID。
     * - 如需将文档挂载到指定目录下，可通过parent_document_id参数指定父文档ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return CreateDocumentResponse
     */
    public CreateDocumentResponse createDocument(CreateDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.createDocument);
    }

    /**
     * 创建结构化文档
     *
     * 本接口用于在指定数据模型下创建结构化文档。结构化文档是工业数据管理中用于承载设计说明书、工艺卡片、BOM清单等工业文档的载体，支持目录（directory）、Page文档（pageDocument）、Board文档（boardDocument）、Mind文档（mindDocument）、Draw文档（drawDocument）等多种文档类型。
     * - 创建结构化文档时，需指定文档标题和文档类型。
     * - 如需将文档关联到具体的数据模型实例，可通过instance_id参数指定实例ID。
     * - 如需将文档挂载到指定目录下，可通过parent_document_id参数指定父文档ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDocumentRequest 请求对象
     * @return SyncInvoker<CreateDocumentRequest, CreateDocumentResponse>
     */
    public SyncInvoker<CreateDocumentRequest, CreateDocumentResponse> createDocumentInvoker(
        CreateDocumentRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.createDocument, hcClient);
    }

    /**
     * 创建M-V模型视图数据实例
     *
     * 本接口用于勾选了“多维视图&amp;多维分支”的MV模型创建数据实例。创建实例时给视图属性赋不同视图属性表示实例所属的视图。视图属性为NULL表示的是默认视图，若创建、更新、修订等MV模型特有接口不指定视图参数则表示操作的视图属性为NULL的视图。
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
     * 创建M-V模型视图数据实例
     *
     * 本接口用于勾选了“多维视图&amp;多维分支”的MV模型创建数据实例。创建实例时给视图属性赋不同视图属性表示实例所属的视图。视图属性为NULL表示的是默认视图，若创建、更新、修订等MV模型特有接口不指定视图参数则表示操作的视图属性为NULL的视图。
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
     * 本接口用于在指定的数据模型（数据实体或关系实体）下创建数据实例。调用成功后，将返回新创建实例的详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于在指定的数据模型（数据实体或关系实体）下创建数据实例。调用成功后，将返回新创建实例的详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 创建多维视图
     *
     * 本接口用于为指定的M-V模型数据实例创建一个新的多维视图。多维视图允许用户从不同的预设维度（如设计视图、工艺视图、采购视图等）来观察和管理同一个数据对象，每个视图下的属性或关系可以独立配置和演进。在同一个数据实例下，视图的标识（item）必须是唯一的。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 创建多维视图
     *
     * 本接口用于为指定的M-V模型数据实例创建一个新的多维视图。多维视图允许用户从不同的预设维度（如设计视图、工艺视图、采购视图等）来观察和管理同一个数据对象，每个视图下的属性或关系可以独立配置和演进。在同一个数据实例下，视图的标识（item）必须是唯一的。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）和修订版本号（version），删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 其中：
     * - 分支（Branch）：对应M-V模型中的大版本（如版本A、版本B），代表一次完整的修订基线。
     * - 迭代（Iteration）：对应分支内的小版本（如A.1、A.2），代表同一修订基线下的多次迭代更新。
     * - 本接口将级联删除指定分支下的所有迭代版本，包括该分支的最终版本及其历史迭代记录。
     * 
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）和修订版本号（version），删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 其中：
     * - 分支（Branch）：对应M-V模型中的大版本（如版本A、版本B），代表一次完整的修订基线。
     * - 迭代（Iteration）：对应分支内的小版本（如A.1、A.2），代表同一修订基线下的多次迭代更新。
     * - 本接口将级联删除指定分支下的所有迭代版本，包括该分支的最终版本及其历史迭代记录。
     * 
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 条件删除M-V模型数据实例
     *
     * 根据用户指定条件删除MV模型数据实例。
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
     * 条件删除M-V模型数据实例
     *
     * 根据用户指定条件删除MV模型数据实例。
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
     * 本接口用于根据指定的过滤条件，批量删除指定数据模型下满足条件的所有数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必先使用[分页查询实例 - ShowFindUsingPost](ShowFindUsingPost.xml)接口验证条件表达式的准确性。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的过滤条件，批量删除指定数据模型下满足条件的所有数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必先使用[分页查询实例 - ShowFindUsingPost](ShowFindUsingPost.xml)接口验证条件表达式的准确性。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），精准删除指定Master-Branch-Version（M-V）模型在特定分支下的最新（末端）版本实例。
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），精准删除指定Master-Branch-Version（M-V）模型在特定分支下的最新（末端）版本实例。
     * 此操作为物理删除，执行后数据将无法恢复，请谨慎使用。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）和修订版本号（version），软删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 软删除操作并非物理删除，而是将目标分支下的所有版本实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId）和修订版本号（version），软删除指定M-V模型实例中最新分支（Branch）下的所有迭代版本（Iteration）。
     * 软删除操作并非物理删除，而是将目标分支下的所有版本实例标记为已删除状态（rdmDeleteFlag置为1），并将数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID，软删除指定M-V模型实体下最新分支的最新版本数据实例。
     * 软删除操作并非从数据库中物理移除数据，而是将目标实例标记为已删除状态（rdmDeleteFlag置为1），并将该实例的数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID，软删除指定M-V模型实体下最新分支的最新版本数据实例。
     * 软删除操作并非从数据库中物理移除数据，而是将目标实例标记为已删除状态（rdmDeleteFlag置为1），并将该实例的数据转存至XDM应用的XDMLogicDeleteData内置模型中，以便在需要时进行数据恢复或归档查询。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 删除M-V模型指定视图版本
     *
     * 本接口用于勾选了“多维视图&amp;多维分支”的MV模型删除指定的数据实例。若模型配置视图属性，且调用createView接口创建了多维视图。需要在接口参数中给视图属性指定要删除的视图。若入参中书体属性为null，会删除视图属性为null的视图。本接口为同步接口，调用完成后立即返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiViewRequest 请求对象
     * @return DeleteMultiViewResponse
     */
    public DeleteMultiViewResponse deleteMultiView(DeleteMultiViewRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteMultiView);
    }

    /**
     * 删除M-V模型指定视图版本
     *
     * 本接口用于勾选了“多维视图&amp;多维分支”的MV模型删除指定的数据实例。若模型配置视图属性，且调用createView接口创建了多维视图。需要在接口参数中给视图属性指定要删除的视图。若入参中书体属性为null，会删除视图属性为null的视图。本接口为同步接口，调用完成后立即返回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMultiViewRequest 请求对象
     * @return SyncInvoker<DeleteMultiViewRequest, DeleteMultiViewResponse>
     */
    public SyncInvoker<DeleteMultiViewRequest, DeleteMultiViewResponse> deleteMultiViewInvoker(
        DeleteMultiViewRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteMultiView, hcClient);
    }

    /**
     * 通过目标模型删除关系实体的数据实例
     *
     * 本接口用于通过目标模型删除关系实体的数据实例，即解除源模型实例与目标模型实例之间的关联关系。
     * - 调用本接口时，需在sourceId中指定源模型实例ID，在targetType中指定目标模型的英文名称，系统将删除该源实例与指定目标模型之间的所有关联关系实例。
     * - 当latestOnly设置为true时，仅删除源实例关联的最新版本目标模型实例的关系（仅对M-V模型实体生效）。
     * - 当latestOnly设置为false时，删除源实例关联的所有版本目标模型实例的关系。
     * - 本接口仅执行关系表的DELETE操作，目标端实体的业务数据不受任何影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTargetRequest 请求对象
     * @return DeleteTargetResponse
     */
    public DeleteTargetResponse deleteTarget(DeleteTargetRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.deleteTarget);
    }

    /**
     * 通过目标模型删除关系实体的数据实例
     *
     * 本接口用于通过目标模型删除关系实体的数据实例，即解除源模型实例与目标模型实例之间的关联关系。
     * - 调用本接口时，需在sourceId中指定源模型实例ID，在targetType中指定目标模型的英文名称，系统将删除该源实例与指定目标模型之间的所有关联关系实例。
     * - 当latestOnly设置为true时，仅删除源实例关联的最新版本目标模型实例的关系（仅对M-V模型实体生效）。
     * - 当latestOnly设置为false时，删除源实例关联的所有版本目标模型实例的关系。
     * - 本接口仅执行关系表的DELETE操作，目标端实体的业务数据不受任何影响。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTargetRequest 请求对象
     * @return SyncInvoker<DeleteTargetRequest, DeleteTargetResponse>
     */
    public SyncInvoker<DeleteTargetRequest, DeleteTargetResponse> deleteTargetInvoker(DeleteTargetRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.deleteTarget, hcClient);
    }

    /**
     * 删除实例
     *
     * 本接口用于根据数据实例的唯一编码（id），删除指定数据模型中的一个数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必确认目标实例，谨慎操作。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一编码（id），删除指定数据模型中的一个数据实例。
     * 删除操作不可逆，实例删除后将无法恢复。请在调用前务必确认目标实例，谨慎操作。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于批量将指定数据模型的数据实例标记为失效状态，并同步返回实际失效成功的实例数量。
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
     * 本接口用于批量将指定数据模型的数据实例标记为失效状态，并同步返回实际失效成功的实例数量。
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
     * 本接口用于批量将指定数据模型中处于失效状态的数据实例重新标记为生效状态，并同步返回实际生效成功的实例数量。
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
     * 本接口用于批量将指定数据模型中处于失效状态的数据实例重新标记为生效状态，并同步返回实际生效成功的实例数量。
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
     * 本接口用于对指定的Master-Branch-Version（M-V）模型实例执行修订（Revise）操作。
     * 调用本接口后，系统会基于指定的主对象（Master）及其当前最新修订版本，复制并生成一个新的修订版本实例。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于对指定的Master-Branch-Version（M-V）模型实例执行修订（Revise）操作。
     * 调用本接口后，系统会基于指定的主对象（Master）及其当前最新修订版本，复制并生成一个新的修订版本实例。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 生成新模型业务编码
     *
     * 本接口用于根据指定数据模型在应用设计态预配置的“业务编码生成器”规则，自动生成符合企业命名规范的业务流水码。
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
     * 生成新模型业务编码
     *
     * 本接口用于根据指定数据模型在应用设计态预配置的“业务编码生成器”规则，自动生成符合企业命名规范的业务流水码。
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
     * 本接口用于根据主对象ID（masterId），分页获取指定Master-Branch-Version（M-V）模型实例的所有版本信息（包含对应版本下的属性信息）。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID（masterId），分页获取指定Master-Branch-Version（M-V）模型实例的所有版本信息（包含对应版本下的属性信息）。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 批量查询关系实体关联模型的信息
     *
     * 本接口用于批量查询指定关系实体所关联的源模型或目标模型的所有实例信息，返回结果包含实例的具体属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchQueryRelatedObjectsRequest 请求对象
     * @return ListBatchQueryRelatedObjectsResponse
     */
    public ListBatchQueryRelatedObjectsResponse listBatchQueryRelatedObjects(
        ListBatchQueryRelatedObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listBatchQueryRelatedObjects);
    }

    /**
     * 批量查询关系实体关联模型的信息
     *
     * 本接口用于批量查询指定关系实体所关联的源模型或目标模型的所有实例信息，返回结果包含实例的具体属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchQueryRelatedObjectsRequest 请求对象
     * @return SyncInvoker<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse>
     */
    public SyncInvoker<ListBatchQueryRelatedObjectsRequest, ListBatchQueryRelatedObjectsResponse> listBatchQueryRelatedObjectsInvoker(
        ListBatchQueryRelatedObjectsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listBatchQueryRelatedObjects, hcClient);
    }

    /**
     * 获取所有父节点
     *
     * 本接口用于获取指定数据实例的所有父节点列表，同时返回各父节点的列表属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetAllParentListRequest 请求对象
     * @return ListGetAllParentListResponse
     */
    public ListGetAllParentListResponse listGetAllParentList(ListGetAllParentListRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listGetAllParentList);
    }

    /**
     * 获取所有父节点
     *
     * 本接口用于获取指定数据实例的所有父节点列表，同时返回各父节点的列表属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetAllParentListRequest 请求对象
     * @return SyncInvoker<ListGetAllParentListRequest, ListGetAllParentListResponse>
     */
    public SyncInvoker<ListGetAllParentListRequest, ListGetAllParentListResponse> listGetAllParentListInvoker(
        ListGetAllParentListRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listGetAllParentList, hcClient);
    }

    /**
     * 获取子节点
     *
     * 本接口用于分页获取指定数据实例的直接子节点列表，同时返回各子节点的列表属性。当需要展开BOM（物料清单）的某个装配节点查看下级零部件、浏览组织架构中某个部门的下属团队或查看产品分类的下一级类目时，可调用本接口获取直接子节点信息。
     * 调用本接口时，需在parentId中传入目标数据实例的ID，系统将返回该实例的直接子节点（仅返回一层，不向下递归）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetChildListRequest 请求对象
     * @return ListGetChildListResponse
     */
    public ListGetChildListResponse listGetChildList(ListGetChildListRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listGetChildList);
    }

    /**
     * 获取子节点
     *
     * 本接口用于分页获取指定数据实例的直接子节点列表，同时返回各子节点的列表属性。当需要展开BOM（物料清单）的某个装配节点查看下级零部件、浏览组织架构中某个部门的下属团队或查看产品分类的下一级类目时，可调用本接口获取直接子节点信息。
     * 调用本接口时，需在parentId中传入目标数据实例的ID，系统将返回该实例的直接子节点（仅返回一层，不向下递归）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGetChildListRequest 请求对象
     * @return SyncInvoker<ListGetChildListRequest, ListGetChildListResponse>
     */
    public SyncInvoker<ListGetChildListRequest, ListGetChildListResponse> listGetChildListInvoker(
        ListGetChildListRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listGetChildList, hcClient);
    }

    /**
     * 分页查询模型历史版本信息
     *
     * 本接口用于分页查询指定数据实例的历史版本信息。系统以数据实例的最后修改时间作为查询条件，根据您指定的时间范围返回该实例的历史版本变更记录。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于分页查询指定数据实例的历史版本信息。系统以数据实例的最后修改时间作为查询条件，根据您指定的时间范围返回该实例的历史版本变更记录。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“系统版本”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 查询结构化文档
     *
     * 本接口用于查询指定数据模型下的结构化文档列表。
     * - 当请求中传入instance_id时，返回与该实例关联的结构化文档列表。
     * - 当请求中传入type时，返回指定类型的结构化文档列表。
     * - 当请求中同时传入instance_id和type时，返回同时满足两个条件的结构化文档列表。
     * - 当请求中不传入任何筛选条件时，返回该数据模型下所有的结构化文档列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryDocumentsRequest 请求对象
     * @return ListQueryDocumentsResponse
     */
    public ListQueryDocumentsResponse listQueryDocuments(ListQueryDocumentsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryDocuments);
    }

    /**
     * 查询结构化文档
     *
     * 本接口用于查询指定数据模型下的结构化文档列表。
     * - 当请求中传入instance_id时，返回与该实例关联的结构化文档列表。
     * - 当请求中传入type时，返回指定类型的结构化文档列表。
     * - 当请求中同时传入instance_id和type时，返回同时满足两个条件的结构化文档列表。
     * - 当请求中不传入任何筛选条件时，返回该数据模型下所有的结构化文档列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryDocumentsRequest 请求对象
     * @return SyncInvoker<ListQueryDocumentsRequest, ListQueryDocumentsResponse>
     */
    public SyncInvoker<ListQueryDocumentsRequest, ListQueryDocumentsResponse> listQueryDocumentsInvoker(
        ListQueryDocumentsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryDocuments, hcClient);
    }

    /**
     * 查询关系实体关联模型的信息
     *
     * 本接口用于分页查询指定关系实体所关联的源模型或目标模型的所有实例信息，返回结果包含关联实例的具体属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelatedObjectsRequest 请求对象
     * @return ListQueryRelatedObjectsResponse
     */
    public ListQueryRelatedObjectsResponse listQueryRelatedObjects(ListQueryRelatedObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryRelatedObjects);
    }

    /**
     * 查询关系实体关联模型的信息
     *
     * 本接口用于分页查询指定关系实体所关联的源模型或目标模型的所有实例信息，返回结果包含关联实例的具体属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelatedObjectsRequest 请求对象
     * @return SyncInvoker<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse>
     */
    public SyncInvoker<ListQueryRelatedObjectsRequest, ListQueryRelatedObjectsResponse> listQueryRelatedObjectsInvoker(
        ListQueryRelatedObjectsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryRelatedObjects, hcClient);
    }

    /**
     * 查询关系实体的数据实例
     *
     * 本接口用于分页查询关系实体的数据实例。通过指定数据实例ID及对应的关系角色（源/目标），或数据模型的英文名称及对应的关系角色（源类型/目标类型），返回匹配的关系实体数据实例信息。
     * 如果对应的关系实体存在“参考对象”类型属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelationshipRequest 请求对象
     * @return ListQueryRelationshipResponse
     */
    public ListQueryRelationshipResponse listQueryRelationship(ListQueryRelationshipRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryRelationship);
    }

    /**
     * 查询关系实体的数据实例
     *
     * 本接口用于分页查询关系实体的数据实例。通过指定数据实例ID及对应的关系角色（源/目标），或数据模型的英文名称及对应的关系角色（源类型/目标类型），返回匹配的关系实体数据实例信息。
     * 如果对应的关系实体存在“参考对象”类型属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryRelationshipRequest 请求对象
     * @return SyncInvoker<ListQueryRelationshipRequest, ListQueryRelationshipResponse>
     */
    public SyncInvoker<ListQueryRelationshipRequest, ListQueryRelationshipResponse> listQueryRelationshipInvoker(
        ListQueryRelationshipRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryRelationship, hcClient);
    }

    /**
     * 查询结构化文档分享授权列表
     *
     * 本接口用于查询指定结构化文档的分享授权列表，获取该文档的所有分享记录信息。当需要审计文档的共享范围、回收过期权限或排查文档访问异常时，可调用本接口获取完整的分享授权信息。
     * - 调用本接口时，需在params中传入目标结构化文档的ID。
     * - 返回结果中包含该文档的所有分享记录，每条记录包含被分享用户、分享用户、权限类型等详细信息。
     * - 返回结果中的id字段为分享权限记录的唯一标识，可用于[批量删除结构化文档分享权限 - BatchDeleteShareDocs](BatchDeleteShareDocs.xml)接口删除指定分享权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryShareDocsRequest 请求对象
     * @return ListQueryShareDocsResponse
     */
    public ListQueryShareDocsResponse listQueryShareDocs(ListQueryShareDocsRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryShareDocs);
    }

    /**
     * 查询结构化文档分享授权列表
     *
     * 本接口用于查询指定结构化文档的分享授权列表，获取该文档的所有分享记录信息。当需要审计文档的共享范围、回收过期权限或排查文档访问异常时，可调用本接口获取完整的分享授权信息。
     * - 调用本接口时，需在params中传入目标结构化文档的ID。
     * - 返回结果中包含该文档的所有分享记录，每条记录包含被分享用户、分享用户、权限类型等详细信息。
     * - 返回结果中的id字段为分享权限记录的唯一标识，可用于[批量删除结构化文档分享权限 - BatchDeleteShareDocs](BatchDeleteShareDocs.xml)接口删除指定分享权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryShareDocsRequest 请求对象
     * @return SyncInvoker<ListQueryShareDocsRequest, ListQueryShareDocsResponse>
     */
    public SyncInvoker<ListQueryShareDocsRequest, ListQueryShareDocsResponse> listQueryShareDocsInvoker(
        ListQueryShareDocsRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryShareDocs, hcClient);
    }

    /**
     * 通过源模型实例ID查询关联的目标模型实例
     *
     * 本接口用于通过源模型的数据实例ID，分页查询并返回与该实例关联的目标模型数据实例信息。返回的实例信息包含目标模板的“列表属性”（即模型中标记为列表展示的属性）。
     * 如果目标模型存在“参考对象”类型的属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 如果目标对象是M-V模型，可通过设置latestOnly&#x3D;true仅返回源实例关联的最新版本目标对象；默认返回所有版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryTargetRequest 请求对象
     * @return ListQueryTargetResponse
     */
    public ListQueryTargetResponse listQueryTarget(ListQueryTargetRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.listQueryTarget);
    }

    /**
     * 通过源模型实例ID查询关联的目标模型实例
     *
     * 本接口用于通过源模型的数据实例ID，分页查询并返回与该实例关联的目标模型数据实例信息。返回的实例信息包含目标模板的“列表属性”（即模型中标记为列表展示的属性）。
     * 如果目标模型存在“参考对象”类型的属性，且参考的数据模型为抽象模型，返回信息仅返回对应模型的英文名称和ID。如果参考的数据模型为实体模型，返回空。
     * 如果目标对象是M-V模型，可通过设置latestOnly&#x3D;true仅返回源实例关联的最新版本目标对象；默认返回所有版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQueryTargetRequest 请求对象
     * @return SyncInvoker<ListQueryTargetRequest, ListQueryTargetResponse>
     */
    public SyncInvoker<ListQueryTargetRequest, ListQueryTargetResponse> listQueryTargetInvoker(
        ListQueryTargetRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.listQueryTarget, hcClient);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据，且支持分页。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 目标数据模型在应用设计态中，必须至少存在一个“列表属性”为“是”的属性。
     * 2. 已在应用设计态完成数据模型的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 3. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据，且支持分页。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 目标数据模型在应用设计态中，必须至少存在一个“列表属性”为“是”的属性。
     * 2. 已在应用设计态完成数据模型的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 3. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据查询条件，按需返回数据模型实例的指定属性信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据查询条件，按需返回数据模型实例的指定属性信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据查询条件，分页检索数据模型实例的基础属性与系统级元数据信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据查询条件，分页检索数据模型实例的基础属性与系统级元数据信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 刷新树形节点
     *
     * 本接口用于刷新指定数据实例对应的节点全路径。在调用本接口前请确保数据模型具有“树形结构”功能。
     * 调用本接口时，如果未指定数据实例或指定的数据实例为父节点，则刷新整棵树的所有节点全路径。
     * 本接口为异步接口，调用后立即返回结果，但实际上整棵树的结构还在刷新中，需适时等待后（刷新时间视该树的大小而定）再查看该树的具体数据是否已刷新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RefreshRequest 请求对象
     * @return RefreshResponse
     */
    public RefreshResponse refresh(RefreshRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.refresh);
    }

    /**
     * 刷新树形节点
     *
     * 本接口用于刷新指定数据实例对应的节点全路径。在调用本接口前请确保数据模型具有“树形结构”功能。
     * 调用本接口时，如果未指定数据实例或指定的数据实例为父节点，则刷新整棵树的所有节点全路径。
     * 本接口为异步接口，调用后立即返回结果，但实际上整棵树的结构还在刷新中，需适时等待后（刷新时间视该树的大小而定）再查看该树的具体数据是否已刷新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RefreshRequest 请求对象
     * @return SyncInvoker<RefreshRequest, RefreshResponse>
     */
    public SyncInvoker<RefreshRequest, RefreshResponse> refreshInvoker(RefreshRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.refresh, hcClient);
    }

    /**
     * 移除数据分类
     *
     * 本接口用于数据实例从指定分类中移除。当零部件变更产品线、设备调整工艺归属或物料重新归类时，可调用本接口解除实例与分类的关联关系。
     * - 当实例不存在时，系统将抛出异常。
     * - 当实例与指定分类不存在关联关系时，返回值为0。
     * - 当实例与指定分类存在关联关系时，返回值为成功移除的关联数据分类个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFromCategoryRequest 请求对象
     * @return RemoveFromCategoryResponse
     */
    public RemoveFromCategoryResponse removeFromCategory(RemoveFromCategoryRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.removeFromCategory);
    }

    /**
     * 移除数据分类
     *
     * 本接口用于数据实例从指定分类中移除。当零部件变更产品线、设备调整工艺归属或物料重新归类时，可调用本接口解除实例与分类的关联关系。
     * - 当实例不存在时，系统将抛出异常。
     * - 当实例与指定分类不存在关联关系时，返回值为0。
     * - 当实例与指定分类存在关联关系时，返回值为成功移除的关联数据分类个数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveFromCategoryRequest 请求对象
     * @return SyncInvoker<RemoveFromCategoryRequest, RemoveFromCategoryResponse>
     */
    public SyncInvoker<RemoveFromCategoryRequest, RemoveFromCategoryResponse> removeFromCategoryInvoker(
        RemoveFromCategoryRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.removeFromCategory, hcClient);
    }

    /**
     * 解绑标签
     *
     * 本接口用于为指定数据模型的数据实例解绑标签，移除实例与标签之间的关联关系。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 解绑标签
     *
     * 本接口用于为指定数据模型的数据实例解绑标签，移除实例与标签之间的关联关系。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据模型中“唯一键”为“是”的属性（业务唯一键），对数据实例执行全量保存或更新操作。
     * 更新（Update）：若系统中已存在匹配该唯一键的实例，则更新其所有字段。
     * 创建（Insert）：若系统中不存在匹配该唯一键的实例，则自动创建一条新实例。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据模型中“唯一键”为“是”的属性（业务唯一键），对数据实例执行全量保存或更新操作。
     * 更新（Update）：若系统中已存在匹配该唯一键的实例，则更新其所有字段。
     * 创建（Insert）：若系统中不存在匹配该唯一键的实例，则自动创建一条新实例。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 另存实例数据
     *
     * 本接口用于对指定数据模型的数据实例执行另存为（SaveAs）操作。系统将以指定的源实例为模板，克隆其数据并生成一条全新的实例记录。
     * 在另存过程中，用户可以灵活控制新实例的属性值：
     * - 未作特殊指定的属性，将完全保持与源实例一致。
     * - 可通过entityToSave为指定属性赋予新的值。
     * - 可通过needSetNullAttrs将指定属性强制清空（置为Null）。
     * 另存操作不会修改或覆盖源实例，而是生成一个具有全新系统主键（id）的新实例。此功能常用于工业场景中的“图纸/模型版本迭代”、“BOM复制建版”或“基于历史数据快速创建新对象”等业务。
     * 
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 另存实例数据
     *
     * 本接口用于对指定数据模型的数据实例执行另存为（SaveAs）操作。系统将以指定的源实例为模板，克隆其数据并生成一条全新的实例记录。
     * 在另存过程中，用户可以灵活控制新实例的属性值：
     * - 未作特殊指定的属性，将完全保持与源实例一致。
     * - 可通过entityToSave为指定属性赋予新的值。
     * - 可通过needSetNullAttrs将指定属性强制清空（置为Null）。
     * 另存操作不会修改或覆盖源实例，而是生成一个具有全新系统主键（id）的新实例。此功能常用于工业场景中的“图纸/模型版本迭代”、“BOM复制建版”或“基于历史数据快速创建新对象”等业务。
     * 
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据模型中“唯一键”为“是”的属性（业务唯一键），对数据实例执行指定字段的保存或更新操作。
     *   - 更新（Update）：若系统中已存在匹配该唯一键的实例，则仅更新请求体中传入的指定字段。
     *   - 创建（Insert）：若系统中不存在匹配该唯一键的实例，则自动创建一条新实例。
     * 
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据模型中“唯一键”为“是”的属性（业务唯一键），对数据实例执行指定字段的保存或更新操作。
     *   - 更新（Update）：若系统中已存在匹配该唯一键的实例，则仅更新请求体中传入的指定字段。
     *   - 创建（Insert）：若系统中不存在匹配该唯一键的实例，则自动创建一条新实例。
     * 
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于分页查询指定数据模型中的数据实例列表。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于分页查询指定数据模型中的数据实例列表。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 根据唯一键为“是”的基本属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的基本属性时，可根据该属性查询实例数据。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 根据唯一键为“是”的基本属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的基本属性时，可根据该属性查询实例数据。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 获取父节点
     *
     * 本接口用于获取指定数据实例的直接父节点，同时返回父节点的列表属性。当需要查询BOM（物料清单）中某个零部件的直接上级装配节点、查看组织架构中某个部门的直接汇报部门或获取产品分类的直接上级类目时，可调用本接口获取直接父节点信息。
     * - 调用本接口时，需在childId中传入目标数据实例的ID，系统将返回该实例的直接父节点（仅返回一层，不向上递归）。
     * - 返回结果中包含父节点的完整属性信息，包括创建者、创建时间、租户信息等列表属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetParentRequest 请求对象
     * @return ShowGetParentResponse
     */
    public ShowGetParentResponse showGetParent(ShowGetParentRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetParent);
    }

    /**
     * 获取父节点
     *
     * 本接口用于获取指定数据实例的直接父节点，同时返回父节点的列表属性。当需要查询BOM（物料清单）中某个零部件的直接上级装配节点、查看组织架构中某个部门的直接汇报部门或获取产品分类的直接上级类目时，可调用本接口获取直接父节点信息。
     * - 调用本接口时，需在childId中传入目标数据实例的ID，系统将返回该实例的直接父节点（仅返回一层，不向上递归）。
     * - 返回结果中包含父节点的完整属性信息，包括创建者、创建时间、租户信息等列表属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetParentRequest 请求对象
     * @return SyncInvoker<ShowGetParentRequest, ShowGetParentResponse>
     */
    public SyncInvoker<ShowGetParentRequest, ShowGetParentResponse> showGetParentInvoker(ShowGetParentRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetParent, hcClient);
    }

    /**
     * 获取根节点
     *
     * 本接口用于获取指定数据实例所在树形结构的根节点信息。当需要追溯BOM（物料清单）的顶层装配节点、查找组织架构的顶层部门或定位产品分类的顶级类目时，可调用本接口获取目标节点的根节点。
     * 调用本接口时，需在id中传入目标数据实例的ID，系统将沿树形结构向上遍历，返回该实例所在树的根节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetRootRequest 请求对象
     * @return ShowGetRootResponse
     */
    public ShowGetRootResponse showGetRoot(ShowGetRootRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetRoot);
    }

    /**
     * 获取根节点
     *
     * 本接口用于获取指定数据实例所在树形结构的根节点信息。当需要追溯BOM（物料清单）的顶层装配节点、查找组织架构的顶层部门或定位产品分类的顶级类目时，可调用本接口获取目标节点的根节点。
     * 调用本接口时，需在id中传入目标数据实例的ID，系统将沿树形结构向上遍历，返回该实例所在树的根节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetRootRequest 请求对象
     * @return SyncInvoker<ShowGetRootRequest, ShowGetRootResponse>
     */
    public SyncInvoker<ShowGetRootRequest, ShowGetRootResponse> showGetRootInvoker(ShowGetRootRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetRoot, hcClient);
    }

    /**
     * 获取Token信息
     *
     * 本接口用于通过文档ID和认证类型获取结构化文档的访问Token。获取Token后，可在Token有效期内对指定结构化文档进行只读或读写操作。
     * - 当认证类型为read时，获取的Token仅支持对文档进行查看操作。
     * - 当认证类型为write时，获取的Token支持对文档进行编辑、保存等操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetTokensRequest 请求对象
     * @return ShowGetTokensResponse
     */
    public ShowGetTokensResponse showGetTokens(ShowGetTokensRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetTokens);
    }

    /**
     * 获取Token信息
     *
     * 本接口用于通过文档ID和认证类型获取结构化文档的访问Token。获取Token后，可在Token有效期内对指定结构化文档进行只读或读写操作。
     * - 当认证类型为read时，获取的Token仅支持对文档进行查看操作。
     * - 当认证类型为write时，获取的Token支持对文档进行编辑、保存等操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetTokensRequest 请求对象
     * @return SyncInvoker<ShowGetTokensRequest, ShowGetTokensResponse>
     */
    public SyncInvoker<ShowGetTokensRequest, ShowGetTokensResponse> showGetTokensInvoker(ShowGetTokensRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetTokens, hcClient);
    }

    /**
     * 查询实例详情
     *
     * 本接口用于根据数据实例的唯一编码（id），查询指定数据模型下单个数据实例的完整详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 查询实例详情
     *
     * 本接口用于根据数据实例的唯一编码（id），查询指定数据模型下单个数据实例的完整详细信息。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的过滤条件，批量对指定数据模型下满足条件的所有数据实例执行软删除（逻辑删除）操作。
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的过滤条件，批量对指定数据模型下满足条件的所有数据实例执行软删除（逻辑删除）操作。
     * 通过此接口进行删除操作时，系统会将当前删除的实例转存至XDM应用的XDMLogicDeleteData内置模型中。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一编码（id），对指定数据模型下的单个数据实例执行软删除（逻辑删除）操作。
     * 软删除操作不会从数据库中物理移除数据，而是将实例标记为已删除状态，并转存至XDM应用的XDMLogicDeleteData内置模型中。如需彻底删除数据，请使用[删除实例 - DeleteUsingPost](DeleteUsingPost.xml)接口。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据数据实例的唯一编码（id），对指定数据模型下的单个数据实例执行软删除（逻辑删除）操作。
     * 软删除操作不会从数据库中物理移除数据，而是将实例标记为已删除状态，并转存至XDM应用的XDMLogicDeleteData内置模型中。如需彻底删除数据，请使用[删除实例 - DeleteUsingPost](DeleteUsingPost.xml)接口。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 分页查询数据实例的统计信息
     *
     * 本接口用于根据指定的聚合函数与分组条件，对指定数据模型的实例数据进行统计计算，并支持对分组后的统计结果进行分页返回。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsPageRequest 请求对象
     * @return ShowStaticsPageResponse
     */
    public ShowStaticsPageResponse showStaticsPage(ShowStaticsPageRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showStaticsPage);
    }

    /**
     * 分页查询数据实例的统计信息
     *
     * 本接口用于根据指定的聚合函数与分组条件，对指定数据模型的实例数据进行统计计算，并支持对分组后的统计结果进行分页返回。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStaticsPageRequest 请求对象
     * @return SyncInvoker<ShowStaticsPageRequest, ShowStaticsPageResponse>
     */
    public SyncInvoker<ShowStaticsPageRequest, ShowStaticsPageResponse> showStaticsPageInvoker(
        ShowStaticsPageRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showStaticsPage, hcClient);
    }

    /**
     * 查询指定数据模型的实例统计信息
     *
     * 本接口用于根据指定的聚合函数与分组条件，对指定数据模型的实例数据进行统计计算（如计数、求平均值、求最大/最小值等）。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的聚合函数与分组条件，对指定数据模型的实例数据进行统计计算（如计数、求平均值、求最大/最小值等）。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 查询指定数据实例的标签详情
     *
     * 本接口用于查询指定模型的数据实例已绑定的所有标签详情，返回标签的完整定义信息及所属标签组信息。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 查询指定数据实例的标签详情
     *
     * 本接口用于查询指定模型的数据实例已绑定的所有标签详情，返回标签的完整定义信息及所属标签组信息。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“标签管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据主对象ID、迭代版本和版本号，查询M-V模型实例的详细版本信息。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 切换生命周期模板
     *
     * 本接口用于为指定模型的数据实例切换绑定的生命周期模板，并同时指定实例在新模板中的生命周期状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“生命周期管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在运行态创建目标生命周期模板，且模板中包含目标生命周期状态。具体操作请参见[生命周期管理](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0068.html)。
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
     * 切换生命周期模板
     *
     * 本接口用于为指定模型的数据实例切换绑定的生命周期模板，并同时指定实例在新模板中的生命周期状态。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“生命周期管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在运行态创建目标生命周期模板，且模板中包含目标生命周期状态。具体操作请参见[生命周期管理](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0068.html)。
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
     * 本接口用于更新指定M-V模型实例的数据，并同步完成检入操作，即一步完成“修改-提交”流程。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于更新指定M-V模型实例的数据，并同步完成检入操作，即一步完成“修改-提交”流程。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本用于修订一个指定的M-V模型数据实例，并在修订生成新版本的同时，更新该新实例的业务数据。
     * 修订操作会将version字段升级为新的修订版本号（例如从A升级到B），随后将data参数中指定的属性值应用到新版本实例上。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本用于修订一个指定的M-V模型数据实例，并在修订生成新版本的同时，更新该新实例的业务数据。
     * 修订操作会将version字段升级为新的修订版本号（例如从A升级到B），随后将data参数中指定的属性值应用到新版本实例上。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员强制更新Master-Branch-Version（M-V）模型数据实例，适用于数据治理中的紧急数据修正、版本回滚、批量属性修正等管理场景。当实例的唯一编码不存在时，系统将不做任何更新操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于管理员强制更新Master-Branch-Version（M-V）模型数据实例，适用于数据治理中的紧急数据修正、版本回滚、批量属性修正等管理场景。当实例的唯一编码不存在时，系统将不做任何更新操作。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态完成M-V模型实体（即“父模型”为“VersionObject”的数据实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的过滤条件，批量更新指定数据模型下满足条件的所有数据实例。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于根据指定的过滤条件，批量更新指定数据模型下满足条件的所有数据实例。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 更新文档标题
     *
     * 本接口用于更新结构化文档的标题信息。当文档标题需要随产品版本迭代、工艺变更或项目阶段调整时，可调用本接口修改文档标题。
     * 调用本接口时，需通过document_id或instance_id指定目标文档。
     * 若同时传入document_id和instance_id，优先以document_id定位目标文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return UpdateDocumentResponse
     */
    public UpdateDocumentResponse updateDocument(UpdateDocumentRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.updateDocument);
    }

    /**
     * 更新文档标题
     *
     * 本接口用于更新结构化文档的标题信息。当文档标题需要随产品版本迭代、工艺变更或项目阶段调整时，可调用本接口修改文档标题。
     * 调用本接口时，需通过document_id或instance_id指定目标文档。
     * 若同时传入document_id和instance_id，优先以document_id定位目标文档。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDocumentRequest 请求对象
     * @return SyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse>
     */
    public SyncInvoker<UpdateDocumentRequest, UpdateDocumentResponse> updateDocumentInvoker(
        UpdateDocumentRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.updateDocument, hcClient);
    }

    /**
     * 设置生命周期的状态
     *
     * 本接口用于修改或切换数据实例所绑定的生命周期状态，支持单个或批量实例的状态更新。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“生命周期管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在运行态创建并发布目标生命周期模板，且模板中包含目标生命周期状态。具体操作请参见[生命周期管理](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0068.html)。
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
     * 设置生命周期的状态
     *
     * 本接口用于修改或切换数据实例所绑定的生命周期状态，支持单个或批量实例的状态更新。
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“生命周期管理”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
     * 3. 已在运行态创建并发布目标生命周期模板，且模板中包含目标生命周期状态。具体操作请参见[生命周期管理](https://support.huaweicloud.com/usermanual-idme/idme_clientog_0068.html)。
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
     * 本接口用于更新指定数据模型中的一个实例数据。如果请求中指定的实例唯一编码（id）不存在，接口将不会执行任何更新操作，也不会返回错误。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 本接口用于更新指定数据模型中的一个实例数据。如果请求中指定的实例唯一编码（id）不存在，接口将不会执行任何更新操作，也不会返回错误。
     * 在调用本接口前，请确保目标数据模型已满足实例化条件：
     * 1. 已在应用设计态完成数据模型（数据实体或关系实体）的创建与发布。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 更新M-V模型数据实例的多维视图属性
     *
     * 本接口用于更新指定M-V模型实例的多维视图属性。
     * 在多维视图管理中，一个零部件（Part）可能衍生出“研发”、“工艺”、“采购”等多个视图。随着业务流转或数据纠错的需求，可能需要对已存在的视图实例进行属性调整：
     * - 变更视图标识（视角切换）：当视图绑定的分类标识（item，如MultiViewItem对象）分配错误或业务标准变更时，可通过此接口将其重新绑定到正确的视图标识上。
     * - 视图属性脱敏/置空：在切换视角或修正数据时，通过needSetNull参数强制清空某些不再适用于当前视角的敏感或冗余属性。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
     * 更新M-V模型数据实例的多维视图属性
     *
     * 本接口用于更新指定M-V模型实例的多维视图属性。
     * 在多维视图管理中，一个零部件（Part）可能衍生出“研发”、“工艺”、“采购”等多个视图。随着业务流转或数据纠错的需求，可能需要对已存在的视图实例进行属性调整：
     * - 变更视图标识（视角切换）：当视图绑定的分类标识（item，如MultiViewItem对象）分配错误或业务标准变更时，可通过此接口将其重新绑定到正确的视图标识上。
     * - 视图属性脱敏/置空：在切换视角或修正数据时，通过needSetNull参数强制清空某些不再适用于当前视角的敏感或冗余属性。
     * 
     * 在调用本接口前，请确保目标数据模型满足以下条件：
     * 1. 已在应用设计态创建并发布一个具有“多维视图&amp;多维分支”功能的数据模型。具体操作请参见[创建数据实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0007.html)、[创建关系实体](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0022.html)和[应用发布](https://support.huaweicloud.com/usermanual-idme/idme_usermanual_0085.html)。
     * 2. 已将对应应用成功部署至运行态。具体操作请参见[部署应用](https://support.huaweicloud.com/consog-idme/idme_consog_0022.html)。
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
