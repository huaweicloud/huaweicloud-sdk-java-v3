package com.huaweicloud.sdk.cdn.v1;

import com.huaweicloud.sdk.cdn.v1.model.BatchDeleteTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.BatchDeleteTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreatePreheatingTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreatePreheatingTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreateRefreshTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateRefreshTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.CreateTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.CreateTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.DeleteDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.DeleteDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.DisableDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.DisableDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.EnableDomainRequest;
import com.huaweicloud.sdk.cdn.v1.model.EnableDomainResponse;
import com.huaweicloud.sdk.cdn.v1.model.ListDomainsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ListDomainsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowBlackWhiteListRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowBlackWhiteListResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowCacheRulesRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowCacheRulesResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowCertificatesHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainDetailRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainDetailResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainItemLocationDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainLocationStatsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainLocationStatsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainStatsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowDomainStatsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTaskDetailsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTasksRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHistoryTasksResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowHttpInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowHttpInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowIpInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowIpInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowLogsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowLogsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowOriginHostRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowOriginHostResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowReferRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowReferResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowResponseHeaderRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowResponseHeaderResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowTagsRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowTagsResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowTopUrlRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowTopUrlResponse;
import com.huaweicloud.sdk.cdn.v1.model.ShowUrlTaskInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.ShowUrlTaskInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateBlackWhiteListRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateBlackWhiteListResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateCacheRulesRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateCacheRulesResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainFullConfigRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainFullConfigResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainMultiCertificatesResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainOriginRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateDomainOriginResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateFollow302SwitchRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateFollow302SwitchResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateHttpsInfoRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateHttpsInfoResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateOriginHostRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateOriginHostResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdatePrivateBucketAccessResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateRangeSwitchRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateRangeSwitchResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateReferRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateReferResponse;
import com.huaweicloud.sdk.cdn.v1.model.UpdateResponseHeaderRequest;
import com.huaweicloud.sdk.cdn.v1.model.UpdateResponseHeaderResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CdnAsyncClient {

    protected HcClient hcClient;

    public CdnAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnAsyncClient> newBuilder() {
        ClientBuilder<CdnAsyncClient> clientBuilder = new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
        return clientBuilder;
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteTagsResponse>
     */
    public CompletableFuture<BatchDeleteTagsResponse> batchDeleteTagsAsync(BatchDeleteTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.batchDeleteTags);
    }

    /**
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public AsyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsAsyncInvoker(
        BatchDeleteTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.batchDeleteTags, hcClient);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return CompletableFuture<CreateDomainResponse>
     */
    public CompletableFuture<CreateDomainResponse> createDomainAsync(CreateDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createDomain);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createDomain, hcClient);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return CompletableFuture<CreatePreheatingTasksResponse>
     */
    public CompletableFuture<CreatePreheatingTasksResponse> createPreheatingTasksAsync(
        CreatePreheatingTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createPreheatingTasks);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePreheatingTasksRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>
     */
    public AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksAsyncInvoker(
        CreatePreheatingTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createPreheatingTasks, hcClient);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return CompletableFuture<CreateRefreshTasksResponse>
     */
    public CompletableFuture<CreateRefreshTasksResponse> createRefreshTasksAsync(CreateRefreshTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createRefreshTasks);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRefreshTasksRequest 请求对象
     * @return AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>
     */
    public AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksAsyncInvoker(
        CreateRefreshTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createRefreshTasks, hcClient);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return CompletableFuture<CreateTagsResponse>
     */
    public CompletableFuture<CreateTagsResponse> createTagsAsync(CreateTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.createTags);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagsRequest 请求对象
     * @return AsyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public AsyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsAsyncInvoker(CreateTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.createTags, hcClient);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return CompletableFuture<DeleteDomainResponse>
     */
    public CompletableFuture<DeleteDomainResponse> deleteDomainAsync(DeleteDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.deleteDomain);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.deleteDomain, hcClient);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return CompletableFuture<DisableDomainResponse>
     */
    public CompletableFuture<DisableDomainResponse> disableDomainAsync(DisableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.disableDomain);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDomainRequest 请求对象
     * @return AsyncInvoker<DisableDomainRequest, DisableDomainResponse>
     */
    public AsyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainAsyncInvoker(
        DisableDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.disableDomain, hcClient);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return CompletableFuture<EnableDomainResponse>
     */
    public CompletableFuture<EnableDomainResponse> enableDomainAsync(EnableDomainRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.enableDomain);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDomainRequest 请求对象
     * @return AsyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public AsyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainAsyncInvoker(
        EnableDomainRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.enableDomain, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    @Deprecated
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.listDomains);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    @Deprecated
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.listDomains, hcClient);
    }

    /**
     * 查询IP黑白名单
     *
     * 查询域名已经设置的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlackWhiteListRequest 请求对象
     * @return CompletableFuture<ShowBlackWhiteListResponse>
     */
    public CompletableFuture<ShowBlackWhiteListResponse> showBlackWhiteListAsync(ShowBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showBlackWhiteList);
    }

    /**
     * 查询IP黑白名单
     *
     * 查询域名已经设置的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>
     */
    public AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteListAsyncInvoker(
        ShowBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showBlackWhiteList, hcClient);
    }

    /**
     * 查询缓存规则
     *
     * 查询缓存规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCacheRulesRequest 请求对象
     * @return CompletableFuture<ShowCacheRulesResponse>
     */
    public CompletableFuture<ShowCacheRulesResponse> showCacheRulesAsync(ShowCacheRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showCacheRules);
    }

    /**
     * 查询缓存规则
     *
     * 查询缓存规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCacheRulesRequest 请求对象
     * @return AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>
     */
    public AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRulesAsyncInvoker(
        ShowCacheRulesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showCacheRules, hcClient);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return CompletableFuture<ShowCertificatesHttpsInfoResponse>
     */
    public CompletableFuture<ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsync(
        ShowCertificatesHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showCertificatesHttpsInfo);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCertificatesHttpsInfoRequest 请求对象
     * @return AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>
     */
    public AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsyncInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 查询加速域名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return CompletableFuture<ShowDomainDetailResponse>
     */
    public CompletableFuture<ShowDomainDetailResponse> showDomainDetailAsync(ShowDomainDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainDetail);
    }

    /**
     * 查询加速域名详情
     *
     * 查询加速域名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainDetail, hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，
     * 支持查询回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return CompletableFuture<ShowDomainFullConfigResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDomainFullConfigResponse> showDomainFullConfigAsync(
        ShowDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，
     * 支持查询回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigAsyncInvoker(
        ShowDomainFullConfigRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainFullConfig, hcClient);
    }

    /**
     * 批量查询域名的统计明细-按域名单独返回
     *
     * - 支持查询90天内的数据。
     * - 查询跨度不能超过7天。
     * - 最多同时指定100个域名。
     * - 起始时间和结束时间，左闭右开，需要同时指定。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。
     * - 统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 如果传的是多个域名，则每个域名的数据分开返回。
     * - 支持同时查询多个指标，不超过10个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainItemDetailsRequest 请求对象
     * @return CompletableFuture<ShowDomainItemDetailsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDomainItemDetailsResponse> showDomainItemDetailsAsync(
        ShowDomainItemDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainItemDetails);
    }

    /**
     * 批量查询域名的统计明细-按域名单独返回
     *
     * - 支持查询90天内的数据。
     * - 查询跨度不能超过7天。
     * - 最多同时指定100个域名。
     * - 起始时间和结束时间，左闭右开，需要同时指定。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。
     * - 统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 如果传的是多个域名，则每个域名的数据分开返回。
     * - 支持同时查询多个指标，不超过10个。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainItemDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetailsAsyncInvoker(
        ShowDomainItemDetailsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainItemDetails, hcClient);
    }

    /**
     * 批量查询域名的区域、运营商统计明细-按域名单独返回
     *
     * - 支持查询90天内的数据。
     * - 查询跨度是7天。
     * - 最多同时指定100个域名。
     * - 起始时间和结束时间，左闭右开，需要同时指定。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。
     * - 统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类指标单位统一为次数。
     * - 用于查询指定域名、指定统计指标的明细数据。
     * - 如果传的是多个域名，则每个域名的数据分开返回。
     * - 支持按区域、运营商维度查询统计数据, 回源指标除外。
     * - 支持同时查询多个指标，不超过10个。
     * - 域名为海外加速场景不适用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainItemLocationDetailsRequest 请求对象
     * @return CompletableFuture<ShowDomainItemLocationDetailsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsAsync(
        ShowDomainItemLocationDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainItemLocationDetails);
    }

    /**
     * 批量查询域名的区域、运营商统计明细-按域名单独返回
     *
     * - 支持查询90天内的数据。
     * - 查询跨度是7天。
     * - 最多同时指定100个域名。
     * - 起始时间和结束时间，左闭右开，需要同时指定。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。
     * - 统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类指标单位统一为次数。
     * - 用于查询指定域名、指定统计指标的明细数据。
     * - 如果传的是多个域名，则每个域名的数据分开返回。
     * - 支持按区域、运营商维度查询统计数据, 回源指标除外。
     * - 支持同时查询多个指标，不超过10个。
     * - 域名为海外加速场景不适用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainItemLocationDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsAsyncInvoker(
        ShowDomainItemLocationDetailsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainItemLocationDetails, hcClient);
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
     * @return CompletableFuture<ShowDomainLocationStatsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
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
     * @return AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainLocationStats, hcClient);
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
     * @return CompletableFuture<ShowDomainStatsResponse>
     */
    @Deprecated
    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
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
     * @return AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showDomainStats, hcClient);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return CompletableFuture<ShowHistoryTaskDetailsResponse>
     */
    public CompletableFuture<ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsync(
        ShowHistoryTaskDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTaskDetails);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>
     */
    public AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsyncInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showHistoryTaskDetails, hcClient);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return CompletableFuture<ShowHistoryTasksResponse>
     */
    public CompletableFuture<ShowHistoryTasksResponse> showHistoryTasksAsync(ShowHistoryTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHistoryTasks);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHistoryTasksRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>
     */
    public AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksAsyncInvoker(
        ShowHistoryTasksRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showHistoryTasks, hcClient);
    }

    /**
     * 查询HTTPS配置
     *
     * 获取加速域名证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpInfoRequest 请求对象
     * @return CompletableFuture<ShowHttpInfoResponse>
     */
    public CompletableFuture<ShowHttpInfoResponse> showHttpInfoAsync(ShowHttpInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showHttpInfo);
    }

    /**
     * 查询HTTPS配置
     *
     * 获取加速域名证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpInfoRequest 请求对象
     * @return AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>
     */
    public AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfoAsyncInvoker(
        ShowHttpInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showHttpInfo, hcClient);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return CompletableFuture<ShowIpInfoResponse>
     */
    public CompletableFuture<ShowIpInfoResponse> showIpInfoAsync(ShowIpInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showIpInfo);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowIpInfoRequest 请求对象
     * @return AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>
     */
    public AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoAsyncInvoker(ShowIpInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showIpInfo, hcClient);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return CompletableFuture<ShowLogsResponse>
     */
    public CompletableFuture<ShowLogsResponse> showLogsAsync(ShowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showLogs);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLogsRequest 请求对象
     * @return AsyncInvoker<ShowLogsRequest, ShowLogsResponse>
     */
    public AsyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsAsyncInvoker(ShowLogsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showLogs, hcClient);
    }

    /**
     * 查询回源HOST
     *
     * 查询回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginHostRequest 请求对象
     * @return CompletableFuture<ShowOriginHostResponse>
     */
    public CompletableFuture<ShowOriginHostResponse> showOriginHostAsync(ShowOriginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showOriginHost);
    }

    /**
     * 查询回源HOST
     *
     * 查询回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOriginHostRequest 请求对象
     * @return AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>
     */
    public AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHostAsyncInvoker(
        ShowOriginHostRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showOriginHost, hcClient);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return CompletableFuture<ShowQuotaResponse>
     */
    public CompletableFuture<ShowQuotaResponse> showQuotaAsync(ShowQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showQuota);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showQuota, hcClient);
    }

    /**
     * 查询Referer过滤规则
     *
     * 查询Referer过滤规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReferRequest 请求对象
     * @return CompletableFuture<ShowReferResponse>
     */
    public CompletableFuture<ShowReferResponse> showReferAsync(ShowReferRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showRefer);
    }

    /**
     * 查询Referer过滤规则
     *
     * 查询Referer过滤规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReferRequest 请求对象
     * @return AsyncInvoker<ShowReferRequest, ShowReferResponse>
     */
    public AsyncInvoker<ShowReferRequest, ShowReferResponse> showReferAsyncInvoker(ShowReferRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showRefer, hcClient);
    }

    /**
     * 查询响应头配置
     *
     * 列举header所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResponseHeaderRequest 请求对象
     * @return CompletableFuture<ShowResponseHeaderResponse>
     */
    public CompletableFuture<ShowResponseHeaderResponse> showResponseHeaderAsync(ShowResponseHeaderRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showResponseHeader);
    }

    /**
     * 查询响应头配置
     *
     * 列举header所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResponseHeaderRequest 请求对象
     * @return AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>
     */
    public AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeaderAsyncInvoker(
        ShowResponseHeaderRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showResponseHeader, hcClient);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return CompletableFuture<ShowTagsResponse>
     */
    public CompletableFuture<ShowTagsResponse> showTagsAsync(ShowTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTags);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagsRequest 请求对象
     * @return AsyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public AsyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsAsyncInvoker(ShowTagsRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showTags, hcClient);
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
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00
     * 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
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
     * @return CompletableFuture<ShowTopUrlResponse>
     */
    @Deprecated
    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
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
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00
     * 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
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
     * @return AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    @Deprecated
    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowUrlTaskInfoResponse>
     */
    public CompletableFuture<ShowUrlTaskInfoResponse> showUrlTaskInfoAsync(ShowUrlTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showUrlTaskInfo);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUrlTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>
     */
    public AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfoAsyncInvoker(
        ShowUrlTaskInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.showUrlTaskInfo, hcClient);
    }

    /**
     * 设置IP黑白名单
     *
     * 设置域名的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return CompletableFuture<UpdateBlackWhiteListResponse>
     */
    public CompletableFuture<UpdateBlackWhiteListResponse> updateBlackWhiteListAsync(
        UpdateBlackWhiteListRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateBlackWhiteList);
    }

    /**
     * 设置IP黑白名单
     *
     * 设置域名的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 设置缓存规则
     *
     * 设置CDN节点上缓存资源的缓存策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCacheRulesRequest 请求对象
     * @return CompletableFuture<UpdateCacheRulesResponse>
     */
    public CompletableFuture<UpdateCacheRulesResponse> updateCacheRulesAsync(UpdateCacheRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateCacheRules);
    }

    /**
     * 设置缓存规则
     *
     * 设置CDN节点上缓存资源的缓存策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCacheRulesRequest 请求对象
     * @return AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>
     */
    public AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRulesAsyncInvoker(
        UpdateCacheRulesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateCacheRules, hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，
     * 支持修改回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return CompletableFuture<UpdateDomainFullConfigResponse>
     */
    @Deprecated
    public CompletableFuture<UpdateDomainFullConfigResponse> updateDomainFullConfigAsync(
        UpdateDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，
     * 支持修改回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    @Deprecated
    public AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigAsyncInvoker(
        UpdateDomainFullConfigRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateDomainFullConfig, hcClient);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return CompletableFuture<UpdateDomainMultiCertificatesResponse>
     */
    public CompletableFuture<UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsync(
        UpdateDomainMultiCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainMultiCertificates);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainMultiCertificatesRequest 请求对象
     * @return AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>
     */
    public AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsyncInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    /**
     * 修改源站信息。
     *
     * 修改加速域名的源站配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainOriginRequest 请求对象
     * @return CompletableFuture<UpdateDomainOriginResponse>
     */
    public CompletableFuture<UpdateDomainOriginResponse> updateDomainOriginAsync(UpdateDomainOriginRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainOrigin);
    }

    /**
     * 修改源站信息。
     *
     * 修改加速域名的源站配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateDomainOriginRequest 请求对象
     * @return AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>
     */
    public AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOriginAsyncInvoker(
        UpdateDomainOriginRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateDomainOrigin, hcClient);
    }

    /**
     * 开启/关闭回源跟随
     *
     * 开启此项配置后，当CDN节点回源请求源站返回301/302状态码时，CDN节点会先跳转到301/302对应地址获取资源并缓存后再返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFollow302SwitchRequest 请求对象
     * @return CompletableFuture<UpdateFollow302SwitchResponse>
     */
    public CompletableFuture<UpdateFollow302SwitchResponse> updateFollow302SwitchAsync(
        UpdateFollow302SwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateFollow302Switch);
    }

    /**
     * 开启/关闭回源跟随
     *
     * 开启此项配置后，当CDN节点回源请求源站返回301/302状态码时，CDN节点会先跳转到301/302对应地址获取资源并缓存后再返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFollow302SwitchRequest 请求对象
     * @return AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>
     */
    public AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302SwitchAsyncInvoker(
        UpdateFollow302SwitchRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateFollow302Switch, hcClient);
    }

    /**
     * 配置HTTPS
     *
     * 设置加速域名HTTPS。通过配置加速域名的HTTPS证书，并将其部署在全网CDN节点，实现HTTPS安全加速。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsInfoRequest 请求对象
     * @return CompletableFuture<UpdateHttpsInfoResponse>
     */
    public CompletableFuture<UpdateHttpsInfoResponse> updateHttpsInfoAsync(UpdateHttpsInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateHttpsInfo);
    }

    /**
     * 配置HTTPS
     *
     * 设置加速域名HTTPS。通过配置加速域名的HTTPS证书，并将其部署在全网CDN节点，实现HTTPS安全加速。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsInfoRequest 请求对象
     * @return AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>
     */
    public AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfoAsyncInvoker(
        UpdateHttpsInfoRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateHttpsInfo, hcClient);
    }

    /**
     * 修改回源HOST。
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOriginHostRequest 请求对象
     * @return CompletableFuture<UpdateOriginHostResponse>
     */
    public CompletableFuture<UpdateOriginHostResponse> updateOriginHostAsync(UpdateOriginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateOriginHost);
    }

    /**
     * 修改回源HOST。
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateOriginHostRequest 请求对象
     * @return AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>
     */
    public AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHostAsyncInvoker(
        UpdateOriginHostRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateOriginHost, hcClient);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return CompletableFuture<UpdatePrivateBucketAccessResponse>
     */
    public CompletableFuture<UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsync(
        UpdatePrivateBucketAccessRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updatePrivateBucketAccess);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateBucketAccessRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>
     */
    public AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsyncInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    /**
     * 开启/关闭Range回源
     *
     * Range回源是指源站在收到CDN节点回源请求时，根据http请求头中的Range信息返回指定范围的数据给CDN节点。
     * 
     * 开启Range回源前需要确认源站是否支持Range请求，若源站不支持Range请求，开启Range回源将导致资源无法缓存。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRangeSwitchRequest 请求对象
     * @return CompletableFuture<UpdateRangeSwitchResponse>
     */
    public CompletableFuture<UpdateRangeSwitchResponse> updateRangeSwitchAsync(UpdateRangeSwitchRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateRangeSwitch);
    }

    /**
     * 开启/关闭Range回源
     *
     * Range回源是指源站在收到CDN节点回源请求时，根据http请求头中的Range信息返回指定范围的数据给CDN节点。
     * 
     * 开启Range回源前需要确认源站是否支持Range请求，若源站不支持Range请求，开启Range回源将导致资源无法缓存。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRangeSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>
     */
    public AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitchAsyncInvoker(
        UpdateRangeSwitchRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateRangeSwitch, hcClient);
    }

    /**
     * 设置Referer过滤规则
     *
     * 设置Referer过滤规则。通过设置过滤策略，对访问者身份进行识别和过滤，实现限制访问来源的目的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReferRequest 请求对象
     * @return CompletableFuture<UpdateReferResponse>
     */
    public CompletableFuture<UpdateReferResponse> updateReferAsync(UpdateReferRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateRefer);
    }

    /**
     * 设置Referer过滤规则
     *
     * 设置Referer过滤规则。通过设置过滤策略，对访问者身份进行识别和过滤，实现限制访问来源的目的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateReferRequest 请求对象
     * @return AsyncInvoker<UpdateReferRequest, UpdateReferResponse>
     */
    public AsyncInvoker<UpdateReferRequest, UpdateReferResponse> updateReferAsyncInvoker(UpdateReferRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateRefer, hcClient);
    }

    /**
     * 新增/修改响应头配置
     *
     * 新增/修改域名响应头配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResponseHeaderRequest 请求对象
     * @return CompletableFuture<UpdateResponseHeaderResponse>
     */
    public CompletableFuture<UpdateResponseHeaderResponse> updateResponseHeaderAsync(
        UpdateResponseHeaderRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateResponseHeader);
    }

    /**
     * 新增/修改响应头配置
     *
     * 新增/修改域名响应头配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResponseHeaderRequest 请求对象
     * @return AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>
     */
    public AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeaderAsyncInvoker(
        UpdateResponseHeaderRequest request) {
        return new AsyncInvoker<>(request, CdnMeta.updateResponseHeader, hcClient);
    }

}
