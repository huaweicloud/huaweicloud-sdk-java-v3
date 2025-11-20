package com.huaweicloud.sdk.iamaccessanalyzer.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CheckNoNewAccessRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CheckNoNewAccessResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAccessPreviewsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAnalyzersRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListAnalyzersResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListArchiveRulesRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListArchiveRulesResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListNotificationSettingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListNotificationSettingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListResourceConfigurationsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ListResourceConfigurationsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateNotificationSettingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateNotificationSettingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyResponse;

import java.util.concurrent.CompletableFuture;

public class IAMAccessAnalyzerAsyncClient {

    protected HcClient hcClient;

    public IAMAccessAnalyzerAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IAMAccessAnalyzerAsyncClient> newBuilder() {
        ClientBuilder<IAMAccessAnalyzerAsyncClient> clientBuilder =
            new ClientBuilder<>(IAMAccessAnalyzerAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建分析器
     *
     * 为您的账号或者组织创建分析器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalyzerRequest 请求对象
     * @return CompletableFuture<CreateAnalyzerResponse>
     */
    public CompletableFuture<CreateAnalyzerResponse> createAnalyzerAsync(CreateAnalyzerRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.createAnalyzer);
    }

    /**
     * 创建分析器
     *
     * 为您的账号或者组织创建分析器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalyzerRequest 请求对象
     * @return AsyncInvoker<CreateAnalyzerRequest, CreateAnalyzerResponse>
     */
    public AsyncInvoker<CreateAnalyzerRequest, CreateAnalyzerResponse> createAnalyzerAsyncInvoker(
        CreateAnalyzerRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.createAnalyzer, hcClient);
    }

    /**
     * 删除指定的分析器
     *
     * 删除指定的分析器。分析器生成的所有检查结果都将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalyzerRequest 请求对象
     * @return CompletableFuture<DeleteAnalyzerResponse>
     */
    public CompletableFuture<DeleteAnalyzerResponse> deleteAnalyzerAsync(DeleteAnalyzerRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteAnalyzer);
    }

    /**
     * 删除指定的分析器
     *
     * 删除指定的分析器。分析器生成的所有检查结果都将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalyzerRequest 请求对象
     * @return AsyncInvoker<DeleteAnalyzerRequest, DeleteAnalyzerResponse>
     */
    public AsyncInvoker<DeleteAnalyzerRequest, DeleteAnalyzerResponse> deleteAnalyzerAsyncInvoker(
        DeleteAnalyzerRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteAnalyzer, hcClient);
    }

    /**
     * 检索分析器的列表
     *
     * 检索分析器的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalyzersRequest 请求对象
     * @return CompletableFuture<ListAnalyzersResponse>
     */
    public CompletableFuture<ListAnalyzersResponse> listAnalyzersAsync(ListAnalyzersRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listAnalyzers);
    }

    /**
     * 检索分析器的列表
     *
     * 检索分析器的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalyzersRequest 请求对象
     * @return AsyncInvoker<ListAnalyzersRequest, ListAnalyzersResponse>
     */
    public AsyncInvoker<ListAnalyzersRequest, ListAnalyzersResponse> listAnalyzersAsyncInvoker(
        ListAnalyzersRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listAnalyzers, hcClient);
    }

    /**
     * 显示指定的分析器
     *
     * 检索有关指定分析器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalyzerRequest 请求对象
     * @return CompletableFuture<ShowAnalyzerResponse>
     */
    public CompletableFuture<ShowAnalyzerResponse> showAnalyzerAsync(ShowAnalyzerRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.showAnalyzer);
    }

    /**
     * 显示指定的分析器
     *
     * 检索有关指定分析器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalyzerRequest 请求对象
     * @return AsyncInvoker<ShowAnalyzerRequest, ShowAnalyzerResponse>
     */
    public AsyncInvoker<ShowAnalyzerRequest, ShowAnalyzerResponse> showAnalyzerAsyncInvoker(
        ShowAnalyzerRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.showAnalyzer, hcClient);
    }

    /**
     * 立即开始扫描应用于指定资源的策略
     *
     * 立即开始扫描应用于指定资源的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResourceScanRequest 请求对象
     * @return CompletableFuture<StartResourceScanResponse>
     */
    public CompletableFuture<StartResourceScanResponse> startResourceScanAsync(StartResourceScanRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.startResourceScan);
    }

    /**
     * 立即开始扫描应用于指定资源的策略
     *
     * 立即开始扫描应用于指定资源的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResourceScanRequest 请求对象
     * @return AsyncInvoker<StartResourceScanRequest, StartResourceScanResponse>
     */
    public AsyncInvoker<StartResourceScanRequest, StartResourceScanResponse> startResourceScanAsyncInvoker(
        StartResourceScanRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.startResourceScan, hcClient);
    }

    /**
     * 更新指定分析器的配置
     *
     * 更新指定分析器的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalyzerRequest 请求对象
     * @return CompletableFuture<UpdateAnalyzerResponse>
     */
    public CompletableFuture<UpdateAnalyzerResponse> updateAnalyzerAsync(UpdateAnalyzerRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.updateAnalyzer);
    }

    /**
     * 更新指定分析器的配置
     *
     * 更新指定分析器的配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateAnalyzerRequest 请求对象
     * @return AsyncInvoker<UpdateAnalyzerRequest, UpdateAnalyzerResponse>
     */
    public AsyncInvoker<UpdateAnalyzerRequest, UpdateAnalyzerResponse> updateAnalyzerAsyncInvoker(
        UpdateAnalyzerRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.updateAnalyzer, hcClient);
    }

    /**
     * 应用存档规则
     *
     * 以追溯方式将存档规则应用于符合存档规则条件的现有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyArchiveRuleRequest 请求对象
     * @return CompletableFuture<ApplyArchiveRuleResponse>
     */
    public CompletableFuture<ApplyArchiveRuleResponse> applyArchiveRuleAsync(ApplyArchiveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.applyArchiveRule);
    }

    /**
     * 应用存档规则
     *
     * 以追溯方式将存档规则应用于符合存档规则条件的现有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyArchiveRuleRequest 请求对象
     * @return AsyncInvoker<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse>
     */
    public AsyncInvoker<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse> applyArchiveRuleAsyncInvoker(
        ApplyArchiveRuleRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.applyArchiveRule, hcClient);
    }

    /**
     * 为指定的分析器创建存档规则
     *
     * 为指定的分析器创建存档规则。存档规则会自动存档符合您在创建规则时所定义条件的新结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArchiveRuleRequest 请求对象
     * @return CompletableFuture<CreateArchiveRuleResponse>
     */
    public CompletableFuture<CreateArchiveRuleResponse> createArchiveRuleAsync(CreateArchiveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.createArchiveRule);
    }

    /**
     * 为指定的分析器创建存档规则
     *
     * 为指定的分析器创建存档规则。存档规则会自动存档符合您在创建规则时所定义条件的新结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArchiveRuleRequest 请求对象
     * @return AsyncInvoker<CreateArchiveRuleRequest, CreateArchiveRuleResponse>
     */
    public AsyncInvoker<CreateArchiveRuleRequest, CreateArchiveRuleResponse> createArchiveRuleAsyncInvoker(
        CreateArchiveRuleRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.createArchiveRule, hcClient);
    }

    /**
     * 删除指定的存档规则
     *
     * 删除指定的存档规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArchiveRuleRequest 请求对象
     * @return CompletableFuture<DeleteArchiveRuleResponse>
     */
    public CompletableFuture<DeleteArchiveRuleResponse> deleteArchiveRuleAsync(DeleteArchiveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteArchiveRule);
    }

    /**
     * 删除指定的存档规则
     *
     * 删除指定的存档规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArchiveRuleRequest 请求对象
     * @return AsyncInvoker<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse>
     */
    public AsyncInvoker<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse> deleteArchiveRuleAsyncInvoker(
        DeleteArchiveRuleRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteArchiveRule, hcClient);
    }

    /**
     * 检索为指定分析器创建的存档规则的列表
     *
     * 检索为指定分析器创建的存档规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveRulesRequest 请求对象
     * @return CompletableFuture<ListArchiveRulesResponse>
     */
    public CompletableFuture<ListArchiveRulesResponse> listArchiveRulesAsync(ListArchiveRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listArchiveRules);
    }

    /**
     * 检索为指定分析器创建的存档规则的列表
     *
     * 检索为指定分析器创建的存档规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveRulesRequest 请求对象
     * @return AsyncInvoker<ListArchiveRulesRequest, ListArchiveRulesResponse>
     */
    public AsyncInvoker<ListArchiveRulesRequest, ListArchiveRulesResponse> listArchiveRulesAsyncInvoker(
        ListArchiveRulesRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listArchiveRules, hcClient);
    }

    /**
     * 检索有关存档规则的信息
     *
     * 检索有关存档规则的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowArchiveRuleRequest 请求对象
     * @return CompletableFuture<ShowArchiveRuleResponse>
     */
    public CompletableFuture<ShowArchiveRuleResponse> showArchiveRuleAsync(ShowArchiveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.showArchiveRule);
    }

    /**
     * 检索有关存档规则的信息
     *
     * 检索有关存档规则的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowArchiveRuleRequest 请求对象
     * @return AsyncInvoker<ShowArchiveRuleRequest, ShowArchiveRuleResponse>
     */
    public AsyncInvoker<ShowArchiveRuleRequest, ShowArchiveRuleResponse> showArchiveRuleAsyncInvoker(
        ShowArchiveRuleRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.showArchiveRule, hcClient);
    }

    /**
     * 更新指定存档规则的条件和值
     *
     * 更新指定存档规则的条件和值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveRuleRequest 请求对象
     * @return CompletableFuture<UpdateArchiveRuleResponse>
     */
    public CompletableFuture<UpdateArchiveRuleResponse> updateArchiveRuleAsync(UpdateArchiveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.updateArchiveRule);
    }

    /**
     * 更新指定存档规则的条件和值
     *
     * 更新指定存档规则的条件和值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveRuleRequest 请求对象
     * @return AsyncInvoker<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse>
     */
    public AsyncInvoker<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse> updateArchiveRuleAsyncInvoker(
        UpdateArchiveRuleRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.updateArchiveRule, hcClient);
    }

    /**
     * 创建资源分析配置
     *
     * 创建指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigurationsRequest 请求对象
     * @return CompletableFuture<CreateResourceConfigurationsResponse>
     */
    public CompletableFuture<CreateResourceConfigurationsResponse> createResourceConfigurationsAsync(
        CreateResourceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.createResourceConfigurations);
    }

    /**
     * 创建资源分析配置
     *
     * 创建指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResourceConfigurationsRequest 请求对象
     * @return AsyncInvoker<CreateResourceConfigurationsRequest, CreateResourceConfigurationsResponse>
     */
    public AsyncInvoker<CreateResourceConfigurationsRequest, CreateResourceConfigurationsResponse> createResourceConfigurationsAsyncInvoker(
        CreateResourceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.createResourceConfigurations, hcClient);
    }

    /**
     * 删除资源分析配置
     *
     * 删除指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceConfigurationsRequest 请求对象
     * @return CompletableFuture<DeleteResourceConfigurationsResponse>
     */
    public CompletableFuture<DeleteResourceConfigurationsResponse> deleteResourceConfigurationsAsync(
        DeleteResourceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteResourceConfigurations);
    }

    /**
     * 删除资源分析配置
     *
     * 删除指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResourceConfigurationsRequest 请求对象
     * @return AsyncInvoker<DeleteResourceConfigurationsRequest, DeleteResourceConfigurationsResponse>
     */
    public AsyncInvoker<DeleteResourceConfigurationsRequest, DeleteResourceConfigurationsResponse> deleteResourceConfigurationsAsyncInvoker(
        DeleteResourceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteResourceConfigurations, hcClient);
    }

    /**
     * 列举资源分析配置
     *
     * 列举指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceConfigurationsRequest 请求对象
     * @return CompletableFuture<ListResourceConfigurationsResponse>
     */
    public CompletableFuture<ListResourceConfigurationsResponse> listResourceConfigurationsAsync(
        ListResourceConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listResourceConfigurations);
    }

    /**
     * 列举资源分析配置
     *
     * 列举指定分析器的资源分析配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListResourceConfigurationsRequest, ListResourceConfigurationsResponse>
     */
    public AsyncInvoker<ListResourceConfigurationsRequest, ListResourceConfigurationsResponse> listResourceConfigurationsAsyncInvoker(
        ListResourceConfigurationsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listResourceConfigurations, hcClient);
    }

    /**
     * 检索指定分析器生成的访问分析结果列表
     *
     * 检索指定分析器生成的访问分析结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFindingsRequest 请求对象
     * @return CompletableFuture<ListFindingsResponse>
     */
    public CompletableFuture<ListFindingsResponse> listFindingsAsync(ListFindingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listFindings);
    }

    /**
     * 检索指定分析器生成的访问分析结果列表
     *
     * 检索指定分析器生成的访问分析结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFindingsRequest 请求对象
     * @return AsyncInvoker<ListFindingsRequest, ListFindingsResponse>
     */
    public AsyncInvoker<ListFindingsRequest, ListFindingsResponse> listFindingsAsyncInvoker(
        ListFindingsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listFindings, hcClient);
    }

    /**
     * 检索有关指定结果的信息
     *
     * 检索有关指定结果的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindingRequest 请求对象
     * @return CompletableFuture<ShowFindingResponse>
     */
    public CompletableFuture<ShowFindingResponse> showFindingAsync(ShowFindingRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.showFinding);
    }

    /**
     * 检索有关指定结果的信息
     *
     * 检索有关指定结果的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindingRequest 请求对象
     * @return AsyncInvoker<ShowFindingRequest, ShowFindingResponse>
     */
    public AsyncInvoker<ShowFindingRequest, ShowFindingResponse> showFindingAsyncInvoker(ShowFindingRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.showFinding, hcClient);
    }

    /**
     * 更新指定结果的状态
     *
     * 更新指定访问分析结果的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFindingsRequest 请求对象
     * @return CompletableFuture<UpdateFindingsResponse>
     */
    public CompletableFuture<UpdateFindingsResponse> updateFindingsAsync(UpdateFindingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.updateFindings);
    }

    /**
     * 更新指定结果的状态
     *
     * 更新指定访问分析结果的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFindingsRequest 请求对象
     * @return AsyncInvoker<UpdateFindingsRequest, UpdateFindingsResponse>
     */
    public AsyncInvoker<UpdateFindingsRequest, UpdateFindingsResponse> updateFindingsAsyncInvoker(
        UpdateFindingsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.updateFindings, hcClient);
    }

    /**
     * 创建消息通知配置
     *
     * 创建消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationSettingRequest 请求对象
     * @return CompletableFuture<CreateNotificationSettingResponse>
     */
    public CompletableFuture<CreateNotificationSettingResponse> createNotificationSettingAsync(
        CreateNotificationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.createNotificationSetting);
    }

    /**
     * 创建消息通知配置
     *
     * 创建消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateNotificationSettingRequest 请求对象
     * @return AsyncInvoker<CreateNotificationSettingRequest, CreateNotificationSettingResponse>
     */
    public AsyncInvoker<CreateNotificationSettingRequest, CreateNotificationSettingResponse> createNotificationSettingAsyncInvoker(
        CreateNotificationSettingRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.createNotificationSetting, hcClient);
    }

    /**
     * 删除消息通知配置
     *
     * 删除消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationSettingRequest 请求对象
     * @return CompletableFuture<DeleteNotificationSettingResponse>
     */
    public CompletableFuture<DeleteNotificationSettingResponse> deleteNotificationSettingAsync(
        DeleteNotificationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteNotificationSetting);
    }

    /**
     * 删除消息通知配置
     *
     * 删除消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteNotificationSettingRequest 请求对象
     * @return AsyncInvoker<DeleteNotificationSettingRequest, DeleteNotificationSettingResponse>
     */
    public AsyncInvoker<DeleteNotificationSettingRequest, DeleteNotificationSettingResponse> deleteNotificationSettingAsyncInvoker(
        DeleteNotificationSettingRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteNotificationSetting, hcClient);
    }

    /**
     * 获取消息通知配置列表
     *
     * 获取消息通知配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationSettingsRequest 请求对象
     * @return CompletableFuture<ListNotificationSettingsResponse>
     */
    public CompletableFuture<ListNotificationSettingsResponse> listNotificationSettingsAsync(
        ListNotificationSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listNotificationSettings);
    }

    /**
     * 获取消息通知配置列表
     *
     * 获取消息通知配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNotificationSettingsRequest 请求对象
     * @return AsyncInvoker<ListNotificationSettingsRequest, ListNotificationSettingsResponse>
     */
    public AsyncInvoker<ListNotificationSettingsRequest, ListNotificationSettingsResponse> listNotificationSettingsAsyncInvoker(
        ListNotificationSettingsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listNotificationSettings, hcClient);
    }

    /**
     * 获取消息通知配置
     *
     * 获取消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSettingRequest 请求对象
     * @return CompletableFuture<ShowNotificationSettingResponse>
     */
    public CompletableFuture<ShowNotificationSettingResponse> showNotificationSettingAsync(
        ShowNotificationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.showNotificationSetting);
    }

    /**
     * 获取消息通知配置
     *
     * 获取消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSettingRequest 请求对象
     * @return AsyncInvoker<ShowNotificationSettingRequest, ShowNotificationSettingResponse>
     */
    public AsyncInvoker<ShowNotificationSettingRequest, ShowNotificationSettingResponse> showNotificationSettingAsyncInvoker(
        ShowNotificationSettingRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.showNotificationSetting, hcClient);
    }

    /**
     * 更新消息通知配置
     *
     * 更新消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSettingRequest 请求对象
     * @return CompletableFuture<UpdateNotificationSettingResponse>
     */
    public CompletableFuture<UpdateNotificationSettingResponse> updateNotificationSettingAsync(
        UpdateNotificationSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.updateNotificationSetting);
    }

    /**
     * 更新消息通知配置
     *
     * 更新消息通知配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSettingRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationSettingRequest, UpdateNotificationSettingResponse>
     */
    public AsyncInvoker<UpdateNotificationSettingRequest, UpdateNotificationSettingResponse> updateNotificationSettingAsyncInvoker(
        UpdateNotificationSettingRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.updateNotificationSetting, hcClient);
    }

    /**
     * 创建访问预览
     *
     * 创建访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPreviewRequest 请求对象
     * @return CompletableFuture<CreateAccessPreviewResponse>
     */
    public CompletableFuture<CreateAccessPreviewResponse> createAccessPreviewAsync(CreateAccessPreviewRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.createAccessPreview);
    }

    /**
     * 创建访问预览
     *
     * 创建访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPreviewRequest 请求对象
     * @return AsyncInvoker<CreateAccessPreviewRequest, CreateAccessPreviewResponse>
     */
    public AsyncInvoker<CreateAccessPreviewRequest, CreateAccessPreviewResponse> createAccessPreviewAsyncInvoker(
        CreateAccessPreviewRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.createAccessPreview, hcClient);
    }

    /**
     * 获取相关预览生成的分析结果
     *
     * 获取相关预览生成的分析结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewFindingsRequest 请求对象
     * @return CompletableFuture<ListAccessPreviewFindingsResponse>
     */
    public CompletableFuture<ListAccessPreviewFindingsResponse> listAccessPreviewFindingsAsync(
        ListAccessPreviewFindingsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listAccessPreviewFindings);
    }

    /**
     * 获取相关预览生成的分析结果
     *
     * 获取相关预览生成的分析结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewFindingsRequest 请求对象
     * @return AsyncInvoker<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse>
     */
    public AsyncInvoker<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse> listAccessPreviewFindingsAsyncInvoker(
        ListAccessPreviewFindingsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listAccessPreviewFindings, hcClient);
    }

    /**
     * 获取所有访问预览
     *
     * 获取所有访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewsRequest 请求对象
     * @return CompletableFuture<ListAccessPreviewsResponse>
     */
    public CompletableFuture<ListAccessPreviewsResponse> listAccessPreviewsAsync(ListAccessPreviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.listAccessPreviews);
    }

    /**
     * 获取所有访问预览
     *
     * 获取所有访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewsRequest 请求对象
     * @return AsyncInvoker<ListAccessPreviewsRequest, ListAccessPreviewsResponse>
     */
    public AsyncInvoker<ListAccessPreviewsRequest, ListAccessPreviewsResponse> listAccessPreviewsAsyncInvoker(
        ListAccessPreviewsRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.listAccessPreviews, hcClient);
    }

    /**
     * 获取相关访问预览的信息
     *
     * 获取相关访问预览的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPreviewRequest 请求对象
     * @return CompletableFuture<ShowAccessPreviewResponse>
     */
    public CompletableFuture<ShowAccessPreviewResponse> showAccessPreviewAsync(ShowAccessPreviewRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.showAccessPreview);
    }

    /**
     * 获取相关访问预览的信息
     *
     * 获取相关访问预览的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPreviewRequest 请求对象
     * @return AsyncInvoker<ShowAccessPreviewRequest, ShowAccessPreviewResponse>
     */
    public AsyncInvoker<ShowAccessPreviewRequest, ShowAccessPreviewResponse> showAccessPreviewAsyncInvoker(
        ShowAccessPreviewRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.showAccessPreview, hcClient);
    }

    /**
     * 向指定资源添加标签
     *
     * 向指定资源添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return CompletableFuture<TagResourceResponse>
     */
    public CompletableFuture<TagResourceResponse> tagResourceAsync(TagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.tagResource);
    }

    /**
     * 向指定资源添加标签
     *
     * 向指定资源添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return AsyncInvoker<TagResourceRequest, TagResourceResponse>
     */
    public AsyncInvoker<TagResourceRequest, TagResourceResponse> tagResourceAsyncInvoker(TagResourceRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.tagResource, hcClient);
    }

    /**
     * 从指定资源中删除标签
     *
     * 从指定资源中删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return CompletableFuture<UntagResourceResponse>
     */
    public CompletableFuture<UntagResourceResponse> untagResourceAsync(UntagResourceRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.untagResource);
    }

    /**
     * 从指定资源中删除标签
     *
     * 从指定资源中删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return AsyncInvoker<UntagResourceRequest, UntagResourceResponse>
     */
    public AsyncInvoker<UntagResourceRequest, UntagResourceResponse> untagResourceAsyncInvoker(
        UntagResourceRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.untagResource, hcClient);
    }

    /**
     * 校验策略是否有新访问权限
     *
     * 校验策略是否有新访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNoNewAccessRequest 请求对象
     * @return CompletableFuture<CheckNoNewAccessResponse>
     */
    public CompletableFuture<CheckNoNewAccessResponse> checkNoNewAccessAsync(CheckNoNewAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.checkNoNewAccess);
    }

    /**
     * 校验策略是否有新访问权限
     *
     * 校验策略是否有新访问权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckNoNewAccessRequest 请求对象
     * @return AsyncInvoker<CheckNoNewAccessRequest, CheckNoNewAccessResponse>
     */
    public AsyncInvoker<CheckNoNewAccessRequest, CheckNoNewAccessResponse> checkNoNewAccessAsyncInvoker(
        CheckNoNewAccessRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.checkNoNewAccess, hcClient);
    }

    /**
     * 校验策略
     *
     * 校验策略并返回结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidatePolicyRequest 请求对象
     * @return CompletableFuture<ValidatePolicyResponse>
     */
    public CompletableFuture<ValidatePolicyResponse> validatePolicyAsync(ValidatePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, IAMAccessAnalyzerMeta.validatePolicy);
    }

    /**
     * 校验策略
     *
     * 校验策略并返回结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidatePolicyRequest 请求对象
     * @return AsyncInvoker<ValidatePolicyRequest, ValidatePolicyResponse>
     */
    public AsyncInvoker<ValidatePolicyRequest, ValidatePolicyResponse> validatePolicyAsyncInvoker(
        ValidatePolicyRequest request) {
        return new AsyncInvoker<>(request, IAMAccessAnalyzerMeta.validatePolicy, hcClient);
    }

}
