package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.ApplyDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.ApplyDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchCopyDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.BatchUpdateRuleStatusRequest;
import com.huaweicloud.sdk.cdn.v2.model.BatchUpdateRuleStatusResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateAccessControlTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateAccessControlTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainByDuplicateRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainByDuplicateResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateExportTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateExportTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreatePreheatingTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateRefreshTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateSubscriptionTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateSubscriptionTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.CreateTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.DeleteSubscriptionTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.DeleteSubscriptionTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.DisableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadRegionCarrierExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelRequest;
import com.huaweicloud.sdk.cdn.v2.model.DownloadStatisticsExcelResponse;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainRequest;
import com.huaweicloud.sdk.cdn.v2.model.EnableDomainResponse;
import com.huaweicloud.sdk.cdn.v2.model.ExportStatsOpenRequest;
import com.huaweicloud.sdk.cdn.v2.model.ExportStatsOpenResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListAccessControlTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListAccessControlTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListBanUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListBanUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopIpsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopIpsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopOriginUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopOriginUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopPathRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopPathResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopRefersResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopUasRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListCdnDomainTopUasResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainClientStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainClientStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainConfigsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainConfigsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListExportTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListExportTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListRuleDetailsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListRuleDetailsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListSpecialConfigurationRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListSpecialConfigurationResponse;
import com.huaweicloud.sdk.cdn.v2.model.ListSubscriptionTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.ListSubscriptionTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.ModifyAccountInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ModifyAccountInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.SetStatsConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.SetStatsConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowAppliedTemplateRecordRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowAppliedTemplateRecordResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowBandwidthCalcResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowCertificatesHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowChargeModesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainCountryStatRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainCountryStatResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainDetailByNameResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTaskDetailsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowHistoryTasksResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowIpInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowLogsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowSpecialUserRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowSpecialUserResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowStatsConfigsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowStatsConfigsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTagsResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopDomainNamesResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowUrlTaskInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoRequest;
import com.huaweicloud.sdk.cdn.v2.model.ShowVerifyDomainOwnerInfoResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainMultiCertificatesResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainTemplateRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateDomainTemplateResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateFullRuleRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateFullRuleResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdatePrivateBucketAccessResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateRuleNewRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateRuleNewResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateShareCacheGroupsRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateShareCacheGroupsResponse;
import com.huaweicloud.sdk.cdn.v2.model.UpdateSubscriptionTaskRequest;
import com.huaweicloud.sdk.cdn.v2.model.UpdateSubscriptionTaskResponse;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerRequest;
import com.huaweicloud.sdk.cdn.v2.model.VerifyDomainOwnerResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CdnClient {

    protected HcClient hcClient;

    public CdnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnClient> newBuilder() {
        ClientBuilder<CdnClient> clientBuilder = new ClientBuilder<>(CdnClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 应用域名模板。
     *
     * 应用域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDomainTemplateRequest 请求对象
     * @return ApplyDomainTemplateResponse
     */
    public ApplyDomainTemplateResponse applyDomainTemplate(ApplyDomainTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.applyDomainTemplate);
    }

    /**
     * 应用域名模板。
     *
     * 应用域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApplyDomainTemplateRequest 请求对象
     * @return SyncInvoker<ApplyDomainTemplateRequest, ApplyDomainTemplateResponse>
     */
    public SyncInvoker<ApplyDomainTemplateRequest, ApplyDomainTemplateResponse> applyDomainTemplateInvoker(
        ApplyDomainTemplateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.applyDomainTemplate, hcClient);
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口。
     *  &gt; 将某个加速域名的配置批量复制到其他域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCopyDomainRequest 请求对象
     * @return BatchCopyDomainResponse
     */
    public BatchCopyDomainResponse batchCopyDomain(BatchCopyDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.batchCopyDomain);
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口。
     *  &gt; 将某个加速域名的配置批量复制到其他域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCopyDomainRequest 请求对象
     * @return SyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>
     */
    public SyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomainInvoker(
        BatchCopyDomainRequest request) {
        return new SyncInvoker<>(request, CdnMeta.batchCopyDomain, hcClient);
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return BatchDeleteTagsResponse
     */
    public BatchDeleteTagsResponse batchDeleteTags(BatchDeleteTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.batchDeleteTags);
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.batchDeleteTags, hcClient);
    }

    /**
     * 批量更新规则状态及优先级
     *
     * 批量更新规则状态及优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRuleStatusRequest 请求对象
     * @return BatchUpdateRuleStatusResponse
     */
    public BatchUpdateRuleStatusResponse batchUpdateRuleStatus(BatchUpdateRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.batchUpdateRuleStatus);
    }

    /**
     * 批量更新规则状态及优先级
     *
     * 批量更新规则状态及优先级。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRuleStatusRequest 请求对象
     * @return SyncInvoker<BatchUpdateRuleStatusRequest, BatchUpdateRuleStatusResponse>
     */
    public SyncInvoker<BatchUpdateRuleStatusRequest, BatchUpdateRuleStatusResponse> batchUpdateRuleStatusInvoker(
        BatchUpdateRuleStatusRequest request) {
        return new SyncInvoker<>(request, CdnMeta.batchUpdateRuleStatus, hcClient);
    }

    /**
     * 创建封禁/解禁URL任务
     *
     * 创建封禁/解禁URL任务，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：10次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlTaskRequest 请求对象
     * @return CreateAccessControlTaskResponse
     */
    public CreateAccessControlTaskResponse createAccessControlTask(CreateAccessControlTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createAccessControlTask);
    }

    /**
     * 创建封禁/解禁URL任务
     *
     * 创建封禁/解禁URL任务，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：10次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAccessControlTaskRequest 请求对象
     * @return SyncInvoker<CreateAccessControlTaskRequest, CreateAccessControlTaskResponse>
     */
    public SyncInvoker<CreateAccessControlTaskRequest, CreateAccessControlTaskResponse> createAccessControlTaskInvoker(
        CreateAccessControlTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createAccessControlTask, hcClient);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createDomain);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createDomain, hcClient);
    }

    /**
     * 复制配置到新添加域名
     *
     * 将存量加速域名的配置复制给新添加的域名。
     * - 已开通CDN服务。
     * - 如果加速域名的服务范围包含中国大陆，加速域名需要已完成备案。
     * - 单租户调用频率：20次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainByDuplicateRequest 请求对象
     * @return CreateDomainByDuplicateResponse
     */
    public CreateDomainByDuplicateResponse createDomainByDuplicate(CreateDomainByDuplicateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createDomainByDuplicate);
    }

    /**
     * 复制配置到新添加域名
     *
     * 将存量加速域名的配置复制给新添加的域名。
     * - 已开通CDN服务。
     * - 如果加速域名的服务范围包含中国大陆，加速域名需要已完成备案。
     * - 单租户调用频率：20次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainByDuplicateRequest 请求对象
     * @return SyncInvoker<CreateDomainByDuplicateRequest, CreateDomainByDuplicateResponse>
     */
    public SyncInvoker<CreateDomainByDuplicateRequest, CreateDomainByDuplicateResponse> createDomainByDuplicateInvoker(
        CreateDomainByDuplicateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createDomainByDuplicate, hcClient);
    }

    /**
     * 创建域名模板。
     *
     * 创建域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainTemplateRequest 请求对象
     * @return CreateDomainTemplateResponse
     */
    public CreateDomainTemplateResponse createDomainTemplate(CreateDomainTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createDomainTemplate);
    }

    /**
     * 创建域名模板。
     *
     * 创建域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainTemplateRequest 请求对象
     * @return SyncInvoker<CreateDomainTemplateRequest, CreateDomainTemplateResponse>
     */
    public SyncInvoker<CreateDomainTemplateRequest, CreateDomainTemplateResponse> createDomainTemplateInvoker(
        CreateDomainTemplateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createDomainTemplate, hcClient);
    }

    /**
     * 创建统计数据异步导出任务
     *
     * 创建统计数据异步导出任务，目前支持话单数据导出、top url导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExportTaskRequest 请求对象
     * @return CreateExportTaskResponse
     */
    public CreateExportTaskResponse createExportTask(CreateExportTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createExportTask);
    }

    /**
     * 创建统计数据异步导出任务
     *
     * 创建统计数据异步导出任务，目前支持话单数据导出、top url导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateExportTaskRequest 请求对象
     * @return SyncInvoker<CreateExportTaskRequest, CreateExportTaskResponse>
     */
    public SyncInvoker<CreateExportTaskRequest, CreateExportTaskResponse> createExportTaskInvoker(
        CreateExportTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createExportTask, hcClient);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return CreatePreheatingTasksResponse
     */
    public CreatePreheatingTasksResponse createPreheatingTasks(CreatePreheatingTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createPreheatingTasks);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>
     */
    public SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksInvoker(
        CreatePreheatingTasksRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createPreheatingTasks, hcClient);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return CreateRefreshTasksResponse
     */
    public CreateRefreshTasksResponse createRefreshTasks(CreateRefreshTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createRefreshTasks);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>
     */
    public SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksInvoker(
        CreateRefreshTasksRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createRefreshTasks, hcClient);
    }

    /**
     * 创建规则引擎规则
     *
     * 规则引擎功能通过图形化的方式实现各种规则配置，实现更加灵活、细粒度的规则配置。通过限制触发条件，控制当前配置生效的资源范围，满足多种场景的配置需求。
     * - 请提交工单开通规则引擎功能后再使用当前接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleNewRequest 请求对象
     * @return CreateRuleNewResponse
     */
    public CreateRuleNewResponse createRuleNew(CreateRuleNewRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createRuleNew);
    }

    /**
     * 创建规则引擎规则
     *
     * 规则引擎功能通过图形化的方式实现各种规则配置，实现更加灵活、细粒度的规则配置。通过限制触发条件，控制当前配置生效的资源范围，满足多种场景的配置需求。
     * - 请提交工单开通规则引擎功能后再使用当前接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRuleNewRequest 请求对象
     * @return SyncInvoker<CreateRuleNewRequest, CreateRuleNewResponse>
     */
    public SyncInvoker<CreateRuleNewRequest, CreateRuleNewResponse> createRuleNewInvoker(CreateRuleNewRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createRuleNew, hcClient);
    }

    /**
     * 创建共享缓存组
     *
     * 配置共享缓存组，将一个域名设置为主域名，组内其他域名共享该域名的缓存，提高缓存命中率。
     * - 只有缓存规则中“URL参数”的配置为“忽略参数”或者“不忽略参数”的域名才能加入共享缓存组。
     * - 每个账号最多配置500个共享缓存组。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareCacheGroupsRequest 请求对象
     * @return CreateShareCacheGroupsResponse
     */
    public CreateShareCacheGroupsResponse createShareCacheGroups(CreateShareCacheGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createShareCacheGroups);
    }

    /**
     * 创建共享缓存组
     *
     * 配置共享缓存组，将一个域名设置为主域名，组内其他域名共享该域名的缓存，提高缓存命中率。
     * - 只有缓存规则中“URL参数”的配置为“忽略参数”或者“不忽略参数”的域名才能加入共享缓存组。
     * - 每个账号最多配置500个共享缓存组。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateShareCacheGroupsRequest 请求对象
     * @return SyncInvoker<CreateShareCacheGroupsRequest, CreateShareCacheGroupsResponse>
     */
    public SyncInvoker<CreateShareCacheGroupsRequest, CreateShareCacheGroupsResponse> createShareCacheGroupsInvoker(
        CreateShareCacheGroupsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createShareCacheGroups, hcClient);
    }

    /**
     * 创建运营报表订阅任务
     *
     * create subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTaskRequest 请求对象
     * @return CreateSubscriptionTaskResponse
     */
    public CreateSubscriptionTaskResponse createSubscriptionTask(CreateSubscriptionTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createSubscriptionTask);
    }

    /**
     * 创建运营报表订阅任务
     *
     * create subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSubscriptionTaskRequest 请求对象
     * @return SyncInvoker<CreateSubscriptionTaskRequest, CreateSubscriptionTaskResponse>
     */
    public SyncInvoker<CreateSubscriptionTaskRequest, CreateSubscriptionTaskResponse> createSubscriptionTaskInvoker(
        CreateSubscriptionTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createSubscriptionTask, hcClient);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CreateTagsResponse
     */
    public CreateTagsResponse createTags(CreateTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.createTags);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.createTags, hcClient);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteDomain);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<>(request, CdnMeta.deleteDomain, hcClient);
    }

    /**
     * 删除域名模板。
     *
     * 删除域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainTemplateRequest 请求对象
     * @return DeleteDomainTemplateResponse
     */
    public DeleteDomainTemplateResponse deleteDomainTemplate(DeleteDomainTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteDomainTemplate);
    }

    /**
     * 删除域名模板。
     *
     * 删除域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainTemplateRequest 请求对象
     * @return SyncInvoker<DeleteDomainTemplateRequest, DeleteDomainTemplateResponse>
     */
    public SyncInvoker<DeleteDomainTemplateRequest, DeleteDomainTemplateResponse> deleteDomainTemplateInvoker(
        DeleteDomainTemplateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.deleteDomainTemplate, hcClient);
    }

    /**
     * 删除规则引擎规则
     *
     * 删除规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleNewRequest 请求对象
     * @return DeleteRuleNewResponse
     */
    public DeleteRuleNewResponse deleteRuleNew(DeleteRuleNewRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteRuleNew);
    }

    /**
     * 删除规则引擎规则
     *
     * 删除规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRuleNewRequest 请求对象
     * @return SyncInvoker<DeleteRuleNewRequest, DeleteRuleNewResponse>
     */
    public SyncInvoker<DeleteRuleNewRequest, DeleteRuleNewResponse> deleteRuleNewInvoker(DeleteRuleNewRequest request) {
        return new SyncInvoker<>(request, CdnMeta.deleteRuleNew, hcClient);
    }

    /**
     * 删除共享缓存组
     *
     * 删除新共享缓存组。
     * - 共享缓存组内不包含关联域名时才可以删除。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareCacheGroupsRequest 请求对象
     * @return DeleteShareCacheGroupsResponse
     */
    public DeleteShareCacheGroupsResponse deleteShareCacheGroups(DeleteShareCacheGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteShareCacheGroups);
    }

    /**
     * 删除共享缓存组
     *
     * 删除新共享缓存组。
     * - 共享缓存组内不包含关联域名时才可以删除。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteShareCacheGroupsRequest 请求对象
     * @return SyncInvoker<DeleteShareCacheGroupsRequest, DeleteShareCacheGroupsResponse>
     */
    public SyncInvoker<DeleteShareCacheGroupsRequest, DeleteShareCacheGroupsResponse> deleteShareCacheGroupsInvoker(
        DeleteShareCacheGroupsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.deleteShareCacheGroups, hcClient);
    }

    /**
     * 删除运营报表订阅任务
     *
     * delete subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTaskRequest 请求对象
     * @return DeleteSubscriptionTaskResponse
     */
    public DeleteSubscriptionTaskResponse deleteSubscriptionTask(DeleteSubscriptionTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.deleteSubscriptionTask);
    }

    /**
     * 删除运营报表订阅任务
     *
     * delete subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSubscriptionTaskRequest 请求对象
     * @return SyncInvoker<DeleteSubscriptionTaskRequest, DeleteSubscriptionTaskResponse>
     */
    public SyncInvoker<DeleteSubscriptionTaskRequest, DeleteSubscriptionTaskResponse> deleteSubscriptionTaskInvoker(
        DeleteSubscriptionTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.deleteSubscriptionTask, hcClient);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return DisableDomainResponse
     */
    public DisableDomainResponse disableDomain(DisableDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.disableDomain);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return SyncInvoker<DisableDomainRequest, DisableDomainResponse>
     */
    public SyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainInvoker(DisableDomainRequest request) {
        return new SyncInvoker<>(request, CdnMeta.disableDomain, hcClient);
    }

    /**
     * 下载区域运营商指标数据表格文件
     *
     * - 下载区域运营商指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据表格。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRegionCarrierExcelRequest 请求对象
     * @return DownloadRegionCarrierExcelResponse
     */
    @Deprecated
    public DownloadRegionCarrierExcelResponse downloadRegionCarrierExcel(DownloadRegionCarrierExcelRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.downloadRegionCarrierExcel);
    }

    /**
     * 下载区域运营商指标数据表格文件
     *
     * - 下载区域运营商指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据表格。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadRegionCarrierExcelRequest 请求对象
     * @return SyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>
     */
    @Deprecated
    public SyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcelInvoker(
        DownloadRegionCarrierExcelRequest request) {
        return new SyncInvoker<>(request, CdnMeta.downloadRegionCarrierExcel, hcClient);
    }

    /**
     * 下载统计指标数据表格文件
     *
     * - 下载统计指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadStatisticsExcelRequest 请求对象
     * @return DownloadStatisticsExcelResponse
     */
    @Deprecated
    public DownloadStatisticsExcelResponse downloadStatisticsExcel(DownloadStatisticsExcelRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.downloadStatisticsExcel);
    }

    /**
     * 下载统计指标数据表格文件
     *
     * - 下载统计指标数据表格文件。
     * 
     * - 支持下载90天内的指标数据。
     * 
     * - 时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如时间跨度为2022-10-24 00:00:00 到 2022-10-25 00:00:00，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadStatisticsExcelRequest 请求对象
     * @return SyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>
     */
    @Deprecated
    public SyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcelInvoker(
        DownloadStatisticsExcelRequest request) {
        return new SyncInvoker<>(request, CdnMeta.downloadStatisticsExcel, hcClient);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return EnableDomainResponse
     */
    public EnableDomainResponse enableDomain(EnableDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.enableDomain);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return SyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public SyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainInvoker(EnableDomainRequest request) {
        return new SyncInvoker<>(request, CdnMeta.enableDomain, hcClient);
    }

    /**
     * CDN数据导出
     *
     * CDN数据导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportStatsOpenRequest 请求对象
     * @return ExportStatsOpenResponse
     */
    public ExportStatsOpenResponse exportStatsOpen(ExportStatsOpenRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.exportStatsOpen);
    }

    /**
     * CDN数据导出
     *
     * CDN数据导出
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportStatsOpenRequest 请求对象
     * @return SyncInvoker<ExportStatsOpenRequest, ExportStatsOpenResponse>
     */
    public SyncInvoker<ExportStatsOpenRequest, ExportStatsOpenResponse> exportStatsOpenInvoker(
        ExportStatsOpenRequest request) {
        return new SyncInvoker<>(request, CdnMeta.exportStatsOpen, hcClient);
    }

    /**
     * 查询封禁/解禁URL任务
     *
     * 查询封禁/解禁URL任务，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：30次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlTaskRequest 请求对象
     * @return ListAccessControlTaskResponse
     */
    public ListAccessControlTaskResponse listAccessControlTask(ListAccessControlTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listAccessControlTask);
    }

    /**
     * 查询封禁/解禁URL任务
     *
     * 查询封禁/解禁URL任务，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：30次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAccessControlTaskRequest 请求对象
     * @return SyncInvoker<ListAccessControlTaskRequest, ListAccessControlTaskResponse>
     */
    public SyncInvoker<ListAccessControlTaskRequest, ListAccessControlTaskResponse> listAccessControlTaskInvoker(
        ListAccessControlTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listAccessControlTask, hcClient);
    }

    /**
     * 查询已封禁的URL
     *
     * 查询已封禁的URL，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：30次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBanUrlRequest 请求对象
     * @return ListBanUrlResponse
     */
    public ListBanUrlResponse listBanUrl(ListBanUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listBanUrl);
    }

    /**
     * 查询已封禁的URL
     *
     * 查询已封禁的URL，如需使用本接口，请提交工单申请。
     * - 单租户调用频率：30次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBanUrlRequest 请求对象
     * @return SyncInvoker<ListBanUrlRequest, ListBanUrlResponse>
     */
    public SyncInvoker<ListBanUrlRequest, ListBanUrlResponse> listBanUrlInvoker(ListBanUrlRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listBanUrl, hcClient);
    }

    /**
     * 查询域名top ip统计分析数据
     *
     * - 查询域名top ip统计分析数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopIpsRequest 请求对象
     * @return ListCdnDomainTopIpsResponse
     */
    public ListCdnDomainTopIpsResponse listCdnDomainTopIps(ListCdnDomainTopIpsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listCdnDomainTopIps);
    }

    /**
     * 查询域名top ip统计分析数据
     *
     * - 查询域名top ip统计分析数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopIpsRequest 请求对象
     * @return SyncInvoker<ListCdnDomainTopIpsRequest, ListCdnDomainTopIpsResponse>
     */
    public SyncInvoker<ListCdnDomainTopIpsRequest, ListCdnDomainTopIpsResponse> listCdnDomainTopIpsInvoker(
        ListCdnDomainTopIpsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listCdnDomainTopIps, hcClient);
    }

    /**
     * 查询域名top回源URL数据
     *
     * - 查询域名top 回源URL数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopOriginUrlRequest 请求对象
     * @return ListCdnDomainTopOriginUrlResponse
     */
    public ListCdnDomainTopOriginUrlResponse listCdnDomainTopOriginUrl(ListCdnDomainTopOriginUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listCdnDomainTopOriginUrl);
    }

    /**
     * 查询域名top回源URL数据
     *
     * - 查询域名top 回源URL数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopOriginUrlRequest 请求对象
     * @return SyncInvoker<ListCdnDomainTopOriginUrlRequest, ListCdnDomainTopOriginUrlResponse>
     */
    public SyncInvoker<ListCdnDomainTopOriginUrlRequest, ListCdnDomainTopOriginUrlResponse> listCdnDomainTopOriginUrlInvoker(
        ListCdnDomainTopOriginUrlRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listCdnDomainTopOriginUrl, hcClient);
    }

    /**
     * 查询 TOP Path明细
     *
     * 查询 TOP Path明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopPathRequest 请求对象
     * @return ListCdnDomainTopPathResponse
     */
    public ListCdnDomainTopPathResponse listCdnDomainTopPath(ListCdnDomainTopPathRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listCdnDomainTopPath);
    }

    /**
     * 查询 TOP Path明细
     *
     * 查询 TOP Path明细
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopPathRequest 请求对象
     * @return SyncInvoker<ListCdnDomainTopPathRequest, ListCdnDomainTopPathResponse>
     */
    public SyncInvoker<ListCdnDomainTopPathRequest, ListCdnDomainTopPathResponse> listCdnDomainTopPathInvoker(
        ListCdnDomainTopPathRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listCdnDomainTopPath, hcClient);
    }

    /**
     * 查询统计TOP100 referer数据明细
     *
     * - 查询TOP100 referer数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopRefersRequest 请求对象
     * @return ListCdnDomainTopRefersResponse
     */
    public ListCdnDomainTopRefersResponse listCdnDomainTopRefers(ListCdnDomainTopRefersRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listCdnDomainTopRefers);
    }

    /**
     * 查询统计TOP100 referer数据明细
     *
     * - 查询TOP100 referer数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopRefersRequest 请求对象
     * @return SyncInvoker<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse>
     */
    public SyncInvoker<ListCdnDomainTopRefersRequest, ListCdnDomainTopRefersResponse> listCdnDomainTopRefersInvoker(
        ListCdnDomainTopRefersRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listCdnDomainTopRefers, hcClient);
    }

    /**
     * 查询域名top ua统计分析数据
     *
     * - 统计分析TOP UA统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopUasRequest 请求对象
     * @return ListCdnDomainTopUasResponse
     */
    public ListCdnDomainTopUasResponse listCdnDomainTopUas(ListCdnDomainTopUasRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listCdnDomainTopUas);
    }

    /**
     * 查询域名top ua统计分析数据
     *
     * - 统计分析TOP UA统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCdnDomainTopUasRequest 请求对象
     * @return SyncInvoker<ListCdnDomainTopUasRequest, ListCdnDomainTopUasResponse>
     */
    public SyncInvoker<ListCdnDomainTopUasRequest, ListCdnDomainTopUasResponse> listCdnDomainTopUasInvoker(
        ListCdnDomainTopUasRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listCdnDomainTopUas, hcClient);
    }

    /**
     * 按域名维度查询每天客户端访问详情统计
     *
     * - 按域名维度查询每天客户端访问详情统计。
     * - 支持查询90天内的数据。
     * - ip_num查询跨度只支持1天,uv查询跨度只支持5分钟。
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2022-07-12 00:00:00 到 2022-07-13 00:00:00 的数据，表示取 [2022-07-12 00:00:00, 2022-07-13 00:00:00)的统计数据。
     * - ip_num开始时间、结束时间必须传毫秒级时间戳，必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * - uv必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainClientStatsRequest 请求对象
     * @return ListDomainClientStatsResponse
     */
    public ListDomainClientStatsResponse listDomainClientStats(ListDomainClientStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listDomainClientStats);
    }

    /**
     * 按域名维度查询每天客户端访问详情统计
     *
     * - 按域名维度查询每天客户端访问详情统计。
     * - 支持查询90天内的数据。
     * - ip_num查询跨度只支持1天,uv查询跨度只支持5分钟。
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2022-07-12 00:00:00 到 2022-07-13 00:00:00 的数据，表示取 [2022-07-12 00:00:00, 2022-07-13 00:00:00)的统计数据。
     * - ip_num开始时间、结束时间必须传毫秒级时间戳，必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * - uv必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainClientStatsRequest 请求对象
     * @return SyncInvoker<ListDomainClientStatsRequest, ListDomainClientStatsResponse>
     */
    public SyncInvoker<ListDomainClientStatsRequest, ListDomainClientStatsResponse> listDomainClientStatsInvoker(
        ListDomainClientStatsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listDomainClientStats, hcClient);
    }

    /**
     * 查询加速域名基础信息
     *
     * 查询加速域名的基础信息，包含cname状态、加速域名是否支持复制配置。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainConfigsRequest 请求对象
     * @return ListDomainConfigsResponse
     */
    public ListDomainConfigsResponse listDomainConfigs(ListDomainConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listDomainConfigs);
    }

    /**
     * 查询加速域名基础信息
     *
     * 查询加速域名的基础信息，包含cname状态、加速域名是否支持复制配置。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainConfigsRequest 请求对象
     * @return SyncInvoker<ListDomainConfigsRequest, ListDomainConfigsResponse>
     */
    public SyncInvoker<ListDomainConfigsRequest, ListDomainConfigsResponse> listDomainConfigsInvoker(
        ListDomainConfigsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listDomainConfigs, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listDomains);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listDomains, hcClient);
    }

    /**
     * 分页查询统计数据异步导出
     *
     * 分页查询统计数据异步导出任务，按修改时间降序排列，当任务状态为success时，返回参数中会包含download_link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return ListExportTasksResponse
     */
    public ListExportTasksResponse listExportTasks(ListExportTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listExportTasks);
    }

    /**
     * 分页查询统计数据异步导出
     *
     * 分页查询统计数据异步导出任务，按修改时间降序排列，当任务状态为success时，返回参数中会包含download_link
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListExportTasksRequest 请求对象
     * @return SyncInvoker<ListExportTasksRequest, ListExportTasksResponse>
     */
    public SyncInvoker<ListExportTasksRequest, ListExportTasksResponse> listExportTasksInvoker(
        ListExportTasksRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listExportTasks, hcClient);
    }

    /**
     * 查询规则引擎列表
     *
     * 查询规则引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleDetailsRequest 请求对象
     * @return ListRuleDetailsResponse
     */
    public ListRuleDetailsResponse listRuleDetails(ListRuleDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listRuleDetails);
    }

    /**
     * 查询规则引擎列表
     *
     * 查询规则引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRuleDetailsRequest 请求对象
     * @return SyncInvoker<ListRuleDetailsRequest, ListRuleDetailsResponse>
     */
    public SyncInvoker<ListRuleDetailsRequest, ListRuleDetailsResponse> listRuleDetailsInvoker(
        ListRuleDetailsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listRuleDetails, hcClient);
    }

    /**
     * 查询共享缓存组列表
     *
     * 查询共享缓存组列表。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareCacheGroupsRequest 请求对象
     * @return ListShareCacheGroupsResponse
     */
    public ListShareCacheGroupsResponse listShareCacheGroups(ListShareCacheGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listShareCacheGroups);
    }

    /**
     * 查询共享缓存组列表
     *
     * 查询共享缓存组列表。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListShareCacheGroupsRequest 请求对象
     * @return SyncInvoker<ListShareCacheGroupsRequest, ListShareCacheGroupsResponse>
     */
    public SyncInvoker<ListShareCacheGroupsRequest, ListShareCacheGroupsResponse> listShareCacheGroupsInvoker(
        ListShareCacheGroupsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listShareCacheGroups, hcClient);
    }

    /**
     * 查询加速域名的特殊配置
     *
     * 查询加速域名的特殊配置，当前支持查询备忘录信息。
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialConfigurationRequest 请求对象
     * @return ListSpecialConfigurationResponse
     */
    public ListSpecialConfigurationResponse listSpecialConfiguration(ListSpecialConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listSpecialConfiguration);
    }

    /**
     * 查询加速域名的特殊配置
     *
     * 查询加速域名的特殊配置，当前支持查询备忘录信息。
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSpecialConfigurationRequest 请求对象
     * @return SyncInvoker<ListSpecialConfigurationRequest, ListSpecialConfigurationResponse>
     */
    public SyncInvoker<ListSpecialConfigurationRequest, ListSpecialConfigurationResponse> listSpecialConfigurationInvoker(
        ListSpecialConfigurationRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listSpecialConfiguration, hcClient);
    }

    /**
     * 分页查询运营报表订阅任务
     *
     * query subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionTasksRequest 请求对象
     * @return ListSubscriptionTasksResponse
     */
    public ListSubscriptionTasksResponse listSubscriptionTasks(ListSubscriptionTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listSubscriptionTasks);
    }

    /**
     * 分页查询运营报表订阅任务
     *
     * query subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubscriptionTasksRequest 请求对象
     * @return SyncInvoker<ListSubscriptionTasksRequest, ListSubscriptionTasksResponse>
     */
    public SyncInvoker<ListSubscriptionTasksRequest, ListSubscriptionTasksResponse> listSubscriptionTasksInvoker(
        ListSubscriptionTasksRequest request) {
        return new SyncInvoker<>(request, CdnMeta.listSubscriptionTasks, hcClient);
    }

    /**
     * 修改租户配置
     *
     * 修改租户配置，当前仅支持开启OBS和SCM委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAccountInfoRequest 请求对象
     * @return ModifyAccountInfoResponse
     */
    public ModifyAccountInfoResponse modifyAccountInfo(ModifyAccountInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.modifyAccountInfo);
    }

    /**
     * 修改租户配置
     *
     * 修改租户配置，当前仅支持开启OBS和SCM委托授权。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyAccountInfoRequest 请求对象
     * @return SyncInvoker<ModifyAccountInfoRequest, ModifyAccountInfoResponse>
     */
    public SyncInvoker<ModifyAccountInfoRequest, ModifyAccountInfoResponse> modifyAccountInfoInvoker(
        ModifyAccountInfoRequest request) {
        return new SyncInvoker<>(request, CdnMeta.modifyAccountInfo, hcClient);
    }

    /**
     * 设置用户计费模式
     *
     * - 设置用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内）
     * 
     * - 计费模式仅支持设置flux（流量），v2及以上客户支持bw（带宽）
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetChargeModesRequest 请求对象
     * @return SetChargeModesResponse
     */
    public SetChargeModesResponse setChargeModes(SetChargeModesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.setChargeModes);
    }

    /**
     * 设置用户计费模式
     *
     * - 设置用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内）
     * 
     * - 计费模式仅支持设置flux（流量），v2及以上客户支持bw（带宽）
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：10次/min。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetChargeModesRequest 请求对象
     * @return SyncInvoker<SetChargeModesRequest, SetChargeModesResponse>
     */
    public SyncInvoker<SetChargeModesRequest, SetChargeModesResponse> setChargeModesInvoker(
        SetChargeModesRequest request) {
        return new SyncInvoker<>(request, CdnMeta.setChargeModes, hcClient);
    }

    /**
     * 设置统计配置
     *
     * - 设置统计配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetStatsConfigRequest 请求对象
     * @return SetStatsConfigResponse
     */
    public SetStatsConfigResponse setStatsConfig(SetStatsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.setStatsConfig);
    }

    /**
     * 设置统计配置
     *
     * - 设置统计配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetStatsConfigRequest 请求对象
     * @return SyncInvoker<SetStatsConfigRequest, SetStatsConfigResponse>
     */
    public SyncInvoker<SetStatsConfigRequest, SetStatsConfigResponse> setStatsConfigInvoker(
        SetStatsConfigRequest request) {
        return new SyncInvoker<>(request, CdnMeta.setStatsConfig, hcClient);
    }

    /**
     * 查询域名模板应用记录。
     *
     * 查询域名模板应用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppliedTemplateRecordRequest 请求对象
     * @return ShowAppliedTemplateRecordResponse
     */
    public ShowAppliedTemplateRecordResponse showAppliedTemplateRecord(ShowAppliedTemplateRecordRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showAppliedTemplateRecord);
    }

    /**
     * 查询域名模板应用记录。
     *
     * 查询域名模板应用记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAppliedTemplateRecordRequest 请求对象
     * @return SyncInvoker<ShowAppliedTemplateRecordRequest, ShowAppliedTemplateRecordResponse>
     */
    public SyncInvoker<ShowAppliedTemplateRecordRequest, ShowAppliedTemplateRecordResponse> showAppliedTemplateRecordInvoker(
        ShowAppliedTemplateRecordRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showAppliedTemplateRecord, hcClient);
    }

    /**
     * 查询域名带宽峰值类数据
     *
     * - 查询域名带宽峰值类数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、峰值类指标单位统一为bps（比特率），请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthCalcRequest 请求对象
     * @return ShowBandwidthCalcResponse
     */
    @Deprecated
    public ShowBandwidthCalcResponse showBandwidthCalc(ShowBandwidthCalcRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showBandwidthCalc);
    }

    /**
     * 查询域名带宽峰值类数据
     *
     * - 查询域名带宽峰值类数据。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传毫秒级时间戳，起始时间和结束时间必须同时指定。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、峰值类指标单位统一为bps（比特率），请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：2次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBandwidthCalcRequest 请求对象
     * @return SyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>
     */
    @Deprecated
    public SyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalcInvoker(
        ShowBandwidthCalcRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showBandwidthCalc, hcClient);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return ShowCertificatesHttpsInfoResponse
     */
    public ShowCertificatesHttpsInfoResponse showCertificatesHttpsInfo(ShowCertificatesHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showCertificatesHttpsInfo);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>
     */
    public SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    /**
     * 查询用户计费模式
     *
     * - 查询用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内，默认）和outside_mainland_china（海外）
     * 
     * - 计费模式状态支持active（已生效），upcoming（待生效）两种状态，默认为active(已生效)
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChargeModesRequest 请求对象
     * @return ShowChargeModesResponse
     */
    public ShowChargeModesResponse showChargeModes(ShowChargeModesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showChargeModes);
    }

    /**
     * 查询用户计费模式
     *
     * - 查询用户计费模式。
     * 
     * - 服务区域仅支持mainland_china（国内，默认）和outside_mainland_china（海外）
     * 
     * - 计费模式状态支持active（已生效），upcoming（待生效）两种状态，默认为active(已生效)
     * 
     * - 加速类型仅支持base（基础加速）
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChargeModesRequest 请求对象
     * @return SyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>
     */
    public SyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModesInvoker(
        ShowChargeModesRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showChargeModes, hcClient);
    }

    /**
     * CDN查询域名的国家统计数据
     *
     * CDN查询域名的国家统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCountryStatRequest 请求对象
     * @return ShowDomainCountryStatResponse
     */
    public ShowDomainCountryStatResponse showDomainCountryStat(ShowDomainCountryStatRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainCountryStat);
    }

    /**
     * CDN查询域名的国家统计数据
     *
     * CDN查询域名的国家统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainCountryStatRequest 请求对象
     * @return SyncInvoker<ShowDomainCountryStatRequest, ShowDomainCountryStatResponse>
     */
    public SyncInvoker<ShowDomainCountryStatRequest, ShowDomainCountryStatResponse> showDomainCountryStatInvoker(
        ShowDomainCountryStatRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainCountryStat, hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 加速域名详情信息接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailByNameRequest 请求对象
     * @return ShowDomainDetailByNameResponse
     */
    public ShowDomainDetailByNameResponse showDomainDetailByName(ShowDomainDetailByNameRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainDetailByName);
    }

    /**
     * 查询加速域名详情
     *
     * 加速域名详情信息接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailByNameRequest 请求对象
     * @return SyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse>
     */
    public SyncInvoker<ShowDomainDetailByNameRequest, ShowDomainDetailByNameResponse> showDomainDetailByNameInvoker(
        ShowDomainDetailByNameRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainDetailByName, hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return ShowDomainFullConfigResponse
     */
    public ShowDomainFullConfigResponse showDomainFullConfig(ShowDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持查询业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、 Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    public SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigInvoker(
        ShowDomainFullConfigRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainFullConfig, hcClient);
    }

    /**
     * 按区域运营商查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：location_detail,location_summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLocationStatsRequest 请求对象
     * @return ShowDomainLocationStatsResponse
     */
    public ShowDomainLocationStatsResponse showDomainLocationStats(ShowDomainLocationStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    /**
     * 按区域运营商查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：location_detail,location_summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainLocationStatsRequest 请求对象
     * @return SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    public SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsInvoker(
        ShowDomainLocationStatsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainLocationStats, hcClient);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：detail,summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatsRequest 请求对象
     * @return ShowDomainStatsResponse
     */
    public ShowDomainStatsResponse showDomainStats(ShowDomainStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * 
     * - 支持多指标同时查询，不超过5个。
     * 
     * - 最多同时指定20个域名。
     * 
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，且时间点必须为与查询时间间隔参数匹配的整时刻点。比如查询时间间隔为5分钟时，起始时间和结束时间必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果时间点与时间间隔不匹配，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * 
     * - action取值：detail,summary
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：15次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainStatsRequest 请求对象
     * @return SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    public SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsInvoker(
        ShowDomainStatsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainStats, hcClient);
    }

    /**
     * 查询域名模板列表
     *
     * 查询域名模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainTemplateRequest 请求对象
     * @return ShowDomainTemplateResponse
     */
    public ShowDomainTemplateResponse showDomainTemplate(ShowDomainTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainTemplate);
    }

    /**
     * 查询域名模板列表
     *
     * 查询域名模板列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainTemplateRequest 请求对象
     * @return SyncInvoker<ShowDomainTemplateRequest, ShowDomainTemplateResponse>
     */
    public SyncInvoker<ShowDomainTemplateRequest, ShowDomainTemplateResponse> showDomainTemplateInvoker(
        ShowDomainTemplateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showDomainTemplate, hcClient);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return ShowHistoryTaskDetailsResponse
     */
    public ShowHistoryTaskDetailsResponse showHistoryTaskDetails(ShowHistoryTaskDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHistoryTaskDetails);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>
     */
    public SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showHistoryTaskDetails, hcClient);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return ShowHistoryTasksResponse
     */
    public ShowHistoryTasksResponse showHistoryTasks(ShowHistoryTasksRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHistoryTasks);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>
     */
    public SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksInvoker(
        ShowHistoryTasksRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showHistoryTasks, hcClient);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return ShowIpInfoResponse
     */
    public ShowIpInfoResponse showIpInfo(ShowIpInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showIpInfo);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>
     */
    public SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoInvoker(ShowIpInfoRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showIpInfo, hcClient);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return ShowLogsResponse
     */
    public ShowLogsResponse showLogs(ShowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showLogs);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return SyncInvoker<ShowLogsRequest, ShowLogsResponse>
     */
    public SyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsInvoker(ShowLogsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showLogs, hcClient);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return ShowQuotaResponse
     */
    public ShowQuotaResponse showQuota(ShowQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showQuota);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showQuota, hcClient);
    }

    /**
     * 查询CDN特殊用户接口
     *
     * 查询CDN特殊用户接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecialUserRequest 请求对象
     * @return ShowSpecialUserResponse
     */
    public ShowSpecialUserResponse showSpecialUser(ShowSpecialUserRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showSpecialUser);
    }

    /**
     * 查询CDN特殊用户接口
     *
     * 查询CDN特殊用户接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowSpecialUserRequest 请求对象
     * @return SyncInvoker<ShowSpecialUserRequest, ShowSpecialUserResponse>
     */
    public SyncInvoker<ShowSpecialUserRequest, ShowSpecialUserResponse> showSpecialUserInvoker(
        ShowSpecialUserRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showSpecialUser, hcClient);
    }

    /**
     * 查询统计配置
     *
     * - 配置类型：目前支持，
     * - 0：热点统计。
     * - 1：ces上报。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatsConfigsRequest 请求对象
     * @return ShowStatsConfigsResponse
     */
    public ShowStatsConfigsResponse showStatsConfigs(ShowStatsConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showStatsConfigs);
    }

    /**
     * 查询统计配置
     *
     * - 配置类型：目前支持，
     * - 0：热点统计。
     * - 1：ces上报。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowStatsConfigsRequest 请求对象
     * @return SyncInvoker<ShowStatsConfigsRequest, ShowStatsConfigsResponse>
     */
    public SyncInvoker<ShowStatsConfigsRequest, ShowStatsConfigsResponse> showStatsConfigsInvoker(
        ShowStatsConfigsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showStatsConfigs, hcClient);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return ShowTagsResponse
     */
    public ShowTagsResponse showTags(ShowTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showTags);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showTags, hcClient);
    }

    /**
     * 查询TOP域名
     *
     * - 查询TOP域名。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过1天。
     * 
     * - 起始时间和结束时间，左闭右开，必须同时指定。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传整点毫秒级时间戳。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopDomainNamesRequest 请求对象
     * @return ShowTopDomainNamesResponse
     */
    @Deprecated
    public ShowTopDomainNamesResponse showTopDomainNames(ShowTopDomainNamesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showTopDomainNames);
    }

    /**
     * 查询TOP域名
     *
     * - 查询TOP域名。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询时间跨度不能超过1天。
     * 
     * - 起始时间和结束时间，左闭右开，必须同时指定。如查询2022-10-24 00:00:00 到 2022-10-25 00:00:00 的数据，表示取 [2022-10-24 00:00:00, 2022-10-25 00:00:00)的统计数据。
     * 
     * - 起始时间、结束时间必须传整点毫秒级时间戳。
     * 
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopDomainNamesRequest 请求对象
     * @return SyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>
     */
    @Deprecated
    public SyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNamesInvoker(
        ShowTopDomainNamesRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showTopDomainNames, hcClient);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * 
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * 
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopUrlRequest 请求对象
     * @return ShowTopUrlResponse
     */
    public ShowTopUrlResponse showTopUrl(ShowTopUrlRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * 
     * - 支持查询90天内的数据。
     * 
     * - 查询跨度不能超过31天。
     * 
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * 
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * 
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * 
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTopUrlRequest 请求对象
     * @return SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    public SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlInvoker(ShowTopUrlRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return ShowUrlTaskInfoResponse
     */
    public ShowUrlTaskInfoResponse showUrlTaskInfo(ShowUrlTaskInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showUrlTaskInfo);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>
     */
    public SyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfoInvoker(
        ShowUrlTaskInfoRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showUrlTaskInfo, hcClient);
    }

    /**
     * 查询域名归属校验信息
     *
     * 用于查询域名归属校验信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVerifyDomainOwnerInfoRequest 请求对象
     * @return ShowVerifyDomainOwnerInfoResponse
     */
    public ShowVerifyDomainOwnerInfoResponse showVerifyDomainOwnerInfo(ShowVerifyDomainOwnerInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showVerifyDomainOwnerInfo);
    }

    /**
     * 查询域名归属校验信息
     *
     * 用于查询域名归属校验信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowVerifyDomainOwnerInfoRequest 请求对象
     * @return SyncInvoker<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse>
     */
    public SyncInvoker<ShowVerifyDomainOwnerInfoRequest, ShowVerifyDomainOwnerInfoResponse> showVerifyDomainOwnerInfoInvoker(
        ShowVerifyDomainOwnerInfoRequest request) {
        return new SyncInvoker<>(request, CdnMeta.showVerifyDomainOwnerInfo, hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return UpdateDomainFullConfigResponse
     */
    public UpdateDomainFullConfigResponse updateDomainFullConfig(UpdateDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，支持修改业务类型、服务范围、备注、IPv6开关、回源方式、回源URL改写、高级回源、Range回源、回源跟随、回源是否校验Etag、回源超时时间、回源请求头、HTTPS配置、TLS版本配置、强制跳转、HSTS、HTTP/2、OCSP Stapling、QUIC、缓存规则、状态码缓存时间、防盗链、IP黑白名单、Use-Agent黑白名单、URL鉴权配置、远程鉴权配置、IP访问限频、HTTP header配置、自定义错误页面配置、智能压缩、请求限速配置、WebSocket配置、视频拖拽、回源SNI、访问URL重写、浏览器缓存过期时间、区域访问控制。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    public SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigInvoker(
        UpdateDomainFullConfigRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateDomainFullConfig, hcClient);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return UpdateDomainMultiCertificatesResponse
     */
    public UpdateDomainMultiCertificatesResponse updateDomainMultiCertificates(
        UpdateDomainMultiCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainMultiCertificates);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>
     */
    public SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    /**
     * 修改域名模板。
     *
     * 修改域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainTemplateRequest 请求对象
     * @return UpdateDomainTemplateResponse
     */
    public UpdateDomainTemplateResponse updateDomainTemplate(UpdateDomainTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainTemplate);
    }

    /**
     * 修改域名模板。
     *
     * 修改域名模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainTemplateRequest 请求对象
     * @return SyncInvoker<UpdateDomainTemplateRequest, UpdateDomainTemplateResponse>
     */
    public SyncInvoker<UpdateDomainTemplateRequest, UpdateDomainTemplateResponse> updateDomainTemplateInvoker(
        UpdateDomainTemplateRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateDomainTemplate, hcClient);
    }

    /**
     * 全量更新规则引擎规则
     *
     * 全量更新规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullRuleRequest 请求对象
     * @return UpdateFullRuleResponse
     */
    public UpdateFullRuleResponse updateFullRule(UpdateFullRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateFullRule);
    }

    /**
     * 全量更新规则引擎规则
     *
     * 全量更新规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFullRuleRequest 请求对象
     * @return SyncInvoker<UpdateFullRuleRequest, UpdateFullRuleResponse>
     */
    public SyncInvoker<UpdateFullRuleRequest, UpdateFullRuleResponse> updateFullRuleInvoker(
        UpdateFullRuleRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateFullRule, hcClient);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return UpdatePrivateBucketAccessResponse
     */
    public UpdatePrivateBucketAccessResponse updatePrivateBucketAccess(UpdatePrivateBucketAccessRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updatePrivateBucketAccess);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>
     */
    public SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    /**
     * 更新规则引擎规则
     *
     * 更新规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleNewRequest 请求对象
     * @return UpdateRuleNewResponse
     */
    public UpdateRuleNewResponse updateRuleNew(UpdateRuleNewRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateRuleNew);
    }

    /**
     * 更新规则引擎规则
     *
     * 更新规则引擎规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRuleNewRequest 请求对象
     * @return SyncInvoker<UpdateRuleNewRequest, UpdateRuleNewResponse>
     */
    public SyncInvoker<UpdateRuleNewRequest, UpdateRuleNewResponse> updateRuleNewInvoker(UpdateRuleNewRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateRuleNew, hcClient);
    }

    /**
     * 更新共享缓存组
     *
     * 更新共享缓存组。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareCacheGroupsRequest 请求对象
     * @return UpdateShareCacheGroupsResponse
     */
    public UpdateShareCacheGroupsResponse updateShareCacheGroups(UpdateShareCacheGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateShareCacheGroups);
    }

    /**
     * 更新共享缓存组
     *
     * 更新共享缓存组。
     * - 单租户调用频率：5次/s。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateShareCacheGroupsRequest 请求对象
     * @return SyncInvoker<UpdateShareCacheGroupsRequest, UpdateShareCacheGroupsResponse>
     */
    public SyncInvoker<UpdateShareCacheGroupsRequest, UpdateShareCacheGroupsResponse> updateShareCacheGroupsInvoker(
        UpdateShareCacheGroupsRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateShareCacheGroups, hcClient);
    }

    /**
     * 修改运营报表订阅任务
     *
     * modify subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTaskRequest 请求对象
     * @return UpdateSubscriptionTaskResponse
     */
    public UpdateSubscriptionTaskResponse updateSubscriptionTask(UpdateSubscriptionTaskRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateSubscriptionTask);
    }

    /**
     * 修改运营报表订阅任务
     *
     * modify subscription task
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSubscriptionTaskRequest 请求对象
     * @return SyncInvoker<UpdateSubscriptionTaskRequest, UpdateSubscriptionTaskResponse>
     */
    public SyncInvoker<UpdateSubscriptionTaskRequest, UpdateSubscriptionTaskResponse> updateSubscriptionTaskInvoker(
        UpdateSubscriptionTaskRequest request) {
        return new SyncInvoker<>(request, CdnMeta.updateSubscriptionTask, hcClient);
    }

    /**
     * 域名归属校验
     *
     * 用于域名归属校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyDomainOwnerRequest 请求对象
     * @return VerifyDomainOwnerResponse
     */
    public VerifyDomainOwnerResponse verifyDomainOwner(VerifyDomainOwnerRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.verifyDomainOwner);
    }

    /**
     * 域名归属校验
     *
     * 用于域名归属校验
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyDomainOwnerRequest 请求对象
     * @return SyncInvoker<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse>
     */
    public SyncInvoker<VerifyDomainOwnerRequest, VerifyDomainOwnerResponse> verifyDomainOwnerInvoker(
        VerifyDomainOwnerRequest request) {
        return new SyncInvoker<>(request, CdnMeta.verifyDomainOwner, hcClient);
    }

}
