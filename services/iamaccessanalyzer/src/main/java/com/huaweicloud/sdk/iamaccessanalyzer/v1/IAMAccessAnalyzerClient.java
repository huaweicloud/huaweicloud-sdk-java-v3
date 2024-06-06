package com.huaweicloud.sdk.iamaccessanalyzer.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ApplyArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.CreateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.DeleteArchiveRuleResponse;
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
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAccessPreviewResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowAnalyzerResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ShowFindingResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.StartResourceScanResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.TagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UntagResourceResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateArchiveRuleResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.UpdateFindingsResponse;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyRequest;
import com.huaweicloud.sdk.iamaccessanalyzer.v1.model.ValidatePolicyResponse;

public class IAMAccessAnalyzerClient {

    protected HcClient hcClient;

    public IAMAccessAnalyzerClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IAMAccessAnalyzerClient> newBuilder() {
        ClientBuilder<IAMAccessAnalyzerClient> clientBuilder =
            new ClientBuilder<>(IAMAccessAnalyzerClient::new, "GlobalCredentials");
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
     * @return CreateAnalyzerResponse
     */
    public CreateAnalyzerResponse createAnalyzer(CreateAnalyzerRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.createAnalyzer);
    }

    /**
     * 创建分析器
     *
     * 为您的账号或者组织创建分析器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAnalyzerRequest 请求对象
     * @return SyncInvoker<CreateAnalyzerRequest, CreateAnalyzerResponse>
     */
    public SyncInvoker<CreateAnalyzerRequest, CreateAnalyzerResponse> createAnalyzerInvoker(
        CreateAnalyzerRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.createAnalyzer, hcClient);
    }

    /**
     * 删除指定的分析器
     *
     * 删除指定的分析器。分析器生成的所有检查结果都将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalyzerRequest 请求对象
     * @return DeleteAnalyzerResponse
     */
    public DeleteAnalyzerResponse deleteAnalyzer(DeleteAnalyzerRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteAnalyzer);
    }

    /**
     * 删除指定的分析器
     *
     * 删除指定的分析器。分析器生成的所有检查结果都将被删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteAnalyzerRequest 请求对象
     * @return SyncInvoker<DeleteAnalyzerRequest, DeleteAnalyzerResponse>
     */
    public SyncInvoker<DeleteAnalyzerRequest, DeleteAnalyzerResponse> deleteAnalyzerInvoker(
        DeleteAnalyzerRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteAnalyzer, hcClient);
    }

    /**
     * 检索分析器的列表
     *
     * 检索分析器的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalyzersRequest 请求对象
     * @return ListAnalyzersResponse
     */
    public ListAnalyzersResponse listAnalyzers(ListAnalyzersRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.listAnalyzers);
    }

    /**
     * 检索分析器的列表
     *
     * 检索分析器的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAnalyzersRequest 请求对象
     * @return SyncInvoker<ListAnalyzersRequest, ListAnalyzersResponse>
     */
    public SyncInvoker<ListAnalyzersRequest, ListAnalyzersResponse> listAnalyzersInvoker(ListAnalyzersRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.listAnalyzers, hcClient);
    }

    /**
     * 显示指定的分析器
     *
     * 检索有关指定分析器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalyzerRequest 请求对象
     * @return ShowAnalyzerResponse
     */
    public ShowAnalyzerResponse showAnalyzer(ShowAnalyzerRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.showAnalyzer);
    }

    /**
     * 显示指定的分析器
     *
     * 检索有关指定分析器的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAnalyzerRequest 请求对象
     * @return SyncInvoker<ShowAnalyzerRequest, ShowAnalyzerResponse>
     */
    public SyncInvoker<ShowAnalyzerRequest, ShowAnalyzerResponse> showAnalyzerInvoker(ShowAnalyzerRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.showAnalyzer, hcClient);
    }

    /**
     * 立即开始扫描应用于指定资源的策略
     *
     * 立即开始扫描应用于指定资源的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResourceScanRequest 请求对象
     * @return StartResourceScanResponse
     */
    public StartResourceScanResponse startResourceScan(StartResourceScanRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.startResourceScan);
    }

    /**
     * 立即开始扫描应用于指定资源的策略
     *
     * 立即开始扫描应用于指定资源的策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartResourceScanRequest 请求对象
     * @return SyncInvoker<StartResourceScanRequest, StartResourceScanResponse>
     */
    public SyncInvoker<StartResourceScanRequest, StartResourceScanResponse> startResourceScanInvoker(
        StartResourceScanRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.startResourceScan, hcClient);
    }

    /**
     * 应用存档规则
     *
     * 以追溯方式将存档规则应用于符合存档规则条件的现有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyArchiveRuleRequest 请求对象
     * @return ApplyArchiveRuleResponse
     */
    public ApplyArchiveRuleResponse applyArchiveRule(ApplyArchiveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.applyArchiveRule);
    }

    /**
     * 应用存档规则
     *
     * 以追溯方式将存档规则应用于符合存档规则条件的现有结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyArchiveRuleRequest 请求对象
     * @return SyncInvoker<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse>
     */
    public SyncInvoker<ApplyArchiveRuleRequest, ApplyArchiveRuleResponse> applyArchiveRuleInvoker(
        ApplyArchiveRuleRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.applyArchiveRule, hcClient);
    }

    /**
     * 为指定的分析器创建存档规则
     *
     * 为指定的分析器创建存档规则。存档规则会自动存档符合您在创建规则时所定义条件的新结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArchiveRuleRequest 请求对象
     * @return CreateArchiveRuleResponse
     */
    public CreateArchiveRuleResponse createArchiveRule(CreateArchiveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.createArchiveRule);
    }

    /**
     * 为指定的分析器创建存档规则
     *
     * 为指定的分析器创建存档规则。存档规则会自动存档符合您在创建规则时所定义条件的新结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateArchiveRuleRequest 请求对象
     * @return SyncInvoker<CreateArchiveRuleRequest, CreateArchiveRuleResponse>
     */
    public SyncInvoker<CreateArchiveRuleRequest, CreateArchiveRuleResponse> createArchiveRuleInvoker(
        CreateArchiveRuleRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.createArchiveRule, hcClient);
    }

    /**
     * 删除指定的存档规则
     *
     * 删除指定的存档规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArchiveRuleRequest 请求对象
     * @return DeleteArchiveRuleResponse
     */
    public DeleteArchiveRuleResponse deleteArchiveRule(DeleteArchiveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.deleteArchiveRule);
    }

    /**
     * 删除指定的存档规则
     *
     * 删除指定的存档规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteArchiveRuleRequest 请求对象
     * @return SyncInvoker<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse>
     */
    public SyncInvoker<DeleteArchiveRuleRequest, DeleteArchiveRuleResponse> deleteArchiveRuleInvoker(
        DeleteArchiveRuleRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.deleteArchiveRule, hcClient);
    }

    /**
     * 检索为指定分析器创建的存档规则的列表
     *
     * 检索为指定分析器创建的存档规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveRulesRequest 请求对象
     * @return ListArchiveRulesResponse
     */
    public ListArchiveRulesResponse listArchiveRules(ListArchiveRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.listArchiveRules);
    }

    /**
     * 检索为指定分析器创建的存档规则的列表
     *
     * 检索为指定分析器创建的存档规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListArchiveRulesRequest 请求对象
     * @return SyncInvoker<ListArchiveRulesRequest, ListArchiveRulesResponse>
     */
    public SyncInvoker<ListArchiveRulesRequest, ListArchiveRulesResponse> listArchiveRulesInvoker(
        ListArchiveRulesRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.listArchiveRules, hcClient);
    }

    /**
     * 检索有关存档规则的信息
     *
     * 检索有关存档规则的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowArchiveRuleRequest 请求对象
     * @return ShowArchiveRuleResponse
     */
    public ShowArchiveRuleResponse showArchiveRule(ShowArchiveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.showArchiveRule);
    }

    /**
     * 检索有关存档规则的信息
     *
     * 检索有关存档规则的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowArchiveRuleRequest 请求对象
     * @return SyncInvoker<ShowArchiveRuleRequest, ShowArchiveRuleResponse>
     */
    public SyncInvoker<ShowArchiveRuleRequest, ShowArchiveRuleResponse> showArchiveRuleInvoker(
        ShowArchiveRuleRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.showArchiveRule, hcClient);
    }

    /**
     * 更新指定存档规则的条件和值
     *
     * 更新指定存档规则的条件和值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveRuleRequest 请求对象
     * @return UpdateArchiveRuleResponse
     */
    public UpdateArchiveRuleResponse updateArchiveRule(UpdateArchiveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.updateArchiveRule);
    }

    /**
     * 更新指定存档规则的条件和值
     *
     * 更新指定存档规则的条件和值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateArchiveRuleRequest 请求对象
     * @return SyncInvoker<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse>
     */
    public SyncInvoker<UpdateArchiveRuleRequest, UpdateArchiveRuleResponse> updateArchiveRuleInvoker(
        UpdateArchiveRuleRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.updateArchiveRule, hcClient);
    }

    /**
     * 检索指定分析器生成的访问分析结果列表
     *
     * 检索指定分析器生成的访问分析结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFindingsRequest 请求对象
     * @return ListFindingsResponse
     */
    public ListFindingsResponse listFindings(ListFindingsRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.listFindings);
    }

    /**
     * 检索指定分析器生成的访问分析结果列表
     *
     * 检索指定分析器生成的访问分析结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFindingsRequest 请求对象
     * @return SyncInvoker<ListFindingsRequest, ListFindingsResponse>
     */
    public SyncInvoker<ListFindingsRequest, ListFindingsResponse> listFindingsInvoker(ListFindingsRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.listFindings, hcClient);
    }

    /**
     * 检索有关指定结果的信息
     *
     * 检索有关指定结果的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindingRequest 请求对象
     * @return ShowFindingResponse
     */
    public ShowFindingResponse showFinding(ShowFindingRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.showFinding);
    }

    /**
     * 检索有关指定结果的信息
     *
     * 检索有关指定结果的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFindingRequest 请求对象
     * @return SyncInvoker<ShowFindingRequest, ShowFindingResponse>
     */
    public SyncInvoker<ShowFindingRequest, ShowFindingResponse> showFindingInvoker(ShowFindingRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.showFinding, hcClient);
    }

    /**
     * 更新指定结果的状态
     *
     * 更新指定访问分析结果的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFindingsRequest 请求对象
     * @return UpdateFindingsResponse
     */
    public UpdateFindingsResponse updateFindings(UpdateFindingsRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.updateFindings);
    }

    /**
     * 更新指定结果的状态
     *
     * 更新指定访问分析结果的状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFindingsRequest 请求对象
     * @return SyncInvoker<UpdateFindingsRequest, UpdateFindingsResponse>
     */
    public SyncInvoker<UpdateFindingsRequest, UpdateFindingsResponse> updateFindingsInvoker(
        UpdateFindingsRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.updateFindings, hcClient);
    }

    /**
     * 创建访问预览
     *
     * 创建访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPreviewRequest 请求对象
     * @return CreateAccessPreviewResponse
     */
    public CreateAccessPreviewResponse createAccessPreview(CreateAccessPreviewRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.createAccessPreview);
    }

    /**
     * 创建访问预览
     *
     * 创建访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessPreviewRequest 请求对象
     * @return SyncInvoker<CreateAccessPreviewRequest, CreateAccessPreviewResponse>
     */
    public SyncInvoker<CreateAccessPreviewRequest, CreateAccessPreviewResponse> createAccessPreviewInvoker(
        CreateAccessPreviewRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.createAccessPreview, hcClient);
    }

    /**
     * 获取相关预览生成的分析结果
     *
     * 获取相关预览生成的分析结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewFindingsRequest 请求对象
     * @return ListAccessPreviewFindingsResponse
     */
    public ListAccessPreviewFindingsResponse listAccessPreviewFindings(ListAccessPreviewFindingsRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.listAccessPreviewFindings);
    }

    /**
     * 获取相关预览生成的分析结果
     *
     * 获取相关预览生成的分析结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewFindingsRequest 请求对象
     * @return SyncInvoker<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse>
     */
    public SyncInvoker<ListAccessPreviewFindingsRequest, ListAccessPreviewFindingsResponse> listAccessPreviewFindingsInvoker(
        ListAccessPreviewFindingsRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.listAccessPreviewFindings, hcClient);
    }

    /**
     * 获取所有访问预览
     *
     * 获取所有访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewsRequest 请求对象
     * @return ListAccessPreviewsResponse
     */
    public ListAccessPreviewsResponse listAccessPreviews(ListAccessPreviewsRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.listAccessPreviews);
    }

    /**
     * 获取所有访问预览
     *
     * 获取所有访问预览。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessPreviewsRequest 请求对象
     * @return SyncInvoker<ListAccessPreviewsRequest, ListAccessPreviewsResponse>
     */
    public SyncInvoker<ListAccessPreviewsRequest, ListAccessPreviewsResponse> listAccessPreviewsInvoker(
        ListAccessPreviewsRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.listAccessPreviews, hcClient);
    }

    /**
     * 获取相关访问预览的信息
     *
     * 获取相关访问预览的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPreviewRequest 请求对象
     * @return ShowAccessPreviewResponse
     */
    public ShowAccessPreviewResponse showAccessPreview(ShowAccessPreviewRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.showAccessPreview);
    }

    /**
     * 获取相关访问预览的信息
     *
     * 获取相关访问预览的信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAccessPreviewRequest 请求对象
     * @return SyncInvoker<ShowAccessPreviewRequest, ShowAccessPreviewResponse>
     */
    public SyncInvoker<ShowAccessPreviewRequest, ShowAccessPreviewResponse> showAccessPreviewInvoker(
        ShowAccessPreviewRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.showAccessPreview, hcClient);
    }

    /**
     * 向指定资源添加标签
     *
     * 向指定资源添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return TagResourceResponse
     */
    public TagResourceResponse tagResource(TagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.tagResource);
    }

    /**
     * 向指定资源添加标签
     *
     * 向指定资源添加标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TagResourceRequest 请求对象
     * @return SyncInvoker<TagResourceRequest, TagResourceResponse>
     */
    public SyncInvoker<TagResourceRequest, TagResourceResponse> tagResourceInvoker(TagResourceRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.tagResource, hcClient);
    }

    /**
     * 从指定资源中删除标签
     *
     * 从指定资源中删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return UntagResourceResponse
     */
    public UntagResourceResponse untagResource(UntagResourceRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.untagResource);
    }

    /**
     * 从指定资源中删除标签
     *
     * 从指定资源中删除标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UntagResourceRequest 请求对象
     * @return SyncInvoker<UntagResourceRequest, UntagResourceResponse>
     */
    public SyncInvoker<UntagResourceRequest, UntagResourceResponse> untagResourceInvoker(UntagResourceRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.untagResource, hcClient);
    }

    /**
     * 校验策略
     *
     * 校验策略并返回结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidatePolicyRequest 请求对象
     * @return ValidatePolicyResponse
     */
    public ValidatePolicyResponse validatePolicy(ValidatePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, IAMAccessAnalyzerMeta.validatePolicy);
    }

    /**
     * 校验策略
     *
     * 校验策略并返回结果列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ValidatePolicyRequest 请求对象
     * @return SyncInvoker<ValidatePolicyRequest, ValidatePolicyResponse>
     */
    public SyncInvoker<ValidatePolicyRequest, ValidatePolicyResponse> validatePolicyInvoker(
        ValidatePolicyRequest request) {
        return new SyncInvoker<>(request, IAMAccessAnalyzerMeta.validatePolicy, hcClient);
    }

}
