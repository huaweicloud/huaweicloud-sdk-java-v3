package com.huaweicloud.sdk.msgsms.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.msgsms.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class MsgsmsAsyncClient {

    protected HcClient hcClient;

    public MsgsmsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MsgsmsAsyncClient> newBuilder() {
        return new ClientBuilder<>(MsgsmsAsyncClient::new);
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return CompletableFuture<CreateAppResponse>
     */
    public CompletableFuture<CreateAppResponse> createAppAsync(CreateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.createApp);
    }

    /**
     * 创建短信应用
     *
     * 该接口用于用户创建应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateAppRequest 请求对象
     * @return AsyncInvoker<CreateAppRequest, CreateAppResponse>
     */
    public AsyncInvoker<CreateAppRequest, CreateAppResponse> createAppAsyncInvoker(CreateAppRequest request) {
        return new AsyncInvoker<CreateAppRequest, CreateAppResponse>(request, MsgsmsMeta.createApp, hcClient);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppDetailsRequest 请求对象
     * @return CompletableFuture<ListAppDetailsResponse>
     */
    public CompletableFuture<ListAppDetailsResponse> listAppDetailsAsync(ListAppDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.listAppDetails);
    }

    /**
     * 查询短信应用
     *
     * 该接口用于用户查询已创建的应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAppDetailsRequest 请求对象
     * @return AsyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse>
     */
    public AsyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse> listAppDetailsAsyncInvoker(
        ListAppDetailsRequest request) {
        return new AsyncInvoker<ListAppDetailsRequest, ListAppDetailsResponse>(request, MsgsmsMeta.listAppDetails,
            hcClient);
    }

    /**
     * 获取应用详情
     *
     * 该接口用于用户查询应用详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return CompletableFuture<ShowAppResponse>
     */
    public CompletableFuture<ShowAppResponse> showAppAsync(ShowAppRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.showApp);
    }

    /**
     * 获取应用详情
     *
     * 该接口用于用户查询应用详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppRequest 请求对象
     * @return AsyncInvoker<ShowAppRequest, ShowAppResponse>
     */
    public AsyncInvoker<ShowAppRequest, ShowAppResponse> showAppAsyncInvoker(ShowAppRequest request) {
        return new AsyncInvoker<ShowAppRequest, ShowAppResponse>(request, MsgsmsMeta.showApp, hcClient);
    }

    /**
     * 查询应用数量
     *
     * 该接口用于用户查询应用使用的数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppCountRequest 请求对象
     * @return CompletableFuture<ShowAppCountResponse>
     */
    public CompletableFuture<ShowAppCountResponse> showAppCountAsync(ShowAppCountRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.showAppCount);
    }

    /**
     * 查询应用数量
     *
     * 该接口用于用户查询应用使用的数量信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAppCountRequest 请求对象
     * @return AsyncInvoker<ShowAppCountRequest, ShowAppCountResponse>
     */
    public AsyncInvoker<ShowAppCountRequest, ShowAppCountResponse> showAppCountAsyncInvoker(
        ShowAppCountRequest request) {
        return new AsyncInvoker<ShowAppCountRequest, ShowAppCountResponse>(request, MsgsmsMeta.showAppCount, hcClient);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return CompletableFuture<UpdateAppResponse>
     */
    public CompletableFuture<UpdateAppResponse> updateAppAsync(UpdateAppRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.updateApp);
    }

    /**
     * 修改短信应用
     *
     * 该接口用于用户修改应用信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAppRequest 请求对象
     * @return AsyncInvoker<UpdateAppRequest, UpdateAppResponse>
     */
    public AsyncInvoker<UpdateAppRequest, UpdateAppResponse> updateAppAsyncInvoker(UpdateAppRequest request) {
        return new AsyncInvoker<UpdateAppRequest, UpdateAppResponse>(request, MsgsmsMeta.updateApp, hcClient);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureRequest 请求对象
     * @return CompletableFuture<CreateSignatureResponse>
     */
    public CompletableFuture<CreateSignatureResponse> createSignatureAsync(CreateSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.createSignature);
    }

    /**
     * 创建短信签名
     *
     * 该接口用于用户创建签名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateSignatureRequest 请求对象
     * @return AsyncInvoker<CreateSignatureRequest, CreateSignatureResponse>
     */
    public AsyncInvoker<CreateSignatureRequest, CreateSignatureResponse> createSignatureAsyncInvoker(
        CreateSignatureRequest request) {
        return new AsyncInvoker<CreateSignatureRequest, CreateSignatureResponse>(request, MsgsmsMeta.createSignature,
            hcClient);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的签名信息息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureRequest 请求对象
     * @return CompletableFuture<DeleteSignatureResponse>
     */
    public CompletableFuture<DeleteSignatureResponse> deleteSignatureAsync(DeleteSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.deleteSignature);
    }

    /**
     * 删除短信签名
     *
     * 该接口用于用户删除已创建的签名信息息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteSignatureRequest 请求对象
     * @return AsyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse>
     */
    public AsyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse> deleteSignatureAsyncInvoker(
        DeleteSignatureRequest request) {
        return new AsyncInvoker<DeleteSignatureRequest, DeleteSignatureResponse>(request, MsgsmsMeta.deleteSignature,
            hcClient);
    }

    /**
     * 申请激活签名
     *
     * 该接口用于用户申请激活签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSignatureRequest 请求对象
     * @return CompletableFuture<EnableSignatureResponse>
     */
    public CompletableFuture<EnableSignatureResponse> enableSignatureAsync(EnableSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.enableSignature);
    }

    /**
     * 申请激活签名
     *
     * 该接口用于用户申请激活签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableSignatureRequest 请求对象
     * @return AsyncInvoker<EnableSignatureRequest, EnableSignatureResponse>
     */
    public AsyncInvoker<EnableSignatureRequest, EnableSignatureResponse> enableSignatureAsyncInvoker(
        EnableSignatureRequest request) {
        return new AsyncInvoker<EnableSignatureRequest, EnableSignatureResponse>(request, MsgsmsMeta.enableSignature,
            hcClient);
    }

    /**
     * 查询签名信息
     *
     * 该接口用于用户查询已创建的短信签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureDetailsRequest 请求对象
     * @return CompletableFuture<ListSignatureDetailsResponse>
     */
    public CompletableFuture<ListSignatureDetailsResponse> listSignatureDetailsAsync(
        ListSignatureDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.listSignatureDetails);
    }

    /**
     * 查询签名信息
     *
     * 该接口用于用户查询已创建的短信签名信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSignatureDetailsRequest 请求对象
     * @return AsyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse>
     */
    public AsyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse> listSignatureDetailsAsyncInvoker(
        ListSignatureDetailsRequest request) {
        return new AsyncInvoker<ListSignatureDetailsRequest, ListSignatureDetailsResponse>(request,
            MsgsmsMeta.listSignatureDetails, hcClient);
    }

    /**
     * 获取签名详情
     *
     * 该接口用于用户查询签名详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureRequest 请求对象
     * @return CompletableFuture<ShowSignatureResponse>
     */
    public CompletableFuture<ShowSignatureResponse> showSignatureAsync(ShowSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.showSignature);
    }

    /**
     * 获取签名详情
     *
     * 该接口用于用户查询签名详情信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureRequest 请求对象
     * @return AsyncInvoker<ShowSignatureRequest, ShowSignatureResponse>
     */
    public AsyncInvoker<ShowSignatureRequest, ShowSignatureResponse> showSignatureAsyncInvoker(
        ShowSignatureRequest request) {
        return new AsyncInvoker<ShowSignatureRequest, ShowSignatureResponse>(request, MsgsmsMeta.showSignature,
            hcClient);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询上传的文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureFileRequest 请求对象
     * @return CompletableFuture<ShowSignatureFileResponse>
     */
    public CompletableFuture<ShowSignatureFileResponse> showSignatureFileAsync(ShowSignatureFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.showSignatureFile);
    }

    /**
     * 查询申请文件
     *
     * 该接口用于用户查询上传的文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSignatureFileRequest 请求对象
     * @return AsyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse>
     */
    public AsyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse> showSignatureFileAsyncInvoker(
        ShowSignatureFileRequest request) {
        return new AsyncInvoker<ShowSignatureFileRequest, ShowSignatureFileResponse>(request,
            MsgsmsMeta.showSignatureFile, hcClient);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureRequest 请求对象
     * @return CompletableFuture<UpdateSignatureResponse>
     */
    public CompletableFuture<UpdateSignatureResponse> updateSignatureAsync(UpdateSignatureRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.updateSignature);
    }

    /**
     * 修改短信签名
     *
     * 该接口用于用户更新签名信息，目前仅支持审核不通过的短信签名重新修改。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSignatureRequest 请求对象
     * @return AsyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse>
     */
    public AsyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse> updateSignatureAsyncInvoker(
        UpdateSignatureRequest request) {
        return new AsyncInvoker<UpdateSignatureRequest, UpdateSignatureResponse>(request, MsgsmsMeta.updateSignature,
            hcClient);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSignatureFileRequest 请求对象
     * @return CompletableFuture<UploadSignatureFileResponse>
     */
    public CompletableFuture<UploadSignatureFileResponse> uploadSignatureFileAsync(UploadSignatureFileRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.uploadSignatureFile);
    }

    /**
     * 上传申请文件
     *
     * 该接口用于用户上传文件信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UploadSignatureFileRequest 请求对象
     * @return AsyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse>
     */
    public AsyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse> uploadSignatureFileAsyncInvoker(
        UploadSignatureFileRequest request) {
        return new AsyncInvoker<UploadSignatureFileRequest, UploadSignatureFileResponse>(request,
            MsgsmsMeta.uploadSignatureFile, hcClient);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return CompletableFuture<CreateTemplateResponse>
     */
    public CompletableFuture<CreateTemplateResponse> createTemplateAsync(CreateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.createTemplate);
    }

    /**
     * 创建短信模板
     *
     * 该接口用于用户创建模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTemplateRequest 请求对象
     * @return AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>
     */
    public AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse> createTemplateAsyncInvoker(
        CreateTemplateRequest request) {
        return new AsyncInvoker<CreateTemplateRequest, CreateTemplateResponse>(request, MsgsmsMeta.createTemplate,
            hcClient);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return CompletableFuture<DeleteTemplateResponse>
     */
    public CompletableFuture<DeleteTemplateResponse> deleteTemplateAsync(DeleteTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.deleteTemplate);
    }

    /**
     * 删除短信模板
     *
     * 该接口用于用户删除已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>
     */
    public AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplateAsyncInvoker(
        DeleteTemplateRequest request) {
        return new AsyncInvoker<DeleteTemplateRequest, DeleteTemplateResponse>(request, MsgsmsMeta.deleteTemplate,
            hcClient);
    }

    /**
     * 查询发送国家
     *
     * 该接口用于用户查询短信发送的国家信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSendCountryDetailsRequest 请求对象
     * @return CompletableFuture<ListSendCountryDetailsResponse>
     */
    public CompletableFuture<ListSendCountryDetailsResponse> listSendCountryDetailsAsync(
        ListSendCountryDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.listSendCountryDetails);
    }

    /**
     * 查询发送国家
     *
     * 该接口用于用户查询短信发送的国家信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSendCountryDetailsRequest 请求对象
     * @return AsyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse>
     */
    public AsyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse> listSendCountryDetailsAsyncInvoker(
        ListSendCountryDetailsRequest request) {
        return new AsyncInvoker<ListSendCountryDetailsRequest, ListSendCountryDetailsResponse>(request,
            MsgsmsMeta.listSendCountryDetails, hcClient);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateDetailsRequest 请求对象
     * @return CompletableFuture<ListTemplateDetailsResponse>
     */
    public CompletableFuture<ListTemplateDetailsResponse> listTemplateDetailsAsync(ListTemplateDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.listTemplateDetails);
    }

    /**
     * 查询短信模板
     *
     * 该接口用于用户查询已创建的模板信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateDetailsRequest 请求对象
     * @return AsyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse>
     */
    public AsyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse> listTemplateDetailsAsyncInvoker(
        ListTemplateDetailsRequest request) {
        return new AsyncInvoker<ListTemplateDetailsRequest, ListTemplateDetailsResponse>(request,
            MsgsmsMeta.listTemplateDetails, hcClient);
    }

    /**
     * 查询模板变量
     *
     * 该接口用于用户查询模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateVarilableDetailsRequest 请求对象
     * @return CompletableFuture<ListTemplateVarilableDetailsResponse>
     */
    public CompletableFuture<ListTemplateVarilableDetailsResponse> listTemplateVarilableDetailsAsync(
        ListTemplateVarilableDetailsRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.listTemplateVarilableDetails);
    }

    /**
     * 查询模板变量
     *
     * 该接口用于用户查询模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTemplateVarilableDetailsRequest 请求对象
     * @return AsyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse>
     */
    public AsyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse> listTemplateVarilableDetailsAsyncInvoker(
        ListTemplateVarilableDetailsRequest request) {
        return new AsyncInvoker<ListTemplateVarilableDetailsRequest, ListTemplateVarilableDetailsResponse>(request,
            MsgsmsMeta.listTemplateVarilableDetails, hcClient);
    }

    /**
     * 获取模板详情
     *
     * 该接口用于用户查询已创建的模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return CompletableFuture<ShowTemplateResponse>
     */
    public CompletableFuture<ShowTemplateResponse> showTemplateAsync(ShowTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.showTemplate);
    }

    /**
     * 获取模板详情
     *
     * 该接口用于用户查询已创建的模板详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowTemplateRequest 请求对象
     * @return AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>
     */
    public AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse> showTemplateAsyncInvoker(
        ShowTemplateRequest request) {
        return new AsyncInvoker<ShowTemplateRequest, ShowTemplateResponse>(request, MsgsmsMeta.showTemplate, hcClient);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改模板信息，目前仅支持审核不通过的短信模板重新修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return CompletableFuture<UpdateTemplateResponse>
     */
    public CompletableFuture<UpdateTemplateResponse> updateTemplateAsync(UpdateTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, MsgsmsMeta.updateTemplate);
    }

    /**
     * 修改短信模板
     *
     * 该接口用于用户修改模板信息，目前仅支持审核不通过的短信模板重新修改
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>
     */
    public AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplateAsyncInvoker(
        UpdateTemplateRequest request) {
        return new AsyncInvoker<UpdateTemplateRequest, UpdateTemplateResponse>(request, MsgsmsMeta.updateTemplate,
            hcClient);
    }

}
