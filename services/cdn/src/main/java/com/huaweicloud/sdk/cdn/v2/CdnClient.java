package com.huaweicloud.sdk.cdn.v2;

import com.huaweicloud.sdk.cdn.v2.model.*;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CdnClient {

    protected HcClient hcClient;

    public CdnClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CdnClient> newBuilder() {
        return new ClientBuilder<>(CdnClient::new, "GlobalCredentials");
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCopyDomainRequest 请求对象
     * @return BatchCopyDomainResponse
     */
    public BatchCopyDomainResponse batchCopyDomain(BatchCopyDomainRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.batchCopyDomain);
    }

    /**
     * 批量域名复制
     *
     * 批量域名复制接口
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCopyDomainRequest 请求对象
     * @return SyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>
     */
    public SyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse> batchCopyDomainInvoker(
        BatchCopyDomainRequest request) {
        return new SyncInvoker<BatchCopyDomainRequest, BatchCopyDomainResponse>(request, CdnMeta.batchCopyDomain,
            hcClient);
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
     * @param DownloadRegionCarrierExcelRequest 请求对象
     * @return DownloadRegionCarrierExcelResponse
     */
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
     * @param DownloadRegionCarrierExcelRequest 请求对象
     * @return SyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>
     */
    public SyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse> downloadRegionCarrierExcelInvoker(
        DownloadRegionCarrierExcelRequest request) {
        return new SyncInvoker<DownloadRegionCarrierExcelRequest, DownloadRegionCarrierExcelResponse>(request,
            CdnMeta.downloadRegionCarrierExcel, hcClient);
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
     * @param DownloadStatisticsExcelRequest 请求对象
     * @return DownloadStatisticsExcelResponse
     */
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
     * @param DownloadStatisticsExcelRequest 请求对象
     * @return SyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>
     */
    public SyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse> downloadStatisticsExcelInvoker(
        DownloadStatisticsExcelRequest request) {
        return new SyncInvoker<DownloadStatisticsExcelRequest, DownloadStatisticsExcelResponse>(request,
            CdnMeta.downloadStatisticsExcel, hcClient);
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
     * @param SetChargeModesRequest 请求对象
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
     * @param SetChargeModesRequest 请求对象
     * @return SyncInvoker<SetChargeModesRequest, SetChargeModesResponse>
     */
    public SyncInvoker<SetChargeModesRequest, SetChargeModesResponse> setChargeModesInvoker(
        SetChargeModesRequest request) {
        return new SyncInvoker<SetChargeModesRequest, SetChargeModesResponse>(request, CdnMeta.setChargeModes,
            hcClient);
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
     * @param ShowBandwidthCalcRequest 请求对象
     * @return ShowBandwidthCalcResponse
     */
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
     * @param ShowBandwidthCalcRequest 请求对象
     * @return SyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>
     */
    public SyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse> showBandwidthCalcInvoker(
        ShowBandwidthCalcRequest request) {
        return new SyncInvoker<ShowBandwidthCalcRequest, ShowBandwidthCalcResponse>(request, CdnMeta.showBandwidthCalc,
            hcClient);
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
     * @param ShowChargeModesRequest 请求对象
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
     * @param ShowChargeModesRequest 请求对象
     * @return SyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>
     */
    public SyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse> showChargeModesInvoker(
        ShowChargeModesRequest request) {
        return new SyncInvoker<ShowChargeModesRequest, ShowChargeModesResponse>(request, CdnMeta.showChargeModes,
            hcClient);
    }

    /**
     * 查询域名统计区域运营商数据
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
    public ShowDomainLocationStatsResponse showDomainLocationStats(ShowDomainLocationStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainLocationStats);
    }

    /**
     * 查询域名统计区域运营商数据
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
    public SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse> showDomainLocationStatsInvoker(
        ShowDomainLocationStatsRequest request) {
        return new SyncInvoker<ShowDomainLocationStatsRequest, ShowDomainLocationStatsResponse>(request,
            CdnMeta.showDomainLocationStats, hcClient);
    }

    /**
     * 查询域名统计基础数据
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
    public ShowDomainStatsResponse showDomainStats(ShowDomainStatsRequest request) {
        return hcClient.syncInvokeHttp(request, CdnMeta.showDomainStats);
    }

    /**
     * 查询域名统计基础数据
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
    public SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse> showDomainStatsInvoker(
        ShowDomainStatsRequest request) {
        return new SyncInvoker<ShowDomainStatsRequest, ShowDomainStatsResponse>(request, CdnMeta.showDomainStats,
            hcClient);
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
     * @param ShowTopDomainNamesRequest 请求对象
     * @return ShowTopDomainNamesResponse
     */
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
     * @param ShowTopDomainNamesRequest 请求对象
     * @return SyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>
     */
    public SyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse> showTopDomainNamesInvoker(
        ShowTopDomainNamesRequest request) {
        return new SyncInvoker<ShowTopDomainNamesRequest, ShowTopDomainNamesResponse>(request,
            CdnMeta.showTopDomainNames, hcClient);
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
     * @param ShowTopUrlRequest 请求对象
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
     * @param ShowTopUrlRequest 请求对象
     * @return SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>
     */
    public SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse> showTopUrlInvoker(ShowTopUrlRequest request) {
        return new SyncInvoker<ShowTopUrlRequest, ShowTopUrlResponse>(request, CdnMeta.showTopUrl, hcClient);
    }

}
