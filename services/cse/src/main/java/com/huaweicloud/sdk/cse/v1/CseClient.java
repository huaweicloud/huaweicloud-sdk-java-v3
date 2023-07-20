package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieResponse;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.UploadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.UploadKieResponse;

public class CseClient {

    protected HcClient hcClient;

    public CseClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CseClient> newBuilder() {
        ClientBuilder<CseClient> clientBuilder = new ClientBuilder<>(CseClient::new);
        return clientBuilder;
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return CreateEngineResponse
     */
    public CreateEngineResponse createEngine(CreateEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.createEngine);
    }

    /**
     * 创建微服务引擎专享版
     *
     * 创建微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEngineRequest 请求对象
     * @return SyncInvoker<CreateEngineRequest, CreateEngineResponse>
     */
    public SyncInvoker<CreateEngineRequest, CreateEngineResponse> createEngineInvoker(CreateEngineRequest request) {
        return new SyncInvoker<CreateEngineRequest, CreateEngineResponse>(request, CseMeta.createEngine, hcClient);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return DeleteEngineResponse
     */
    public DeleteEngineResponse deleteEngine(DeleteEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.deleteEngine);
    }

    /**
     * 删除微服务引擎专享版
     *
     * 删除微服务引擎专享版。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEngineRequest 请求对象
     * @return SyncInvoker<DeleteEngineRequest, DeleteEngineResponse>
     */
    public SyncInvoker<DeleteEngineRequest, DeleteEngineResponse> deleteEngineInvoker(DeleteEngineRequest request) {
        return new SyncInvoker<DeleteEngineRequest, DeleteEngineResponse>(request, CseMeta.deleteEngine, hcClient);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadKieRequest 请求对象
     * @return DownloadKieResponse
     */
    public DownloadKieResponse downloadKie(DownloadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.downloadKie);
    }

    /**
     * 导出kie配置
     *
     * 导出kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DownloadKieRequest 请求对象
     * @return SyncInvoker<DownloadKieRequest, DownloadKieResponse>
     */
    public SyncInvoker<DownloadKieRequest, DownloadKieResponse> downloadKieInvoker(DownloadKieRequest request) {
        return new SyncInvoker<DownloadKieRequest, DownloadKieResponse>(request, CseMeta.downloadKie, hcClient);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return ListEnginesResponse
     */
    public ListEnginesResponse listEngines(ListEnginesRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listEngines);
    }

    /**
     * 查询微服务引擎列表
     *
     * 查询微服务引擎列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnginesRequest 请求对象
     * @return SyncInvoker<ListEnginesRequest, ListEnginesResponse>
     */
    public SyncInvoker<ListEnginesRequest, ListEnginesResponse> listEnginesInvoker(ListEnginesRequest request) {
        return new SyncInvoker<ListEnginesRequest, ListEnginesResponse>(request, CseMeta.listEngines, hcClient);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.listFlavors);
    }

    /**
     * 查询微服务引擎专享版的规格列表
     *
     * 查询微服务引擎专享版的规格列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, CseMeta.listFlavors, hcClient);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryEngineRequest 请求对象
     * @return RetryEngineResponse
     */
    public RetryEngineResponse retryEngine(RetryEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.retryEngine);
    }

    /**
     * 对微服务引擎专享版进行重试
     *
     * 对微服务引擎专享版进行重试
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RetryEngineRequest 请求对象
     * @return SyncInvoker<RetryEngineRequest, RetryEngineResponse>
     */
    public SyncInvoker<RetryEngineRequest, RetryEngineResponse> retryEngineInvoker(RetryEngineRequest request) {
        return new SyncInvoker<RetryEngineRequest, RetryEngineResponse>(request, CseMeta.retryEngine, hcClient);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return ShowEngineResponse
     */
    public ShowEngineResponse showEngine(ShowEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngine);
    }

    /**
     * 查询微服务引擎专享版详情
     *
     * 查询微服务引擎专享版详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineRequest 请求对象
     * @return SyncInvoker<ShowEngineRequest, ShowEngineResponse>
     */
    public SyncInvoker<ShowEngineRequest, ShowEngineResponse> showEngineInvoker(ShowEngineRequest request) {
        return new SyncInvoker<ShowEngineRequest, ShowEngineResponse>(request, CseMeta.showEngine, hcClient);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineJobRequest 请求对象
     * @return ShowEngineJobResponse
     */
    public ShowEngineJobResponse showEngineJob(ShowEngineJobRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.showEngineJob);
    }

    /**
     * 查询微服务引擎任务详情
     *
     * 查询微服务引擎任务详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEngineJobRequest 请求对象
     * @return SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>
     */
    public SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJobInvoker(ShowEngineJobRequest request) {
        return new SyncInvoker<ShowEngineJobRequest, ShowEngineJobResponse>(request, CseMeta.showEngineJob, hcClient);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineRequest 请求对象
     * @return UpgradeEngineResponse
     */
    public UpgradeEngineResponse upgradeEngine(UpgradeEngineRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.upgradeEngine);
    }

    /**
     * 升级微服务引擎专享版
     *
     * 升级微服务引擎专享版
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeEngineRequest 请求对象
     * @return SyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>
     */
    public SyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngineInvoker(UpgradeEngineRequest request) {
        return new SyncInvoker<UpgradeEngineRequest, UpgradeEngineResponse>(request, CseMeta.upgradeEngine, hcClient);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadKieRequest 请求对象
     * @return UploadKieResponse
     */
    public UploadKieResponse uploadKie(UploadKieRequest request) {
        return hcClient.syncInvokeHttp(request, CseMeta.uploadKie);
    }

    /**
     * 导入kie配置
     *
     * 导入kie配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadKieRequest 请求对象
     * @return SyncInvoker<UploadKieRequest, UploadKieResponse>
     */
    public SyncInvoker<UploadKieRequest, UploadKieResponse> uploadKieInvoker(UploadKieRequest request) {
        return new SyncInvoker<UploadKieRequest, UploadKieResponse>(request, CseMeta.uploadKie, hcClient);
    }

}
