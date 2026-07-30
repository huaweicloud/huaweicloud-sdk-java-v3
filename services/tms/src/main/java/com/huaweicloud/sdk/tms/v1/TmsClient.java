package com.huaweicloud.sdk.tms.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.tms.v1.model.ChangeAssociatedResourceOpenStatusRequest;
import com.huaweicloud.sdk.tms.v1.model.ChangeAssociatedResourceOpenStatusResponse;
import com.huaweicloud.sdk.tms.v1.model.CreateAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.CreateAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.CreatePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.DeleteAssociatedResourceRuleRequest;
import com.huaweicloud.sdk.tms.v1.model.DeleteAssociatedResourceRuleResponse;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.DeletePredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceSettingsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListAssociatedResourceSettingsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListPredefineTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersRequest;
import com.huaweicloud.sdk.tms.v1.model.ListProvidersResponse;
import com.huaweicloud.sdk.tms.v1.model.ListResourceRequest;
import com.huaweicloud.sdk.tms.v1.model.ListResourceResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagKeysResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagValuesResponse;
import com.huaweicloud.sdk.tms.v1.model.ListTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.ListTagsResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowApiVersionResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowAssociatedResourceOpenStatusRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowAssociatedResourceOpenStatusResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaRequest;
import com.huaweicloud.sdk.tms.v1.model.ShowTagQuotaResponse;
import com.huaweicloud.sdk.tms.v1.model.UpdateAssociatedResourceRulesRequest;
import com.huaweicloud.sdk.tms.v1.model.UpdateAssociatedResourceRulesResponse;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsRequest;
import com.huaweicloud.sdk.tms.v1.model.UpdatePredefineTagsResponse;

public class TmsClient {

    protected HcClient hcClient;

    public TmsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<TmsClient> newBuilder() {
        ClientBuilder<TmsClient> clientBuilder = new ClientBuilder<>(TmsClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 开通或关闭关联资源标签继承能力
     *
     * 开通或关闭关联资源标签继承能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAssociatedResourceOpenStatusRequest 请求对象
     * @return ChangeAssociatedResourceOpenStatusResponse
     */
    public ChangeAssociatedResourceOpenStatusResponse changeAssociatedResourceOpenStatus(
        ChangeAssociatedResourceOpenStatusRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.changeAssociatedResourceOpenStatus);
    }

    /**
     * 开通或关闭关联资源标签继承能力
     *
     * 开通或关闭关联资源标签继承能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ChangeAssociatedResourceOpenStatusRequest 请求对象
     * @return SyncInvoker<ChangeAssociatedResourceOpenStatusRequest, ChangeAssociatedResourceOpenStatusResponse>
     */
    public SyncInvoker<ChangeAssociatedResourceOpenStatusRequest, ChangeAssociatedResourceOpenStatusResponse> changeAssociatedResourceOpenStatusInvoker(
        ChangeAssociatedResourceOpenStatusRequest request) {
        return new SyncInvoker<>(request, TmsMeta.changeAssociatedResourceOpenStatus, hcClient);
    }

    /**
     * 批量启用规则
     *
     * 按照规则和region来批量启用规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssociatedResourceRulesRequest 请求对象
     * @return CreateAssociatedResourceRulesResponse
     */
    public CreateAssociatedResourceRulesResponse createAssociatedResourceRules(
        CreateAssociatedResourceRulesRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createAssociatedResourceRules);
    }

    /**
     * 批量启用规则
     *
     * 按照规则和region来批量启用规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAssociatedResourceRulesRequest 请求对象
     * @return SyncInvoker<CreateAssociatedResourceRulesRequest, CreateAssociatedResourceRulesResponse>
     */
    public SyncInvoker<CreateAssociatedResourceRulesRequest, CreateAssociatedResourceRulesResponse> createAssociatedResourceRulesInvoker(
        CreateAssociatedResourceRulesRequest request) {
        return new SyncInvoker<>(request, TmsMeta.createAssociatedResourceRules, hcClient);
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePredefineTagsRequest 请求对象
     * @return CreatePredefineTagsResponse
     */
    public CreatePredefineTagsResponse createPredefineTags(CreatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createPredefineTags);
    }

    /**
     * 创建预定义标签
     *
     * 用于创建预定标签。用户创建预定义标签后，可以使用预定义标签来给资源创建标签。该接口支持幂等特性和处理批量数据。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePredefineTagsRequest 请求对象
     * @return SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse>
     */
    public SyncInvoker<CreatePredefineTagsRequest, CreatePredefineTagsResponse> createPredefineTagsInvoker(
        CreatePredefineTagsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.createPredefineTags, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return CreateResourceTagResponse
     */
    public CreateResourceTagResponse createResourceTag(CreateResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.createResourceTag);
    }

    /**
     * 批量添加标签
     *
     * 用于给云服务的多个资源添加标签，每个资源最多可添加10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceTagRequest 请求对象
     * @return SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public SyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagInvoker(
        CreateResourceTagRequest request) {
        return new SyncInvoker<>(request, TmsMeta.createResourceTag, hcClient);
    }

    /**
     * 关闭规则
     *
     * 通过指定setting_name和region_id来关闭指定的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssociatedResourceRuleRequest 请求对象
     * @return DeleteAssociatedResourceRuleResponse
     */
    public DeleteAssociatedResourceRuleResponse deleteAssociatedResourceRule(
        DeleteAssociatedResourceRuleRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deleteAssociatedResourceRule);
    }

    /**
     * 关闭规则
     *
     * 通过指定setting_name和region_id来关闭指定的规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAssociatedResourceRuleRequest 请求对象
     * @return SyncInvoker<DeleteAssociatedResourceRuleRequest, DeleteAssociatedResourceRuleResponse>
     */
    public SyncInvoker<DeleteAssociatedResourceRuleRequest, DeleteAssociatedResourceRuleResponse> deleteAssociatedResourceRuleInvoker(
        DeleteAssociatedResourceRuleRequest request) {
        return new SyncInvoker<>(request, TmsMeta.deleteAssociatedResourceRule, hcClient);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePredefineTagsRequest 请求对象
     * @return DeletePredefineTagsResponse
     */
    public DeletePredefineTagsResponse deletePredefineTags(DeletePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deletePredefineTags);
    }

    /**
     * 删除预定义标签
     *
     * 用于删除预定标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePredefineTagsRequest 请求对象
     * @return SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse>
     */
    public SyncInvoker<DeletePredefineTagsRequest, DeletePredefineTagsResponse> deletePredefineTagsInvoker(
        DeletePredefineTagsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.deletePredefineTags, hcClient);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return DeleteResourceTagResponse
     */
    public DeleteResourceTagResponse deleteResourceTag(DeleteResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.deleteResourceTag);
    }

    /**
     * 批量移除标签
     *
     * 用于批量移除云服务多个资源的标签，每个资源最多支持移除10个标签，每次最多支持批量操作20个资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceTagRequest 请求对象
     * @return SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public SyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagInvoker(
        DeleteResourceTagRequest request) {
        return new SyncInvoker<>(request, TmsMeta.deleteResourceTag, hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listApiVersions);
    }

    /**
     * 查询API版本列表
     *
     * 查询标签管理服务的API版本列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询当前规则列表
     *
     * 查询当前规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedResourceRulesRequest 请求对象
     * @return ListAssociatedResourceRulesResponse
     */
    public ListAssociatedResourceRulesResponse listAssociatedResourceRules(ListAssociatedResourceRulesRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listAssociatedResourceRules);
    }

    /**
     * 查询当前规则列表
     *
     * 查询当前规则列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedResourceRulesRequest 请求对象
     * @return SyncInvoker<ListAssociatedResourceRulesRequest, ListAssociatedResourceRulesResponse>
     */
    public SyncInvoker<ListAssociatedResourceRulesRequest, ListAssociatedResourceRulesResponse> listAssociatedResourceRulesInvoker(
        ListAssociatedResourceRulesRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listAssociatedResourceRules, hcClient);
    }

    /**
     * 查询当前规则的配置列表
     *
     * 查询当前规则的配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedResourceSettingsRequest 请求对象
     * @return ListAssociatedResourceSettingsResponse
     */
    public ListAssociatedResourceSettingsResponse listAssociatedResourceSettings(
        ListAssociatedResourceSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listAssociatedResourceSettings);
    }

    /**
     * 查询当前规则的配置列表
     *
     * 查询当前规则的配置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAssociatedResourceSettingsRequest 请求对象
     * @return SyncInvoker<ListAssociatedResourceSettingsRequest, ListAssociatedResourceSettingsResponse>
     */
    public SyncInvoker<ListAssociatedResourceSettingsRequest, ListAssociatedResourceSettingsResponse> listAssociatedResourceSettingsInvoker(
        ListAssociatedResourceSettingsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listAssociatedResourceSettings, hcClient);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefineTagsRequest 请求对象
     * @return ListPredefineTagsResponse
     */
    public ListPredefineTagsResponse listPredefineTags(ListPredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listPredefineTags);
    }

    /**
     * 查询预定义标签列表
     *
     * 用于查询预定义标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPredefineTagsRequest 请求对象
     * @return SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse>
     */
    public SyncInvoker<ListPredefineTagsRequest, ListPredefineTagsResponse> listPredefineTagsInvoker(
        ListPredefineTagsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listPredefineTags, hcClient);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return ListProvidersResponse
     */
    public ListProvidersResponse listProviders(ListProvidersRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listProviders);
    }

    /**
     * 查询标签管理支持的服务
     *
     * 查询标签管理支持的服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProvidersRequest 请求对象
     * @return SyncInvoker<ListProvidersRequest, ListProvidersResponse>
     */
    public SyncInvoker<ListProvidersRequest, ListProvidersResponse> listProvidersInvoker(ListProvidersRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listProviders, hcClient);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return ListResourceResponse
     */
    public ListResourceResponse listResource(ListResourceRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listResource);
    }

    /**
     * 根据标签过滤资源
     *
     * 根据标签过滤资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceRequest 请求对象
     * @return SyncInvoker<ListResourceRequest, ListResourceResponse>
     */
    public SyncInvoker<ListResourceRequest, ListResourceResponse> listResourceInvoker(ListResourceRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listResource, hcClient);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagKeysRequest 请求对象
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listTagKeys);
    }

    /**
     * 查询标签键列表
     *
     * 查询指定区域的所有标签键.
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagKeysRequest 请求对象
     * @return SyncInvoker<ListTagKeysRequest, ListTagKeysResponse>
     */
    public SyncInvoker<ListTagKeysRequest, ListTagKeysResponse> listTagKeysInvoker(ListTagKeysRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listTagKeys, hcClient);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagValuesRequest 请求对象
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listTagValues);
    }

    /**
     * 查询标签值列表
     *
     * 查询指定区域的标签键下的所有标签值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagValuesRequest 请求对象
     * @return SyncInvoker<ListTagValuesRequest, ListTagValuesResponse>
     */
    public SyncInvoker<ListTagValuesRequest, ListTagValuesResponse> listTagValuesInvoker(ListTagValuesRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listTagValues, hcClient);
    }

    /**
     * 查询标签列表
     *
     * 查询指定区域和实例类型中租户的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.listTags);
    }

    /**
     * 查询标签列表
     *
     * 查询指定区域和实例类型中租户的所有标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.listTags, hcClient);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse
     */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showApiVersion);
    }

    /**
     * 查询API版本号详情
     *
     * 查询指定的标签管理服务API版本号详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<>(request, TmsMeta.showApiVersion, hcClient);
    }

    /**
     * 查询当前用户的关联资源标签继承能力的开通状态
     *
     * 查询当前用户的关联资源标签继承能力的开通状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedResourceOpenStatusRequest 请求对象
     * @return ShowAssociatedResourceOpenStatusResponse
     */
    public ShowAssociatedResourceOpenStatusResponse showAssociatedResourceOpenStatus(
        ShowAssociatedResourceOpenStatusRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showAssociatedResourceOpenStatus);
    }

    /**
     * 查询当前用户的关联资源标签继承能力的开通状态
     *
     * 查询当前用户的关联资源标签继承能力的开通状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAssociatedResourceOpenStatusRequest 请求对象
     * @return SyncInvoker<ShowAssociatedResourceOpenStatusRequest, ShowAssociatedResourceOpenStatusResponse>
     */
    public SyncInvoker<ShowAssociatedResourceOpenStatusRequest, ShowAssociatedResourceOpenStatusResponse> showAssociatedResourceOpenStatusInvoker(
        ShowAssociatedResourceOpenStatusRequest request) {
        return new SyncInvoker<>(request, TmsMeta.showAssociatedResourceOpenStatus, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return ShowResourceTagResponse
     */
    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询单个资源上的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<>(request, TmsMeta.showResourceTag, hcClient);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagQuotaRequest 请求对象
     * @return ShowTagQuotaResponse
     */
    public ShowTagQuotaResponse showTagQuota(ShowTagQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.showTagQuota);
    }

    /**
     * 查询标签配额
     *
     * 查询标签的配额信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagQuotaRequest 请求对象
     * @return SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse>
     */
    public SyncInvoker<ShowTagQuotaRequest, ShowTagQuotaResponse> showTagQuotaInvoker(ShowTagQuotaRequest request) {
        return new SyncInvoker<>(request, TmsMeta.showTagQuota, hcClient);
    }

    /**
     * 更新规则
     *
     * 更新规则。规则更新的信息会覆盖原有内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssociatedResourceRulesRequest 请求对象
     * @return UpdateAssociatedResourceRulesResponse
     */
    public UpdateAssociatedResourceRulesResponse updateAssociatedResourceRules(
        UpdateAssociatedResourceRulesRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.updateAssociatedResourceRules);
    }

    /**
     * 更新规则
     *
     * 更新规则。规则更新的信息会覆盖原有内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAssociatedResourceRulesRequest 请求对象
     * @return SyncInvoker<UpdateAssociatedResourceRulesRequest, UpdateAssociatedResourceRulesResponse>
     */
    public SyncInvoker<UpdateAssociatedResourceRulesRequest, UpdateAssociatedResourceRulesResponse> updateAssociatedResourceRulesInvoker(
        UpdateAssociatedResourceRulesRequest request) {
        return new SyncInvoker<>(request, TmsMeta.updateAssociatedResourceRules, hcClient);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePredefineTagsRequest 请求对象
     * @return UpdatePredefineTagsResponse
     */
    public UpdatePredefineTagsResponse updatePredefineTags(UpdatePredefineTagsRequest request) {
        return hcClient.syncInvokeHttp(request, TmsMeta.updatePredefineTags);
    }

    /**
     * 修改预定义标签
     *
     * 修改预定义标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePredefineTagsRequest 请求对象
     * @return SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse>
     */
    public SyncInvoker<UpdatePredefineTagsRequest, UpdatePredefineTagsResponse> updatePredefineTagsInvoker(
        UpdatePredefineTagsRequest request) {
        return new SyncInvoker<>(request, TmsMeta.updatePredefineTags, hcClient);
    }

}
