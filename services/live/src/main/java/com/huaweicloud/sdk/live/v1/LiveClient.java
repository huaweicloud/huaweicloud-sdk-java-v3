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
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordIndexResponse;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.CreateRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.CreateSnapshotConfigResponse;
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
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeletePublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteRecordRuleResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteSnapshotConfigResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.DeleteTranscodingsTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListDelayConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ListGeoBlockingConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListRequest;
import com.huaweicloud.sdk.live.v1.model.ListIpAuthListResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveSampleLogsResponse;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineRequest;
import com.huaweicloud.sdk.live.v1.model.ListLiveStreamsOnlineResponse;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateRequest;
import com.huaweicloud.sdk.live.v1.model.ListPublishTemplateResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordCallbackConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordContentsResponse;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesRequest;
import com.huaweicloud.sdk.live.v1.model.ListRecordRulesResponse;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenResponse;
import com.huaweicloud.sdk.live.v1.model.RunRecordRequest;
import com.huaweicloud.sdk.live.v1.model.RunRecordResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainHttpsCertResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainKeyChainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowDomainRequest;
import com.huaweicloud.sdk.live.v1.model.ShowDomainResponse;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowPullSourcesConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordCallbackConfigResponse;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleRequest;
import com.huaweicloud.sdk.live.v1.model.ShowRecordRuleResponse;
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
     * @param BatchShowIpBelongsRequest 请求对象
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
     * @param BatchShowIpBelongsRequest 请求对象
     * @return SyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>
     */
    public SyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongsInvoker(
        BatchShowIpBelongsRequest request) {
        return new SyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>(request,
            LiveMeta.batchShowIpBelongs, hcClient);
    }

    /**
     * 创建直播域名
     *
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
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
     * @param CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, LiveMeta.createDomain, hcClient);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainMappingRequest 请求对象
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
     * @param CreateDomainMappingRequest 请求对象
     * @return SyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>
     */
    public SyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMappingInvoker(
        CreateDomainMappingRequest request) {
        return new SyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>(request,
            LiveMeta.createDomainMapping, hcClient);
    }

    /**
     * 创建录制回调配置
     *
     * 创建录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordCallbackConfigRequest 请求对象
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
     * @param CreateRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>
     */
    public SyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfigInvoker(
        CreateRecordCallbackConfigRequest request) {
        return new SyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>(request,
            LiveMeta.createRecordCallbackConfig, hcClient);
    }

    /**
     * 创建录制视频索引文件
     *
     * Create Record Index
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordIndexRequest 请求对象
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
     * @param CreateRecordIndexRequest 请求对象
     * @return SyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>
     */
    public SyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndexInvoker(
        CreateRecordIndexRequest request) {
        return new SyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>(request, LiveMeta.createRecordIndex,
            hcClient);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordRuleRequest 请求对象
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
     * @param CreateRecordRuleRequest 请求对象
     * @return SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleInvoker(
        CreateRecordRuleRequest request) {
        return new SyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>(request, LiveMeta.createRecordRule,
            hcClient);
    }

    /**
     * 创建直播截图配置
     *
     * 创建直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSnapshotConfigRequest 请求对象
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
     * @param CreateSnapshotConfigRequest 请求对象
     * @return SyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>
     */
    public SyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfigInvoker(
        CreateSnapshotConfigRequest request) {
        return new SyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>(request,
            LiveMeta.createSnapshotConfig, hcClient);
    }

    /**
     * 禁止直播推流
     *
     * 禁止直播推流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStreamForbiddenRequest 请求对象
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
     * @param CreateStreamForbiddenRequest 请求对象
     * @return SyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>
     */
    public SyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbiddenInvoker(
        CreateStreamForbiddenRequest request) {
        return new SyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>(request,
            LiveMeta.createStreamForbidden, hcClient);
    }

    /**
     * 创建直播转码模板
     *
     * 创建直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTranscodingsTemplateRequest 请求对象
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
     * @param CreateTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>
     */
    public SyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplateInvoker(
        CreateTranscodingsTemplateRequest request) {
        return new SyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>(request,
            LiveMeta.createTranscodingsTemplate, hcClient);
    }

    /**
     * 生成URL鉴权串
     *
     * 生成URL鉴权串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateUrlAuthchainRequest 请求对象
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
     * @param CreateUrlAuthchainRequest 请求对象
     * @return SyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>
     */
    public SyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> createUrlAuthchainInvoker(
        CreateUrlAuthchainRequest request) {
        return new SyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>(request,
            LiveMeta.createUrlAuthchain, hcClient);
    }

    /**
     * 删除直播域名
     *
     * 删除域名。只有在域名停用（off）状态时才能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
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
     * @param DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, LiveMeta.deleteDomain, hcClient);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainKeyChainRequest 请求对象
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
     * @param DeleteDomainKeyChainRequest 请求对象
     * @return SyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>
     */
    public SyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChainInvoker(
        DeleteDomainKeyChainRequest request) {
        return new SyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>(request,
            LiveMeta.deleteDomainKeyChain, hcClient);
    }

    /**
     * 删除直播域名映射关系
     *
     * 将播放域名和推流域名的域名映射关系删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainMappingRequest 请求对象
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
     * @param DeleteDomainMappingRequest 请求对象
     * @return SyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>
     */
    public SyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMappingInvoker(
        DeleteDomainMappingRequest request) {
        return new SyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>(request,
            LiveMeta.deleteDomainMapping, hcClient);
    }

    /**
     * 删除直播推流通知配置
     *
     * 删除直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublishTemplateRequest 请求对象
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
     * @param DeletePublishTemplateRequest 请求对象
     * @return SyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>
     */
    public SyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse> deletePublishTemplateInvoker(
        DeletePublishTemplateRequest request) {
        return new SyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>(request,
            LiveMeta.deletePublishTemplate, hcClient);
    }

    /**
     * 删除录制回调配置
     *
     * 删除录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordCallbackConfigRequest 请求对象
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
     * @param DeleteRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>
     */
    public SyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfigInvoker(
        DeleteRecordCallbackConfigRequest request) {
        return new SyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>(request,
            LiveMeta.deleteRecordCallbackConfig, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 删除录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordRuleRequest 请求对象
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
     * @param DeleteRecordRuleRequest 请求对象
     * @return SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleInvoker(
        DeleteRecordRuleRequest request) {
        return new SyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>(request, LiveMeta.deleteRecordRule,
            hcClient);
    }

    /**
     * 删除直播截图配置
     *
     * 删除直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSnapshotConfigRequest 请求对象
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
     * @param DeleteSnapshotConfigRequest 请求对象
     * @return SyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>
     */
    public SyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfigInvoker(
        DeleteSnapshotConfigRequest request) {
        return new SyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>(request,
            LiveMeta.deleteSnapshotConfig, hcClient);
    }

    /**
     * 禁推恢复
     *
     * 恢复直播推流接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStreamForbiddenRequest 请求对象
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
     * @param DeleteStreamForbiddenRequest 请求对象
     * @return SyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>
     */
    public SyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbiddenInvoker(
        DeleteStreamForbiddenRequest request) {
        return new SyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>(request,
            LiveMeta.deleteStreamForbidden, hcClient);
    }

    /**
     * 删除直播转码模板
     *
     * 删除直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTranscodingsTemplateRequest 请求对象
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
     * @param DeleteTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>
     */
    public SyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateInvoker(
        DeleteTranscodingsTemplateRequest request) {
        return new SyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>(request,
            LiveMeta.deleteTranscodingsTemplate, hcClient);
    }

    /**
     * 查询播放域名延时配置
     *
     * 查询播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDelayConfigRequest 请求对象
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
     * @param ListDelayConfigRequest 请求对象
     * @return SyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>
     */
    public SyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse> listDelayConfigInvoker(
        ListDelayConfigRequest request) {
        return new SyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>(request, LiveMeta.listDelayConfig,
            hcClient);
    }

    /**
     * 获取地域限制配置列表
     *
     * 查询播放域名的地域限制列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListGeoBlockingConfigRequest 请求对象
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
     * @param ListGeoBlockingConfigRequest 请求对象
     * @return SyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>
     */
    public SyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> listGeoBlockingConfigInvoker(
        ListGeoBlockingConfigRequest request) {
        return new SyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>(request,
            LiveMeta.listGeoBlockingConfig, hcClient);
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
     * @param ListIpAuthListRequest 请求对象
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
     * @param ListIpAuthListRequest 请求对象
     * @return SyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>
     */
    public SyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse> listIpAuthListInvoker(
        ListIpAuthListRequest request) {
        return new SyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>(request, LiveMeta.listIpAuthList,
            hcClient);
    }

    /**
     * 获取直播播放日志
     *
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveSampleLogsRequest 请求对象
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
     * @param ListLiveSampleLogsRequest 请求对象
     * @return SyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>
     */
    public SyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogsInvoker(
        ListLiveSampleLogsRequest request) {
        return new SyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>(request,
            LiveMeta.listLiveSampleLogs, hcClient);
    }

    /**
     * 查询直播中的流信息
     *
     * 查询直播中的流信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLiveStreamsOnlineRequest 请求对象
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
     * @param ListLiveStreamsOnlineRequest 请求对象
     * @return SyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>
     */
    public SyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnlineInvoker(
        ListLiveStreamsOnlineRequest request) {
        return new SyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>(request,
            LiveMeta.listLiveStreamsOnline, hcClient);
    }

    /**
     * 查询直播推流通知配置
     *
     * 查询直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublishTemplateRequest 请求对象
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
     * @param ListPublishTemplateRequest 请求对象
     * @return SyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>
     */
    public SyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse> listPublishTemplateInvoker(
        ListPublishTemplateRequest request) {
        return new SyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>(request,
            LiveMeta.listPublishTemplate, hcClient);
    }

    /**
     * 查询录制回调配置列表
     *
     * 查询录制回调配置列表接口。通过指定条件，查询满足条件的配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordCallbackConfigsRequest 请求对象
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
     * @param ListRecordCallbackConfigsRequest 请求对象
     * @return SyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>
     */
    public SyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigsInvoker(
        ListRecordCallbackConfigsRequest request) {
        return new SyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>(request,
            LiveMeta.listRecordCallbackConfigs, hcClient);
    }

    /**
     * 录制完成内容的查询
     *
     * 录制完成的内容查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordContentsRequest 请求对象
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
     * @param ListRecordContentsRequest 请求对象
     * @return SyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>
     */
    public SyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContentsInvoker(
        ListRecordContentsRequest request) {
        return new SyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>(request,
            LiveMeta.listRecordContents, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 查询录制规则列表接口，通过指定条件，查询满足条件的录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordRulesRequest 请求对象
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
     * @param ListRecordRulesRequest 请求对象
     * @return SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesInvoker(
        ListRecordRulesRequest request) {
        return new SyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>(request, LiveMeta.listRecordRules,
            hcClient);
    }

    /**
     * 查询直播截图配置
     *
     * 查询直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSnapshotConfigsRequest 请求对象
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
     * @param ListSnapshotConfigsRequest 请求对象
     * @return SyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>
     */
    public SyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigsInvoker(
        ListSnapshotConfigsRequest request) {
        return new SyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>(request,
            LiveMeta.listSnapshotConfigs, hcClient);
    }

    /**
     * 查询禁止直播推流列表
     *
     * 查询禁播黑名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStreamForbiddenRequest 请求对象
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
     * @param ListStreamForbiddenRequest 请求对象
     * @return SyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>
     */
    public SyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbiddenInvoker(
        ListStreamForbiddenRequest request) {
        return new SyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>(request,
            LiveMeta.listStreamForbidden, hcClient);
    }

    /**
     * 提交录制控制命令
     *
     * 对单条流的实时录制控制接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RunRecordRequest 请求对象
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
     * @param RunRecordRequest 请求对象
     * @return SyncInvoker<RunRecordRequest, RunRecordResponse>
     */
    public SyncInvoker<RunRecordRequest, RunRecordResponse> runRecordInvoker(RunRecordRequest request) {
        return new SyncInvoker<RunRecordRequest, RunRecordResponse>(request, LiveMeta.runRecord, hcClient);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainRequest 请求对象
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
     * @param ShowDomainRequest 请求对象
     * @return SyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public SyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainInvoker(ShowDomainRequest request) {
        return new SyncInvoker<ShowDomainRequest, ShowDomainResponse>(request, LiveMeta.showDomain, hcClient);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainKeyChainRequest 请求对象
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
     * @param ShowDomainKeyChainRequest 请求对象
     * @return SyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>
     */
    public SyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChainInvoker(
        ShowDomainKeyChainRequest request) {
        return new SyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>(request,
            LiveMeta.showDomainKeyChain, hcClient);
    }

    /**
     * 查询直播拉流回源配置
     *
     * 查询直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPullSourcesConfigRequest 请求对象
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
     * @param ShowPullSourcesConfigRequest 请求对象
     * @return SyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>
     */
    public SyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> showPullSourcesConfigInvoker(
        ShowPullSourcesConfigRequest request) {
        return new SyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>(request,
            LiveMeta.showPullSourcesConfig, hcClient);
    }

    /**
     * 查询录制回调配置
     *
     * 查询录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordCallbackConfigRequest 请求对象
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
     * @param ShowRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>
     */
    public SyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfigInvoker(
        ShowRecordCallbackConfigRequest request) {
        return new SyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>(request,
            LiveMeta.showRecordCallbackConfig, hcClient);
    }

    /**
     * 查询录制规则配置
     *
     * 查询录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordRuleRequest 请求对象
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
     * @param ShowRecordRuleRequest 请求对象
     * @return SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleInvoker(
        ShowRecordRuleRequest request) {
        return new SyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>(request, LiveMeta.showRecordRule,
            hcClient);
    }

    /**
     * 查询直播转码模板
     *
     * 查询直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTranscodingsTemplateRequest 请求对象
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
     * @param ShowTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>
     */
    public SyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplateInvoker(
        ShowTranscodingsTemplateRequest request) {
        return new SyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>(request,
            LiveMeta.showTranscodingsTemplate, hcClient);
    }

    /**
     * 修改播放域名延时配置
     *
     * 修改播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDelayConfigRequest 请求对象
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
     * @param UpdateDelayConfigRequest 请求对象
     * @return SyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>
     */
    public SyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse> updateDelayConfigInvoker(
        UpdateDelayConfigRequest request) {
        return new SyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>(request, LiveMeta.updateDelayConfig,
            hcClient);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainRequest 请求对象
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
     * @param UpdateDomainRequest 请求对象
     * @return SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public SyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainInvoker(UpdateDomainRequest request) {
        return new SyncInvoker<UpdateDomainRequest, UpdateDomainResponse>(request, LiveMeta.updateDomain, hcClient);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainIp6SwitchRequest 请求对象
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
     * @param UpdateDomainIp6SwitchRequest 请求对象
     * @return SyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>
     */
    public SyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6SwitchInvoker(
        UpdateDomainIp6SwitchRequest request) {
        return new SyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>(request,
            LiveMeta.updateDomainIp6Switch, hcClient);
    }

    /**
     * 更新指定域名的Key防盗链配置
     *
     * 更新指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainKeyChainRequest 请求对象
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
     * @param UpdateDomainKeyChainRequest 请求对象
     * @return SyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>
     */
    public SyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChainInvoker(
        UpdateDomainKeyChainRequest request) {
        return new SyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>(request,
            LiveMeta.updateDomainKeyChain, hcClient);
    }

    /**
     * 修改地域限制配置
     *
     * 修改播放域名的地域限制，选中地域允许接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateGeoBlockingConfigRequest 请求对象
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
     * @param UpdateGeoBlockingConfigRequest 请求对象
     * @return SyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>
     */
    public SyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> updateGeoBlockingConfigInvoker(
        UpdateGeoBlockingConfigRequest request) {
        return new SyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>(request,
            LiveMeta.updateGeoBlockingConfig, hcClient);
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
     * @param UpdateIpAuthListRequest 请求对象
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
     * @param UpdateIpAuthListRequest 请求对象
     * @return SyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>
     */
    public SyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse> updateIpAuthListInvoker(
        UpdateIpAuthListRequest request) {
        return new SyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>(request, LiveMeta.updateIpAuthList,
            hcClient);
    }

    /**
     * 新增、覆盖直播推流通知配置
     *
     * 新增、覆盖直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublishTemplateRequest 请求对象
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
     * @param UpdatePublishTemplateRequest 请求对象
     * @return SyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>
     */
    public SyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> updatePublishTemplateInvoker(
        UpdatePublishTemplateRequest request) {
        return new SyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>(request,
            LiveMeta.updatePublishTemplate, hcClient);
    }

    /**
     * 修改直播拉流回源配置
     *
     * 修改直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePullSourcesConfigRequest 请求对象
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
     * @param UpdatePullSourcesConfigRequest 请求对象
     * @return SyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>
     */
    public SyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> updatePullSourcesConfigInvoker(
        UpdatePullSourcesConfigRequest request) {
        return new SyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>(request,
            LiveMeta.updatePullSourcesConfig, hcClient);
    }

    /**
     * 修改录制回调配置
     *
     * 修改录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordCallbackConfigRequest 请求对象
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
     * @param UpdateRecordCallbackConfigRequest 请求对象
     * @return SyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>
     */
    public SyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfigInvoker(
        UpdateRecordCallbackConfigRequest request) {
        return new SyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>(request,
            LiveMeta.updateRecordCallbackConfig, hcClient);
    }

    /**
     * 修改录制规则
     *
     * 修改录制规则接口，如果规则修改后，修改后的规则对正在录制的流无效，对新的流有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordRuleRequest 请求对象
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
     * @param UpdateRecordRuleRequest 请求对象
     * @return SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleInvoker(
        UpdateRecordRuleRequest request) {
        return new SyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>(request, LiveMeta.updateRecordRule,
            hcClient);
    }

    /**
     * 修改直播截图配置
     *
     * 修改直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSnapshotConfigRequest 请求对象
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
     * @param UpdateSnapshotConfigRequest 请求对象
     * @return SyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>
     */
    public SyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfigInvoker(
        UpdateSnapshotConfigRequest request) {
        return new SyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>(request,
            LiveMeta.updateSnapshotConfig, hcClient);
    }

    /**
     * 修改禁推属性
     *
     * 修改禁推属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStreamForbiddenRequest 请求对象
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
     * @param UpdateStreamForbiddenRequest 请求对象
     * @return SyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>
     */
    public SyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbiddenInvoker(
        UpdateStreamForbiddenRequest request) {
        return new SyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>(request,
            LiveMeta.updateStreamForbidden, hcClient);
    }

    /**
     * 配置直播转码模板
     *
     * 修改直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTranscodingsTemplateRequest 请求对象
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
     * @param UpdateTranscodingsTemplateRequest 请求对象
     * @return SyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>
     */
    public SyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateInvoker(
        UpdateTranscodingsTemplateRequest request) {
        return new SyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>(request,
            LiveMeta.updateTranscodingsTemplate, hcClient);
    }

    /**
     * 删除指定域名的https证书配置
     *
     * 删除指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainHttpsCertRequest 请求对象
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
     * @param DeleteDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>
     */
    public SyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCertInvoker(
        DeleteDomainHttpsCertRequest request) {
        return new SyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>(request,
            LiveMeta.deleteDomainHttpsCert, hcClient);
    }

    /**
     * 查询指定域名的https证书配置
     *
     * 查询指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainHttpsCertRequest 请求对象
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
     * @param ShowDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>
     */
    public SyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCertInvoker(
        ShowDomainHttpsCertRequest request) {
        return new SyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>(request,
            LiveMeta.showDomainHttpsCert, hcClient);
    }

    /**
     * 修改指定域名的https证书配置
     *
     * 修改指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainHttpsCertRequest 请求对象
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
     * @param UpdateDomainHttpsCertRequest 请求对象
     * @return SyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>
     */
    public SyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCertInvoker(
        UpdateDomainHttpsCertRequest request) {
        return new SyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>(request,
            LiveMeta.updateDomainHttpsCert, hcClient);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateObsBucketAuthorityPublicRequest 请求对象
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
     * @param UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return SyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>
     */
    public SyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublicInvoker(
        UpdateObsBucketAuthorityPublicRequest request) {
        return new SyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>(request,
            LiveMeta.updateObsBucketAuthorityPublic, hcClient);
    }

}
