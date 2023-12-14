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
     * @param BatchShowIpBelongsRequest 请求对象
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
     * @param BatchShowIpBelongsRequest 请求对象
     * @return AsyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>
     */
    public AsyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse> batchShowIpBelongsAsyncInvoker(
        BatchShowIpBelongsRequest request) {
        return new AsyncInvoker<BatchShowIpBelongsRequest, BatchShowIpBelongsResponse>(request,
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
     * @param CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, LiveMeta.createDomain, hcClient);
    }

    /**
     * 域名映射
     *
     * 将用户已创建的播放域名和推流域名建立域名映射关系
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainMappingRequest 请求对象
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
     * @param CreateDomainMappingRequest 请求对象
     * @return AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>
     */
    public AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse> createDomainMappingAsyncInvoker(
        CreateDomainMappingRequest request) {
        return new AsyncInvoker<CreateDomainMappingRequest, CreateDomainMappingResponse>(request,
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
     * @param CreateRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>
     */
    public AsyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse> createRecordCallbackConfigAsyncInvoker(
        CreateRecordCallbackConfigRequest request) {
        return new AsyncInvoker<CreateRecordCallbackConfigRequest, CreateRecordCallbackConfigResponse>(request,
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
     * @param CreateRecordIndexRequest 请求对象
     * @return AsyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>
     */
    public AsyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse> createRecordIndexAsyncInvoker(
        CreateRecordIndexRequest request) {
        return new AsyncInvoker<CreateRecordIndexRequest, CreateRecordIndexResponse>(request,
            LiveMeta.createRecordIndex, hcClient);
    }

    /**
     * 创建录制规则
     *
     * 创建录制规则接口，录制规则对新推送的流生效，对已经推送中的流不生效
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordRuleRequest 请求对象
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
     * @param CreateRecordRuleRequest 请求对象
     * @return AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>
     */
    public AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse> createRecordRuleAsyncInvoker(
        CreateRecordRuleRequest request) {
        return new AsyncInvoker<CreateRecordRuleRequest, CreateRecordRuleResponse>(request, LiveMeta.createRecordRule,
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
     * @param CreateSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>
     */
    public AsyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse> createSnapshotConfigAsyncInvoker(
        CreateSnapshotConfigRequest request) {
        return new AsyncInvoker<CreateSnapshotConfigRequest, CreateSnapshotConfigResponse>(request,
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
     * @param CreateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>
     */
    public AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse> createStreamForbiddenAsyncInvoker(
        CreateStreamForbiddenRequest request) {
        return new AsyncInvoker<CreateStreamForbiddenRequest, CreateStreamForbiddenResponse>(request,
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
     * @param CreateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse> createTranscodingsTemplateAsyncInvoker(
        CreateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<CreateTranscodingsTemplateRequest, CreateTranscodingsTemplateResponse>(request,
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
     * @param CreateUrlAuthchainRequest 请求对象
     * @return AsyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>
     */
    public AsyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse> createUrlAuthchainAsyncInvoker(
        CreateUrlAuthchainRequest request) {
        return new AsyncInvoker<CreateUrlAuthchainRequest, CreateUrlAuthchainResponse>(request,
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
     * @param DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, LiveMeta.deleteDomain, hcClient);
    }

    /**
     * 删除指定域名的Key防盗链配置
     *
     * 删除指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainKeyChainRequest 请求对象
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
     * @param DeleteDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>
     */
    public AsyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse> deleteDomainKeyChainAsyncInvoker(
        DeleteDomainKeyChainRequest request) {
        return new AsyncInvoker<DeleteDomainKeyChainRequest, DeleteDomainKeyChainResponse>(request,
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
     * @param DeleteDomainMappingRequest 请求对象
     * @return AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>
     */
    public AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse> deleteDomainMappingAsyncInvoker(
        DeleteDomainMappingRequest request) {
        return new AsyncInvoker<DeleteDomainMappingRequest, DeleteDomainMappingResponse>(request,
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
     * @param DeletePublishTemplateRequest 请求对象
     * @return AsyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>
     */
    public AsyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse> deletePublishTemplateAsyncInvoker(
        DeletePublishTemplateRequest request) {
        return new AsyncInvoker<DeletePublishTemplateRequest, DeletePublishTemplateResponse>(request,
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
     * @param DeleteRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>
     */
    public AsyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse> deleteRecordCallbackConfigAsyncInvoker(
        DeleteRecordCallbackConfigRequest request) {
        return new AsyncInvoker<DeleteRecordCallbackConfigRequest, DeleteRecordCallbackConfigResponse>(request,
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
     * @param DeleteRecordRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>
     */
    public AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse> deleteRecordRuleAsyncInvoker(
        DeleteRecordRuleRequest request) {
        return new AsyncInvoker<DeleteRecordRuleRequest, DeleteRecordRuleResponse>(request, LiveMeta.deleteRecordRule,
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
     * @param DeleteSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>
     */
    public AsyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse> deleteSnapshotConfigAsyncInvoker(
        DeleteSnapshotConfigRequest request) {
        return new AsyncInvoker<DeleteSnapshotConfigRequest, DeleteSnapshotConfigResponse>(request,
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
     * @param DeleteStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>
     */
    public AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse> deleteStreamForbiddenAsyncInvoker(
        DeleteStreamForbiddenRequest request) {
        return new AsyncInvoker<DeleteStreamForbiddenRequest, DeleteStreamForbiddenResponse>(request,
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
     * @param DeleteTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>
     */
    public AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse> deleteTranscodingsTemplateAsyncInvoker(
        DeleteTranscodingsTemplateRequest request) {
        return new AsyncInvoker<DeleteTranscodingsTemplateRequest, DeleteTranscodingsTemplateResponse>(request,
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
     * @param ListDelayConfigRequest 请求对象
     * @return AsyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>
     */
    public AsyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse> listDelayConfigAsyncInvoker(
        ListDelayConfigRequest request) {
        return new AsyncInvoker<ListDelayConfigRequest, ListDelayConfigResponse>(request, LiveMeta.listDelayConfig,
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
     * @param ListGeoBlockingConfigRequest 请求对象
     * @return AsyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>
     */
    public AsyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse> listGeoBlockingConfigAsyncInvoker(
        ListGeoBlockingConfigRequest request) {
        return new AsyncInvoker<ListGeoBlockingConfigRequest, ListGeoBlockingConfigResponse>(request,
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
     * @param ListIpAuthListRequest 请求对象
     * @return AsyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>
     */
    public AsyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse> listIpAuthListAsyncInvoker(
        ListIpAuthListRequest request) {
        return new AsyncInvoker<ListIpAuthListRequest, ListIpAuthListResponse>(request, LiveMeta.listIpAuthList,
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
     * @param ListLiveSampleLogsRequest 请求对象
     * @return AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>
     */
    public AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse> listLiveSampleLogsAsyncInvoker(
        ListLiveSampleLogsRequest request) {
        return new AsyncInvoker<ListLiveSampleLogsRequest, ListLiveSampleLogsResponse>(request,
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
     * @param ListLiveStreamsOnlineRequest 请求对象
     * @return AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>
     */
    public AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse> listLiveStreamsOnlineAsyncInvoker(
        ListLiveStreamsOnlineRequest request) {
        return new AsyncInvoker<ListLiveStreamsOnlineRequest, ListLiveStreamsOnlineResponse>(request,
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
     * @param ListPublishTemplateRequest 请求对象
     * @return AsyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>
     */
    public AsyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse> listPublishTemplateAsyncInvoker(
        ListPublishTemplateRequest request) {
        return new AsyncInvoker<ListPublishTemplateRequest, ListPublishTemplateResponse>(request,
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
     * @param ListRecordCallbackConfigsRequest 请求对象
     * @return AsyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>
     */
    public AsyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse> listRecordCallbackConfigsAsyncInvoker(
        ListRecordCallbackConfigsRequest request) {
        return new AsyncInvoker<ListRecordCallbackConfigsRequest, ListRecordCallbackConfigsResponse>(request,
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
     * @param ListRecordContentsRequest 请求对象
     * @return AsyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>
     */
    public AsyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse> listRecordContentsAsyncInvoker(
        ListRecordContentsRequest request) {
        return new AsyncInvoker<ListRecordContentsRequest, ListRecordContentsResponse>(request,
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
     * @param ListRecordRulesRequest 请求对象
     * @return AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>
     */
    public AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse> listRecordRulesAsyncInvoker(
        ListRecordRulesRequest request) {
        return new AsyncInvoker<ListRecordRulesRequest, ListRecordRulesResponse>(request, LiveMeta.listRecordRules,
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
     * @param ListSnapshotConfigsRequest 请求对象
     * @return AsyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>
     */
    public AsyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse> listSnapshotConfigsAsyncInvoker(
        ListSnapshotConfigsRequest request) {
        return new AsyncInvoker<ListSnapshotConfigsRequest, ListSnapshotConfigsResponse>(request,
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
     * @param ListStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>
     */
    public AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse> listStreamForbiddenAsyncInvoker(
        ListStreamForbiddenRequest request) {
        return new AsyncInvoker<ListStreamForbiddenRequest, ListStreamForbiddenResponse>(request,
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
     * @param RunRecordRequest 请求对象
     * @return AsyncInvoker<RunRecordRequest, RunRecordResponse>
     */
    public AsyncInvoker<RunRecordRequest, RunRecordResponse> runRecordAsyncInvoker(RunRecordRequest request) {
        return new AsyncInvoker<RunRecordRequest, RunRecordResponse>(request, LiveMeta.runRecord, hcClient);
    }

    /**
     * 查询直播域名
     *
     * 查询直播域名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainRequest 请求对象
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
     * @param ShowDomainRequest 请求对象
     * @return AsyncInvoker<ShowDomainRequest, ShowDomainResponse>
     */
    public AsyncInvoker<ShowDomainRequest, ShowDomainResponse> showDomainAsyncInvoker(ShowDomainRequest request) {
        return new AsyncInvoker<ShowDomainRequest, ShowDomainResponse>(request, LiveMeta.showDomain, hcClient);
    }

    /**
     * 查询指定域名的Key防盗链配置
     *
     * 查询指定域名的Key防盗链配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainKeyChainRequest 请求对象
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
     * @param ShowDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>
     */
    public AsyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse> showDomainKeyChainAsyncInvoker(
        ShowDomainKeyChainRequest request) {
        return new AsyncInvoker<ShowDomainKeyChainRequest, ShowDomainKeyChainResponse>(request,
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
     * @param ShowPullSourcesConfigRequest 请求对象
     * @return AsyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>
     */
    public AsyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse> showPullSourcesConfigAsyncInvoker(
        ShowPullSourcesConfigRequest request) {
        return new AsyncInvoker<ShowPullSourcesConfigRequest, ShowPullSourcesConfigResponse>(request,
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
     * @param ShowRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>
     */
    public AsyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse> showRecordCallbackConfigAsyncInvoker(
        ShowRecordCallbackConfigRequest request) {
        return new AsyncInvoker<ShowRecordCallbackConfigRequest, ShowRecordCallbackConfigResponse>(request,
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
     * @param ShowRecordRuleRequest 请求对象
     * @return AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>
     */
    public AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse> showRecordRuleAsyncInvoker(
        ShowRecordRuleRequest request) {
        return new AsyncInvoker<ShowRecordRuleRequest, ShowRecordRuleResponse>(request, LiveMeta.showRecordRule,
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
     * @param ShowTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>
     */
    public AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse> showTranscodingsTemplateAsyncInvoker(
        ShowTranscodingsTemplateRequest request) {
        return new AsyncInvoker<ShowTranscodingsTemplateRequest, ShowTranscodingsTemplateResponse>(request,
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
     * @param UpdateDelayConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>
     */
    public AsyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse> updateDelayConfigAsyncInvoker(
        UpdateDelayConfigRequest request) {
        return new AsyncInvoker<UpdateDelayConfigRequest, UpdateDelayConfigResponse>(request,
            LiveMeta.updateDelayConfig, hcClient);
    }

    /**
     * 修改直播域名
     *
     * 修改直播播放、RTMP推流加速域名相关信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainRequest 请求对象
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
     * @param UpdateDomainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>
     */
    public AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse> updateDomainAsyncInvoker(
        UpdateDomainRequest request) {
        return new AsyncInvoker<UpdateDomainRequest, UpdateDomainResponse>(request, LiveMeta.updateDomain, hcClient);
    }

    /**
     * 配置域名IPV6开关
     *
     * 配置IPV6开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainIp6SwitchRequest 请求对象
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
     * @param UpdateDomainIp6SwitchRequest 请求对象
     * @return AsyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>
     */
    public AsyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse> updateDomainIp6SwitchAsyncInvoker(
        UpdateDomainIp6SwitchRequest request) {
        return new AsyncInvoker<UpdateDomainIp6SwitchRequest, UpdateDomainIp6SwitchResponse>(request,
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
     * @param UpdateDomainKeyChainRequest 请求对象
     * @return AsyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>
     */
    public AsyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse> updateDomainKeyChainAsyncInvoker(
        UpdateDomainKeyChainRequest request) {
        return new AsyncInvoker<UpdateDomainKeyChainRequest, UpdateDomainKeyChainResponse>(request,
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
     * @param UpdateGeoBlockingConfigRequest 请求对象
     * @return AsyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>
     */
    public AsyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse> updateGeoBlockingConfigAsyncInvoker(
        UpdateGeoBlockingConfigRequest request) {
        return new AsyncInvoker<UpdateGeoBlockingConfigRequest, UpdateGeoBlockingConfigResponse>(request,
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
     * @param UpdateIpAuthListRequest 请求对象
     * @return AsyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>
     */
    public AsyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse> updateIpAuthListAsyncInvoker(
        UpdateIpAuthListRequest request) {
        return new AsyncInvoker<UpdateIpAuthListRequest, UpdateIpAuthListResponse>(request, LiveMeta.updateIpAuthList,
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
     * @param UpdatePublishTemplateRequest 请求对象
     * @return AsyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>
     */
    public AsyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse> updatePublishTemplateAsyncInvoker(
        UpdatePublishTemplateRequest request) {
        return new AsyncInvoker<UpdatePublishTemplateRequest, UpdatePublishTemplateResponse>(request,
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
     * @param UpdatePullSourcesConfigRequest 请求对象
     * @return AsyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>
     */
    public AsyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse> updatePullSourcesConfigAsyncInvoker(
        UpdatePullSourcesConfigRequest request) {
        return new AsyncInvoker<UpdatePullSourcesConfigRequest, UpdatePullSourcesConfigResponse>(request,
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
     * @param UpdateRecordCallbackConfigRequest 请求对象
     * @return AsyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>
     */
    public AsyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse> updateRecordCallbackConfigAsyncInvoker(
        UpdateRecordCallbackConfigRequest request) {
        return new AsyncInvoker<UpdateRecordCallbackConfigRequest, UpdateRecordCallbackConfigResponse>(request,
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
     * @param UpdateRecordRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>
     */
    public AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse> updateRecordRuleAsyncInvoker(
        UpdateRecordRuleRequest request) {
        return new AsyncInvoker<UpdateRecordRuleRequest, UpdateRecordRuleResponse>(request, LiveMeta.updateRecordRule,
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
     * @param UpdateSnapshotConfigRequest 请求对象
     * @return AsyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>
     */
    public AsyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse> updateSnapshotConfigAsyncInvoker(
        UpdateSnapshotConfigRequest request) {
        return new AsyncInvoker<UpdateSnapshotConfigRequest, UpdateSnapshotConfigResponse>(request,
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
     * @param UpdateStreamForbiddenRequest 请求对象
     * @return AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>
     */
    public AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse> updateStreamForbiddenAsyncInvoker(
        UpdateStreamForbiddenRequest request) {
        return new AsyncInvoker<UpdateStreamForbiddenRequest, UpdateStreamForbiddenResponse>(request,
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
     * @param UpdateTranscodingsTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>
     */
    public AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse> updateTranscodingsTemplateAsyncInvoker(
        UpdateTranscodingsTemplateRequest request) {
        return new AsyncInvoker<UpdateTranscodingsTemplateRequest, UpdateTranscodingsTemplateResponse>(request,
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
     * @param DeleteDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>
     */
    public AsyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse> deleteDomainHttpsCertAsyncInvoker(
        DeleteDomainHttpsCertRequest request) {
        return new AsyncInvoker<DeleteDomainHttpsCertRequest, DeleteDomainHttpsCertResponse>(request,
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
     * @param ShowDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>
     */
    public AsyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse> showDomainHttpsCertAsyncInvoker(
        ShowDomainHttpsCertRequest request) {
        return new AsyncInvoker<ShowDomainHttpsCertRequest, ShowDomainHttpsCertResponse>(request,
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
     * @param UpdateDomainHttpsCertRequest 请求对象
     * @return AsyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>
     */
    public AsyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse> updateDomainHttpsCertAsyncInvoker(
        UpdateDomainHttpsCertRequest request) {
        return new AsyncInvoker<UpdateDomainHttpsCertRequest, UpdateDomainHttpsCertResponse>(request,
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
     * @param UpdateObsBucketAuthorityPublicRequest 请求对象
     * @return AsyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>
     */
    public AsyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse> updateObsBucketAuthorityPublicAsyncInvoker(
        UpdateObsBucketAuthorityPublicRequest request) {
        return new AsyncInvoker<UpdateObsBucketAuthorityPublicRequest, UpdateObsBucketAuthorityPublicResponse>(request,
            LiveMeta.updateObsBucketAuthorityPublic, hcClient);
    }

}
