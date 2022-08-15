package com.huaweicloud.sdk.cdn.v1;

import com.huaweicloud.sdk.cdn.v1.model.*;
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
        return new ClientBuilder<>(CdnAsyncClient::new, "GlobalCredentials");
    }

    /**
     * 创建加速域名
     *
     * 创建加速域名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDomainRequest 请求对象
     * @return AsyncInvoker<CreateDomainRequest, CreateDomainResponse>
     */
    public AsyncInvoker<CreateDomainRequest, CreateDomainResponse> createDomainAsyncInvoker(
        CreateDomainRequest request) {
        return new AsyncInvoker<CreateDomainRequest, CreateDomainResponse>(request, CdnMeta.createDomain, hcClient);
    }

    /**
     * 创建预热缓存任务
     *
     * 创建预热任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePreheatingTasksRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePreheatingTasksRequest 请求对象
     * @return AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>
     */
    public AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse> createPreheatingTasksAsyncInvoker(
        CreatePreheatingTasksRequest request) {
        return new AsyncInvoker<CreatePreheatingTasksRequest, CreatePreheatingTasksResponse>(request,
            CdnMeta.createPreheatingTasks, hcClient);
    }

    /**
     * 创建刷新缓存任务
     *
     * 创建刷新缓存任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRefreshTasksRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRefreshTasksRequest 请求对象
     * @return AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>
     */
    public AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse> createRefreshTasksAsyncInvoker(
        CreateRefreshTasksRequest request) {
        return new AsyncInvoker<CreateRefreshTasksRequest, CreateRefreshTasksResponse>(request,
            CdnMeta.createRefreshTasks, hcClient);
    }

    /**
     * 删除加速域名
     *
     * 删除加速域名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDomainRequest 请求对象
     * @return AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>
     */
    public AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse> deleteDomainAsyncInvoker(
        DeleteDomainRequest request) {
        return new AsyncInvoker<DeleteDomainRequest, DeleteDomainResponse>(request, CdnMeta.deleteDomain, hcClient);
    }

    /**
     * 停用加速域名
     *
     * 停用加速域名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableDomainRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisableDomainRequest 请求对象
     * @return AsyncInvoker<DisableDomainRequest, DisableDomainResponse>
     */
    public AsyncInvoker<DisableDomainRequest, DisableDomainResponse> disableDomainAsyncInvoker(
        DisableDomainRequest request) {
        return new AsyncInvoker<DisableDomainRequest, DisableDomainResponse>(request, CdnMeta.disableDomain, hcClient);
    }

    /**
     * 启用加速域名
     *
     * 启用加速域名。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableDomainRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableDomainRequest 请求对象
     * @return AsyncInvoker<EnableDomainRequest, EnableDomainResponse>
     */
    public AsyncInvoker<EnableDomainRequest, EnableDomainResponse> enableDomainAsyncInvoker(
        EnableDomainRequest request) {
        return new AsyncInvoker<EnableDomainRequest, EnableDomainResponse>(request, CdnMeta.enableDomain, hcClient);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return CompletableFuture<ListDomainsResponse>
     */
    public CompletableFuture<ListDomainsResponse> listDomainsAsync(ListDomainsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.listDomains);
    }

    /**
     * 查询加速域名
     *
     * 查询加速域名信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDomainsRequest 请求对象
     * @return AsyncInvoker<ListDomainsRequest, ListDomainsResponse>
     */
    public AsyncInvoker<ListDomainsRequest, ListDomainsResponse> listDomainsAsyncInvoker(ListDomainsRequest request) {
        return new AsyncInvoker<ListDomainsRequest, ListDomainsResponse>(request, CdnMeta.listDomains, hcClient);
    }

    /**
     * 查询IP黑白名单
     *
     * 查询域名已经设置的IP黑白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlackWhiteListRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>
     */
    public AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse> showBlackWhiteListAsyncInvoker(
        ShowBlackWhiteListRequest request) {
        return new AsyncInvoker<ShowBlackWhiteListRequest, ShowBlackWhiteListResponse>(request,
            CdnMeta.showBlackWhiteList, hcClient);
    }

    /**
     * 查询缓存规则
     *
     * 查询缓存规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCacheRulesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCacheRulesRequest 请求对象
     * @return AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>
     */
    public AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse> showCacheRulesAsyncInvoker(
        ShowCacheRulesRequest request) {
        return new AsyncInvoker<ShowCacheRulesRequest, ShowCacheRulesResponse>(request, CdnMeta.showCacheRules,
            hcClient);
    }

    /**
     * 查询所有绑定HTTPS证书的域名信息
     *
     * 查询所有绑定HTTPS证书的域名信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificatesHttpsInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowCertificatesHttpsInfoRequest 请求对象
     * @return AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>
     */
    public AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse> showCertificatesHttpsInfoAsyncInvoker(
        ShowCertificatesHttpsInfoRequest request) {
        return new AsyncInvoker<ShowCertificatesHttpsInfoRequest, ShowCertificatesHttpsInfoResponse>(request,
            CdnMeta.showCertificatesHttpsInfo, hcClient);
    }

    /**
     * 查询加速域名详情
     *
     * 查询加速域名详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainDetailRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainDetailRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>
     */
    public AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse> showDomainDetailAsyncInvoker(
        ShowDomainDetailRequest request) {
        return new AsyncInvoker<ShowDomainDetailRequest, ShowDomainDetailResponse>(request, CdnMeta.showDomainDetail,
            hcClient);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持配置回源请求头、http header配置、url鉴权
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return CompletableFuture<ShowDomainFullConfigResponse>
     */
    public CompletableFuture<ShowDomainFullConfigResponse> showDomainFullConfigAsync(
        ShowDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainFullConfig);
    }

    /**
     * 查询域名配置接口
     *
     * 查询域名配置接口，支持配置回源请求头、http header配置、url鉴权
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>
     */
    public AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse> showDomainFullConfigAsyncInvoker(
        ShowDomainFullConfigRequest request) {
        return new AsyncInvoker<ShowDomainFullConfigRequest, ShowDomainFullConfigResponse>(request,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainItemDetailsRequest 请求对象
     * @return CompletableFuture<ShowDomainItemDetailsResponse>
     */
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainItemDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>
     */
    public AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse> showDomainItemDetailsAsyncInvoker(
        ShowDomainItemDetailsRequest request) {
        return new AsyncInvoker<ShowDomainItemDetailsRequest, ShowDomainItemDetailsResponse>(request,
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainItemLocationDetailsRequest 请求对象
     * @return CompletableFuture<ShowDomainItemLocationDetailsResponse>
     */
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainItemLocationDetailsRequest 请求对象
     * @return AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>
     */
    public AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse> showDomainItemLocationDetailsAsyncInvoker(
        ShowDomainItemLocationDetailsRequest request) {
        return new AsyncInvoker<ShowDomainItemLocationDetailsRequest, ShowDomainItemLocationDetailsResponse>(request,
            CdnMeta.showDomainItemLocationDetails, hcClient);
    }

    /**
     * 查询域名统计数据-区域运营商
     *
     * - 支持查询90天内的数据。
     * - 支持多指标同时查询，不超过5个。
     * - 最多同时指定20个域名。
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点， 返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - action取值：location_detail,location_summary
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * - 单租户调用频率：15次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainLocationStatsResponse>
     */
    public CompletableFuture<ShowDomainLocationStatsResponse> showDomainLocationStatsAsync(
        ShowDomainLocationStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    /**
     * 查询域名统计数据-区域运营商
     *
     * - 支持查询90天内的数据。
     * - 支持多指标同时查询，不超过5个。
     * - 最多同时指定20个域名。
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点， 返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - action取值：location_detail,location_summary
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的区域运营商明细数据。
     * - 单租户调用频率：15次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainLocationStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>
     */
    public AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsAsyncInvoker(
        ShowDomainLocationStatsRequest request) {
        return new AsyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * - 支持多指标同时查询，不超过5个。
     * - 最多同时指定20个域名。
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - action取值：detail,summary
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 单租户调用频率：15次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainStatsRequest 请求对象
     * @return CompletableFuture<ShowDomainStatsResponse>
     */
    public CompletableFuture<ShowDomainStatsResponse> showDomainStatsAsync(ShowDomainStatsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /**
     * 查询域名统计数据
     *
     * - 支持查询90天内的数据。
     * - 支持多指标同时查询，不超过5个。
     * - 最多同时指定20个域名。
     * - 起始时间和结束时间需要同时指定，左闭右开，毫秒级时间戳，必须为5分钟整时刻点，如：0分、5分、10分、15分等，如果传的不是5分钟时刻点，返回数据可能与预期不一致。统一用开始时间表示一个时间段，如：2019-01-24 20:15:00 表示取 [20:15:00, 20:20:00)的统计数据，且左闭右开。
     * - action取值：detail,summary
     * - 流量类指标单位统一为Byte（字节）、带宽类指标单位统一为bit/s（比特/秒）、请求数类和状态码类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 单租户调用频率：15次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainStatsRequest 请求对象
     * @return AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>
     */
    public AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsAsyncInvoker(
        ShowDomainStatsRequest request) {
        return new AsyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
    }

    /**
     * 查询刷新预热任务详情
     *
     * 查询刷新预热任务详情。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHistoryTaskDetailsRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHistoryTaskDetailsRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>
     */
    public AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse> showHistoryTaskDetailsAsyncInvoker(
        ShowHistoryTaskDetailsRequest request) {
        return new AsyncInvoker<ShowHistoryTaskDetailsRequest, ShowHistoryTaskDetailsResponse>(request,
            CdnMeta.showHistoryTaskDetails, hcClient);
    }

    /**
     * 查询刷新预热任务
     *
     * 查询刷新预热任务。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHistoryTasksRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHistoryTasksRequest 请求对象
     * @return AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>
     */
    public AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse> showHistoryTasksAsyncInvoker(
        ShowHistoryTasksRequest request) {
        return new AsyncInvoker<ShowHistoryTasksRequest, ShowHistoryTasksResponse>(request, CdnMeta.showHistoryTasks,
            hcClient);
    }

    /**
     * 查询HTTPS配置
     *
     * 获取加速域名证书。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHttpInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowHttpInfoRequest 请求对象
     * @return AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>
     */
    public AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse> showHttpInfoAsyncInvoker(
        ShowHttpInfoRequest request) {
        return new AsyncInvoker<ShowHttpInfoRequest, ShowHttpInfoResponse>(request, CdnMeta.showHttpInfo, hcClient);
    }

    /**
     * 查询IP归属信息
     *
     * 查询IP归属信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIpInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowIpInfoRequest 请求对象
     * @return AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>
     */
    public AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse> showIpInfoAsyncInvoker(ShowIpInfoRequest request) {
        return new AsyncInvoker<ShowIpInfoRequest, ShowIpInfoResponse>(request, CdnMeta.showIpInfo, hcClient);
    }

    /**
     * 日志查询
     *
     * 日志查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLogsRequest 请求对象
     * @return CompletableFuture<ShowLogsResponse>
     */
    public CompletableFuture<ShowLogsResponse> showLogsAsync(ShowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showLogs);
    }

    /**
     * 日志查询
     *
     * 日志查询。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLogsRequest 请求对象
     * @return AsyncInvoker<ShowLogsRequest, ShowLogsResponse>
     */
    public AsyncInvoker<ShowLogsRequest, ShowLogsResponse> showLogsAsyncInvoker(ShowLogsRequest request) {
        return new AsyncInvoker<ShowLogsRequest, ShowLogsResponse>(request, CdnMeta.showLogs, hcClient);
    }

    /**
     * 查询回源HOST
     *
     * 查询回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOriginHostRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOriginHostRequest 请求对象
     * @return AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>
     */
    public AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse> showOriginHostAsyncInvoker(
        ShowOriginHostRequest request) {
        return new AsyncInvoker<ShowOriginHostRequest, ShowOriginHostResponse>(request, CdnMeta.showOriginHost,
            hcClient);
    }

    /**
     * 查询用户配额
     *
     * 查询当前用户域名、刷新文件、刷新目录和预热的配额
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotaRequest 请求对象
     * @return AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>
     */
    public AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse> showQuotaAsyncInvoker(ShowQuotaRequest request) {
        return new AsyncInvoker<ShowQuotaRequest, ShowQuotaResponse>(request, CdnMeta.showQuota, hcClient);
    }

    /**
     * 查询Referer过滤规则
     *
     * 查询Referer过滤规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowReferRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowReferRequest 请求对象
     * @return AsyncInvoker<ShowReferRequest, ShowReferResponse>
     */
    public AsyncInvoker<ShowReferRequest, ShowReferResponse> showReferAsyncInvoker(ShowReferRequest request) {
        return new AsyncInvoker<ShowReferRequest, ShowReferResponse>(request, CdnMeta.showRefer, hcClient);
    }

    /**
     * 查询响应头配置
     *
     * 列举header所有配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResponseHeaderRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResponseHeaderRequest 请求对象
     * @return AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>
     */
    public AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse> showResponseHeaderAsyncInvoker(
        ShowResponseHeaderRequest request) {
        return new AsyncInvoker<ShowResponseHeaderRequest, ShowResponseHeaderResponse>(request,
            CdnMeta.showResponseHeader, hcClient);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * - 支持查询90天内的数据。
     * - 查询跨度不能超过31天。
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 单租户调用频率：5次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTopUrlRequest 请求对象
     * @return CompletableFuture<ShowTopUrlResponse>
     */
    public CompletableFuture<ShowTopUrlResponse> showTopUrlAsync(ShowTopUrlRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showTopUrl);
    }

    /**
     * 查询TOP100 URL明细
     *
     * - 查询TOP100 URL明细。
     * - 支持查询90天内的数据。
     * - 查询跨度不能超过31天。
     * - 起始时间和结束时间，左闭右开，需要同时指定。如查询2021-10-24 00:00:00 到 2021-10-25 00:00:00 的数据，表示取 [2021-10-24 00:00:00, 2021-10-25 00:00:00)的统计数据。
     * - 开始时间、结束时间必须传毫秒级时间戳，且必须为凌晨0点整时刻点，如果传的不是凌晨0点整时刻点，返回数据可能与预期不一致。
     * - 流量类指标单位统一为Byte（字节）、请求数类指标单位统一为次数。用于查询指定域名、指定统计指标的明细数据。
     * - 单租户调用频率：5次/s。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowTopUrlRequest 请求对象
     * @return AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    public AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlAsyncInvoker(ShowTopUrlRequest request) {
        return new AsyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUrlTaskInfoRequest 请求对象
     * @return CompletableFuture<ShowUrlTaskInfoResponse>
     */
    public CompletableFuture<ShowUrlTaskInfoResponse> showUrlTaskInfoAsync(ShowUrlTaskInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.showUrlTaskInfo);
    }

    /**
     * 查询刷新预热URL记录
     *
     * 查询刷新预热URL记录。如需此接口，请提交工单开通
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowUrlTaskInfoRequest 请求对象
     * @return AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>
     */
    public AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse> showUrlTaskInfoAsyncInvoker(
        ShowUrlTaskInfoRequest request) {
        return new AsyncInvoker<ShowUrlTaskInfoRequest, ShowUrlTaskInfoResponse>(request, CdnMeta.showUrlTaskInfo,
            hcClient);
    }

    /**
     * 设置IP黑白名单
     *
     * 设置域名的IP黑白名单。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateBlackWhiteListRequest 请求对象
     * @return AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>
     */
    public AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse> updateBlackWhiteListAsyncInvoker(
        UpdateBlackWhiteListRequest request) {
        return new AsyncInvoker<UpdateBlackWhiteListRequest, UpdateBlackWhiteListResponse>(request,
            CdnMeta.updateBlackWhiteList, hcClient);
    }

    /**
     * 设置缓存规则
     *
     * 设置CDN节点上缓存资源的缓存策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCacheRulesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCacheRulesRequest 请求对象
     * @return AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>
     */
    public AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse> updateCacheRulesAsyncInvoker(
        UpdateCacheRulesRequest request) {
        return new AsyncInvoker<UpdateCacheRulesRequest, UpdateCacheRulesResponse>(request, CdnMeta.updateCacheRules,
            hcClient);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名全量配置接口，支持配置回源请求头、http header配置、url鉴权
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return CompletableFuture<UpdateDomainFullConfigResponse>
     */
    public CompletableFuture<UpdateDomainFullConfigResponse> updateDomainFullConfigAsync(
        UpdateDomainFullConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainFullConfig);
    }

    /**
     * 修改域名全量配置接口
     *
     * 修改域名全量配置接口，支持配置回源请求头、http header配置、url鉴权
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainFullConfigRequest 请求对象
     * @return AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>
     */
    public AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse> updateDomainFullConfigAsyncInvoker(
        UpdateDomainFullConfigRequest request) {
        return new AsyncInvoker<UpdateDomainFullConfigRequest, UpdateDomainFullConfigResponse>(request,
            CdnMeta.updateDomainFullConfig, hcClient);
    }

    /**
     * 一个证书批量设置多个域名
     *
     * 一个证书配置多个域名，设置域名强制https回源参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainMultiCertificatesRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainMultiCertificatesRequest 请求对象
     * @return AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>
     */
    public AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse> updateDomainMultiCertificatesAsyncInvoker(
        UpdateDomainMultiCertificatesRequest request) {
        return new AsyncInvoker<UpdateDomainMultiCertificatesRequest, UpdateDomainMultiCertificatesResponse>(request,
            CdnMeta.updateDomainMultiCertificates, hcClient);
    }

    /**
     * 修改源站信息
     *
     * 修改源站信息。源站IP地址或域名都可以指引CDN节点回源到对应的源站服务器，源站域名不能与加速域名相同。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainOriginRequest 请求对象
     * @return CompletableFuture<UpdateDomainOriginResponse>
     */
    public CompletableFuture<UpdateDomainOriginResponse> updateDomainOriginAsync(UpdateDomainOriginRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateDomainOrigin);
    }

    /**
     * 修改源站信息
     *
     * 修改源站信息。源站IP地址或域名都可以指引CDN节点回源到对应的源站服务器，源站域名不能与加速域名相同。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDomainOriginRequest 请求对象
     * @return AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>
     */
    public AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse> updateDomainOriginAsyncInvoker(
        UpdateDomainOriginRequest request) {
        return new AsyncInvoker<UpdateDomainOriginRequest, UpdateDomainOriginResponse>(request,
            CdnMeta.updateDomainOrigin, hcClient);
    }

    /**
     * 开启/关闭回源跟随
     *
     * 开启此项配置后，当CDN节点回源请求源站返回301/302状态码时，CDN节点会先跳转到301/302对应地址获取资源并缓存后再返回给用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFollow302SwitchRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateFollow302SwitchRequest 请求对象
     * @return AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>
     */
    public AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse> updateFollow302SwitchAsyncInvoker(
        UpdateFollow302SwitchRequest request) {
        return new AsyncInvoker<UpdateFollow302SwitchRequest, UpdateFollow302SwitchResponse>(request,
            CdnMeta.updateFollow302Switch, hcClient);
    }

    /**
     * 配置HTTPS
     *
     * 设置加速域名HTTPS。通过配置加速域名的HTTPS证书，并将其部署在全网CDN节点，实现HTTPS安全加速。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHttpsInfoRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateHttpsInfoRequest 请求对象
     * @return AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>
     */
    public AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse> updateHttpsInfoAsyncInvoker(
        UpdateHttpsInfoRequest request) {
        return new AsyncInvoker<UpdateHttpsInfoRequest, UpdateHttpsInfoResponse>(request, CdnMeta.updateHttpsInfo,
            hcClient);
    }

    /**
     * 修改回源HOST
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateOriginHostRequest 请求对象
     * @return CompletableFuture<UpdateOriginHostResponse>
     */
    public CompletableFuture<UpdateOriginHostResponse> updateOriginHostAsync(UpdateOriginHostRequest request) {
        return hcClient.asyncInvokeHttp(request, CdnMeta.updateOriginHost);
    }

    /**
     * 修改回源HOST
     *
     * 修改回源HOST。回源HOST是CDN节点在回源过程中，在源站访问的站点域名，即http请求头中的host信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateOriginHostRequest 请求对象
     * @return AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>
     */
    public AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse> updateOriginHostAsyncInvoker(
        UpdateOriginHostRequest request) {
        return new AsyncInvoker<UpdateOriginHostRequest, UpdateOriginHostResponse>(request, CdnMeta.updateOriginHost,
            hcClient);
    }

    /**
     * 修改私有桶开启关闭状态
     *
     * 修改私有桶开启关闭状态。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivateBucketAccessRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivateBucketAccessRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>
     */
    public AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse> updatePrivateBucketAccessAsyncInvoker(
        UpdatePrivateBucketAccessRequest request) {
        return new AsyncInvoker<UpdatePrivateBucketAccessRequest, UpdatePrivateBucketAccessResponse>(request,
            CdnMeta.updatePrivateBucketAccess, hcClient);
    }

    /**
     * 开启/关闭Range回源
     *
     * Range回源是指源站在收到CDN节点回源请求时，根据http请求头中的Range信息返回指定范围的数据给CDN节点。
     * 
     * 开启Range回源前需要确认源站是否支持Range请求，若源站不支持Range请求，开启Range回源将导致资源无法缓存。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRangeSwitchRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRangeSwitchRequest 请求对象
     * @return AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>
     */
    public AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse> updateRangeSwitchAsyncInvoker(
        UpdateRangeSwitchRequest request) {
        return new AsyncInvoker<UpdateRangeSwitchRequest, UpdateRangeSwitchResponse>(request, CdnMeta.updateRangeSwitch,
            hcClient);
    }

    /**
     * 设置Referer过滤规则
     *
     * 设置Referer过滤规则。通过设置过滤策略，对访问者身份进行识别和过滤，实现限制访问来源的目的。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReferRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReferRequest 请求对象
     * @return AsyncInvoker<UpdateReferRequest, UpdateReferResponse>
     */
    public AsyncInvoker<UpdateReferRequest, UpdateReferResponse> updateReferAsyncInvoker(UpdateReferRequest request) {
        return new AsyncInvoker<UpdateReferRequest, UpdateReferResponse>(request, CdnMeta.updateRefer, hcClient);
    }

    /**
     * 新增/修改响应头配置
     *
     * 新增/修改域名响应头配置。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResponseHeaderRequest 请求对象
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResponseHeaderRequest 请求对象
     * @return AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>
     */
    public AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse> updateResponseHeaderAsyncInvoker(
        UpdateResponseHeaderRequest request) {
        return new AsyncInvoker<UpdateResponseHeaderRequest, UpdateResponseHeaderResponse>(request,
            CdnMeta.updateResponseHeader, hcClient);
    }

}
