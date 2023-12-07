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
     * 删除资源标签配置接口
     *
     * 用于删除资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteTagsRequest 请求对象
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
     * @param BatchDeleteTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>
     */
    public SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse> batchDeleteTagsInvoker(
        BatchDeleteTagsRequest request) {
        return new SyncInvoker<BatchDeleteTagsRequest, BatchDeleteTagsResponse>(request, CdnMeta.batchDeleteTags,
            hcClient);
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
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
     * @param CreateDomainRequest 请求对象
     * @return SyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public SyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainInvoker(CreateDomainRequest request) {
        return new SyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CdnMeta.createDomain, hcClient);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePreheatingTasksRequest 请求对象
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
     * @param CreatePreheatingTasksRequest 请求对象
     * @return SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>
     */
    public SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksInvoker(
        CreatePreheatingTasksRequest request) {
        return new SyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>(request,
            CdnMeta.createPreheatingTasks, hcClient);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRefreshTasksRequest 请求对象
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
     * @param CreateRefreshTasksRequest 请求对象
     * @return SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>
     */
    public SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksInvoker(
        CreateRefreshTasksRequest request) {
        return new SyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>(request,
            CdnMeta.createRefreshTasks, hcClient);
    }

    /**
     * 创建资源标签配置接口
     *
     * 用于创建资源标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagsRequest 请求对象
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
     * @param CreateTagsRequest 请求对象
     * @return SyncInvoker<CreateTagsRequest, CreateTagsResponse>
     */
    public SyncInvoker<CreateTagsRequest, CreateTagsResponse> createTagsInvoker(CreateTagsRequest request) {
        return new SyncInvoker<CreateTagsRequest, CreateTagsResponse>(request, CdnMeta.createTags, hcClient);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
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
     * @param DeleteDomainRequest 请求对象
     * @return SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public SyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainInvoker(DeleteDomainRequest request) {
        return new SyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CdnMeta.deleteDomain, hcClient);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableDomainRequest 请求对象
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
     * @param DisableDomainRequest 请求对象
     * @return SyncInvoker<DisableDomainRequest, DisableDomainResponse>
     */
    public SyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainInvoker(DisableDomainRequest request) {
        return new SyncInvoker<DisableDomainRequest, DisableDomainResponse>(request, CdnMeta.disableDomain, hcClient);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableDomainRequest 请求对象
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
     * @param EnableDomainRequest 请求对象
     * @return SyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public SyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainInvoker(EnableDomainRequest request) {
        return new SyncInvoker<EnableDomainRequest, EnableDomainResponse>(request, CdnMeta.enableDomain, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.listDomains);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return SyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public SyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsInvoker(ListDomainsRequest request) {
        return new SyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CdnMeta.listDomains, hcClient);
    }

    /**
     * 查询IP黑白名单
     *
     * 查询域名已经设置的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlackWhiteListRequest 请求对象
     * @return ShowBlackWhiteListResponse
     */
    public ShowBlackWhiteListResponse showBlackWhiteList(ShowBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showBlackWhiteList);
    }

    /**
     * 查询IP黑白名单
     *
     * 查询域名已经设置的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBlackWhiteListRequest 请求对象
     * @return SyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>
     */
    public SyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteListInvoker(
        ShowBlackWhiteListRequest request) {
        return new SyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>(request,
            CdnMeta.showBlackWhiteList, hcClient);
    }

    /**
     * 查询缓存规则
     *
     * 查询缓存规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCacheRulesRequest 请求对象
     * @return ShowCacheRulesResponse
     */
    public ShowCacheRulesResponse showCacheRules(ShowCacheRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showCacheRules);
    }

    /**
     * 查询缓存规则
     *
     * 查询缓存规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCacheRulesRequest 请求对象
     * @return SyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>
     */
    public SyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRulesInvoker(
        ShowCacheRulesRequest request) {
        return new SyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>(request, CdnMeta.showCacheRules,
            hcClient);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowCertificatesHttpsInfoRequest 请求对象
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
     * @param ShowCertificatesHttpsInfoRequest 请求对象
     * @return SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>
     */
    public SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new SyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>(request,
            CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 查询加速域名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainDetailRequest 请求对象
     * @return ShowDomainDetailResponse
     */
    public ShowDomainDetailResponse showDomainDetail(ShowDomainDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainDetail);
    }

    /**
     * 查询加速域名详情
     *
     * 查询加速域名详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainDetailRequest 请求对象
     * @return SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailInvoker(
        ShowDomainDetailRequest request) {
        return new SyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>(request, CdnMeta.showDomainDetail,
            hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，
     * 支持查询回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return ShowDomainFullConfigResponse
     */
    public ShowDomainFullConfigResponse showDomainFullConfig(ShowDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，
     * 支持查询回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    public SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigInvoker(
        ShowDomainFullConfigRequest request) {
        return new SyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>(request,
            CdnMeta.showDomainFullConfig, hcClient);
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
     * @param ShowDomainItemDetailsRequest 请求对象
     * @return ShowDomainItemDetailsResponse
     */
    @Deprecated
    public ShowDomainItemDetailsResponse showDomainItemDetails(ShowDomainItemDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainItemDetails);
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
     * @param ShowDomainItemDetailsRequest 请求对象
     * @return SyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>
     */
    @Deprecated
    public SyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetailsInvoker(
        ShowDomainItemDetailsRequest request) {
        return new SyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>(request,
            CdnMeta.showDomainItemDetails, hcClient);
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
     * @param ShowDomainItemLocationDetailsRequest 请求对象
     * @return ShowDomainItemLocationDetailsResponse
     */
    @Deprecated
    public ShowDomainItemLocationDetailsResponse showDomainItemLocationDetails(
        ShowDomainItemLocationDetailsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainItemLocationDetails);
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
     * @param ShowDomainItemLocationDetailsRequest 请求对象
     * @return SyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>
     */
    @Deprecated
    public SyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsInvoker(
        ShowDomainItemLocationDetailsRequest request) {
        return new SyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>(request,
            CdnMeta.showDomainItemLocationDetails, hcClient);
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
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return ShowDomainLocationStatsResponse
     */
    @Deprecated
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
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    @Deprecated
    public SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsInvoker(
        ShowDomainLocationStatsRequest request) {
        return new SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
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
     * @param ShowDomainStatsRequest 请求对象
     * @return ShowDomainStatsResponse
     */
    @Deprecated
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
     * @param ShowDomainStatsRequest 请求对象
     * @return SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    @Deprecated
    public SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsInvoker(
        ShowDomainStatsRequest request) {
        return new SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTaskDetailsRequest 请求对象
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
     * @param ShowHistoryTaskDetailsRequest 请求对象
     * @return SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>
     */
    public SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new SyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>(request,
            CdnMeta.showHistoryTaskDetails, hcClient);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHistoryTasksRequest 请求对象
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
     * @param ShowHistoryTasksRequest 请求对象
     * @return SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>
     */
    public SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksInvoker(
        ShowHistoryTasksRequest request) {
        return new SyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>(request, CdnMeta.showHistoryTasks,
            hcClient);
    }

    /**
     * 查询HTTPS配置
     *
     * 获取加速域名证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHttpInfoRequest 请求对象
     * @return ShowHttpInfoResponse
     */
    public ShowHttpInfoResponse showHttpInfo(ShowHttpInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showHttpInfo);
    }

    /**
     * 查询HTTPS配置
     *
     * 获取加速域名证书。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowHttpInfoRequest 请求对象
     * @return SyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>
     */
    public SyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfoInvoker(ShowHttpInfoRequest request) {
        return new SyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>(request, CdnMeta.showHttpInfo, hcClient);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpInfoRequest 请求对象
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
     * @param ShowIpInfoRequest 请求对象
     * @return SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>
     */
    public SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoInvoker(ShowIpInfoRequest request) {
        return new SyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>(request, CdnMeta.showIpInfo, hcClient);
    }

    /**
     * 日志查询
     *
     * 查询日志下载链接，支持查询30天内的日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLogsRequest 请求对象
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
     * @param ShowLogsRequest 请求对象
     * @return SyncInvoker<ShowLogsRequest, ShowLogsResponse>
     */
    public SyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsInvoker(ShowLogsRequest request) {
        return new SyncInvoker<ShowLogsRequest, ShowLogsResponse>(request, CdnMeta.showLogs, hcClient);
    }

    /**
     * 查询回源HOST
     *
     * 查询回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOriginHostRequest 请求对象
     * @return ShowOriginHostResponse
     */
    public ShowOriginHostResponse showOriginHost(ShowOriginHostRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showOriginHost);
    }

    /**
     * 查询回源HOST
     *
     * 查询回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowOriginHostRequest 请求对象
     * @return SyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>
     */
    public SyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHostInvoker(
        ShowOriginHostRequest request) {
        return new SyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>(request, CdnMeta.showOriginHost,
            hcClient);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
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
     * @param ShowQuotaRequest 请求对象
     * @return SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public SyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaInvoker(ShowQuotaRequest request) {
        return new SyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, CdnMeta.showQuota, hcClient);
    }

    /**
     * 查询Referer过滤规则
     *
     * 查询Referer过滤规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReferRequest 请求对象
     * @return ShowReferResponse
     */
    public ShowReferResponse showRefer(ShowReferRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showRefer);
    }

    /**
     * 查询Referer过滤规则
     *
     * 查询Referer过滤规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowReferRequest 请求对象
     * @return SyncInvoker<ShowReferRequest, ShowReferResponse>
     */
    public SyncInvoker<ShowReferRequest, ShowReferResponse> showReferInvoker(ShowReferRequest request) {
        return new SyncInvoker<ShowReferRequest, ShowReferResponse>(request, CdnMeta.showRefer, hcClient);
    }

    /**
     * 查询响应头配置
     *
     * 列举header所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResponseHeaderRequest 请求对象
     * @return ShowResponseHeaderResponse
     */
    public ShowResponseHeaderResponse showResponseHeader(ShowResponseHeaderRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showResponseHeader);
    }

    /**
     * 查询响应头配置
     *
     * 列举header所有配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResponseHeaderRequest 请求对象
     * @return SyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>
     */
    public SyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeaderInvoker(
        ShowResponseHeaderRequest request) {
        return new SyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>(request,
            CdnMeta.showResponseHeader, hcClient);
    }

    /**
     * 查询资源标签列表配置接口
     *
     * 用于查询资源标签列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTagsRequest 请求对象
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
     * @param ShowTagsRequest 请求对象
     * @return SyncInvoker<ShowTagsRequest, ShowTagsResponse>
     */
    public SyncInvoker<ShowTagsRequest, ShowTagsResponse> showTagsInvoker(ShowTagsRequest request) {
        return new SyncInvoker<ShowTagsRequest, ShowTagsResponse>(request, CdnMeta.showTags, hcClient);
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
     * @param ShowTopUrlRequest 请求对象
     * @return ShowTopUrlResponse
     */
    @Deprecated
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
     * @param ShowTopUrlRequest 请求对象
     * @return SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    @Deprecated
    public SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlInvoker(ShowTopUrlRequest request) {
        return new SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowUrlTaskInfoRequest 请求对象
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
     * @param ShowUrlTaskInfoRequest 请求对象
     * @return SyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>
     */
    public SyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfoInvoker(
        ShowUrlTaskInfoRequest request) {
        return new SyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>(request, CdnMeta.showUrlTaskInfo,
            hcClient);
    }

    /**
     * 设置IP黑白名单
     *
     * 设置域名的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListRequest 请求对象
     * @return UpdateBlackWhiteListResponse
     */
    public UpdateBlackWhiteListResponse updateBlackWhiteList(UpdateBlackWhiteListRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateBlackWhiteList);
    }

    /**
     * 设置IP黑白名单
     *
     * 设置域名的IP黑白名单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListRequest 请求对象
     * @return SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListInvoker(
        UpdateBlackWhiteListRequest request) {
        return new SyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
            CdnMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 设置缓存规则
     *
     * 设置CDN节点上缓存资源的缓存策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCacheRulesRequest 请求对象
     * @return UpdateCacheRulesResponse
     */
    public UpdateCacheRulesResponse updateCacheRules(UpdateCacheRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateCacheRules);
    }

    /**
     * 设置缓存规则
     *
     * 设置CDN节点上缓存资源的缓存策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCacheRulesRequest 请求对象
     * @return SyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>
     */
    public SyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRulesInvoker(
        UpdateCacheRulesRequest request) {
        return new SyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>(request, CdnMeta.updateCacheRules,
            hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，
     * 支持修改回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return UpdateDomainFullConfigResponse
     */
    public UpdateDomainFullConfigResponse updateDomainFullConfig(UpdateDomainFullConfigRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名配置接口，
     * 支持修改回源请求头、HTTP header配置、URL鉴权、证书、源站、回源协议、强制重定向、智能压缩、IPv6开关、状态码缓存时间、Range回源、User-Agent黑白名单、改写回源URL、自定义错误页面、缓存规则、IP黑白名单、防盗链、强制跳转。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    public SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigInvoker(
        UpdateDomainFullConfigRequest request) {
        return new SyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>(request,
            CdnMeta.updateDomainFullConfig, hcClient);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainMultiCertificatesRequest 请求对象
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
     * @param UpdateDomainMultiCertificatesRequest 请求对象
     * @return SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>
     */
    public SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new SyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>(request,
            CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    /**
     * 修改源站信息。
     *
     * 修改加速域名的源站配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainOriginRequest 请求对象
     * @return UpdateDomainOriginResponse
     */
    public UpdateDomainOriginResponse updateDomainOrigin(UpdateDomainOriginRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateDomainOrigin);
    }

    /**
     * 修改源站信息。
     *
     * 修改加速域名的源站配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateDomainOriginRequest 请求对象
     * @return SyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>
     */
    public SyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOriginInvoker(
        UpdateDomainOriginRequest request) {
        return new SyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>(request,
            CdnMeta.updateDomainOrigin, hcClient);
    }

    /**
     * 开启/关闭回源跟随
     *
     * 开启此项配置后，当CDN节点回源请求源站返回301/302状态码时，CDN节点会先跳转到301/302对应地址获取资源并缓存后再返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFollow302SwitchRequest 请求对象
     * @return UpdateFollow302SwitchResponse
     */
    public UpdateFollow302SwitchResponse updateFollow302Switch(UpdateFollow302SwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateFollow302Switch);
    }

    /**
     * 开启/关闭回源跟随
     *
     * 开启此项配置后，当CDN节点回源请求源站返回301/302状态码时，CDN节点会先跳转到301/302对应地址获取资源并缓存后再返回给用户。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFollow302SwitchRequest 请求对象
     * @return SyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>
     */
    public SyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302SwitchInvoker(
        UpdateFollow302SwitchRequest request) {
        return new SyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>(request,
            CdnMeta.updateFollow302Switch, hcClient);
    }

    /**
     * 配置HTTPS
     *
     * 设置加速域名HTTPS。通过配置加速域名的HTTPS证书，并将其部署在全网CDN节点，实现HTTPS安全加速。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHttpsInfoRequest 请求对象
     * @return UpdateHttpsInfoResponse
     */
    public UpdateHttpsInfoResponse updateHttpsInfo(UpdateHttpsInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateHttpsInfo);
    }

    /**
     * 配置HTTPS
     *
     * 设置加速域名HTTPS。通过配置加速域名的HTTPS证书，并将其部署在全网CDN节点，实现HTTPS安全加速。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateHttpsInfoRequest 请求对象
     * @return SyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>
     */
    public SyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfoInvoker(
        UpdateHttpsInfoRequest request) {
        return new SyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>(request, CdnMeta.updateHttpsInfo,
            hcClient);
    }

    /**
     * 修改回源HOST。
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOriginHostRequest 请求对象
     * @return UpdateOriginHostResponse
     */
    public UpdateOriginHostResponse updateOriginHost(UpdateOriginHostRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateOriginHost);
    }

    /**
     * 修改回源HOST。
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateOriginHostRequest 请求对象
     * @return SyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>
     */
    public SyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHostInvoker(
        UpdateOriginHostRequest request) {
        return new SyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>(request, CdnMeta.updateOriginHost,
            hcClient);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateBucketAccessRequest 请求对象
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
     * @param UpdatePrivateBucketAccessRequest 请求对象
     * @return SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>
     */
    public SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new SyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>(request,
            CdnMeta.updatePrivateBucketAccess, hcClient);
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
     * @param UpdateRangeSwitchRequest 请求对象
     * @return UpdateRangeSwitchResponse
     */
    public UpdateRangeSwitchResponse updateRangeSwitch(UpdateRangeSwitchRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateRangeSwitch);
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
     * @param UpdateRangeSwitchRequest 请求对象
     * @return SyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>
     */
    public SyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitchInvoker(
        UpdateRangeSwitchRequest request) {
        return new SyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>(request, CdnMeta.updateRangeSwitch,
            hcClient);
    }

    /**
     * 设置Referer过滤规则
     *
     * 设置Referer过滤规则。通过设置过滤策略，对访问者身份进行识别和过滤，实现限制访问来源的目的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReferRequest 请求对象
     * @return UpdateReferResponse
     */
    public UpdateReferResponse updateRefer(UpdateReferRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateRefer);
    }

    /**
     * 设置Referer过滤规则
     *
     * 设置Referer过滤规则。通过设置过滤策略，对访问者身份进行识别和过滤，实现限制访问来源的目的。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateReferRequest 请求对象
     * @return SyncInvoker<UpdateReferRequest, UpdateReferResponse>
     */
    public SyncInvoker<UpdateReferRequest, UpdateReferResponse> updateReferInvoker(UpdateReferRequest request) {
        return new SyncInvoker<UpdateReferRequest, UpdateReferResponse>(request, CdnMeta.updateRefer, hcClient);
    }

    /**
     * 新增/修改响应头配置
     *
     * 新增/修改域名响应头配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResponseHeaderRequest 请求对象
     * @return UpdateResponseHeaderResponse
     */
    public UpdateResponseHeaderResponse updateResponseHeader(UpdateResponseHeaderRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.updateResponseHeader);
    }

    /**
     * 新增/修改响应头配置
     *
     * 新增/修改域名响应头配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResponseHeaderRequest 请求对象
     * @return SyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>
     */
    public SyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeaderInvoker(
        UpdateResponseHeaderRequest request) {
        return new SyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>(request,
            CdnMeta.updateResponseHeader, hcClient);
    }

}
