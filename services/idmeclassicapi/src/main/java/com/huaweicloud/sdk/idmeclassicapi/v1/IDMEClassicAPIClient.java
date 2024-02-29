package com.huaweicloud.sdk.idmeclassicapi.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * @param request ShowBatchCheckinUsingPostRequest 请求对象
     * @return ShowBatchCheckinUsingPostResponse
     */
    public ShowBatchCheckinUsingPostResponse showBatchCheckinUsingPost(ShowBatchCheckinUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckinUsingPost);
    }

    /**
     * XDM_批量检入VersionModel
     *
     * 根据主对象ID批量检入版本对象，小版本升版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckinUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse>
     */
    public SyncInvoker<ShowBatchCheckinUsingPostRequest, ShowBatchCheckinUsingPostResponse> showBatchCheckinUsingPostInvoker(
        ShowBatchCheckinUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckinUsingPost, hcClient);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutAndUpdateUsingPostRequest 请求对象
     * @return ShowBatchCheckoutAndUpdateUsingPostResponse
     */
    public ShowBatchCheckoutAndUpdateUsingPostResponse showBatchCheckoutAndUpdateUsingPost(
        ShowBatchCheckoutAndUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckoutAndUpdateUsingPost);
    }

    /**
     * XDM_批量检出并更新VersionModel
     *
     * 根据主对象ID批量检出对象并根据传入字段批量更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutAndUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowBatchCheckoutAndUpdateUsingPostRequest, ShowBatchCheckoutAndUpdateUsingPostResponse> showBatchCheckoutAndUpdateUsingPostInvoker(
        ShowBatchCheckoutAndUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckoutAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutUsingPostRequest 请求对象
     * @return ShowBatchCheckoutUsingPostResponse
     */
    public ShowBatchCheckoutUsingPostResponse showBatchCheckoutUsingPost(ShowBatchCheckoutUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCheckoutUsingPost);
    }

    /**
     * XDM_批量检出VersionModel
     *
     * 根据主对象ID批量检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCheckoutUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse>
     */
    public SyncInvoker<ShowBatchCheckoutUsingPostRequest, ShowBatchCheckoutUsingPostResponse> showBatchCheckoutUsingPostInvoker(
        ShowBatchCheckoutUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCheckoutUsingPost, hcClient);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateUsingPostRequest 请求对象
     * @return ShowBatchCreateUsingPostResponse
     */
    public ShowBatchCreateUsingPostResponse showBatchCreateUsingPost(ShowBatchCreateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchCreateUsingPost);
    }

    /**
     * 批量创建实例
     *
     * 批量创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse>
     */
    public SyncInvoker<ShowBatchCreateUsingPostRequest, ShowBatchCreateUsingPostResponse> showBatchCreateUsingPostInvoker(
        ShowBatchCreateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchCreateUsingPost, hcClient);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteBranchUsingPostRequest 请求对象
     * @return ShowBatchDeleteBranchUsingPostResponse
     */
    public ShowBatchDeleteBranchUsingPostResponse showBatchDeleteBranchUsingPost(
        ShowBatchDeleteBranchUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchDeleteBranchUsingPost);
    }

    /**
     * XDM_批量删除VersionModel最新分支版本下所有小版本
     *
     * 根据主对象ID&amp;业务版本列表，批量删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchDeleteBranchUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse>
     */
    public SyncInvoker<ShowBatchDeleteBranchUsingPostRequest, ShowBatchDeleteBranchUsingPostResponse> showBatchDeleteBranchUsingPostInvoker(
        ShowBatchDeleteBranchUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchDeleteBranchUsingPost, hcClient);
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
     * @return ShowBatchDeleteUsingPostResponse
     */
    public ShowBatchDeleteUsingPostResponse showBatchDeleteUsingPost(ShowBatchDeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchDeleteUsingPost);
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
     * @return SyncInvoker<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse>
     */
    public SyncInvoker<ShowBatchDeleteUsingPostRequest, ShowBatchDeleteUsingPostResponse> showBatchDeleteUsingPostInvoker(
        ShowBatchDeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchDeleteUsingPost, hcClient);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchGetUsingPostRequest 请求对象
     * @return ShowBatchGetUsingPostResponse
     */
    public ShowBatchGetUsingPostResponse showBatchGetUsingPost(ShowBatchGetUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchGetUsingPost);
    }

    /**
     * 批量查询实例
     *
     * 根据多个数据实例的唯一编码，批量查询实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchGetUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse>
     */
    public SyncInvoker<ShowBatchGetUsingPostRequest, ShowBatchGetUsingPostResponse> showBatchGetUsingPostInvoker(
        ShowBatchGetUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchGetUsingPost, hcClient);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteBranchUsingPostRequest 请求对象
     * @return ShowBatchLogicalDeleteBranchUsingPostResponse
     */
    public ShowBatchLogicalDeleteBranchUsingPostResponse showBatchLogicalDeleteBranchUsingPost(
        ShowBatchLogicalDeleteBranchUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchLogicalDeleteBranchUsingPost);
    }

    /**
     * XDM_批量软删除VersionModel最新分支版本下所有小版本
     *
     * 批量软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchLogicalDeleteBranchUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse>
     */
    public SyncInvoker<ShowBatchLogicalDeleteBranchUsingPostRequest, ShowBatchLogicalDeleteBranchUsingPostResponse> showBatchLogicalDeleteBranchUsingPostInvoker(
        ShowBatchLogicalDeleteBranchUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchLogicalDeleteBranchUsingPost, hcClient);
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
     * @return ShowBatchLogicalDeleteUsingPostResponse
     */
    public ShowBatchLogicalDeleteUsingPostResponse showBatchLogicalDeleteUsingPost(
        ShowBatchLogicalDeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchLogicalDeleteUsingPost);
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
     * @return SyncInvoker<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse>
     */
    public SyncInvoker<ShowBatchLogicalDeleteUsingPostRequest, ShowBatchLogicalDeleteUsingPostResponse> showBatchLogicalDeleteUsingPostInvoker(
        ShowBatchLogicalDeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchLogicalDeleteUsingPost, hcClient);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseAndUpdateUsingPostRequest 请求对象
     * @return ShowBatchReviseAndUpdateUsingPostResponse
     */
    public ShowBatchReviseAndUpdateUsingPostResponse showBatchReviseAndUpdateUsingPost(
        ShowBatchReviseAndUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchReviseAndUpdateUsingPost);
    }

    /**
     * XDM_批量修订且更新VersionModel。
     *
     * 根据主对象ID批量修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseAndUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowBatchReviseAndUpdateUsingPostRequest, ShowBatchReviseAndUpdateUsingPostResponse> showBatchReviseAndUpdateUsingPostInvoker(
        ShowBatchReviseAndUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchReviseAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseUsingPostRequest 请求对象
     * @return ShowBatchReviseUsingPostResponse
     */
    public ShowBatchReviseUsingPostResponse showBatchReviseUsingPost(ShowBatchReviseUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchReviseUsingPost);
    }

    /**
     * XDM_批量修订VersionModel。
     *
     * 根据主对象ID批量修订对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchReviseUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse>
     */
    public SyncInvoker<ShowBatchReviseUsingPostRequest, ShowBatchReviseUsingPostResponse> showBatchReviseUsingPostInvoker(
        ShowBatchReviseUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchReviseUsingPost, hcClient);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return ShowBatchUndoCheckoutByAdminUsingPostResponse
     */
    public ShowBatchUndoCheckoutByAdminUsingPostResponse showBatchUndoCheckoutByAdminUsingPost(
        ShowBatchUndoCheckoutByAdminUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUndoCheckoutByAdminUsingPost);
    }

    /**
     * XDM_管理员批量撤销检出VersionModel
     *
     * 管理员根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUndoCheckoutByAdminUsingPostRequest, ShowBatchUndoCheckoutByAdminUsingPostResponse> showBatchUndoCheckoutByAdminUsingPostInvoker(
        ShowBatchUndoCheckoutByAdminUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUndoCheckoutByAdminUsingPost, hcClient);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutUsingPostRequest 请求对象
     * @return ShowBatchUndoCheckoutUsingPostResponse
     */
    public ShowBatchUndoCheckoutUsingPostResponse showBatchUndoCheckoutUsingPost(
        ShowBatchUndoCheckoutUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUndoCheckoutUsingPost);
    }

    /**
     * XDM_批量撤销检出VersionModel
     *
     * 根据主对象ID批量撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUndoCheckoutUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUndoCheckoutUsingPostRequest, ShowBatchUndoCheckoutUsingPostResponse> showBatchUndoCheckoutUsingPostInvoker(
        ShowBatchUndoCheckoutUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUndoCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateAndCheckinUsingPostRequest 请求对象
     * @return ShowBatchUpdateAndCheckinUsingPostResponse
     */
    public ShowBatchUpdateAndCheckinUsingPostResponse showBatchUpdateAndCheckinUsingPost(
        ShowBatchUpdateAndCheckinUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateAndCheckinUsingPost);
    }

    /**
     * XDM_批量更新并检入VersionModel
     *
     * 根据传入字段批量更新版本对象并根据主对象ID批量检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateAndCheckinUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUpdateAndCheckinUsingPostRequest, ShowBatchUpdateAndCheckinUsingPostResponse> showBatchUpdateAndCheckinUsingPostInvoker(
        ShowBatchUpdateAndCheckinUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateAndCheckinUsingPost, hcClient);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateByAdminUsingPostRequest 请求对象
     * @return ShowBatchUpdateByAdminUsingPostResponse
     */
    public ShowBatchUpdateByAdminUsingPostResponse showBatchUpdateByAdminUsingPost(
        ShowBatchUpdateByAdminUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateByAdminUsingPost);
    }

    /**
     * XDM_管理员批量更新VersionModel指定属性
     *
     * 以管理员身份批量更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateByAdminUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUpdateByAdminUsingPostRequest, ShowBatchUpdateByAdminUsingPostResponse> showBatchUpdateByAdminUsingPostInvoker(
        ShowBatchUpdateByAdminUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateByAdminUsingPost, hcClient);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateUsingPostRequest 请求对象
     * @return ShowBatchUpdateUsingPostResponse
     */
    public ShowBatchUpdateUsingPostResponse showBatchUpdateUsingPost(ShowBatchUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateUsingPost);
    }

    /**
     * 批量更新实例
     *
     * 批量更新指定数据模型中的多个实例数据。如果某个实例的唯一编码不存在，该实例不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUpdateUsingPostRequest, ShowBatchUpdateUsingPostResponse> showBatchUpdateUsingPostInvoker(
        ShowBatchUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateUsingPost, hcClient);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateVersionUsingPostRequest 请求对象
     * @return ShowBatchUpdateVersionUsingPostResponse
     */
    public ShowBatchUpdateVersionUsingPostResponse showBatchUpdateVersionUsingPost(
        ShowBatchUpdateVersionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showBatchUpdateVersionUsingPost);
    }

    /**
     * XDM_批量升版最新版本对象VersionModel的版本号
     *
     * 根据ID批量升版最新版本对象数据的版本号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchUpdateVersionUsingPostRequest 请求对象
     * @return SyncInvoker<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse>
     */
    public SyncInvoker<ShowBatchUpdateVersionUsingPostRequest, ShowBatchUpdateVersionUsingPostResponse> showBatchUpdateVersionUsingPostInvoker(
        ShowBatchUpdateVersionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showBatchUpdateVersionUsingPost, hcClient);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckinUsingPostRequest 请求对象
     * @return ShowCheckinUsingPostResponse
     */
    public ShowCheckinUsingPostResponse showCheckinUsingPost(ShowCheckinUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCheckinUsingPost);
    }

    /**
     * XDM_检入VersionModel
     *
     * 根据主对象ID检入版本对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckinUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse>
     */
    public SyncInvoker<ShowCheckinUsingPostRequest, ShowCheckinUsingPostResponse> showCheckinUsingPostInvoker(
        ShowCheckinUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCheckinUsingPost, hcClient);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutAndUpdateUsingPostRequest 请求对象
     * @return ShowCheckoutAndUpdateUsingPostResponse
     */
    public ShowCheckoutAndUpdateUsingPostResponse showCheckoutAndUpdateUsingPost(
        ShowCheckoutAndUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCheckoutAndUpdateUsingPost);
    }

    /**
     * XDM_检出并更新VersionModel
     *
     * 根据主对象ID检出对象并根据传入字段更新版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutAndUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowCheckoutAndUpdateUsingPostRequest, ShowCheckoutAndUpdateUsingPostResponse> showCheckoutAndUpdateUsingPostInvoker(
        ShowCheckoutAndUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCheckoutAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutUsingPostRequest 请求对象
     * @return ShowCheckoutUsingPostResponse
     */
    public ShowCheckoutUsingPostResponse showCheckoutUsingPost(ShowCheckoutUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCheckoutUsingPost);
    }

    /**
     * XDM_检出VersionModel
     *
     * 根据主对象ID检出版本对象，复制生成一条新的版本记录且状态为已检出。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCheckoutUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse>
     */
    public SyncInvoker<ShowCheckoutUsingPostRequest, ShowCheckoutUsingPostResponse> showCheckoutUsingPostInvoker(
        ShowCheckoutUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareBusinessVersionUsingPostRequest 请求对象
     * @return ShowCompareBusinessVersionUsingPostResponse
     */
    public ShowCompareBusinessVersionUsingPostResponse showCompareBusinessVersionUsingPost(
        ShowCompareBusinessVersionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCompareBusinessVersionUsingPost);
    }

    /**
     * XDM_VersionModel业务版本对比
     *
     * 根据主对象id，输入版本号（大版本+小版本）进行版本属性与关系对比。（建议使用新的接口instance-attrs-comparison和\\ instance-relation-comparison比较属性和关系）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCompareBusinessVersionUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse>
     */
    public SyncInvoker<ShowCompareBusinessVersionUsingPostRequest, ShowCompareBusinessVersionUsingPostResponse> showCompareBusinessVersionUsingPostInvoker(
        ShowCompareBusinessVersionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCompareBusinessVersionUsingPost, hcClient);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCountUsingPostRequest 请求对象
     * @return ShowCountUsingPostResponse
     */
    public ShowCountUsingPostResponse showCountUsingPost(ShowCountUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCountUsingPost);
    }

    /**
     * 统计指定数据模型的实例总数
     *
     * 根据指定的查询条件，统计指定数据模型中的实例总数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCountUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCountUsingPostRequest, ShowCountUsingPostResponse>
     */
    public SyncInvoker<ShowCountUsingPostRequest, ShowCountUsingPostResponse> showCountUsingPostInvoker(
        ShowCountUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCountUsingPost, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateUsingPostRequest 请求对象
     * @return ShowCreateUsingPostResponse
     */
    public ShowCreateUsingPostResponse showCreateUsingPost(ShowCreateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showCreateUsingPost);
    }

    /**
     * 创建实例
     *
     * 创建指定数据模型的数据实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCreateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse>
     */
    public SyncInvoker<ShowCreateUsingPostRequest, ShowCreateUsingPostResponse> showCreateUsingPostInvoker(
        ShowCreateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showCreateUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteBranchUsingPostRequest 请求对象
     * @return ShowDeleteBranchUsingPostResponse
     */
    public ShowDeleteBranchUsingPostResponse showDeleteBranchUsingPost(ShowDeleteBranchUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteBranchUsingPost);
    }

    /**
     * XDM_删除VersionModel最新分支版本下所有小版本
     *
     * 根据masterid&amp;version删除最新大版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteBranchUsingPostRequest 请求对象
     * @return SyncInvoker<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse>
     */
    public SyncInvoker<ShowDeleteBranchUsingPostRequest, ShowDeleteBranchUsingPostResponse> showDeleteBranchUsingPostInvoker(
        ShowDeleteBranchUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteBranchUsingPost, hcClient);
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
     * @return ShowDeleteByConditionUsingPostResponse
     */
    public ShowDeleteByConditionUsingPostResponse showDeleteByConditionUsingPost(
        ShowDeleteByConditionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteByConditionUsingPost);
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
     * @return SyncInvoker<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse>
     */
    public SyncInvoker<ShowDeleteByConditionUsingPostRequest, ShowDeleteByConditionUsingPostResponse> showDeleteByConditionUsingPostInvoker(
        ShowDeleteByConditionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteByConditionUsingPost, hcClient);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteLatestVersionUsingPostRequest 请求对象
     * @return ShowDeleteLatestVersionUsingPostResponse
     */
    public ShowDeleteLatestVersionUsingPostResponse showDeleteLatestVersionUsingPost(
        ShowDeleteLatestVersionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteLatestVersionUsingPost);
    }

    /**
     * XDM_删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，删除最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDeleteLatestVersionUsingPostRequest 请求对象
     * @return SyncInvoker<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse>
     */
    public SyncInvoker<ShowDeleteLatestVersionUsingPostRequest, ShowDeleteLatestVersionUsingPostResponse> showDeleteLatestVersionUsingPostInvoker(
        ShowDeleteLatestVersionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteLatestVersionUsingPost, hcClient);
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
     * @return ShowDeleteUsingPostResponse
     */
    public ShowDeleteUsingPostResponse showDeleteUsingPost(ShowDeleteUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showDeleteUsingPost);
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
     * @return SyncInvoker<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse>
     */
    public SyncInvoker<ShowDeleteUsingPostRequest, ShowDeleteUsingPostResponse> showDeleteUsingPostInvoker(
        ShowDeleteUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showDeleteUsingPost, hcClient);
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
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetAllVersionsUsingPostRequest 请求对象
     * @return ShowGetAllVersionsUsingPostResponse
     */
    public ShowGetAllVersionsUsingPostResponse showGetAllVersionsUsingPost(ShowGetAllVersionsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetAllVersionsUsingPost);
    }

    /**
     * XDM_获取VersionModel版本列表
     *
     * 根据主对象ID，获取全量版本以及对应版本对象list属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetAllVersionsUsingPostRequest 请求对象
     * @return SyncInvoker<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse>
     */
    public SyncInvoker<ShowGetAllVersionsUsingPostRequest, ShowGetAllVersionsUsingPostResponse> showGetAllVersionsUsingPostInvoker(
        ShowGetAllVersionsUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetAllVersionsUsingPost, hcClient);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyUsingPostRequest 请求对象
     * @return ShowGetByUniqueKeyUsingPostResponse
     */
    public ShowGetByUniqueKeyUsingPostResponse showGetByUniqueKeyUsingPost(ShowGetByUniqueKeyUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetByUniqueKeyUsingPost);
    }

    /**
     * 根据唯一键为“是”的属性查询实例
     *
     * 当数据模型中存在“唯一键”为“是”的属性时，可根据该属性查询实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetByUniqueKeyUsingPostRequest 请求对象
     * @return SyncInvoker<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse>
     */
    public SyncInvoker<ShowGetByUniqueKeyUsingPostRequest, ShowGetByUniqueKeyUsingPostResponse> showGetByUniqueKeyUsingPostInvoker(
        ShowGetByUniqueKeyUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetByUniqueKeyUsingPost, hcClient);
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
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetVersionByMasterUsingPostRequest 请求对象
     * @return ShowGetVersionByMasterUsingPostResponse
     */
    public ShowGetVersionByMasterUsingPostResponse showGetVersionByMasterUsingPost(
        ShowGetVersionByMasterUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showGetVersionByMasterUsingPost);
    }

    /**
     * XDM_获取VersionModel对应版本信息
     *
     * 根据Masterid和版本号和小版本号，返回对应版本属性，小版本号为空则返回最新小版本属性。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGetVersionByMasterUsingPostRequest 请求对象
     * @return SyncInvoker<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse>
     */
    public SyncInvoker<ShowGetVersionByMasterUsingPostRequest, ShowGetVersionByMasterUsingPostResponse> showGetVersionByMasterUsingPostInvoker(
        ShowGetVersionByMasterUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showGetVersionByMasterUsingPost, hcClient);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListUsingPostRequest 请求对象
     * @return ShowListUsingPostResponse
     */
    public ShowListUsingPostResponse showListUsingPost(ShowListUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showListUsingPost);
    }

    /**
     * 查询实例的基础属性
     *
     * 根据查询条件分页返回模型基本属性信息且不级联查询（不支持扩展属性作为查询条件）。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowListUsingPostRequest 请求对象
     * @return SyncInvoker<ShowListUsingPostRequest, ShowListUsingPostResponse>
     */
    public SyncInvoker<ShowListUsingPostRequest, ShowListUsingPostResponse> showListUsingPostInvoker(
        ShowListUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showListUsingPost, hcClient);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteBranchUsingPostRequest 请求对象
     * @return ShowLogicalDeleteBranchUsingPostResponse
     */
    public ShowLogicalDeleteBranchUsingPostResponse showLogicalDeleteBranchUsingPost(
        ShowLogicalDeleteBranchUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteBranchUsingPost);
    }

    /**
     * XDM_软删除VersionModel最新分支版本下所有小版本
     *
     * 软删除最新分支版本下的所有小版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteBranchUsingPostRequest 请求对象
     * @return SyncInvoker<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse>
     */
    public SyncInvoker<ShowLogicalDeleteBranchUsingPostRequest, ShowLogicalDeleteBranchUsingPostResponse> showLogicalDeleteBranchUsingPostInvoker(
        ShowLogicalDeleteBranchUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteBranchUsingPost, hcClient);
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
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteLatestVersionUsingPostRequest 请求对象
     * @return ShowLogicalDeleteLatestVersionUsingPostResponse
     */
    public ShowLogicalDeleteLatestVersionUsingPostResponse showLogicalDeleteLatestVersionUsingPost(
        ShowLogicalDeleteLatestVersionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showLogicalDeleteLatestVersionUsingPost);
    }

    /**
     * XDM_软删除VersionModel最新分支的最新版本
     *
     * 根据主对象ID入参，软删最新分支的最新版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogicalDeleteLatestVersionUsingPostRequest 请求对象
     * @return SyncInvoker<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse>
     */
    public SyncInvoker<ShowLogicalDeleteLatestVersionUsingPostRequest, ShowLogicalDeleteLatestVersionUsingPostResponse> showLogicalDeleteLatestVersionUsingPostInvoker(
        ShowLogicalDeleteLatestVersionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showLogicalDeleteLatestVersionUsingPost, hcClient);
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
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryUsingPostRequest 请求对象
     * @return ShowQueryUsingPostResponse
     */
    public ShowQueryUsingPostResponse showQueryUsingPost(ShowQueryUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showQueryUsingPost);
    }

    /**
     * 根据“列表属性”为“是”的属性查询实例
     *
     * 当数据模型中存在“列表属性”为“是”的属性时，可通过此接口查询数据模型中的实例数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQueryUsingPostRequest 请求对象
     * @return SyncInvoker<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse>
     */
    public SyncInvoker<ShowQueryUsingPostRequest, ShowQueryUsingPostResponse> showQueryUsingPostInvoker(
        ShowQueryUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showQueryUsingPost, hcClient);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseAndUpdateUsingPostRequest 请求对象
     * @return ShowReviseAndUpdateUsingPostResponse
     */
    public ShowReviseAndUpdateUsingPostResponse showReviseAndUpdateUsingPost(
        ShowReviseAndUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showReviseAndUpdateUsingPost);
    }

    /**
     * XDM_修订且更新VersionModel。
     *
     * 根据主对象ID修订对象并根据传入字段更新主对象+版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseAndUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowReviseAndUpdateUsingPostRequest, ShowReviseAndUpdateUsingPostResponse> showReviseAndUpdateUsingPostInvoker(
        ShowReviseAndUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showReviseAndUpdateUsingPost, hcClient);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseUsingPostRequest 请求对象
     * @return ShowReviseUsingPostResponse
     */
    public ShowReviseUsingPostResponse showReviseUsingPost(ShowReviseUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showReviseUsingPost);
    }

    /**
     * XDM_修订VersionModel
     *
     * 根据主对象ID修订对象，按照设置的规则生成新的业务版本。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviseUsingPostRequest 请求对象
     * @return SyncInvoker<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse>
     */
    public SyncInvoker<ShowReviseUsingPostRequest, ShowReviseUsingPostResponse> showReviseUsingPostInvoker(
        ShowReviseUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showReviseUsingPost, hcClient);
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
     * @return ShowSaveAllUsingPostResponse
     */
    public ShowSaveAllUsingPostResponse showSaveAllUsingPost(ShowSaveAllUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showSaveAllUsingPost);
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
     * @return SyncInvoker<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse>
     */
    public SyncInvoker<ShowSaveAllUsingPostRequest, ShowSaveAllUsingPostResponse> showSaveAllUsingPostInvoker(
        ShowSaveAllUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showSaveAllUsingPost, hcClient);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAsUsingPostRequest 请求对象
     * @return ShowSaveAsUsingPostResponse
     */
    public ShowSaveAsUsingPostResponse showSaveAsUsingPost(ShowSaveAsUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showSaveAsUsingPost);
    }

    /**
     * 另存版本对象的实例数据
     *
     * 版本对象的另存为接口（saveAs）用于创建一条与原版本对象实例数据相同的数据实例。该实例数据会完全复制原实例现有的数据，包括与其关联的主对象和分支对象，且新实例数据的版本号从初始值开始计算。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSaveAsUsingPostRequest 请求对象
     * @return SyncInvoker<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse>
     */
    public SyncInvoker<ShowSaveAsUsingPostRequest, ShowSaveAsUsingPostResponse> showSaveAsUsingPostInvoker(
        ShowSaveAsUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showSaveAsUsingPost, hcClient);
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
     * @return ShowSaveUsingPostResponse
     */
    public ShowSaveUsingPostResponse showSaveUsingPost(ShowSaveUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showSaveUsingPost);
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
     * @return SyncInvoker<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse>
     */
    public SyncInvoker<ShowSaveUsingPostRequest, ShowSaveUsingPostResponse> showSaveUsingPostInvoker(
        ShowSaveUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showSaveUsingPost, hcClient);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSelectUsingPostRequest 请求对象
     * @return ShowSelectUsingPostResponse
     */
    public ShowSelectUsingPostResponse showSelectUsingPost(ShowSelectUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showSelectUsingPost);
    }

    /**
     * 查询实例的指定属性
     *
     * 根据查询条件及指定属性分页返回（不支持扩展属性作为选定属性列)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSelectUsingPostRequest 请求对象
     * @return SyncInvoker<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse>
     */
    public SyncInvoker<ShowSelectUsingPostRequest, ShowSelectUsingPostResponse> showSelectUsingPostInvoker(
        ShowSelectUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showSelectUsingPost, hcClient);
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
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return ShowUndoCheckoutByAdminUsingPostResponse
     */
    public ShowUndoCheckoutByAdminUsingPostResponse showUndoCheckoutByAdminUsingPost(
        ShowUndoCheckoutByAdminUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUndoCheckoutByAdminUsingPost);
    }

    /**
     * XDM_管理员撤销检出VersionModel
     *
     * 管理员根据主对象ID撤销检出版本对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutByAdminUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse>
     */
    public SyncInvoker<ShowUndoCheckoutByAdminUsingPostRequest, ShowUndoCheckoutByAdminUsingPostResponse> showUndoCheckoutByAdminUsingPostInvoker(
        ShowUndoCheckoutByAdminUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUndoCheckoutByAdminUsingPost, hcClient);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutUsingPostRequest 请求对象
     * @return ShowUndoCheckoutUsingPostResponse
     */
    public ShowUndoCheckoutUsingPostResponse showUndoCheckoutUsingPost(ShowUndoCheckoutUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUndoCheckoutUsingPost);
    }

    /**
     * XDM_撤销检出VersionModel
     *
     * 根据主对象ID撤销检出版本对象，删除新的版本记录且状态为已检入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUndoCheckoutUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse>
     */
    public SyncInvoker<ShowUndoCheckoutUsingPostRequest, ShowUndoCheckoutUsingPostResponse> showUndoCheckoutUsingPostInvoker(
        ShowUndoCheckoutUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUndoCheckoutUsingPost, hcClient);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateAndCheckinUsingPostRequest 请求对象
     * @return ShowUpdateAndCheckinUsingPostResponse
     */
    public ShowUpdateAndCheckinUsingPostResponse showUpdateAndCheckinUsingPost(
        ShowUpdateAndCheckinUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateAndCheckinUsingPost);
    }

    /**
     * XDM_更新并检入VersionModel
     *
     * 根据传入字段更新版本对象并根据主对象ID检入对象。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateAndCheckinUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse>
     */
    public SyncInvoker<ShowUpdateAndCheckinUsingPostRequest, ShowUpdateAndCheckinUsingPostResponse> showUpdateAndCheckinUsingPostInvoker(
        ShowUpdateAndCheckinUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateAndCheckinUsingPost, hcClient);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByAdminUsingPostRequest 请求对象
     * @return ShowUpdateByAdminUsingPostResponse
     */
    public ShowUpdateByAdminUsingPostResponse showUpdateByAdminUsingPost(ShowUpdateByAdminUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateByAdminUsingPost);
    }

    /**
     * XDM_管理员更新对象VersionModel指定属性
     *
     * 以管理员身份更新指定版本实例上的基础信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByAdminUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse>
     */
    public SyncInvoker<ShowUpdateByAdminUsingPostRequest, ShowUpdateByAdminUsingPostResponse> showUpdateByAdminUsingPostInvoker(
        ShowUpdateByAdminUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateByAdminUsingPost, hcClient);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByConditionUsingPostRequest 请求对象
     * @return ShowUpdateByConditionUsingPostResponse
     */
    public ShowUpdateByConditionUsingPostResponse showUpdateByConditionUsingPost(
        ShowUpdateByConditionUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateByConditionUsingPost);
    }

    /**
     * 根据指定条件更新实例
     *
     * 根据指定条件更新指定模型的实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateByConditionUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse>
     */
    public SyncInvoker<ShowUpdateByConditionUsingPostRequest, ShowUpdateByConditionUsingPostResponse> showUpdateByConditionUsingPostInvoker(
        ShowUpdateByConditionUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateByConditionUsingPost, hcClient);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateUsingPostRequest 请求对象
     * @return ShowUpdateUsingPostResponse
     */
    public ShowUpdateUsingPostResponse showUpdateUsingPost(ShowUpdateUsingPostRequest request) {
        return hcClient.syncInvokeHttp(request, IDMEClassicAPIMeta.showUpdateUsingPost);
    }

    /**
     * 更新实例
     *
     * 更新指定数据模型中的一个实例数据。如果实例的唯一编码不存在，则不做任何更新操作。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUpdateUsingPostRequest 请求对象
     * @return SyncInvoker<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse>
     */
    public SyncInvoker<ShowUpdateUsingPostRequest, ShowUpdateUsingPostResponse> showUpdateUsingPostInvoker(
        ShowUpdateUsingPostRequest request) {
        return new SyncInvoker<>(request, IDMEClassicAPIMeta.showUpdateUsingPost, hcClient);
    }

}
