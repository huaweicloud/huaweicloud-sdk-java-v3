package com.huaweicloud.sdk.dcos.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class DcosClient {

    protected HcClient hcClient;

    public DcosClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcosClient> newBuilder() {
        ClientBuilder<DcosClient> clientBuilder =
            new ClientBuilder<>(DcosClient::new, "GlobalCredentials,BasicCredentials");
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
     * @return ListOrderResponse
     */
    public ListOrderResponse listOrder(ListOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.listOrder);
    }

    /**
     * 客户查询服务单列表
     *
     * 客户查询服务单列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListOrderRequest 请求对象
     * @return SyncInvoker<ListOrderRequest, ListOrderResponse>
     */
    public SyncInvoker<ListOrderRequest, ListOrderResponse> listOrderInvoker(ListOrderRequest request) {
        return new SyncInvoker<>(request, DcosMeta.listOrder, hcClient);
    }

    /**
     * 客户创建服务单
     *
     * 客户创建服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrderRequest 请求对象
     * @return SaveOrderResponse
     */
    public SaveOrderResponse saveOrder(SaveOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.saveOrder);
    }

    /**
     * 客户创建服务单
     *
     * 客户创建服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SaveOrderRequest 请求对象
     * @return SyncInvoker<SaveOrderRequest, SaveOrderResponse>
     */
    public SyncInvoker<SaveOrderRequest, SaveOrderResponse> saveOrderInvoker(SaveOrderRequest request) {
        return new SyncInvoker<>(request, DcosMeta.saveOrder, hcClient);
    }

    /**
     * 客户查询服务单详情
     *
     * 客户查询服务单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return ShowOrderResponse
     */
    public ShowOrderResponse showOrder(ShowOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.showOrder);
    }

    /**
     * 客户查询服务单详情
     *
     * 客户查询服务单详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderRequest 请求对象
     * @return SyncInvoker<ShowOrderRequest, ShowOrderResponse>
     */
    public SyncInvoker<ShowOrderRequest, ShowOrderResponse> showOrderInvoker(ShowOrderRequest request) {
        return new SyncInvoker<>(request, DcosMeta.showOrder, hcClient);
    }

    /**
     * 获取服务单目录列表
     *
     * 获取服务单目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderCatalogueRequest 请求对象
     * @return ShowOrderCatalogueResponse
     */
    public ShowOrderCatalogueResponse showOrderCatalogue(ShowOrderCatalogueRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.showOrderCatalogue);
    }

    /**
     * 获取服务单目录列表
     *
     * 获取服务单目录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderCatalogueRequest 请求对象
     * @return SyncInvoker<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse>
     */
    public SyncInvoker<ShowOrderCatalogueRequest, ShowOrderCatalogueResponse> showOrderCatalogueInvoker(
        ShowOrderCatalogueRequest request) {
        return new SyncInvoker<>(request, DcosMeta.showOrderCatalogue, hcClient);
    }

    /**
     * 获取服务服务单项目信息
     *
     * 获取服务服务单项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderInformationRequest 请求对象
     * @return ShowOrderInformationResponse
     */
    public ShowOrderInformationResponse showOrderInformation(ShowOrderInformationRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.showOrderInformation);
    }

    /**
     * 获取服务服务单项目信息
     *
     * 获取服务服务单项目信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowOrderInformationRequest 请求对象
     * @return SyncInvoker<ShowOrderInformationRequest, ShowOrderInformationResponse>
     */
    public SyncInvoker<ShowOrderInformationRequest, ShowOrderInformationResponse> showOrderInformationInvoker(
        ShowOrderInformationRequest request) {
        return new SyncInvoker<>(request, DcosMeta.showOrderInformation, hcClient);
    }

    /**
     * 资产列表
     *
     * 资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageAssetListResultRequest 请求对象
     * @return ShowPageAssetListResultResponse
     */
    public ShowPageAssetListResultResponse showPageAssetListResult(ShowPageAssetListResultRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.showPageAssetListResult);
    }

    /**
     * 资产列表
     *
     * 资产列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPageAssetListResultRequest 请求对象
     * @return SyncInvoker<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse>
     */
    public SyncInvoker<ShowPageAssetListResultRequest, ShowPageAssetListResultResponse> showPageAssetListResultInvoker(
        ShowPageAssetListResultRequest request) {
        return new SyncInvoker<>(request, DcosMeta.showPageAssetListResult, hcClient);
    }

    /**
     * 上传附件
     *
     * 上传附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return UploadFileResponse
     */
    public UploadFileResponse uploadFile(UploadFileRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.uploadFile);
    }

    /**
     * 上传附件
     *
     * 上传附件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UploadFileRequest 请求对象
     * @return SyncInvoker<UploadFileRequest, UploadFileResponse>
     */
    public SyncInvoker<UploadFileRequest, UploadFileResponse> uploadFileInvoker(UploadFileRequest request) {
        return new SyncInvoker<>(request, DcosMeta.uploadFile, hcClient);
    }

    /**
     * 验收服务单
     *
     * 验收服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyOrderRequest 请求对象
     * @return VerifyOrderResponse
     */
    public VerifyOrderResponse verifyOrder(VerifyOrderRequest request) {
        return hcClient.syncInvokeHttp(request, DcosMeta.verifyOrder);
    }

    /**
     * 验收服务单
     *
     * 验收服务单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request VerifyOrderRequest 请求对象
     * @return SyncInvoker<VerifyOrderRequest, VerifyOrderResponse>
     */
    public SyncInvoker<VerifyOrderRequest, VerifyOrderResponse> verifyOrderInvoker(VerifyOrderRequest request) {
        return new SyncInvoker<>(request, DcosMeta.verifyOrder, hcClient);
    }

}
