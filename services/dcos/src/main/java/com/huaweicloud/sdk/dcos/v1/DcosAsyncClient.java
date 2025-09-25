package com.huaweicloud.sdk.dcos.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dcos.v1.model.ListOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.ListOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.SaveOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.SaveOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderCatalogueRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderCatalogueResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderInformationRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderInformationResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowOrderResponse;
import com.huaweicloud.sdk.dcos.v1.model.ShowPageAssetListResultRequest;
import com.huaweicloud.sdk.dcos.v1.model.ShowPageAssetListResultResponse;
import com.huaweicloud.sdk.dcos.v1.model.UploadFileRequest;
import com.huaweicloud.sdk.dcos.v1.model.UploadFileResponse;
import com.huaweicloud.sdk.dcos.v1.model.VerifyOrderRequest;
import com.huaweicloud.sdk.dcos.v1.model.VerifyOrderResponse;

import java.util.concurrent.CompletableFuture;

public class DcosAsyncClient {

    protected HcClient hcClient;

    public DcosAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcosAsyncClient> newBuilder() {
        ClientBuilder<DcosAsyncClient> clientBuilder = new ClientBuilder<>(DcosAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 客户查询服务单列表
     *
     * 客户查询服务单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderRequest 请求对象
     * @return CompletableFuture<ListOrderResponse>
     */
    public CompletableFuture<ListOrderResponse> listOrderAsync(ListOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.listOrder);
    }

    /**
     * 客户查询服务单列表
     *
     * 客户查询服务单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderRequest 请求对象
     * @return AsyncInvoker<ListOrderRequest, ListOrderResponse>
     */
    public AsyncInvoker<ListOrderRequest, ListOrderResponse> listOrderAsyncInvoker(ListOrderRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.listOrder, hcClient);
    }

    /**
     * 客户创建服务单
     *
     * 客户创建服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrderRequest 请求对象
     * @return CompletableFuture<SaveOrderResponse>
     */
    public CompletableFuture<SaveOrderResponse> saveOrderAsync(SaveOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.saveOrder);
    }

    /**
     * 客户创建服务单
     *
     * 客户创建服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrderRequest 请求对象
     * @return AsyncInvoker<SaveOrderRequest, SaveOrderResponse>
     */
    public AsyncInvoker<SaveOrderRequest, SaveOrderResponse> saveOrderAsyncInvoker(SaveOrderRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.saveOrder, hcClient);
    }

    /**
     * 客户查询服务单详情
     *
     * 客户查询服务单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return CompletableFuture<ShowOrderResponse>
     */
    public CompletableFuture<ShowOrderResponse> showOrderAsync(ShowOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.showOrder);
    }

    /**
     * 客户查询服务单详情
     *
     * 客户查询服务单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return AsyncInvoker<ShowOrderRequest, ShowOrderResponse>
     */
    public AsyncInvoker<ShowOrderRequest, ShowOrderResponse> showOrderAsyncInvoker(ShowOrderRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.showOrder, hcClient);
    }

    /**
     * 获取服务单目录列表
     *
     * 获取服务单目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderCatalogueRequest 请求对象
     * @return CompletableFuture<ShowOrderCatalogueResponse>
     */
    public CompletableFuture<ShowOrderCatalogueResponse> showOrderCatalogueAsync(ShowOrderCatalogueRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.showOrderCatalogue);
    }

    /**
     * 获取服务单目录列表
     *
     * 获取服务单目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderCatalogueRequest 请求对象
     * @return AsyncInvoker<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse>
     */
    public AsyncInvoker<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse> showOrderCatalogueAsyncInvoker(
        ShowOrderCatalogueRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.showOrderCatalogue, hcClient);
    }

    /**
     * 获取服务服务单项目信息
     *
     * 获取服务服务单项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderInformationRequest 请求对象
     * @return CompletableFuture<ShowOrderInformationResponse>
     */
    public CompletableFuture<ShowOrderInformationResponse> showOrderInformationAsync(
        ShowOrderInformationRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.showOrderInformation);
    }

    /**
     * 获取服务服务单项目信息
     *
     * 获取服务服务单项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderInformationRequest 请求对象
     * @return AsyncInvoker<ShowOrderInformationRequest, ShowOrderInformationResponse>
     */
    public AsyncInvoker<ShowOrderInformationRequest, ShowOrderInformationResponse> showOrderInformationAsyncInvoker(
        ShowOrderInformationRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.showOrderInformation, hcClient);
    }

    /**
     * 资产列表
     *
     * 资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageAssetListResultRequest 请求对象
     * @return CompletableFuture<ShowPageAssetListResultResponse>
     */
    public CompletableFuture<ShowPageAssetListResultResponse> showPageAssetListResultAsync(
        ShowPageAssetListResultRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.showPageAssetListResult);
    }

    /**
     * 资产列表
     *
     * 资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageAssetListResultRequest 请求对象
     * @return AsyncInvoker<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse>
     */
    public AsyncInvoker<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse> showPageAssetListResultAsyncInvoker(
        ShowPageAssetListResultRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.showPageAssetListResult, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return CompletableFuture<UploadFileResponse>
     */
    public CompletableFuture<UploadFileResponse> uploadFileAsync(UploadFileRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.uploadFile);
    }

    /**
     * 上传附件
     *
     * 上传附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return AsyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public AsyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileAsyncInvoker(UploadFileRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.uploadFile, hcClient);
    }

    /**
     * 验收服务单
     *
     * 验收服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyOrderRequest 请求对象
     * @return CompletableFuture<VerifyOrderResponse>
     */
    public CompletableFuture<VerifyOrderResponse> verifyOrderAsync(VerifyOrderRequest request) {
        return hcClient.asyncInvokeHttp(request, DcosMeta.verifyOrder);
    }

    /**
     * 验收服务单
     *
     * 验收服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyOrderRequest 请求对象
     * @return AsyncInvoker<VerifyOrderRequest, VerifyOrderResponse>
     */
    public AsyncInvoker<VerifyOrderRequest, VerifyOrderResponse> verifyOrderAsyncInvoker(VerifyOrderRequest request) {
        return new AsyncInvoker<>(request, DcosMeta.verifyOrder, hcClient);
    }

}
