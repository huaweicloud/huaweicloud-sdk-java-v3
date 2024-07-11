package com.huaweicloud.sdk.live.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsRequest;
import com.huaweicloud.sdk.live.v1.model.BatchShowIpBelongsResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainMappingResponse;
import com.huaweicloud.sdk.live.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.live.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoRequest;
import com.huaweicloud.sdk.live.v1.model.CreateOttChannelInfoResponse;
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
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsRequest;
import com.huaweicloud.sdk.live.v1.model.ListSnapshotConfigsResponse;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenRequest;
import com.huaweicloud.sdk.live.v1.model.ListStreamForbiddenResponse;
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

import java.util.concurrent.CompletableFuture;

public class LiveAsyncClient {

    protected HcClient hcClient;

    public LiveAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<LiveAsyncClient> newBuilder() {
        ClientBuilder<LiveAsyncClient> clientBuilder = new ClientBuilder<>(LiveAsyncClient::new);
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
     * @return CompletableFuture<BatchShowIpBelongsResponse>
     */
    public CompletableFuture<BatchShowIpBelongsResponse> batchShowIpBelongsAsync(BatchShowIpBelongsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.batchShowIpBelongs);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchShowIpBelongsRequest 请求对象
     * @return AsyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>
     */
    public AsyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongsAsyncInvoker(
        BatchShowIpBelongsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.batchShowIpBelongs, hcClient);
    }

    /**
     * 创建直播域名
     *
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createDomain);
    }

    /**
     * 创建直播域名
     *
     * 可单独创建直播播放域名或推流域名，每个租户最多可配置64条域名记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createDomain, hcClient);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainMappingRequest 请求对象
     * @return CompletableFuture<CreateDomainMappingResponse>
     */
    public CompletableFuture<CreateDomainMappingResponse> createDomainMappingAsync(CreateDomainMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createDomainMapping);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainMappingRequest 请求对象
     * @return AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>
     */
    public AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMappingAsyncInvoker(
        CreateDomainMappingRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createDomainMapping, hcClient);
    }

    /**
     * 创建录制回调配置
     *
     * 创建录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordCallbackConfigRequest 请求对象
     * @return CompletableFuture<CreateRecordCallbackConfigResponse>
     */
    public CompletableFuture<CreateRecordCallbackConfigResponse> createRecordCallbackConfigAsync(
        CreateRecordCallbackConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createRecordCallbackConfig);
    }

    /**
     * 创建录制回调配置
     *
     * 创建录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>
     */
    public AsyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfigAsyncInvoker(
        CreateRecordCallbackConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createRecordCallbackConfig, hcClient);
    }

    /**
     * 创建录制视频索引文件
     *
     * Create Record Index
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordIndexRequest 请求对象
     * @return CompletableFuture<CreateRecordIndexResponse>
     */
    public CompletableFuture<CreateRecordIndexResponse> createRecordIndexAsync(CreateRecordIndexRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createRecordIndex);
    }

    /**
     * 创建录制视频索引文件
     *
     * Create Record Index
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordIndexRequest 请求对象
     * @return AsyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>
     */
    public AsyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndexAsyncInvoker(
        CreateRecordIndexRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createRecordIndex, hcClient);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return CompletableFuture<CreateRecordRuleResponse>
     */
    public CompletableFuture<CreateRecordRuleResponse> createRecordRuleAsync(CreateRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createRecordRule);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordRuleRequest 请求对象
     * @return AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleAsyncInvoker(
        CreateRecordRuleRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createRecordRule, hcClient);
    }

    /**
     * 创建直播截图配置
     *
     * 创建直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotConfigRequest 请求对象
     * @return CompletableFuture<CreateSnapshotConfigResponse>
     */
    public CompletableFuture<CreateSnapshotConfigResponse> createSnapshotConfigAsync(
        CreateSnapshotConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createSnapshotConfig);
    }

    /**
     * 创建直播截图配置
     *
     * 创建直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>
     */
    public AsyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfigAsyncInvoker(
        CreateSnapshotConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createSnapshotConfig, hcClient);
    }

    /**
     * 禁止直播推流
     *
     * 禁止直播推流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenRequest 请求对象
     * @return CompletableFuture<CreateStreamForbiddenResponse>
     */
    public CompletableFuture<CreateStreamForbiddenResponse> createStreamForbiddenAsync(
        CreateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createStreamForbidden);
    }

    /**
     * 禁止直播推流
     *
     * 禁止直播推流
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>
     */
    public AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbiddenAsyncInvoker(
        CreateStreamForbiddenRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createStreamForbidden, hcClient);
    }

    /**
     * 创建直播转码模板
     *
     * 创建直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<CreateTranscodingsTemplateResponse>
     */
    public CompletableFuture<CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsync(
        CreateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createTranscodingsTemplate);
    }

    /**
     * 创建直播转码模板
     *
     * 创建直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsyncInvoker(
        CreateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createTranscodingsTemplate, hcClient);
    }

    /**
     * 生成URL鉴权串
     *
     * 生成URL鉴权串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUrlAuthchainRequest 请求对象
     * @return CompletableFuture<CreateUrlAuthchainResponse>
     */
    public CompletableFuture<CreateUrlAuthchainResponse> createUrlAuthchainAsync(CreateUrlAuthchainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createUrlAuthchain);
    }

    /**
     * 生成URL鉴权串
     *
     * 生成URL鉴权串
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateUrlAuthchainRequest 请求对象
     * @return AsyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>
     */
    public AsyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> createUrlAuthchainAsyncInvoker(
        CreateUrlAuthchainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createUrlAuthchain, hcClient);
    }

    /**
     * 删除直播域名
     *
     * 删除域名。只有在域名停用（off）状态时才能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomain);
    }

    /**
     * 删除直播域名
     *
     * 删除域名。只有在域名停用（off）状态时才能删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteDomain, hcClient);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainKeyChainRequest 请求对象
     * @return CompletableFuture<DeleteDomainKeyChainResponse>
     */
    public CompletableFuture<DeleteDomainKeyChainResponse> deleteDomainKeyChainAsync(
        DeleteDomainKeyChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomainKeyChain);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>
     */
    public AsyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChainAsyncInvoker(
        DeleteDomainKeyChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteDomainKeyChain, hcClient);
    }

    /**
     * 删除直播域名映射关系
     *
     * 将播放域名和推流域名的域名映射关系删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainMappingRequest 请求对象
     * @return CompletableFuture<DeleteDomainMappingResponse>
     */
    public CompletableFuture<DeleteDomainMappingResponse> deleteDomainMappingAsync(DeleteDomainMappingRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomainMapping);
    }

    /**
     * 删除直播域名映射关系
     *
     * 将播放域名和推流域名的域名映射关系删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainMappingRequest 请求对象
     * @return AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>
     */
    public AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMappingAsyncInvoker(
        DeleteDomainMappingRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteDomainMapping, hcClient);
    }

    /**
     * 删除直播推流通知配置
     *
     * 删除直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublishTemplateRequest 请求对象
     * @return CompletableFuture<DeletePublishTemplateResponse>
     */
    public CompletableFuture<DeletePublishTemplateResponse> deletePublishTemplateAsync(
        DeletePublishTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deletePublishTemplate);
    }

    /**
     * 删除直播推流通知配置
     *
     * 删除直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublishTemplateRequest 请求对象
     * @return AsyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>
     */
    public AsyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse> deletePublishTemplateAsyncInvoker(
        DeletePublishTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deletePublishTemplate, hcClient);
    }

    /**
     * 删除录制回调配置
     *
     * 删除录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordCallbackConfigRequest 请求对象
     * @return CompletableFuture<DeleteRecordCallbackConfigResponse>
     */
    public CompletableFuture<DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfigAsync(
        DeleteRecordCallbackConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteRecordCallbackConfig);
    }

    /**
     * 删除录制回调配置
     *
     * 删除录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>
     */
    public AsyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfigAsyncInvoker(
        DeleteRecordCallbackConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteRecordCallbackConfig, hcClient);
    }

    /**
     * 删除录制规则
     *
     * 删除录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return CompletableFuture<DeleteRecordRuleResponse>
     */
    public CompletableFuture<DeleteRecordRuleResponse> deleteRecordRuleAsync(DeleteRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteRecordRule);
    }

    /**
     * 删除录制规则
     *
     * 删除录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleAsyncInvoker(
        DeleteRecordRuleRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteRecordRule, hcClient);
    }

    /**
     * 删除Referer防盗链黑白名单
     *
     * 删除Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRefererChainRequest 请求对象
     * @return CompletableFuture<DeleteRefererChainResponse>
     */
    public CompletableFuture<DeleteRefererChainResponse> deleteRefererChainAsync(DeleteRefererChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteRefererChain);
    }

    /**
     * 删除Referer防盗链黑白名单
     *
     * 删除Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRefererChainRequest 请求对象
     * @return AsyncInvoker<DeleteRefererChainRequest, DeleteRefererChainResponse>
     */
    public AsyncInvoker<DeleteRefererChainRequest, DeleteRefererChainResponse> deleteRefererChainAsyncInvoker(
        DeleteRefererChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteRefererChain, hcClient);
    }

    /**
     * 删除直播截图配置
     *
     * 删除直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotConfigRequest 请求对象
     * @return CompletableFuture<DeleteSnapshotConfigResponse>
     */
    public CompletableFuture<DeleteSnapshotConfigResponse> deleteSnapshotConfigAsync(
        DeleteSnapshotConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteSnapshotConfig);
    }

    /**
     * 删除直播截图配置
     *
     * 删除直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>
     */
    public AsyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfigAsyncInvoker(
        DeleteSnapshotConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteSnapshotConfig, hcClient);
    }

    /**
     * 禁推恢复
     *
     * 恢复直播推流接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStreamForbiddenRequest 请求对象
     * @return CompletableFuture<DeleteStreamForbiddenResponse>
     */
    public CompletableFuture<DeleteStreamForbiddenResponse> deleteStreamForbiddenAsync(
        DeleteStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteStreamForbidden);
    }

    /**
     * 禁推恢复
     *
     * 恢复直播推流接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>
     */
    public AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbiddenAsyncInvoker(
        DeleteStreamForbiddenRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteStreamForbidden, hcClient);
    }

    /**
     * 删除直播转码模板
     *
     * 删除直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTranscodingsTemplateResponse>
     */
    public CompletableFuture<DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsync(
        DeleteTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteTranscodingsTemplate);
    }

    /**
     * 删除直播转码模板
     *
     * 删除直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>
     */
    public AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsyncInvoker(
        DeleteTranscodingsTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteTranscodingsTemplate, hcClient);
    }

    /**
     * 查询播放域名延时配置
     *
     * 查询播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelayConfigRequest 请求对象
     * @return CompletableFuture<ListDelayConfigResponse>
     */
    public CompletableFuture<ListDelayConfigResponse> listDelayConfigAsync(ListDelayConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listDelayConfig);
    }

    /**
     * 查询播放域名延时配置
     *
     * 查询播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDelayConfigRequest 请求对象
     * @return AsyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>
     */
    public AsyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse> listDelayConfigAsyncInvoker(
        ListDelayConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listDelayConfig, hcClient);
    }

    /**
     * 获取地域限制配置列表
     *
     * 查询播放域名的地域限制列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoBlockingConfigRequest 请求对象
     * @return CompletableFuture<ListGeoBlockingConfigResponse>
     */
    public CompletableFuture<ListGeoBlockingConfigResponse> listGeoBlockingConfigAsync(
        ListGeoBlockingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listGeoBlockingConfig);
    }

    /**
     * 获取地域限制配置列表
     *
     * 查询播放域名的地域限制列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGeoBlockingConfigRequest 请求对象
     * @return AsyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>
     */
    public AsyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> listGeoBlockingConfigAsyncInvoker(
        ListGeoBlockingConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listGeoBlockingConfig, hcClient);
    }

    /**
     * 查询域名HLS配置
     *
     * 查询域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHlsConfigRequest 请求对象
     * @return CompletableFuture<ListHlsConfigResponse>
     */
    public CompletableFuture<ListHlsConfigResponse> listHlsConfigAsync(ListHlsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listHlsConfig);
    }

    /**
     * 查询域名HLS配置
     *
     * 查询域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListHlsConfigRequest 请求对象
     * @return AsyncInvoker<ListHlsConfigRequest, ListHlsConfigResponse>
     */
    public AsyncInvoker<ListHlsConfigRequest, ListHlsConfigResponse> listHlsConfigAsyncInvoker(
        ListHlsConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listHlsConfig, hcClient);
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
     * @return CompletableFuture<ListIpAuthListResponse>
     */
    public CompletableFuture<ListIpAuthListResponse> listIpAuthListAsync(ListIpAuthListRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listIpAuthList);
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
     * @return AsyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>
     */
    public AsyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse> listIpAuthListAsyncInvoker(
        ListIpAuthListRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listIpAuthList, hcClient);
    }

    /**
     * 获取直播播放日志
     *
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveSampleLogsRequest 请求对象
     * @return CompletableFuture<ListLiveSampleLogsResponse>
     */
    public CompletableFuture<ListLiveSampleLogsResponse> listLiveSampleLogsAsync(ListLiveSampleLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listLiveSampleLogs);
    }

    /**
     * 获取直播播放日志
     *
     * 获取直播播放日志，基于域名以5分钟粒度进行打包，日志内容以 \&quot;|\&quot; 进行分隔。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveSampleLogsRequest 请求对象
     * @return AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>
     */
    public AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogsAsyncInvoker(
        ListLiveSampleLogsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listLiveSampleLogs, hcClient);
    }

    /**
     * 查询直播中的流信息
     *
     * 查询直播中的流信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveStreamsOnlineRequest 请求对象
     * @return CompletableFuture<ListLiveStreamsOnlineResponse>
     */
    public CompletableFuture<ListLiveStreamsOnlineResponse> listLiveStreamsOnlineAsync(
        ListLiveStreamsOnlineRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listLiveStreamsOnline);
    }

    /**
     * 查询直播中的流信息
     *
     * 查询直播中的流信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLiveStreamsOnlineRequest 请求对象
     * @return AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>
     */
    public AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnlineAsyncInvoker(
        ListLiveStreamsOnlineRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listLiveStreamsOnline, hcClient);
    }

    /**
     * 查询直播推流通知配置
     *
     * 查询直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishTemplateRequest 请求对象
     * @return CompletableFuture<ListPublishTemplateResponse>
     */
    public CompletableFuture<ListPublishTemplateResponse> listPublishTemplateAsync(ListPublishTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listPublishTemplate);
    }

    /**
     * 查询直播推流通知配置
     *
     * 查询直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublishTemplateRequest 请求对象
     * @return AsyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>
     */
    public AsyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse> listPublishTemplateAsyncInvoker(
        ListPublishTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listPublishTemplate, hcClient);
    }

    /**
     * 查询录制回调配置列表
     *
     * 查询录制回调配置列表接口。通过指定条件，查询满足条件的配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordCallbackConfigsRequest 请求对象
     * @return CompletableFuture<ListRecordCallbackConfigsResponse>
     */
    public CompletableFuture<ListRecordCallbackConfigsResponse> listRecordCallbackConfigsAsync(
        ListRecordCallbackConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordCallbackConfigs);
    }

    /**
     * 查询录制回调配置列表
     *
     * 查询录制回调配置列表接口。通过指定条件，查询满足条件的配置列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordCallbackConfigsRequest 请求对象
     * @return AsyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>
     */
    public AsyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigsAsyncInvoker(
        ListRecordCallbackConfigsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listRecordCallbackConfigs, hcClient);
    }

    /**
     * 录制完成内容的查询
     *
     * 录制完成的内容查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordContentsRequest 请求对象
     * @return CompletableFuture<ListRecordContentsResponse>
     */
    public CompletableFuture<ListRecordContentsResponse> listRecordContentsAsync(ListRecordContentsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordContents);
    }

    /**
     * 录制完成内容的查询
     *
     * 录制完成的内容查询
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordContentsRequest 请求对象
     * @return AsyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>
     */
    public AsyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContentsAsyncInvoker(
        ListRecordContentsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listRecordContents, hcClient);
    }

    /**
     * 查询录制规则列表
     *
     * 查询录制规则列表接口，通过指定条件，查询满足条件的录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return CompletableFuture<ListRecordRulesResponse>
     */
    public CompletableFuture<ListRecordRulesResponse> listRecordRulesAsync(ListRecordRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listRecordRules);
    }

    /**
     * 查询录制规则列表
     *
     * 查询录制规则列表接口，通过指定条件，查询满足条件的录制规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordRulesRequest 请求对象
     * @return AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesAsyncInvoker(
        ListRecordRulesRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listRecordRules, hcClient);
    }

    /**
     * 查询直播截图配置
     *
     * 查询直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotConfigsRequest 请求对象
     * @return CompletableFuture<ListSnapshotConfigsResponse>
     */
    public CompletableFuture<ListSnapshotConfigsResponse> listSnapshotConfigsAsync(ListSnapshotConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listSnapshotConfigs);
    }

    /**
     * 查询直播截图配置
     *
     * 查询直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSnapshotConfigsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>
     */
    public AsyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigsAsyncInvoker(
        ListSnapshotConfigsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listSnapshotConfigs, hcClient);
    }

    /**
     * 查询禁止直播推流列表
     *
     * 查询禁播黑名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStreamForbiddenRequest 请求对象
     * @return CompletableFuture<ListStreamForbiddenResponse>
     */
    public CompletableFuture<ListStreamForbiddenResponse> listStreamForbiddenAsync(ListStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listStreamForbidden);
    }

    /**
     * 查询禁止直播推流列表
     *
     * 查询禁播黑名单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>
     */
    public AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbiddenAsyncInvoker(
        ListStreamForbiddenRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listStreamForbidden, hcClient);
    }

    /**
     * 提交录制控制命令
     *
     * 对单条流的实时录制控制接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRecordRequest 请求对象
     * @return CompletableFuture<RunRecordResponse>
     */
    public CompletableFuture<RunRecordResponse> runRecordAsync(RunRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.runRecord);
    }

    /**
     * 提交录制控制命令
     *
     * 对单条流的实时录制控制接口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunRecordRequest 请求对象
     * @return AsyncInvoker<RunRecordRequest, RunRecordResponse>
     */
    public AsyncInvoker<RunRecordRequest, RunRecordResponse> runRecordAsyncInvoker(RunRecordRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.runRecord, hcClient);
    }

    /**
     * 设置Referer防盗链黑白名单
     *
     * 设置Referer黑白名单，直播服务会根据配置的referer黑白名单，对访问者的身份进行识别和过滤，符合规则的可以顺利访问到该内容。如果不符合规则，该访问请求将会被禁止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRefererChainRequest 请求对象
     * @return CompletableFuture<SetRefererChainResponse>
     */
    public CompletableFuture<SetRefererChainResponse> setRefererChainAsync(SetRefererChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.setRefererChain);
    }

    /**
     * 设置Referer防盗链黑白名单
     *
     * 设置Referer黑白名单，直播服务会根据配置的referer黑白名单，对访问者的身份进行识别和过滤，符合规则的可以顺利访问到该内容。如果不符合规则，该访问请求将会被禁止。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRefererChainRequest 请求对象
     * @return AsyncInvoker<SetRefererChainRequest, SetRefererChainResponse>
     */
    public AsyncInvoker<SetRefererChainRequest, SetRefererChainResponse> setRefererChainAsyncInvoker(
        SetRefererChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.setRefererChain, hcClient);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return CompletableFuture<ShowDomainResponse>
     */
    public CompletableFuture<ShowDomainResponse> showDomainAsync(ShowDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showDomain);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainRequest 请求对象
     * @return AsyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public AsyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainAsyncInvoker(ShowDomainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showDomain, hcClient);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainKeyChainRequest 请求对象
     * @return CompletableFuture<ShowDomainKeyChainResponse>
     */
    public CompletableFuture<ShowDomainKeyChainResponse> showDomainKeyChainAsync(ShowDomainKeyChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showDomainKeyChain);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>
     */
    public AsyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChainAsyncInvoker(
        ShowDomainKeyChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showDomainKeyChain, hcClient);
    }

    /**
     * 查询直播拉流回源配置
     *
     * 查询直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPullSourcesConfigRequest 请求对象
     * @return CompletableFuture<ShowPullSourcesConfigResponse>
     */
    public CompletableFuture<ShowPullSourcesConfigResponse> showPullSourcesConfigAsync(
        ShowPullSourcesConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showPullSourcesConfig);
    }

    /**
     * 查询直播拉流回源配置
     *
     * 查询直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPullSourcesConfigRequest 请求对象
     * @return AsyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>
     */
    public AsyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> showPullSourcesConfigAsyncInvoker(
        ShowPullSourcesConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showPullSourcesConfig, hcClient);
    }

    /**
     * 查询录制回调配置
     *
     * 查询录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackConfigRequest 请求对象
     * @return CompletableFuture<ShowRecordCallbackConfigResponse>
     */
    public CompletableFuture<ShowRecordCallbackConfigResponse> showRecordCallbackConfigAsync(
        ShowRecordCallbackConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showRecordCallbackConfig);
    }

    /**
     * 查询录制回调配置
     *
     * 查询录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>
     */
    public AsyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfigAsyncInvoker(
        ShowRecordCallbackConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showRecordCallbackConfig, hcClient);
    }

    /**
     * 查询录制规则配置
     *
     * 查询录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return CompletableFuture<ShowRecordRuleResponse>
     */
    public CompletableFuture<ShowRecordRuleResponse> showRecordRuleAsync(ShowRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showRecordRule);
    }

    /**
     * 查询录制规则配置
     *
     * 查询录制规则接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordRuleRequest 请求对象
     * @return AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleAsyncInvoker(
        ShowRecordRuleRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showRecordRule, hcClient);
    }

    /**
     * 查询Referer防盗链黑白名单
     *
     * 查询Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefererChainRequest 请求对象
     * @return CompletableFuture<ShowRefererChainResponse>
     */
    public CompletableFuture<ShowRefererChainResponse> showRefererChainAsync(ShowRefererChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showRefererChain);
    }

    /**
     * 查询Referer防盗链黑白名单
     *
     * 查询Referer防盗链黑白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefererChainRequest 请求对象
     * @return AsyncInvoker<ShowRefererChainRequest, ShowRefererChainResponse>
     */
    public AsyncInvoker<ShowRefererChainRequest, ShowRefererChainResponse> showRefererChainAsyncInvoker(
        ShowRefererChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showRefererChain, hcClient);
    }

    /**
     * 查询直播转码模板
     *
     * 查询直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<ShowTranscodingsTemplateResponse>
     */
    public CompletableFuture<ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsync(
        ShowTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showTranscodingsTemplate);
    }

    /**
     * 查询直播转码模板
     *
     * 查询直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>
     */
    public AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsyncInvoker(
        ShowTranscodingsTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showTranscodingsTemplate, hcClient);
    }

    /**
     * 修改播放域名延时配置
     *
     * 修改播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDelayConfigRequest 请求对象
     * @return CompletableFuture<UpdateDelayConfigResponse>
     */
    public CompletableFuture<UpdateDelayConfigResponse> updateDelayConfigAsync(UpdateDelayConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDelayConfig);
    }

    /**
     * 修改播放域名延时配置
     *
     * 修改播放域名延时配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDelayConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>
     */
    public AsyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse> updateDelayConfigAsyncInvoker(
        UpdateDelayConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateDelayConfig, hcClient);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return CompletableFuture<UpdateDomainResponse>
     */
    public CompletableFuture<UpdateDomainResponse> updateDomainAsync(UpdateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDomain);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainAsyncInvoker(
        UpdateDomainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateDomain, hcClient);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainIp6SwitchRequest 请求对象
     * @return CompletableFuture<UpdateDomainIp6SwitchResponse>
     */
    public CompletableFuture<UpdateDomainIp6SwitchResponse> updateDomainIp6SwitchAsync(
        UpdateDomainIp6SwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDomainIp6Switch);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainIp6SwitchRequest 请求对象
     * @return AsyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>
     */
    public AsyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6SwitchAsyncInvoker(
        UpdateDomainIp6SwitchRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateDomainIp6Switch, hcClient);
    }

    /**
     * 更新指定域名的Key防盗链配置
     *
     * 更新指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainKeyChainRequest 请求对象
     * @return CompletableFuture<UpdateDomainKeyChainResponse>
     */
    public CompletableFuture<UpdateDomainKeyChainResponse> updateDomainKeyChainAsync(
        UpdateDomainKeyChainRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDomainKeyChain);
    }

    /**
     * 更新指定域名的Key防盗链配置
     *
     * 更新指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>
     */
    public AsyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChainAsyncInvoker(
        UpdateDomainKeyChainRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateDomainKeyChain, hcClient);
    }

    /**
     * 修改地域限制配置
     *
     * 修改播放域名的地域限制，选中地域允许接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoBlockingConfigRequest 请求对象
     * @return CompletableFuture<UpdateGeoBlockingConfigResponse>
     */
    public CompletableFuture<UpdateGeoBlockingConfigResponse> updateGeoBlockingConfigAsync(
        UpdateGeoBlockingConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateGeoBlockingConfig);
    }

    /**
     * 修改地域限制配置
     *
     * 修改播放域名的地域限制，选中地域允许接入。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGeoBlockingConfigRequest 请求对象
     * @return AsyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>
     */
    public AsyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> updateGeoBlockingConfigAsyncInvoker(
        UpdateGeoBlockingConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateGeoBlockingConfig, hcClient);
    }

    /**
     * 修改域名HLS配置
     *
     * 修改域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHlsConfigRequest 请求对象
     * @return CompletableFuture<UpdateHlsConfigResponse>
     */
    public CompletableFuture<UpdateHlsConfigResponse> updateHlsConfigAsync(UpdateHlsConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateHlsConfig);
    }

    /**
     * 修改域名HLS配置
     *
     * 修改域名HLS配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHlsConfigRequest 请求对象
     * @return AsyncInvoker<UpdateHlsConfigRequest, UpdateHlsConfigResponse>
     */
    public AsyncInvoker<UpdateHlsConfigRequest, UpdateHlsConfigResponse> updateHlsConfigAsyncInvoker(
        UpdateHlsConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateHlsConfig, hcClient);
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
     * @return CompletableFuture<UpdateIpAuthListResponse>
     */
    public CompletableFuture<UpdateIpAuthListResponse> updateIpAuthListAsync(UpdateIpAuthListRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateIpAuthList);
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
     * @return AsyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>
     */
    public AsyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse> updateIpAuthListAsyncInvoker(
        UpdateIpAuthListRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateIpAuthList, hcClient);
    }

    /**
     * 新增、覆盖直播推流通知配置
     *
     * 新增、覆盖直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublishTemplateRequest 请求对象
     * @return CompletableFuture<UpdatePublishTemplateResponse>
     */
    public CompletableFuture<UpdatePublishTemplateResponse> updatePublishTemplateAsync(
        UpdatePublishTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updatePublishTemplate);
    }

    /**
     * 新增、覆盖直播推流通知配置
     *
     * 新增、覆盖直播推流通知配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublishTemplateRequest 请求对象
     * @return AsyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>
     */
    public AsyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> updatePublishTemplateAsyncInvoker(
        UpdatePublishTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updatePublishTemplate, hcClient);
    }

    /**
     * 修改直播拉流回源配置
     *
     * 修改直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePullSourcesConfigRequest 请求对象
     * @return CompletableFuture<UpdatePullSourcesConfigResponse>
     */
    public CompletableFuture<UpdatePullSourcesConfigResponse> updatePullSourcesConfigAsync(
        UpdatePullSourcesConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updatePullSourcesConfig);
    }

    /**
     * 修改直播拉流回源配置
     *
     * 修改直播拉流回源配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePullSourcesConfigRequest 请求对象
     * @return AsyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>
     */
    public AsyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> updatePullSourcesConfigAsyncInvoker(
        UpdatePullSourcesConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updatePullSourcesConfig, hcClient);
    }

    /**
     * 修改录制回调配置
     *
     * 修改录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackConfigRequest 请求对象
     * @return CompletableFuture<UpdateRecordCallbackConfigResponse>
     */
    public CompletableFuture<UpdateRecordCallbackConfigResponse> updateRecordCallbackConfigAsync(
        UpdateRecordCallbackConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateRecordCallbackConfig);
    }

    /**
     * 修改录制回调配置
     *
     * 修改录制回调配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>
     */
    public AsyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfigAsyncInvoker(
        UpdateRecordCallbackConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateRecordCallbackConfig, hcClient);
    }

    /**
     * 修改录制规则
     *
     * 修改录制规则接口，如果规则修改后，修改后的规则对正在录制的流无效，对新的流有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return CompletableFuture<UpdateRecordRuleResponse>
     */
    public CompletableFuture<UpdateRecordRuleResponse> updateRecordRuleAsync(UpdateRecordRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateRecordRule);
    }

    /**
     * 修改录制规则
     *
     * 修改录制规则接口，如果规则修改后，修改后的规则对正在录制的流无效，对新的流有效。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleAsyncInvoker(
        UpdateRecordRuleRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateRecordRule, hcClient);
    }

    /**
     * 修改直播截图配置
     *
     * 修改直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotConfigRequest 请求对象
     * @return CompletableFuture<UpdateSnapshotConfigResponse>
     */
    public CompletableFuture<UpdateSnapshotConfigResponse> updateSnapshotConfigAsync(
        UpdateSnapshotConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateSnapshotConfig);
    }

    /**
     * 修改直播截图配置
     *
     * 修改直播截图配置接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>
     */
    public AsyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfigAsyncInvoker(
        UpdateSnapshotConfigRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateSnapshotConfig, hcClient);
    }

    /**
     * 修改禁推属性
     *
     * 修改禁推属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStreamForbiddenRequest 请求对象
     * @return CompletableFuture<UpdateStreamForbiddenResponse>
     */
    public CompletableFuture<UpdateStreamForbiddenResponse> updateStreamForbiddenAsync(
        UpdateStreamForbiddenRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateStreamForbidden);
    }

    /**
     * 修改禁推属性
     *
     * 修改禁推属性
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>
     */
    public AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbiddenAsyncInvoker(
        UpdateStreamForbiddenRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateStreamForbidden, hcClient);
    }

    /**
     * 配置直播转码模板
     *
     * 修改直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodingsTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTranscodingsTemplateResponse>
     */
    public CompletableFuture<UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsync(
        UpdateTranscodingsTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateTranscodingsTemplate);
    }

    /**
     * 配置直播转码模板
     *
     * 修改直播转码模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsyncInvoker(
        UpdateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateTranscodingsTemplate, hcClient);
    }

    /**
     * 删除指定域名的https证书配置
     *
     * 删除指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainHttpsCertRequest 请求对象
     * @return CompletableFuture<DeleteDomainHttpsCertResponse>
     */
    public CompletableFuture<DeleteDomainHttpsCertResponse> deleteDomainHttpsCertAsync(
        DeleteDomainHttpsCertRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteDomainHttpsCert);
    }

    /**
     * 删除指定域名的https证书配置
     *
     * 删除指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>
     */
    public AsyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCertAsyncInvoker(
        DeleteDomainHttpsCertRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteDomainHttpsCert, hcClient);
    }

    /**
     * 查询指定域名的https证书配置
     *
     * 查询指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainHttpsCertRequest 请求对象
     * @return CompletableFuture<ShowDomainHttpsCertResponse>
     */
    public CompletableFuture<ShowDomainHttpsCertResponse> showDomainHttpsCertAsync(ShowDomainHttpsCertRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.showDomainHttpsCert);
    }

    /**
     * 查询指定域名的https证书配置
     *
     * 查询指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>
     */
    public AsyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCertAsyncInvoker(
        ShowDomainHttpsCertRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.showDomainHttpsCert, hcClient);
    }

    /**
     * 修改指定域名的https证书配置
     *
     * 修改指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainHttpsCertRequest 请求对象
     * @return CompletableFuture<UpdateDomainHttpsCertResponse>
     */
    public CompletableFuture<UpdateDomainHttpsCertResponse> updateDomainHttpsCertAsync(
        UpdateDomainHttpsCertRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateDomainHttpsCert);
    }

    /**
     * 修改指定域名的https证书配置
     *
     * 修改指定域名的https证书配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>
     */
    public AsyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCertAsyncInvoker(
        UpdateDomainHttpsCertRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateDomainHttpsCert, hcClient);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return CompletableFuture<UpdateObsBucketAuthorityPublicResponse>
     */
    public CompletableFuture<UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublicAsync(
        UpdateObsBucketAuthorityPublicRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.updateObsBucketAuthorityPublic);
    }

    /**
     * OBS桶授权及取消授权
     *
     * OBS桶授权及取消授权
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return AsyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>
     */
    public AsyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublicAsyncInvoker(
        UpdateObsBucketAuthorityPublicRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.updateObsBucketAuthorityPublic, hcClient);
    }

    /**
     * 新建OTT频道
     *
     * 创建频道接口，支持创建OTT频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOttChannelInfoRequest 请求对象
     * @return CompletableFuture<CreateOttChannelInfoResponse>
     */
    public CompletableFuture<CreateOttChannelInfoResponse> createOttChannelInfoAsync(
        CreateOttChannelInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.createOttChannelInfo);
    }

    /**
     * 新建OTT频道
     *
     * 创建频道接口，支持创建OTT频道。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateOttChannelInfoRequest 请求对象
     * @return AsyncInvoker<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse>
     */
    public AsyncInvoker<CreateOttChannelInfoRequest, CreateOttChannelInfoResponse> createOttChannelInfoAsyncInvoker(
        CreateOttChannelInfoRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.createOttChannelInfo, hcClient);
    }

    /**
     * 删除频道信息
     *
     * 删除频道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOttChannelInfoRequest 请求对象
     * @return CompletableFuture<DeleteOttChannelInfoResponse>
     */
    public CompletableFuture<DeleteOttChannelInfoResponse> deleteOttChannelInfoAsync(
        DeleteOttChannelInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.deleteOttChannelInfo);
    }

    /**
     * 删除频道信息
     *
     * 删除频道信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteOttChannelInfoRequest 请求对象
     * @return AsyncInvoker<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse>
     */
    public AsyncInvoker<DeleteOttChannelInfoRequest, DeleteOttChannelInfoResponse> deleteOttChannelInfoAsyncInvoker(
        DeleteOttChannelInfoRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.deleteOttChannelInfo, hcClient);
    }

    /**
     * 查询频道信息
     *
     * 查询频道信息，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOttChannelInfoRequest 请求对象
     * @return CompletableFuture<ListOttChannelInfoResponse>
     */
    public CompletableFuture<ListOttChannelInfoResponse> listOttChannelInfoAsync(ListOttChannelInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.listOttChannelInfo);
    }

    /**
     * 查询频道信息
     *
     * 查询频道信息，支持批量查询。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOttChannelInfoRequest 请求对象
     * @return AsyncInvoker<ListOttChannelInfoRequest, ListOttChannelInfoResponse>
     */
    public AsyncInvoker<ListOttChannelInfoRequest, ListOttChannelInfoResponse> listOttChannelInfoAsyncInvoker(
        ListOttChannelInfoRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.listOttChannelInfo, hcClient);
    }

    /**
     * 修改频道转码模板信息
     *
     * 修改频道转码模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEncoderSettingsRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoEncoderSettingsResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoEncoderSettingsResponse> modifyOttChannelInfoEncoderSettingsAsync(
        ModifyOttChannelInfoEncoderSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoEncoderSettings);
    }

    /**
     * 修改频道转码模板信息
     *
     * 修改频道转码模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEncoderSettingsRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoEncoderSettingsRequest, ModifyOttChannelInfoEncoderSettingsResponse> modifyOttChannelInfoEncoderSettingsAsyncInvoker(
        ModifyOttChannelInfoEncoderSettingsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoEncoderSettings, hcClient);
    }

    /**
     * 修改频道打包信息
     *
     * 修改频道打包信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEndPointsRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoEndPointsResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoEndPointsResponse> modifyOttChannelInfoEndPointsAsync(
        ModifyOttChannelInfoEndPointsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoEndPoints);
    }

    /**
     * 修改频道打包信息
     *
     * 修改频道打包信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoEndPointsRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoEndPointsRequest, ModifyOttChannelInfoEndPointsResponse> modifyOttChannelInfoEndPointsAsyncInvoker(
        ModifyOttChannelInfoEndPointsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoEndPoints, hcClient);
    }

    /**
     * 修改频道通用信息
     *
     * 修改频道通用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoGeneralRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoGeneralResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoGeneralResponse> modifyOttChannelInfoGeneralAsync(
        ModifyOttChannelInfoGeneralRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoGeneral);
    }

    /**
     * 修改频道通用信息
     *
     * 修改频道通用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoGeneralRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoGeneralRequest, ModifyOttChannelInfoGeneralResponse> modifyOttChannelInfoGeneralAsyncInvoker(
        ModifyOttChannelInfoGeneralRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoGeneral, hcClient);
    }

    /**
     * 修改频道入流信息
     *
     * 修改频道入流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoInputRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoInputResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoInputResponse> modifyOttChannelInfoInputAsync(
        ModifyOttChannelInfoInputRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoInput);
    }

    /**
     * 修改频道入流信息
     *
     * 修改频道入流信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoInputRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoInputRequest, ModifyOttChannelInfoInputResponse> modifyOttChannelInfoInputAsyncInvoker(
        ModifyOttChannelInfoInputRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoInput, hcClient);
    }

    /**
     * 修改频道录制信息
     *
     * 修改频道录制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoRecordSettingsRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoRecordSettingsResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoRecordSettingsResponse> modifyOttChannelInfoRecordSettingsAsync(
        ModifyOttChannelInfoRecordSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoRecordSettings);
    }

    /**
     * 修改频道录制信息
     *
     * 修改频道录制信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoRecordSettingsRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoRecordSettingsRequest, ModifyOttChannelInfoRecordSettingsResponse> modifyOttChannelInfoRecordSettingsAsyncInvoker(
        ModifyOttChannelInfoRecordSettingsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoRecordSettings, hcClient);
    }

    /**
     * 修改频道状态
     *
     * 修改频道状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoStatsRequest 请求对象
     * @return CompletableFuture<ModifyOttChannelInfoStatsResponse>
     */
    public CompletableFuture<ModifyOttChannelInfoStatsResponse> modifyOttChannelInfoStatsAsync(
        ModifyOttChannelInfoStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, LiveMeta.modifyOttChannelInfoStats);
    }

    /**
     * 修改频道状态
     *
     * 修改频道状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyOttChannelInfoStatsRequest 请求对象
     * @return AsyncInvoker<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse>
     */
    public AsyncInvoker<ModifyOttChannelInfoStatsRequest, ModifyOttChannelInfoStatsResponse> modifyOttChannelInfoStatsAsyncInvoker(
        ModifyOttChannelInfoStatsRequest request) {
        return new AsyncInvoker<>(request, LiveMeta.modifyOttChannelInfoStats, hcClient);
    }

}
