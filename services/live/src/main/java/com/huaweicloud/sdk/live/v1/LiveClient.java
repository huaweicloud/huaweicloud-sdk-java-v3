package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsRequest;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.CreateFlowsRequest;
import com.huaweicloud.sdk.live.v1.model.CreateFlowsResponse;
import com.huaweicloud.sdk.live.v1.model.CreateHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.CreateHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.CreateScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.CreateScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenOnceRequest;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenOnceResponse;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.CreateStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.CreateTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateUrlAuthchainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteFlowResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListFlowsRequest;
import com.huaweicloud.sdk.live.v1.model.ListFlowsResponse;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.ListHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.ListHlsConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListHlsConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListRequest;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineResponse;
import com.huaweicloud.sdk.live.v1.model.ListOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.ListOttChannelInfoResponse;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.live.v1.model.ListScheduleRecordTasksRequest;
import com.huaweicloud.sdk.live.v1.model.ListScheduleRecordTasksResponse;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowSourcesRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowSourcesResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStartRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStartResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStopRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyFlowStopResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyHarvestTaskRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyHarvestTaskResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEncoderSettingsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEncoderSettingsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEndPointsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoEndPointsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoGeneralRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoGeneralResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoInputRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoInputResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoRecordSettingsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoRecordSettingsResponse;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoStatsRequest;
import com.huaweicloud.sdk.live.v1.model.ModifyOttChannelInfoStatsResponse;
import com.huaweicloud.sdk.live.v1.model.RunRecordRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordResponse;
import com.huaweicloud.sdk.live.v1.model.SetRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.SetRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowChannelStatisticRequest;
import com.huaweicloud.sdk.live.v1.model.ShowChannelStatisticResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowFlowDetailRequest;
import com.huaweicloud.sdk.live.v1.model.ShowFlowDetailResponse;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRefererChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRefererChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ShowTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainIp6SwitchRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainIp6SwitchResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateGeoBlockingConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateHarvestJobStatusRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateHarvestJobStatusResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateHlsConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateHlsConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateIpAuthListRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateIpAuthListResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateObsBucketAuthorityPublicRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateObsBucketAuthorityPublicResponse;
import com.huaweicloud.sdk.live.v1.model.UpdatePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.UpdatePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.UpdatePullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdatePullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.UpdateTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.UpdateTranscodingsTemplateResponse;

public class LiveClient {

    protected HcClient hcClient;

    public LiveClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveClient> newBuilder() {
        ClientBuilder<LiveClient> clientBuilder = new ClientBuilder<>(LiveClient::new);
        return clientBuilder;
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowIpBelongsRequest 请求对象
     * @return BatchShowIpBelongsResponse
     */
    public BatchShowIpBelongsResponse batchShowIpBelongs(BatchShowIpBelongsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.batchShowIpBelongs);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowIpBelongsRequest 请求对象
     * @return SyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>
     */
    public SyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongsInvoker(
        BatchShowIpBelongsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.batchShowIpBelongs, hcClient);
    }

    /**
     * 创建直播域名
     *
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createDomain);
    }

    /**
     * 创建直播域名
     *
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createDomain, hcClient);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainMappingRequest 请求对象
     * @return CreateDomainMappingResponse
     */
    public CreateDomainMappingResponse createDomainMapping(CreateDomainMappingRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createDomainMapping);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainMappingRequest 请求对象
     * @return SyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>
     */
    public SyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMappingInvoker(
        CreateDomainMappingRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createDomainMapping, hcClient);
    }

    /**
     * 创建流
     *
     * 创建流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowsRequest 请求对象
     * @return CreateFlowsResponse
     */
    public CreateFlowsResponse createFlows(CreateFlowsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createFlows);
    }

    /**
     * 创建流
     *
     * 创建流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFlowsRequest 请求对象
     * @return SyncInvoker<CreateFlowsRequest, CreateFlowsResponse>
     */
    public SyncInvoker<CreateFlowsRequest, CreateFlowsResponse> createFlowsInvoker(CreateFlowsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createFlows, hcClient);
    }

    /**
     * 创建录制回调配置
     *
     * 创建录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordCallbackConfigRequest 请求对象
     * @return CreateRecordCallbackConfigResponse
     */
    public CreateRecordCallbackConfigResponse createRecordCallbackConfig(CreateRecordCallbackConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createRecordCallbackConfig);
    }

    /**
     * 创建录制回调配置
     *
     * 创建录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>
     */
    public SyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfigInvoker(
        CreateRecordCallbackConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createRecordCallbackConfig, hcClient);
    }

    /**
     * 创建录制视频索引文件
     *
     * Create Record Index
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordIndexRequest 请求对象
     * @return CreateRecordIndexResponse
     */
    public CreateRecordIndexResponse createRecordIndex(CreateRecordIndexRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createRecordIndex);
    }

    /**
     * 创建录制视频索引文件
     *
     * Create Record Index
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordIndexRequest 请求对象
     * @return SyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>
     */
    public SyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndexInvoker(
        CreateRecordIndexRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createRecordIndex, hcClient);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return CreateRecordRuleResponse
     */
    public CreateRecordRuleResponse createRecordRule(CreateRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createRecordRule);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleInvoker(
        CreateRecordRuleRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createRecordRule, hcClient);
    }

    /**
     * 创建计划录制任务
     *
     * 通过使用指定录制模板ID对应的配置创建一个在指定时间启动、结束的录制任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRecordTasksRequest 请求对象
     * @return CreateScheduleRecordTasksResponse
     */
    public CreateScheduleRecordTasksResponse createScheduleRecordTasks(CreateScheduleRecordTasksRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createScheduleRecordTasks);
    }

    /**
     * 创建计划录制任务
     *
     * 通过使用指定录制模板ID对应的配置创建一个在指定时间启动、结束的录制任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateScheduleRecordTasksRequest 请求对象
     * @return SyncInvoker<CreateScheduleRecordTasksRequest, CreateScheduleRecordTasksResponse>
     */
    public SyncInvoker<CreateScheduleRecordTasksRequest, CreateScheduleRecordTasksResponse> createScheduleRecordTasksInvoker(
        CreateScheduleRecordTasksRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createScheduleRecordTasks, hcClient);
    }

    /**
     * 创建直播截图配置
     *
     * 创建直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotConfigRequest 请求对象
     * @return CreateSnapshotConfigResponse
     */
    public CreateSnapshotConfigResponse createSnapshotConfig(CreateSnapshotConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createSnapshotConfig);
    }

    /**
     * 创建直播截图配置
     *
     * 创建直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotConfigRequest 请求对象
     * @return SyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>
     */
    public SyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfigInvoker(
        CreateSnapshotConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createSnapshotConfig, hcClient);
    }

    /**
     * 禁止直播推流
     *
     * 禁止直播推流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenRequest 请求对象
     * @return CreateStreamForbiddenResponse
     */
    public CreateStreamForbiddenResponse createStreamForbidden(CreateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createStreamForbidden);
    }

    /**
     * 禁止直播推流
     *
     * 禁止直播推流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenRequest 请求对象
     * @return SyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>
     */
    public SyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbiddenInvoker(
        CreateStreamForbiddenRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createStreamForbidden, hcClient);
    }

    /**
     * 禁推闪断
     *
     * 直播推流闪断接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenOnceRequest 请求对象
     * @return CreateStreamForbiddenOnceResponse
     */
    public CreateStreamForbiddenOnceResponse createStreamForbiddenOnce(CreateStreamForbiddenOnceRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createStreamForbiddenOnce);
    }

    /**
     * 禁推闪断
     *
     * 直播推流闪断接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenOnceRequest 请求对象
     * @return SyncInvoker<CreateStreamForbiddenOnceRequest, CreateStreamForbiddenOnceResponse>
     */
    public SyncInvoker<CreateStreamForbiddenOnceRequest, CreateStreamForbiddenOnceResponse> createStreamForbiddenOnceInvoker(
        CreateStreamForbiddenOnceRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createStreamForbiddenOnce, hcClient);
    }

    /**
     * 创建直播转码模板
     *
     * 创建直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingsTemplateRequest 请求对象
     * @return CreateTranscodingsTemplateResponse
     */
    public CreateTranscodingsTemplateResponse createTranscodingsTemplate(CreateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createTranscodingsTemplate);
    }

    /**
     * 创建直播转码模板
     *
     * 创建直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>
     */
    public SyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplateInvoker(
        CreateTranscodingsTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createTranscodingsTemplate, hcClient);
    }

    /**
     * 生成URL鉴权串
     *
     * 生成URL鉴权串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUrlAuthchainRequest 请求对象
     * @return CreateUrlAuthchainResponse
     */
    public CreateUrlAuthchainResponse createUrlAuthchain(CreateUrlAuthchainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createUrlAuthchain);
    }

    /**
     * 生成URL鉴权串
     *
     * 生成URL鉴权串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUrlAuthchainRequest 请求对象
     * @return SyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>
     */
    public SyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> createUrlAuthchainInvoker(
        CreateUrlAuthchainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createUrlAuthchain, hcClient);
    }

    /**
     * 删除直播域名
     *
     * 删除域名。只有在域名停用（off）状态时才能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteDomain);
    }

    /**
     * 删除直播域名
     *
     * 删除域名。只有在域名停用（off）状态时才能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteDomain, hcClient);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainKeyChainRequest 请求对象
     * @return DeleteDomainKeyChainResponse
     */
    public DeleteDomainKeyChainResponse deleteDomainKeyChain(DeleteDomainKeyChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteDomainKeyChain);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainKeyChainRequest 请求对象
     * @return SyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>
     */
    public SyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChainInvoker(
        DeleteDomainKeyChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteDomainKeyChain, hcClient);
    }

    /**
     * 删除直播域名映射关系
     *
     * 将播放域名和推流域名的域名映射关系删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainMappingRequest 请求对象
     * @return DeleteDomainMappingResponse
     */
    public DeleteDomainMappingResponse deleteDomainMapping(DeleteDomainMappingRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteDomainMapping);
    }

    /**
     * 删除直播域名映射关系
     *
     * 将播放域名和推流域名的域名映射关系删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainMappingRequest 请求对象
     * @return SyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>
     */
    public SyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMappingInvoker(
        DeleteDomainMappingRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteDomainMapping, hcClient);
    }

    /**
     * 删除流
     *
     * 删除流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowRequest 请求对象
     * @return DeleteFlowResponse
     */
    public DeleteFlowResponse deleteFlow(DeleteFlowRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteFlow);
    }

    /**
     * 删除流
     *
     * 删除流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFlowRequest 请求对象
     * @return SyncInvoker<DeleteFlowRequest, DeleteFlowResponse>
     */
    public SyncInvoker<DeleteFlowRequest, DeleteFlowResponse> deleteFlowInvoker(DeleteFlowRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteFlow, hcClient);
    }

    /**
     * 删除直播推流通知配置
     *
     * 删除直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublishTemplateRequest 请求对象
     * @return DeletePublishTemplateResponse
     */
    public DeletePublishTemplateResponse deletePublishTemplate(DeletePublishTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deletePublishTemplate);
    }

    /**
     * 删除直播推流通知配置
     *
     * 删除直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublishTemplateRequest 请求对象
     * @return SyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>
     */
    public SyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse> deletePublishTemplateInvoker(
        DeletePublishTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deletePublishTemplate, hcClient);
    }

    /**
     * 删除录制回调配置
     *
     * 删除录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordCallbackConfigRequest 请求对象
     * @return DeleteRecordCallbackConfigResponse
     */
    public DeleteRecordCallbackConfigResponse deleteRecordCallbackConfig(DeleteRecordCallbackConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteRecordCallbackConfig);
    }

    /**
     * 删除录制回调配置
     *
     * 删除录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>
     */
    public SyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfigInvoker(
        DeleteRecordCallbackConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteRecordCallbackConfig, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 删除录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return DeleteRecordRuleResponse
     */
    public DeleteRecordRuleResponse deleteRecordRule(DeleteRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteRecordRule);
    }

    /**
     * 删除录制规则
     *
     * 删除录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleInvoker(
        DeleteRecordRuleRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteRecordRule, hcClient);
    }

    /**
     * 删除Referer防盗链黑白名单
     *
     * 删除Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRefererChainRequest 请求对象
     * @return DeleteRefererChainResponse
     */
    public DeleteRefererChainResponse deleteRefererChain(DeleteRefererChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteRefererChain);
    }

    /**
     * 删除Referer防盗链黑白名单
     *
     * 删除Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRefererChainRequest 请求对象
     * @return SyncInvoker<DeleteRefererChainRequest, DeleteRefererChainResponse>
     */
    public SyncInvoker<DeleteRefererChainRequest, DeleteRefererChainResponse> deleteRefererChainInvoker(
        DeleteRefererChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteRefererChain, hcClient);
    }

    /**
     * 停止计划录制任务
     *
     * 停止计划录制任务，当前的录制任务会中止并生产录制文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRecordTasksRequest 请求对象
     * @return DeleteScheduleRecordTasksResponse
     */
    public DeleteScheduleRecordTasksResponse deleteScheduleRecordTasks(DeleteScheduleRecordTasksRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteScheduleRecordTasks);
    }

    /**
     * 停止计划录制任务
     *
     * 停止计划录制任务，当前的录制任务会中止并生产录制文件。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteScheduleRecordTasksRequest 请求对象
     * @return SyncInvoker<DeleteScheduleRecordTasksRequest, DeleteScheduleRecordTasksResponse>
     */
    public SyncInvoker<DeleteScheduleRecordTasksRequest, DeleteScheduleRecordTasksResponse> deleteScheduleRecordTasksInvoker(
        DeleteScheduleRecordTasksRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteScheduleRecordTasks, hcClient);
    }

    /**
     * 删除直播截图配置
     *
     * 删除直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotConfigRequest 请求对象
     * @return DeleteSnapshotConfigResponse
     */
    public DeleteSnapshotConfigResponse deleteSnapshotConfig(DeleteSnapshotConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteSnapshotConfig);
    }

    /**
     * 删除直播截图配置
     *
     * 删除直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotConfigRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>
     */
    public SyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfigInvoker(
        DeleteSnapshotConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteSnapshotConfig, hcClient);
    }

    /**
     * 禁推恢复
     *
     * 恢复直播推流接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStreamForbiddenRequest 请求对象
     * @return DeleteStreamForbiddenResponse
     */
    public DeleteStreamForbiddenResponse deleteStreamForbidden(DeleteStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteStreamForbidden);
    }

    /**
     * 禁推恢复
     *
     * 恢复直播推流接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStreamForbiddenRequest 请求对象
     * @return SyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>
     */
    public SyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbiddenInvoker(
        DeleteStreamForbiddenRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteStreamForbidden, hcClient);
    }

    /**
     * 删除直播转码模板
     *
     * 删除直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingsTemplateRequest 请求对象
     * @return DeleteTranscodingsTemplateResponse
     */
    public DeleteTranscodingsTemplateResponse deleteTranscodingsTemplate(DeleteTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteTranscodingsTemplate);
    }

    /**
     * 删除直播转码模板
     *
     * 删除直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>
     */
    public SyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateInvoker(
        DeleteTranscodingsTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteTranscodingsTemplate, hcClient);
    }

    /**
     * 查询播放域名延时配置
     *
     * 查询播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelayConfigRequest 请求对象
     * @return ListDelayConfigResponse
     */
    public ListDelayConfigResponse listDelayConfig(ListDelayConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listDelayConfig);
    }

    /**
     * 查询播放域名延时配置
     *
     * 查询播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelayConfigRequest 请求对象
     * @return SyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>
     */
    public SyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse> listDelayConfigInvoker(
        ListDelayConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listDelayConfig, hcClient);
    }

    /**
     * 获取流列表
     *
     * 获取流列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowsRequest 请求对象
     * @return ListFlowsResponse
     */
    public ListFlowsResponse listFlows(ListFlowsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listFlows);
    }

    /**
     * 获取流列表
     *
     * 获取流列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlowsRequest 请求对象
     * @return SyncInvoker<ListFlowsRequest, ListFlowsResponse>
     */
    public SyncInvoker<ListFlowsRequest, ListFlowsResponse> listFlowsInvoker(ListFlowsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listFlows, hcClient);
    }

    /**
     * 获取地域限制配置列表
     *
     * 查询播放域名的地域限制列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoBlockingConfigRequest 请求对象
     * @return ListGeoBlockingConfigResponse
     */
    public ListGeoBlockingConfigResponse listGeoBlockingConfig(ListGeoBlockingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listGeoBlockingConfig);
    }

    /**
     * 获取地域限制配置列表
     *
     * 查询播放域名的地域限制列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoBlockingConfigRequest 请求对象
     * @return SyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>
     */
    public SyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> listGeoBlockingConfigInvoker(
        ListGeoBlockingConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listGeoBlockingConfig, hcClient);
    }

    /**
     * 查询域名HLS配置
     *
     * 查询域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHlsConfigRequest 请求对象
     * @return ListHlsConfigResponse
     */
    public ListHlsConfigResponse listHlsConfig(ListHlsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listHlsConfig);
    }

    /**
     * 查询域名HLS配置
     *
     * 查询域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHlsConfigRequest 请求对象
     * @return SyncInvoker<ListHlsConfigRequest, ListHlsConfigResponse>
     */
    public SyncInvoker<ListHlsConfigRequest, ListHlsConfigResponse> listHlsConfigInvoker(ListHlsConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listHlsConfig, hcClient);
    }

    /**
     * 查询IP黑/白名单
     *
     * 查询推流/播放域名的IP黑/白名单。
     * - 黑名单模式：禁止指定的IP或网段
     * - 白名单模式：仅允许指定的IP或网段
     * - 默认：全放通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpAuthListRequest 请求对象
     * @return ListIpAuthListResponse
     */
    public ListIpAuthListResponse listIpAuthList(ListIpAuthListRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listIpAuthList);
    }

    /**
     * 查询IP黑/白名单
     *
     * 查询推流/播放域名的IP黑/白名单。
     * - 黑名单模式：禁止指定的IP或网段
     * - 白名单模式：仅允许指定的IP或网段
     * - 默认：全放通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListIpAuthListRequest 请求对象
     * @return SyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>
     */
    public SyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse> listIpAuthListInvoker(
        ListIpAuthListRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listIpAuthList, hcClient);
    }

    /**
     * 获取直播播放日志
     *
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveSampleLogsRequest 请求对象
     * @return ListLiveSampleLogsResponse
     */
    public ListLiveSampleLogsResponse listLiveSampleLogs(ListLiveSampleLogsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listLiveSampleLogs);
    }

    /**
     * 获取直播播放日志
     *
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveSampleLogsRequest 请求对象
     * @return SyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>
     */
    public SyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogsInvoker(
        ListLiveSampleLogsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listLiveSampleLogs, hcClient);
    }

    /**
     * 查询直播中的流信息
     *
     * 查询直播中的流信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveStreamsOnlineRequest 请求对象
     * @return ListLiveStreamsOnlineResponse
     */
    public ListLiveStreamsOnlineResponse listLiveStreamsOnline(ListLiveStreamsOnlineRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listLiveStreamsOnline);
    }

    /**
     * 查询直播中的流信息
     *
     * 查询直播中的流信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveStreamsOnlineRequest 请求对象
     * @return SyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>
     */
    public SyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnlineInvoker(
        ListLiveStreamsOnlineRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listLiveStreamsOnline, hcClient);
    }

    /**
     * 查询直播推流通知配置
     *
     * 查询直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishTemplateRequest 请求对象
     * @return ListPublishTemplateResponse
     */
    public ListPublishTemplateResponse listPublishTemplate(ListPublishTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listPublishTemplate);
    }

    /**
     * 查询直播推流通知配置
     *
     * 查询直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishTemplateRequest 请求对象
     * @return SyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>
     */
    public SyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse> listPublishTemplateInvoker(
        ListPublishTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listPublishTemplate, hcClient);
    }

    /**
     * 查询录制回调配置列表
     *
     * 查询录制回调配置列表接口。通过指定条件，查询满足条件的配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordCallbackConfigsRequest 请求对象
     * @return ListRecordCallbackConfigsResponse
     */
    public ListRecordCallbackConfigsResponse listRecordCallbackConfigs(ListRecordCallbackConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listRecordCallbackConfigs);
    }

    /**
     * 查询录制回调配置列表
     *
     * 查询录制回调配置列表接口。通过指定条件，查询满足条件的配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordCallbackConfigsRequest 请求对象
     * @return SyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>
     */
    public SyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigsInvoker(
        ListRecordCallbackConfigsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listRecordCallbackConfigs, hcClient);
    }

    /**
     * 录制完成内容的查询
     *
     * 录制完成的内容查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordContentsRequest 请求对象
     * @return ListRecordContentsResponse
     */
    public ListRecordContentsResponse listRecordContents(ListRecordContentsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listRecordContents);
    }

    /**
     * 录制完成内容的查询
     *
     * 录制完成的内容查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordContentsRequest 请求对象
     * @return SyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>
     */
    public SyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContentsInvoker(
        ListRecordContentsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listRecordContents, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 查询录制规则列表接口，通过指定条件，查询满足条件的录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return ListRecordRulesResponse
     */
    public ListRecordRulesResponse listRecordRules(ListRecordRulesRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listRecordRules);
    }

    /**
     * 查询录制规则列表
     *
     * 查询录制规则列表接口，通过指定条件，查询满足条件的录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesInvoker(
        ListRecordRulesRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listRecordRules, hcClient);
    }

    /**
     * 查询计划录制任务
     *
     * 查询指定时间范围内启动和结束的计划录制任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleRecordTasksRequest 请求对象
     * @return ListScheduleRecordTasksResponse
     */
    public ListScheduleRecordTasksResponse listScheduleRecordTasks(ListScheduleRecordTasksRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listScheduleRecordTasks);
    }

    /**
     * 查询计划录制任务
     *
     * 查询指定时间范围内启动和结束的计划录制任务列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListScheduleRecordTasksRequest 请求对象
     * @return SyncInvoker<ListScheduleRecordTasksRequest, ListScheduleRecordTasksResponse>
     */
    public SyncInvoker<ListScheduleRecordTasksRequest, ListScheduleRecordTasksResponse> listScheduleRecordTasksInvoker(
        ListScheduleRecordTasksRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listScheduleRecordTasks, hcClient);
    }

    /**
     * 查询直播截图配置
     *
     * 查询直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotConfigsRequest 请求对象
     * @return ListSnapshotConfigsResponse
     */
    public ListSnapshotConfigsResponse listSnapshotConfigs(ListSnapshotConfigsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listSnapshotConfigs);
    }

    /**
     * 查询直播截图配置
     *
     * 查询直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotConfigsRequest 请求对象
     * @return SyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>
     */
    public SyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigsInvoker(
        ListSnapshotConfigsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listSnapshotConfigs, hcClient);
    }

    /**
     * 查询禁止直播推流列表
     *
     * 查询禁播黑名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStreamForbiddenRequest 请求对象
     * @return ListStreamForbiddenResponse
     */
    public ListStreamForbiddenResponse listStreamForbidden(ListStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listStreamForbidden);
    }

    /**
     * 查询禁止直播推流列表
     *
     * 查询禁播黑名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStreamForbiddenRequest 请求对象
     * @return SyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>
     */
    public SyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbiddenInvoker(
        ListStreamForbiddenRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listStreamForbidden, hcClient);
    }

    /**
     * 修改流来源
     *
     * 修改流来源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowSourcesRequest 请求对象
     * @return ModifyFlowSourcesResponse
     */
    public ModifyFlowSourcesResponse modifyFlowSources(ModifyFlowSourcesRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyFlowSources);
    }

    /**
     * 修改流来源
     *
     * 修改流来源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowSourcesRequest 请求对象
     * @return SyncInvoker<ModifyFlowSourcesRequest, ModifyFlowSourcesResponse>
     */
    public SyncInvoker<ModifyFlowSourcesRequest, ModifyFlowSourcesResponse> modifyFlowSourcesInvoker(
        ModifyFlowSourcesRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyFlowSources, hcClient);
    }

    /**
     * 启动流任务
     *
     * 启动流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowStartRequest 请求对象
     * @return ModifyFlowStartResponse
     */
    public ModifyFlowStartResponse modifyFlowStart(ModifyFlowStartRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyFlowStart);
    }

    /**
     * 启动流任务
     *
     * 启动流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowStartRequest 请求对象
     * @return SyncInvoker<ModifyFlowStartRequest, ModifyFlowStartResponse>
     */
    public SyncInvoker<ModifyFlowStartRequest, ModifyFlowStartResponse> modifyFlowStartInvoker(
        ModifyFlowStartRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyFlowStart, hcClient);
    }

    /**
     * 停止流任务
     *
     * 停止流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowStopRequest 请求对象
     * @return ModifyFlowStopResponse
     */
    public ModifyFlowStopResponse modifyFlowStop(ModifyFlowStopRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyFlowStop);
    }

    /**
     * 停止流任务
     *
     * 停止流任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyFlowStopRequest 请求对象
     * @return SyncInvoker<ModifyFlowStopRequest, ModifyFlowStopResponse>
     */
    public SyncInvoker<ModifyFlowStopRequest, ModifyFlowStopResponse> modifyFlowStopInvoker(
        ModifyFlowStopRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyFlowStop, hcClient);
    }

    /**
     * 提交录制控制命令
     *
     * 对单条流的实时录制控制接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRecordRequest 请求对象
     * @return RunRecordResponse
     */
    public RunRecordResponse runRecord(RunRecordRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.runRecord);
    }

    /**
     * 提交录制控制命令
     *
     * 对单条流的实时录制控制接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRecordRequest 请求对象
     * @return SyncInvoker<RunRecordRequest, RunRecordResponse>
     */
    public SyncInvoker<RunRecordRequest, RunRecordResponse> runRecordInvoker(RunRecordRequest request) {
        return new SyncInvoker<>(request, LiveMeta.runRecord, hcClient);
    }

    /**
     * 设置Referer防盗链黑白名单
     *
     * 设置Referer黑白名单，直播服务会根据配置的referer黑白名单，对访问者的身份进行识别和过滤，符合规则的可以顺利访问到该内容。如果不符合规则，该访问请求将会被禁止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRefererChainRequest 请求对象
     * @return SetRefererChainResponse
     */
    public SetRefererChainResponse setRefererChain(SetRefererChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.setRefererChain);
    }

    /**
     * 设置Referer防盗链黑白名单
     *
     * 设置Referer黑白名单，直播服务会根据配置的referer黑白名单，对访问者的身份进行识别和过滤，符合规则的可以顺利访问到该内容。如果不符合规则，该访问请求将会被禁止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRefererChainRequest 请求对象
     * @return SyncInvoker<SetRefererChainRequest, SetRefererChainResponse>
     */
    public SyncInvoker<SetRefererChainRequest, SetRefererChainResponse> setRefererChainInvoker(
        SetRefererChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.setRefererChain, hcClient);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return ShowDomainResponse
     */
    public ShowDomainResponse showDomain(ShowDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showDomain);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return SyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public SyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainInvoker(ShowDomainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showDomain, hcClient);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainKeyChainRequest 请求对象
     * @return ShowDomainKeyChainResponse
     */
    public ShowDomainKeyChainResponse showDomainKeyChain(ShowDomainKeyChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showDomainKeyChain);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainKeyChainRequest 请求对象
     * @return SyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>
     */
    public SyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChainInvoker(
        ShowDomainKeyChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showDomainKeyChain, hcClient);
    }

    /**
     * 获取流详情
     *
     * 获取流详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return ShowFlowDetailResponse
     */
    public ShowFlowDetailResponse showFlowDetail(ShowFlowDetailRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showFlowDetail);
    }

    /**
     * 获取流详情
     *
     * 获取流详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFlowDetailRequest 请求对象
     * @return SyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse>
     */
    public SyncInvoker<ShowFlowDetailRequest, ShowFlowDetailResponse> showFlowDetailInvoker(
        ShowFlowDetailRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showFlowDetail, hcClient);
    }

    /**
     * 查询直播拉流回源配置
     *
     * 查询直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPullSourcesConfigRequest 请求对象
     * @return ShowPullSourcesConfigResponse
     */
    public ShowPullSourcesConfigResponse showPullSourcesConfig(ShowPullSourcesConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showPullSourcesConfig);
    }

    /**
     * 查询直播拉流回源配置
     *
     * 查询直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPullSourcesConfigRequest 请求对象
     * @return SyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>
     */
    public SyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> showPullSourcesConfigInvoker(
        ShowPullSourcesConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showPullSourcesConfig, hcClient);
    }

    /**
     * 查询录制回调配置
     *
     * 查询录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackConfigRequest 请求对象
     * @return ShowRecordCallbackConfigResponse
     */
    public ShowRecordCallbackConfigResponse showRecordCallbackConfig(ShowRecordCallbackConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showRecordCallbackConfig);
    }

    /**
     * 查询录制回调配置
     *
     * 查询录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>
     */
    public SyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfigInvoker(
        ShowRecordCallbackConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showRecordCallbackConfig, hcClient);
    }

    /**
     * 查询录制规则配置
     *
     * 查询录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return ShowRecordRuleResponse
     */
    public ShowRecordRuleResponse showRecordRule(ShowRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showRecordRule);
    }

    /**
     * 查询录制规则配置
     *
     * 查询录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleInvoker(
        ShowRecordRuleRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showRecordRule, hcClient);
    }

    /**
     * 查询Referer防盗链黑白名单
     *
     * 查询Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefererChainRequest 请求对象
     * @return ShowRefererChainResponse
     */
    public ShowRefererChainResponse showRefererChain(ShowRefererChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showRefererChain);
    }

    /**
     * 查询Referer防盗链黑白名单
     *
     * 查询Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefererChainRequest 请求对象
     * @return SyncInvoker<ShowRefererChainRequest, ShowRefererChainResponse>
     */
    public SyncInvoker<ShowRefererChainRequest, ShowRefererChainResponse> showRefererChainInvoker(
        ShowRefererChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showRefererChain, hcClient);
    }

    /**
     * 查询直播转码模板
     *
     * 查询直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTranscodingsTemplateRequest 请求对象
     * @return ShowTranscodingsTemplateResponse
     */
    public ShowTranscodingsTemplateResponse showTranscodingsTemplate(ShowTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showTranscodingsTemplate);
    }

    /**
     * 查询直播转码模板
     *
     * 查询直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>
     */
    public SyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplateInvoker(
        ShowTranscodingsTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showTranscodingsTemplate, hcClient);
    }

    /**
     * 修改播放域名延时配置
     *
     * 修改播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDelayConfigRequest 请求对象
     * @return UpdateDelayConfigResponse
     */
    public UpdateDelayConfigResponse updateDelayConfig(UpdateDelayConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateDelayConfig);
    }

    /**
     * 修改播放域名延时配置
     *
     * 修改播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDelayConfigRequest 请求对象
     * @return SyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>
     */
    public SyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse> updateDelayConfigInvoker(
        UpdateDelayConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateDelayConfig, hcClient);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return UpdateDomainResponse
     */
    public UpdateDomainResponse updateDomain(UpdateDomainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateDomain);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public SyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainInvoker(UpdateDomainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateDomain, hcClient);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainIp6SwitchRequest 请求对象
     * @return UpdateDomainIp6SwitchResponse
     */
    public UpdateDomainIp6SwitchResponse updateDomainIp6Switch(UpdateDomainIp6SwitchRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateDomainIp6Switch);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainIp6SwitchRequest 请求对象
     * @return SyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>
     */
    public SyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6SwitchInvoker(
        UpdateDomainIp6SwitchRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateDomainIp6Switch, hcClient);
    }

    /**
     * 更新指定域名的Key防盗链配置
     *
     * 更新指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainKeyChainRequest 请求对象
     * @return UpdateDomainKeyChainResponse
     */
    public UpdateDomainKeyChainResponse updateDomainKeyChain(UpdateDomainKeyChainRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateDomainKeyChain);
    }

    /**
     * 更新指定域名的Key防盗链配置
     *
     * 更新指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainKeyChainRequest 请求对象
     * @return SyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>
     */
    public SyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChainInvoker(
        UpdateDomainKeyChainRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateDomainKeyChain, hcClient);
    }

    /**
     * 修改地域限制配置
     *
     * 修改播放域名的地域限制，选中地域允许接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoBlockingConfigRequest 请求对象
     * @return UpdateGeoBlockingConfigResponse
     */
    public UpdateGeoBlockingConfigResponse updateGeoBlockingConfig(UpdateGeoBlockingConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateGeoBlockingConfig);
    }

    /**
     * 修改地域限制配置
     *
     * 修改播放域名的地域限制，选中地域允许接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoBlockingConfigRequest 请求对象
     * @return SyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>
     */
    public SyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> updateGeoBlockingConfigInvoker(
        UpdateGeoBlockingConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateGeoBlockingConfig, hcClient);
    }

    /**
     * 修改域名HLS配置
     *
     * 修改域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHlsConfigRequest 请求对象
     * @return UpdateHlsConfigResponse
     */
    public UpdateHlsConfigResponse updateHlsConfig(UpdateHlsConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateHlsConfig);
    }

    /**
     * 修改域名HLS配置
     *
     * 修改域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHlsConfigRequest 请求对象
     * @return SyncInvoker<UpdateHlsConfigRequest, UpdateHlsConfigResponse>
     */
    public SyncInvoker<UpdateHlsConfigRequest, UpdateHlsConfigResponse> updateHlsConfigInvoker(
        UpdateHlsConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateHlsConfig, hcClient);
    }

    /**
     * 修改IP黑/白名单
     *
     * 修改推流/播放域名的IP黑/白名单，当前仅支持ipv4。
     * - 黑名单模式：禁止指定的IP或网段
     * - 白名单模式：仅允许指定的IP或网段
     * - 默认：全放通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpAuthListRequest 请求对象
     * @return UpdateIpAuthListResponse
     */
    public UpdateIpAuthListResponse updateIpAuthList(UpdateIpAuthListRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateIpAuthList);
    }

    /**
     * 修改IP黑/白名单
     *
     * 修改推流/播放域名的IP黑/白名单，当前仅支持ipv4。
     * - 黑名单模式：禁止指定的IP或网段
     * - 白名单模式：仅允许指定的IP或网段
     * - 默认：全放通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateIpAuthListRequest 请求对象
     * @return SyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>
     */
    public SyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse> updateIpAuthListInvoker(
        UpdateIpAuthListRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateIpAuthList, hcClient);
    }

    /**
     * 新增、覆盖直播推流通知配置
     *
     * 新增、覆盖直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublishTemplateRequest 请求对象
     * @return UpdatePublishTemplateResponse
     */
    public UpdatePublishTemplateResponse updatePublishTemplate(UpdatePublishTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updatePublishTemplate);
    }

    /**
     * 新增、覆盖直播推流通知配置
     *
     * 新增、覆盖直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublishTemplateRequest 请求对象
     * @return SyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>
     */
    public SyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> updatePublishTemplateInvoker(
        UpdatePublishTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updatePublishTemplate, hcClient);
    }

    /**
     * 修改直播拉流回源配置
     *
     * 修改直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePullSourcesConfigRequest 请求对象
     * @return UpdatePullSourcesConfigResponse
     */
    public UpdatePullSourcesConfigResponse updatePullSourcesConfig(UpdatePullSourcesConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updatePullSourcesConfig);
    }

    /**
     * 修改直播拉流回源配置
     *
     * 修改直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePullSourcesConfigRequest 请求对象
     * @return SyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>
     */
    public SyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> updatePullSourcesConfigInvoker(
        UpdatePullSourcesConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updatePullSourcesConfig, hcClient);
    }

    /**
     * 修改录制回调配置
     *
     * 修改录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackConfigRequest 请求对象
     * @return UpdateRecordCallbackConfigResponse
     */
    public UpdateRecordCallbackConfigResponse updateRecordCallbackConfig(UpdateRecordCallbackConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateRecordCallbackConfig);
    }

    /**
     * 修改录制回调配置
     *
     * 修改录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>
     */
    public SyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfigInvoker(
        UpdateRecordCallbackConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateRecordCallbackConfig, hcClient);
    }

    /**
     * 修改录制规则
     *
     * 修改录制规则接口，如果规则修改后，修改后的规则对正在录制的流无效，对新的流有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return UpdateRecordRuleResponse
     */
    public UpdateRecordRuleResponse updateRecordRule(UpdateRecordRuleRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateRecordRule);
    }

    /**
     * 修改录制规则
     *
     * 修改录制规则接口，如果规则修改后，修改后的规则对正在录制的流无效，对新的流有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleInvoker(
        UpdateRecordRuleRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateRecordRule, hcClient);
    }

    /**
     * 修改直播截图配置
     *
     * 修改直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotConfigRequest 请求对象
     * @return UpdateSnapshotConfigResponse
     */
    public UpdateSnapshotConfigResponse updateSnapshotConfig(UpdateSnapshotConfigRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateSnapshotConfig);
    }

    /**
     * 修改直播截图配置
     *
     * 修改直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotConfigRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>
     */
    public SyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfigInvoker(
        UpdateSnapshotConfigRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateSnapshotConfig, hcClient);
    }

    /**
     * 修改禁推属性
     *
     * 修改禁推属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStreamForbiddenRequest 请求对象
     * @return UpdateStreamForbiddenResponse
     */
    public UpdateStreamForbiddenResponse updateStreamForbidden(UpdateStreamForbiddenRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateStreamForbidden);
    }

    /**
     * 修改禁推属性
     *
     * 修改禁推属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStreamForbiddenRequest 请求对象
     * @return SyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>
     */
    public SyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbiddenInvoker(
        UpdateStreamForbiddenRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateStreamForbidden, hcClient);
    }

    /**
     * 配置直播转码模板
     *
     * 修改直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodingsTemplateRequest 请求对象
     * @return UpdateTranscodingsTemplateResponse
     */
    public UpdateTranscodingsTemplateResponse updateTranscodingsTemplate(UpdateTranscodingsTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateTranscodingsTemplate);
    }

    /**
     * 配置直播转码模板
     *
     * 修改直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>
     */
    public SyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateInvoker(
        UpdateTranscodingsTemplateRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateTranscodingsTemplate, hcClient);
    }

    /**
     * 删除指定域名的https证书配置
     *
     * 删除指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainHttpsCertRequest 请求对象
     * @return DeleteDomainHttpsCertResponse
     */
    public DeleteDomainHttpsCertResponse deleteDomainHttpsCert(DeleteDomainHttpsCertRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteDomainHttpsCert);
    }

    /**
     * 删除指定域名的https证书配置
     *
     * 删除指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>
     */
    public SyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCertInvoker(
        DeleteDomainHttpsCertRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteDomainHttpsCert, hcClient);
    }

    /**
     * 查询指定域名的https证书配置
     *
     * 查询指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainHttpsCertRequest 请求对象
     * @return ShowDomainHttpsCertResponse
     */
    public ShowDomainHttpsCertResponse showDomainHttpsCert(ShowDomainHttpsCertRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showDomainHttpsCert);
    }

    /**
     * 查询指定域名的https证书配置
     *
     * 查询指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>
     */
    public SyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCertInvoker(
        ShowDomainHttpsCertRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showDomainHttpsCert, hcClient);
    }

    /**
     * 修改指定域名的https证书配置
     *
     * 修改指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainHttpsCertRequest 请求对象
     * @return UpdateDomainHttpsCertResponse
     */
    public UpdateDomainHttpsCertResponse updateDomainHttpsCert(UpdateDomainHttpsCertRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateDomainHttpsCert);
    }

    /**
     * 修改指定域名的https证书配置
     *
     * 修改指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>
     */
    public SyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCertInvoker(
        UpdateDomainHttpsCertRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateDomainHttpsCert, hcClient);
    }

    /**
     * 创建Live2VOD任务
     *
     * 创建Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHarvestTaskRequest 请求对象
     * @return CreateHarvestTaskResponse
     */
    public CreateHarvestTaskResponse createHarvestTask(CreateHarvestTaskRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createHarvestTask);
    }

    /**
     * 创建Live2VOD任务
     *
     * 创建Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateHarvestTaskRequest 请求对象
     * @return SyncInvoker<CreateHarvestTaskRequest, CreateHarvestTaskResponse>
     */
    public SyncInvoker<CreateHarvestTaskRequest, CreateHarvestTaskResponse> createHarvestTaskInvoker(
        CreateHarvestTaskRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createHarvestTask, hcClient);
    }

    /**
     * 删除Live2VOD任务
     *
     * 删除Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHarvestTaskRequest 请求对象
     * @return DeleteHarvestTaskResponse
     */
    public DeleteHarvestTaskResponse deleteHarvestTask(DeleteHarvestTaskRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteHarvestTask);
    }

    /**
     * 删除Live2VOD任务
     *
     * 删除Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteHarvestTaskRequest 请求对象
     * @return SyncInvoker<DeleteHarvestTaskRequest, DeleteHarvestTaskResponse>
     */
    public SyncInvoker<DeleteHarvestTaskRequest, DeleteHarvestTaskResponse> deleteHarvestTaskInvoker(
        DeleteHarvestTaskRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteHarvestTask, hcClient);
    }

    /**
     * 查询Live2VOD任务
     *
     * 查询Live2VOD任务，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHarvestTaskRequest 请求对象
     * @return ListHarvestTaskResponse
     */
    public ListHarvestTaskResponse listHarvestTask(ListHarvestTaskRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listHarvestTask);
    }

    /**
     * 查询Live2VOD任务
     *
     * 查询Live2VOD任务，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHarvestTaskRequest 请求对象
     * @return SyncInvoker<ListHarvestTaskRequest, ListHarvestTaskResponse>
     */
    public SyncInvoker<ListHarvestTaskRequest, ListHarvestTaskResponse> listHarvestTaskInvoker(
        ListHarvestTaskRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listHarvestTask, hcClient);
    }

    /**
     * 修改Live2VOD任务
     *
     * 修改Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHarvestTaskRequest 请求对象
     * @return ModifyHarvestTaskResponse
     */
    public ModifyHarvestTaskResponse modifyHarvestTask(ModifyHarvestTaskRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyHarvestTask);
    }

    /**
     * 修改Live2VOD任务
     *
     * 修改Live2VOD任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyHarvestTaskRequest 请求对象
     * @return SyncInvoker<ModifyHarvestTaskRequest, ModifyHarvestTaskResponse>
     */
    public SyncInvoker<ModifyHarvestTaskRequest, ModifyHarvestTaskResponse> modifyHarvestTaskInvoker(
        ModifyHarvestTaskRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyHarvestTask, hcClient);
    }

    /**
     * 修改Live2VOD任务状态
     *
     * 修改Live2VOD任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHarvestJobStatusRequest 请求对象
     * @return UpdateHarvestJobStatusResponse
     */
    public UpdateHarvestJobStatusResponse updateHarvestJobStatus(UpdateHarvestJobStatusRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateHarvestJobStatus);
    }

    /**
     * 修改Live2VOD任务状态
     *
     * 修改Live2VOD任务状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHarvestJobStatusRequest 请求对象
     * @return SyncInvoker<UpdateHarvestJobStatusRequest, UpdateHarvestJobStatusResponse>
     */
    public SyncInvoker<UpdateHarvestJobStatusRequest, UpdateHarvestJobStatusResponse> updateHarvestJobStatusInvoker(
        UpdateHarvestJobStatusRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateHarvestJobStatus, hcClient);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return UpdateObsBucketAuthorityPublicResponse
     */
    public UpdateObsBucketAuthorityPublicResponse updateObsBucketAuthorityPublic(
        UpdateObsBucketAuthorityPublicRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.updateObsBucketAuthorityPublic);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return SyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>
     */
    public SyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublicInvoker(
        UpdateObsBucketAuthorityPublicRequest request) {
        return new SyncInvoker<>(request, LiveMeta.updateObsBucketAuthorityPublic, hcClient);
    }

    /**
     * 新建OTT频道
     *
     * 创建频道接口，支持创建OTT频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOttChannelInfoRequest 请求对象
     * @return CreateOttChannelInfoResponse
     */
    public CreateOttChannelInfoResponse createOttChannelInfo(CreateOttChannelInfoRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.createOttChannelInfo);
    }

    /**
     * 新建OTT频道
     *
     * 创建频道接口，支持创建OTT频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOttChannelInfoRequest 请求对象
     * @return SyncInvoker<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse>
     */
    public SyncInvoker<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse> createOttChannelInfoInvoker(
        CreateOttChannelInfoRequest request) {
        return new SyncInvoker<>(request, LiveMeta.createOttChannelInfo, hcClient);
    }

    /**
     * 删除频道信息
     *
     * 删除频道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOttChannelInfoRequest 请求对象
     * @return DeleteOttChannelInfoResponse
     */
    public DeleteOttChannelInfoResponse deleteOttChannelInfo(DeleteOttChannelInfoRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.deleteOttChannelInfo);
    }

    /**
     * 删除频道信息
     *
     * 删除频道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOttChannelInfoRequest 请求对象
     * @return SyncInvoker<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse>
     */
    public SyncInvoker<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse> deleteOttChannelInfoInvoker(
        DeleteOttChannelInfoRequest request) {
        return new SyncInvoker<>(request, LiveMeta.deleteOttChannelInfo, hcClient);
    }

    /**
     * 查询频道信息
     *
     * 查询频道信息，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOttChannelInfoRequest 请求对象
     * @return ListOttChannelInfoResponse
     */
    public ListOttChannelInfoResponse listOttChannelInfo(ListOttChannelInfoRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.listOttChannelInfo);
    }

    /**
     * 查询频道信息
     *
     * 查询频道信息，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOttChannelInfoRequest 请求对象
     * @return SyncInvoker<ListOttChannelInfoRequest, ListOttChannelInfoResponse>
     */
    public SyncInvoker<ListOttChannelInfoRequest, ListOttChannelInfoResponse> listOttChannelInfoInvoker(
        ListOttChannelInfoRequest request) {
        return new SyncInvoker<>(request, LiveMeta.listOttChannelInfo, hcClient);
    }

    /**
     * 修改频道转码模板信息
     *
     * 修改频道转码模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEncoderSettingsRequest 请求对象
     * @return ModifyOttChannelInfoEncoderSettingsResponse
     */
    public ModifyOttChannelInfoEncoderSettingsResponse modifyOttChannelInfoEncoderSettings(
        ModifyOttChannelInfoEncoderSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoEncoderSettings);
    }

    /**
     * 修改频道转码模板信息
     *
     * 修改频道转码模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEncoderSettingsRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse> modifyOttChannelInfoEncoderSettingsInvoker(
        ModifyOttChannelInfoEncoderSettingsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoEncoderSettings, hcClient);
    }

    /**
     * 修改频道打包信息
     *
     * 修改频道打包信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEndPointsRequest 请求对象
     * @return ModifyOttChannelInfoEndPointsResponse
     */
    public ModifyOttChannelInfoEndPointsResponse modifyOttChannelInfoEndPoints(
        ModifyOttChannelInfoEndPointsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoEndPoints);
    }

    /**
     * 修改频道打包信息
     *
     * 修改频道打包信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEndPointsRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse> modifyOttChannelInfoEndPointsInvoker(
        ModifyOttChannelInfoEndPointsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoEndPoints, hcClient);
    }

    /**
     * 修改频道通用信息
     *
     * 修改频道通用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoGeneralRequest 请求对象
     * @return ModifyOttChannelInfoGeneralResponse
     */
    public ModifyOttChannelInfoGeneralResponse modifyOttChannelInfoGeneral(ModifyOttChannelInfoGeneralRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoGeneral);
    }

    /**
     * 修改频道通用信息
     *
     * 修改频道通用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoGeneralRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse> modifyOttChannelInfoGeneralInvoker(
        ModifyOttChannelInfoGeneralRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoGeneral, hcClient);
    }

    /**
     * 修改频道入流信息
     *
     * 修改频道入流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoInputRequest 请求对象
     * @return ModifyOttChannelInfoInputResponse
     */
    public ModifyOttChannelInfoInputResponse modifyOttChannelInfoInput(ModifyOttChannelInfoInputRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoInput);
    }

    /**
     * 修改频道入流信息
     *
     * 修改频道入流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoInputRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse> modifyOttChannelInfoInputInvoker(
        ModifyOttChannelInfoInputRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoInput, hcClient);
    }

    /**
     * 修改频道录制信息
     *
     * 修改频道录制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoRecordSettingsRequest 请求对象
     * @return ModifyOttChannelInfoRecordSettingsResponse
     */
    public ModifyOttChannelInfoRecordSettingsResponse modifyOttChannelInfoRecordSettings(
        ModifyOttChannelInfoRecordSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoRecordSettings);
    }

    /**
     * 修改频道录制信息
     *
     * 修改频道录制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoRecordSettingsRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse> modifyOttChannelInfoRecordSettingsInvoker(
        ModifyOttChannelInfoRecordSettingsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoRecordSettings, hcClient);
    }

    /**
     * 修改频道状态
     *
     * 修改频道状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoStatsRequest 请求对象
     * @return ModifyOttChannelInfoStatsResponse
     */
    public ModifyOttChannelInfoStatsResponse modifyOttChannelInfoStats(ModifyOttChannelInfoStatsRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.modifyOttChannelInfoStats);
    }

    /**
     * 修改频道状态
     *
     * 修改频道状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoStatsRequest 请求对象
     * @return SyncInvoker<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse>
     */
    public SyncInvoker<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse> modifyOttChannelInfoStatsInvoker(
        ModifyOttChannelInfoStatsRequest request) {
        return new SyncInvoker<>(request, LiveMeta.modifyOttChannelInfoStats, hcClient);
    }

    /**
     * 查询频道统计信息
     *
     * 查询频道的统计信息（入流scte35信号）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChannelStatisticRequest 请求对象
     * @return ShowChannelStatisticResponse
     */
    public ShowChannelStatisticResponse showChannelStatistic(ShowChannelStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, LiveMeta.showChannelStatistic);
    }

    /**
     * 查询频道统计信息
     *
     * 查询频道的统计信息（入流scte35信号）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowChannelStatisticRequest 请求对象
     * @return SyncInvoker<ShowChannelStatisticRequest, ShowChannelStatisticResponse>
     */
    public SyncInvoker<ShowChannelStatisticRequest, ShowChannelStatisticResponse> showChannelStatisticInvoker(
        ShowChannelStatisticRequest request) {
        return new SyncInvoker<>(request, LiveMeta.showChannelStatistic, hcClient);
    }

}
