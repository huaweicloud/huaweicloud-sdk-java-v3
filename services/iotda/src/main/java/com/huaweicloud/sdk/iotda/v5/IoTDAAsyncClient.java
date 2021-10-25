package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.iotda.v5.model.*;

import java.util.concurrent.CompletableFuture;

public class IoTDAAsyncClient {

    protected HcClient hcClient;

    public IoTDAAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAAsyncClient> newBuilder() {
        return new ClientBuilder<>(IoTDAAsyncClient::new, "BasicCredentials,IoTDACredentials");
    }

    /** 生成接入凭证 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return CompletableFuture<CreateAccessCodeResponse> */
    public CompletableFuture<CreateAccessCodeResponse> createAccessCodeAsync(CreateAccessCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createAccessCode);
    }

    /** 生成接入凭证 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> */
    public AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCodeAsyncInvoker(
        CreateAccessCodeRequest request) {
        return new AsyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>(request, IoTDAMeta.createAccessCode,
            hcClient);
    }

    /** 创建AMQP队列 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     *
     * @param AddQueueRequest 请求对象
     * @return CompletableFuture<AddQueueResponse> */
    public CompletableFuture<AddQueueResponse> addQueueAsync(AddQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addQueue);
    }

    /** 创建AMQP队列 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     *
     * @param AddQueueRequest 请求对象
     * @return AsyncInvoker<AddQueueRequest, AddQueueResponse> */
    public AsyncInvoker<AddQueueRequest, AddQueueResponse> addQueueAsyncInvoker(AddQueueRequest request) {
        return new AsyncInvoker<AddQueueRequest, AddQueueResponse>(request, IoTDAMeta.addQueue, hcClient);
    }

    /** 查询AMQP列表 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     *
     * @param BatchShowQueueRequest 请求对象
     * @return CompletableFuture<BatchShowQueueResponse> */
    public CompletableFuture<BatchShowQueueResponse> batchShowQueueAsync(BatchShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.batchShowQueue);
    }

    /** 查询AMQP列表 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     *
     * @param BatchShowQueueRequest 请求对象
     * @return AsyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> */
    public AsyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueueAsyncInvoker(
        BatchShowQueueRequest request) {
        return new AsyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse>(request, IoTDAMeta.batchShowQueue,
            hcClient);
    }

    /** 删除AMQP队列 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     *
     * @param DeleteQueueRequest 请求对象
     * @return CompletableFuture<DeleteQueueResponse> */
    public CompletableFuture<DeleteQueueResponse> deleteQueueAsync(DeleteQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteQueue);
    }

    /** 删除AMQP队列 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     *
     * @param DeleteQueueRequest 请求对象
     * @return AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> */
    public AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueAsyncInvoker(DeleteQueueRequest request) {
        return new AsyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, IoTDAMeta.deleteQueue, hcClient);
    }

    /** 查询单个AMQP队列 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     *
     * @param ShowQueueRequest 请求对象
     * @return CompletableFuture<ShowQueueResponse> */
    public CompletableFuture<ShowQueueResponse> showQueueAsync(ShowQueueRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showQueue);
    }

    /** 查询单个AMQP队列 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     *
     * @param ShowQueueRequest 请求对象
     * @return AsyncInvoker<ShowQueueRequest, ShowQueueResponse> */
    public AsyncInvoker<ShowQueueRequest, ShowQueueResponse> showQueueAsyncInvoker(ShowQueueRequest request) {
        return new AsyncInvoker<ShowQueueRequest, ShowQueueResponse>(request, IoTDAMeta.showQueue, hcClient);
    }

    /** 创建资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     *
     * @param AddApplicationRequest 请求对象
     * @return CompletableFuture<AddApplicationResponse> */
    public CompletableFuture<AddApplicationResponse> addApplicationAsync(AddApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    /** 创建资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     *
     * @param AddApplicationRequest 请求对象
     * @return AsyncInvoker<AddApplicationRequest, AddApplicationResponse> */
    public AsyncInvoker<AddApplicationRequest, AddApplicationResponse> addApplicationAsyncInvoker(
        AddApplicationRequest request) {
        return new AsyncInvoker<AddApplicationRequest, AddApplicationResponse>(request, IoTDAMeta.addApplication,
            hcClient);
    }

    /** 删除资源空间 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     *
     * @param DeleteApplicationRequest 请求对象
     * @return CompletableFuture<DeleteApplicationResponse> */
    public CompletableFuture<DeleteApplicationResponse> deleteApplicationAsync(DeleteApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    /** 删除资源空间 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     *
     * @param DeleteApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> */
    public AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationAsyncInvoker(
        DeleteApplicationRequest request) {
        return new AsyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            IoTDAMeta.deleteApplication, hcClient);
    }

    /** 查询资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     *
     * @param ShowApplicationRequest 请求对象
     * @return CompletableFuture<ShowApplicationResponse> */
    public CompletableFuture<ShowApplicationResponse> showApplicationAsync(ShowApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    /** 查询资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     *
     * @param ShowApplicationRequest 请求对象
     * @return AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse> */
    public AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationAsyncInvoker(
        ShowApplicationRequest request) {
        return new AsyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, IoTDAMeta.showApplication,
            hcClient);
    }

    /** 查询资源空间列表 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     *
     * @param ShowApplicationsRequest 请求对象
     * @return CompletableFuture<ShowApplicationsResponse> */
    public CompletableFuture<ShowApplicationsResponse> showApplicationsAsync(ShowApplicationsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    /** 查询资源空间列表 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     *
     * @param ShowApplicationsRequest 请求对象
     * @return AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> */
    public AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsAsyncInvoker(
        ShowApplicationsRequest request) {
        return new AsyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>(request, IoTDAMeta.showApplications,
            hcClient);
    }

    /** 下发异步设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。
     * 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等,
     * 详情参考[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)。注意：此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return CompletableFuture<CreateAsyncCommandResponse> */
    public CompletableFuture<CreateAsyncCommandResponse> createAsyncCommandAsync(CreateAsyncCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createAsyncCommand);
    }

    /** 下发异步设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。
     * 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等,
     * 详情参考[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)。注意：此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return AsyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> */
    public AsyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommandAsyncInvoker(
        CreateAsyncCommandRequest request) {
        return new AsyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse>(request,
            IoTDAMeta.createAsyncCommand, hcClient);
    }

    /** 查询指定id的命令 物联网平台可查询指定id的命令。
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return CompletableFuture<ShowAsyncDeviceCommandResponse> */
    public CompletableFuture<ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandAsync(
        ShowAsyncDeviceCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showAsyncDeviceCommand);
    }

    /** 查询指定id的命令 物联网平台可查询指定id的命令。
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return AsyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> */
    public AsyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandAsyncInvoker(
        ShowAsyncDeviceCommandRequest request) {
        return new AsyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse>(request,
            IoTDAMeta.showAsyncDeviceCommand, hcClient);
    }

    /** 创建批量任务 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return CompletableFuture<CreateBatchTaskResponse> */
    public CompletableFuture<CreateBatchTaskResponse> createBatchTaskAsync(CreateBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    /** 创建批量任务 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> */
    public AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskAsyncInvoker(
        CreateBatchTaskRequest request) {
        return new AsyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>(request, IoTDAMeta.createBatchTask,
            hcClient);
    }

    /** 查询批量任务列表 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     *
     * @param ListBatchTasksRequest 请求对象
     * @return CompletableFuture<ListBatchTasksResponse> */
    public CompletableFuture<ListBatchTasksResponse> listBatchTasksAsync(ListBatchTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    /** 查询批量任务列表 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     *
     * @param ListBatchTasksRequest 请求对象
     * @return AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> */
    public AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksAsyncInvoker(
        ListBatchTasksRequest request) {
        return new AsyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>(request, IoTDAMeta.listBatchTasks,
            hcClient);
    }

    /** 查询批量任务 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return CompletableFuture<ShowBatchTaskResponse> */
    public CompletableFuture<ShowBatchTaskResponse> showBatchTaskAsync(ShowBatchTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    /** 查询批量任务 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return AsyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> */
    public AsyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTaskAsyncInvoker(
        ShowBatchTaskRequest request) {
        return new AsyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse>(request, IoTDAMeta.showBatchTask,
            hcClient);
    }

    /** 删除批量任务文件 应用服务器可调用此接口删除批量任务文件。
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return CompletableFuture<DeleteBatchTaskFileResponse> */
    public CompletableFuture<DeleteBatchTaskFileResponse> deleteBatchTaskFileAsync(DeleteBatchTaskFileRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteBatchTaskFile);
    }

    /** 删除批量任务文件 应用服务器可调用此接口删除批量任务文件。
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return AsyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> */
    public AsyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFileAsyncInvoker(
        DeleteBatchTaskFileRequest request) {
        return new AsyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse>(request,
            IoTDAMeta.deleteBatchTaskFile, hcClient);
    }

    /** 查询批量任务文件列表 应用服务器可调用此接口查询批量任务文件列表。
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return CompletableFuture<ListBatchTaskFilesResponse> */
    public CompletableFuture<ListBatchTaskFilesResponse> listBatchTaskFilesAsync(ListBatchTaskFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listBatchTaskFiles);
    }

    /** 查询批量任务文件列表 应用服务器可调用此接口查询批量任务文件列表。
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return AsyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> */
    public AsyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFilesAsyncInvoker(
        ListBatchTaskFilesRequest request) {
        return new AsyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse>(request,
            IoTDAMeta.listBatchTaskFiles, hcClient);
    }

    /** 上传批量任务文件 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。 -
     * [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx) -
     * [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx) -
     * [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx) -
     * [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return CompletableFuture<UploadBatchTaskFileResponse> */
    public CompletableFuture<UploadBatchTaskFileResponse> uploadBatchTaskFileAsync(UploadBatchTaskFileRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.uploadBatchTaskFile);
    }

    /** 上传批量任务文件 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。 -
     * [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx) -
     * [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx) -
     * [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx) -
     * [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return AsyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> */
    public AsyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFileAsyncInvoker(
        UploadBatchTaskFileRequest request) {
        return new AsyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse>(request,
            IoTDAMeta.uploadBatchTaskFile, hcClient);
    }

    /** 上传设备CA证书 应用服务器可调用此接口在物联网平台上传设备的CA证书
     *
     * @param AddCertificateRequest 请求对象
     * @return CompletableFuture<AddCertificateResponse> */
    public CompletableFuture<AddCertificateResponse> addCertificateAsync(AddCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    /** 上传设备CA证书 应用服务器可调用此接口在物联网平台上传设备的CA证书
     *
     * @param AddCertificateRequest 请求对象
     * @return AsyncInvoker<AddCertificateRequest, AddCertificateResponse> */
    public AsyncInvoker<AddCertificateRequest, AddCertificateResponse> addCertificateAsyncInvoker(
        AddCertificateRequest request) {
        return new AsyncInvoker<AddCertificateRequest, AddCertificateResponse>(request, IoTDAMeta.addCertificate,
            hcClient);
    }

    /** 验证设备CA证书 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     *
     * @param CheckCertificateRequest 请求对象
     * @return CompletableFuture<CheckCertificateResponse> */
    public CompletableFuture<CheckCertificateResponse> checkCertificateAsync(CheckCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    /** 验证设备CA证书 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     *
     * @param CheckCertificateRequest 请求对象
     * @return AsyncInvoker<CheckCertificateRequest, CheckCertificateResponse> */
    public AsyncInvoker<CheckCertificateRequest, CheckCertificateResponse> checkCertificateAsyncInvoker(
        CheckCertificateRequest request) {
        return new AsyncInvoker<CheckCertificateRequest, CheckCertificateResponse>(request, IoTDAMeta.checkCertificate,
            hcClient);
    }

    /** 删除设备CA证书 应用服务器可调用此接口在物联网平台删除设备的CA证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return CompletableFuture<DeleteCertificateResponse> */
    public CompletableFuture<DeleteCertificateResponse> deleteCertificateAsync(DeleteCertificateRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    /** 删除设备CA证书 应用服务器可调用此接口在物联网平台删除设备的CA证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> */
    public AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateAsyncInvoker(
        DeleteCertificateRequest request) {
        return new AsyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request,
            IoTDAMeta.deleteCertificate, hcClient);
    }

    /** 获取设备CA证书列表 应用服务器可调用此接口在物联网平台获取设备的CA证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return CompletableFuture<ListCertificatesResponse> */
    public CompletableFuture<ListCertificatesResponse> listCertificatesAsync(ListCertificatesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    /** 获取设备CA证书列表 应用服务器可调用此接口在物联网平台获取设备的CA证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> */
    public AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesAsyncInvoker(
        ListCertificatesRequest request) {
        return new AsyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, IoTDAMeta.listCertificates,
            hcClient);
    }

    /** 下发设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回,
     * 如果设备没有响应，平台会返回给应用服务器超时，平台超时间是20秒。注意：此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     *
     * @param CreateCommandRequest 请求对象
     * @return CompletableFuture<CreateCommandResponse> */
    public CompletableFuture<CreateCommandResponse> createCommandAsync(CreateCommandRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    /** 下发设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回,
     * 如果设备没有响应，平台会返回给应用服务器超时，平台超时间是20秒。注意：此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     *
     * @param CreateCommandRequest 请求对象
     * @return AsyncInvoker<CreateCommandRequest, CreateCommandResponse> */
    public AsyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandAsyncInvoker(
        CreateCommandRequest request) {
        return new AsyncInvoker<CreateCommandRequest, CreateCommandResponse>(request, IoTDAMeta.createCommand,
            hcClient);
    }

    /** 添加设备组 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个分组，包括父分组和子分组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return CompletableFuture<AddDeviceGroupResponse> */
    public CompletableFuture<AddDeviceGroupResponse> addDeviceGroupAsync(AddDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    /** 添加设备组 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个分组，包括父分组和子分组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return AsyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> */
    public AsyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroupAsyncInvoker(
        AddDeviceGroupRequest request) {
        return new AsyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse>(request, IoTDAMeta.addDeviceGroup,
            hcClient);
    }

    /** 管理设备组中的设备 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return CompletableFuture<CreateOrDeleteDeviceInGroupResponse> */
    public CompletableFuture<CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupAsync(
        CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    /** 管理设备组中的设备 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return AsyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> */
    public AsyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupAsyncInvoker(
        CreateOrDeleteDeviceInGroupRequest request) {
        return new AsyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse>(request,
            IoTDAMeta.createOrDeleteDeviceInGroup, hcClient);
    }

    /** 删除设备组 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return CompletableFuture<DeleteDeviceGroupResponse> */
    public CompletableFuture<DeleteDeviceGroupResponse> deleteDeviceGroupAsync(DeleteDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    /** 删除设备组 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> */
    public AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupAsyncInvoker(
        DeleteDeviceGroupRequest request) {
        return new AsyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>(request,
            IoTDAMeta.deleteDeviceGroup, hcClient);
    }

    /** 查询设备组列表 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return CompletableFuture<ListDeviceGroupsResponse> */
    public CompletableFuture<ListDeviceGroupsResponse> listDeviceGroupsAsync(ListDeviceGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    /** 查询设备组列表 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return AsyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> */
    public AsyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroupsAsyncInvoker(
        ListDeviceGroupsRequest request) {
        return new AsyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse>(request, IoTDAMeta.listDeviceGroups,
            hcClient);
    }

    /** 查询设备组 应用服务器可调用此接口查询指定设备组详情。
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return CompletableFuture<ShowDeviceGroupResponse> */
    public CompletableFuture<ShowDeviceGroupResponse> showDeviceGroupAsync(ShowDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    /** 查询设备组 应用服务器可调用此接口查询指定设备组详情。
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> */
    public AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupAsyncInvoker(
        ShowDeviceGroupRequest request) {
        return new AsyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>(request, IoTDAMeta.showDeviceGroup,
            hcClient);
    }

    /** 查询设备组设备列表 应用服务器可调用此接口查询指定设备组下的设备列表。
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return CompletableFuture<ShowDevicesInGroupResponse> */
    public CompletableFuture<ShowDevicesInGroupResponse> showDevicesInGroupAsync(ShowDevicesInGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    /** 查询设备组设备列表 应用服务器可调用此接口查询指定设备组下的设备列表。
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> */
    public AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupAsyncInvoker(
        ShowDevicesInGroupRequest request) {
        return new AsyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>(request,
            IoTDAMeta.showDevicesInGroup, hcClient);
    }

    /** 修改设备组 应用服务器可调用此接口修改物联网平台中指定设备组。
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return CompletableFuture<UpdateDeviceGroupResponse> */
    public CompletableFuture<UpdateDeviceGroupResponse> updateDeviceGroupAsync(UpdateDeviceGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    /** 修改设备组 应用服务器可调用此接口修改物联网平台中指定设备组。
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> */
    public AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupAsyncInvoker(
        UpdateDeviceGroupRequest request) {
        return new AsyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>(request,
            IoTDAMeta.updateDeviceGroup, hcClient);
    }

    /** 创建设备 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。 - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。 -
     * 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。 -
     * 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     *
     * @param AddDeviceRequest 请求对象
     * @return CompletableFuture<AddDeviceResponse> */
    public CompletableFuture<AddDeviceResponse> addDeviceAsync(AddDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    /** 创建设备 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。 - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。 -
     * 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。 -
     * 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     *
     * @param AddDeviceRequest 请求对象
     * @return AsyncInvoker<AddDeviceRequest, AddDeviceResponse> */
    public AsyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceAsyncInvoker(AddDeviceRequest request) {
        return new AsyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, IoTDAMeta.addDevice, hcClient);
    }

    /** 删除设备 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return CompletableFuture<DeleteDeviceResponse> */
    public CompletableFuture<DeleteDeviceResponse> deleteDeviceAsync(DeleteDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    /** 删除设备 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> */
    public AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceAsyncInvoker(
        DeleteDeviceRequest request) {
        return new AsyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IoTDAMeta.deleteDevice, hcClient);
    }

    /** 冻结设备 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。
     *
     * @param FreezeDeviceRequest 请求对象
     * @return CompletableFuture<FreezeDeviceResponse> */
    public CompletableFuture<FreezeDeviceResponse> freezeDeviceAsync(FreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    /** 冻结设备 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。
     *
     * @param FreezeDeviceRequest 请求对象
     * @return AsyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> */
    public AsyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> freezeDeviceAsyncInvoker(
        FreezeDeviceRequest request) {
        return new AsyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse>(request, IoTDAMeta.freezeDevice, hcClient);
    }

    /** 查询设备列表 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return CompletableFuture<ListDevicesResponse> */
    public CompletableFuture<ListDevicesResponse> listDevicesAsync(ListDevicesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    /** 查询设备列表 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return AsyncInvoker<ListDevicesRequest, ListDevicesResponse> */
    public AsyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesAsyncInvoker(ListDevicesRequest request) {
        return new AsyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IoTDAMeta.listDevices, hcClient);
    }

    /** 重置设备密钥 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return CompletableFuture<ResetDeviceSecretResponse> */
    public CompletableFuture<ResetDeviceSecretResponse> resetDeviceSecretAsync(ResetDeviceSecretRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    /** 重置设备密钥 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return AsyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> */
    public AsyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecretAsyncInvoker(
        ResetDeviceSecretRequest request) {
        return new AsyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse>(request,
            IoTDAMeta.resetDeviceSecret, hcClient);
    }

    /** 查询设备 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     *
     * @param ShowDeviceRequest 请求对象
     * @return CompletableFuture<ShowDeviceResponse> */
    public CompletableFuture<ShowDeviceResponse> showDeviceAsync(ShowDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    /** 查询设备 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     *
     * @param ShowDeviceRequest 请求对象
     * @return AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse> */
    public AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceAsyncInvoker(ShowDeviceRequest request) {
        return new AsyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, IoTDAMeta.showDevice, hcClient);
    }

    /** 解冻设备 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return CompletableFuture<UnfreezeDeviceResponse> */
    public CompletableFuture<UnfreezeDeviceResponse> unfreezeDeviceAsync(UnfreezeDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    /** 解冻设备 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return AsyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> */
    public AsyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDeviceAsyncInvoker(
        UnfreezeDeviceRequest request) {
        return new AsyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse>(request, IoTDAMeta.unfreezeDevice,
            hcClient);
    }

    /** 修改设备 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return CompletableFuture<UpdateDeviceResponse> */
    public CompletableFuture<UpdateDeviceResponse> updateDeviceAsync(UpdateDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    /** 修改设备 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> */
    public AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceAsyncInvoker(
        UpdateDeviceRequest request) {
        return new AsyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IoTDAMeta.updateDevice, hcClient);
    }

    /** 查询设备影子数据 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 - 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 -
     * 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return CompletableFuture<ShowDeviceShadowResponse> */
    public CompletableFuture<ShowDeviceShadowResponse> showDeviceShadowAsync(ShowDeviceShadowRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    /** 查询设备影子数据 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 - 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 -
     * 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return AsyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> */
    public AsyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadowAsyncInvoker(
        ShowDeviceShadowRequest request) {
        return new AsyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse>(request, IoTDAMeta.showDeviceShadow,
            hcClient);
    }

    /** 配置设备影子预期数据 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。 设备影子介绍： 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 -
     * 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return CompletableFuture<UpdateDeviceShadowDesiredDataResponse> */
    public CompletableFuture<UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataAsync(
        UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    /** 配置设备影子预期数据 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。 设备影子介绍： 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 -
     * 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return AsyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> */
    public AsyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataAsyncInvoker(
        UpdateDeviceShadowDesiredDataRequest request) {
        return new AsyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse>(request,
            IoTDAMeta.updateDeviceShadowDesiredData, hcClient);
    }

    /** 下发设备消息
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。注意：此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     *
     * @param CreateMessageRequest 请求对象
     * @return CompletableFuture<CreateMessageResponse> */
    public CompletableFuture<CreateMessageResponse> createMessageAsync(CreateMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    /** 下发设备消息
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。注意：此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     *
     * @param CreateMessageRequest 请求对象
     * @return AsyncInvoker<CreateMessageRequest, CreateMessageResponse> */
    public AsyncInvoker<CreateMessageRequest, CreateMessageResponse> createMessageAsyncInvoker(
        CreateMessageRequest request) {
        return new AsyncInvoker<CreateMessageRequest, CreateMessageResponse>(request, IoTDAMeta.createMessage,
            hcClient);
    }

    /** 查询设备消息 物联网平台可查询指定设备下发的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return CompletableFuture<ListDeviceMessagesResponse> */
    public CompletableFuture<ListDeviceMessagesResponse> listDeviceMessagesAsync(ListDeviceMessagesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    /** 查询设备消息 物联网平台可查询指定设备下发的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return AsyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> */
    public AsyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessagesAsyncInvoker(
        ListDeviceMessagesRequest request) {
        return new AsyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse>(request,
            IoTDAMeta.listDeviceMessages, hcClient);
    }

    /** 查询指定消息id的消息 物联网平台可查询设备下发的指定消息id的消息。
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return CompletableFuture<ShowDeviceMessageResponse> */
    public CompletableFuture<ShowDeviceMessageResponse> showDeviceMessageAsync(ShowDeviceMessageRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    /** 查询指定消息id的消息 物联网平台可查询设备下发的指定消息id的消息。
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return AsyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> */
    public AsyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessageAsyncInvoker(
        ShowDeviceMessageRequest request) {
        return new AsyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse>(request,
            IoTDAMeta.showDeviceMessage, hcClient);
    }

    /** 创建产品 应用服务器可调用此接口创建产品。
     *
     * @param CreateProductRequest 请求对象
     * @return CompletableFuture<CreateProductResponse> */
    public CompletableFuture<CreateProductResponse> createProductAsync(CreateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    /** 创建产品 应用服务器可调用此接口创建产品。
     *
     * @param CreateProductRequest 请求对象
     * @return AsyncInvoker<CreateProductRequest, CreateProductResponse> */
    public AsyncInvoker<CreateProductRequest, CreateProductResponse> createProductAsyncInvoker(
        CreateProductRequest request) {
        return new AsyncInvoker<CreateProductRequest, CreateProductResponse>(request, IoTDAMeta.createProduct,
            hcClient);
    }

    /** 删除产品 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。
     *
     * @param DeleteProductRequest 请求对象
     * @return CompletableFuture<DeleteProductResponse> */
    public CompletableFuture<DeleteProductResponse> deleteProductAsync(DeleteProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    /** 删除产品 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。
     *
     * @param DeleteProductRequest 请求对象
     * @return AsyncInvoker<DeleteProductRequest, DeleteProductResponse> */
    public AsyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductAsyncInvoker(
        DeleteProductRequest request) {
        return new AsyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, IoTDAMeta.deleteProduct,
            hcClient);
    }

    /** 查询产品列表 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     *
     * @param ListProductsRequest 请求对象
     * @return CompletableFuture<ListProductsResponse> */
    public CompletableFuture<ListProductsResponse> listProductsAsync(ListProductsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    /** 查询产品列表 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     *
     * @param ListProductsRequest 请求对象
     * @return AsyncInvoker<ListProductsRequest, ListProductsResponse> */
    public AsyncInvoker<ListProductsRequest, ListProductsResponse> listProductsAsyncInvoker(
        ListProductsRequest request) {
        return new AsyncInvoker<ListProductsRequest, ListProductsResponse>(request, IoTDAMeta.listProducts, hcClient);
    }

    /** 查询产品 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     *
     * @param ShowProductRequest 请求对象
     * @return CompletableFuture<ShowProductResponse> */
    public CompletableFuture<ShowProductResponse> showProductAsync(ShowProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    /** 查询产品 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     *
     * @param ShowProductRequest 请求对象
     * @return AsyncInvoker<ShowProductRequest, ShowProductResponse> */
    public AsyncInvoker<ShowProductRequest, ShowProductResponse> showProductAsyncInvoker(ShowProductRequest request) {
        return new AsyncInvoker<ShowProductRequest, ShowProductResponse>(request, IoTDAMeta.showProduct, hcClient);
    }

    /** 修改产品 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。
     *
     * @param UpdateProductRequest 请求对象
     * @return CompletableFuture<UpdateProductResponse> */
    public CompletableFuture<UpdateProductResponse> updateProductAsync(UpdateProductRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    /** 修改产品 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。
     *
     * @param UpdateProductRequest 请求对象
     * @return AsyncInvoker<UpdateProductRequest, UpdateProductResponse> */
    public AsyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductAsyncInvoker(
        UpdateProductRequest request) {
        return new AsyncInvoker<UpdateProductRequest, UpdateProductResponse>(request, IoTDAMeta.updateProduct,
            hcClient);
    }

    /** 查询设备属性 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性,
     * 并由设备将属性查询的结果同步返回给应用服务器。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param ListPropertiesRequest 请求对象
     * @return CompletableFuture<ListPropertiesResponse> */
    public CompletableFuture<ListPropertiesResponse> listPropertiesAsync(ListPropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    /** 查询设备属性 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性,
     * 并由设备将属性查询的结果同步返回给应用服务器。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param ListPropertiesRequest 请求对象
     * @return AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse> */
    public AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesAsyncInvoker(
        ListPropertiesRequest request) {
        return new AsyncInvoker<ListPropertiesRequest, ListPropertiesResponse>(request, IoTDAMeta.listProperties,
            hcClient);
    }

    /** 修改设备属性
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return CompletableFuture<UpdatePropertiesResponse> */
    public CompletableFuture<UpdatePropertiesResponse> updatePropertiesAsync(UpdatePropertiesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    /** 修改设备属性
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return AsyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> */
    public AsyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> updatePropertiesAsyncInvoker(
        UpdatePropertiesRequest request) {
        return new AsyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse>(request, IoTDAMeta.updateProperties,
            hcClient);
    }

    /** 创建规则触发条件 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return CompletableFuture<CreateRoutingRuleResponse> */
    public CompletableFuture<CreateRoutingRuleResponse> createRoutingRuleAsync(CreateRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRoutingRule);
    }

    /** 创建规则触发条件 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return AsyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> */
    public AsyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRuleAsyncInvoker(
        CreateRoutingRuleRequest request) {
        return new AsyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse>(request,
            IoTDAMeta.createRoutingRule, hcClient);
    }

    /** 创建规则动作 应用服务器可调用此接口在物联网平台创建一条规则动作。
     *
     * @param CreateRuleActionRequest 请求对象
     * @return CompletableFuture<CreateRuleActionResponse> */
    public CompletableFuture<CreateRuleActionResponse> createRuleActionAsync(CreateRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRuleAction);
    }

    /** 创建规则动作 应用服务器可调用此接口在物联网平台创建一条规则动作。
     *
     * @param CreateRuleActionRequest 请求对象
     * @return AsyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> */
    public AsyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> createRuleActionAsyncInvoker(
        CreateRuleActionRequest request) {
        return new AsyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse>(request, IoTDAMeta.createRuleAction,
            hcClient);
    }

    /** 删除规则触发条件 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return CompletableFuture<DeleteRoutingRuleResponse> */
    public CompletableFuture<DeleteRoutingRuleResponse> deleteRoutingRuleAsync(DeleteRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRoutingRule);
    }

    /** 删除规则触发条件 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> */
    public AsyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRuleAsyncInvoker(
        DeleteRoutingRuleRequest request) {
        return new AsyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse>(request,
            IoTDAMeta.deleteRoutingRule, hcClient);
    }

    /** 删除规则动作 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return CompletableFuture<DeleteRuleActionResponse> */
    public CompletableFuture<DeleteRuleActionResponse> deleteRuleActionAsync(DeleteRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRuleAction);
    }

    /** 删除规则动作 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return AsyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> */
    public AsyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleActionAsyncInvoker(
        DeleteRuleActionRequest request) {
        return new AsyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse>(request, IoTDAMeta.deleteRuleAction,
            hcClient);
    }

    /** 查询规则条件列表 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return CompletableFuture<ListRoutingRulesResponse> */
    public CompletableFuture<ListRoutingRulesResponse> listRoutingRulesAsync(ListRoutingRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRoutingRules);
    }

    /** 查询规则条件列表 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return AsyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> */
    public AsyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRulesAsyncInvoker(
        ListRoutingRulesRequest request) {
        return new AsyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse>(request, IoTDAMeta.listRoutingRules,
            hcClient);
    }

    /** 查询规则动作列表 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     *
     * @param ListRuleActionsRequest 请求对象
     * @return CompletableFuture<ListRuleActionsResponse> */
    public CompletableFuture<ListRuleActionsResponse> listRuleActionsAsync(ListRuleActionsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRuleActions);
    }

    /** 查询规则动作列表 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     *
     * @param ListRuleActionsRequest 请求对象
     * @return AsyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> */
    public AsyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActionsAsyncInvoker(
        ListRuleActionsRequest request) {
        return new AsyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse>(request, IoTDAMeta.listRuleActions,
            hcClient);
    }

    /** 查询规则条件 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return CompletableFuture<ShowRoutingRuleResponse> */
    public CompletableFuture<ShowRoutingRuleResponse> showRoutingRuleAsync(ShowRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRoutingRule);
    }

    /** 查询规则条件 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return AsyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> */
    public AsyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRuleAsyncInvoker(
        ShowRoutingRuleRequest request) {
        return new AsyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse>(request, IoTDAMeta.showRoutingRule,
            hcClient);
    }

    /** 查询规则动作 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     *
     * @param ShowRuleActionRequest 请求对象
     * @return CompletableFuture<ShowRuleActionResponse> */
    public CompletableFuture<ShowRuleActionResponse> showRuleActionAsync(ShowRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRuleAction);
    }

    /** 查询规则动作 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     *
     * @param ShowRuleActionRequest 请求对象
     * @return AsyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> */
    public AsyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> showRuleActionAsyncInvoker(
        ShowRuleActionRequest request) {
        return new AsyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse>(request, IoTDAMeta.showRuleAction,
            hcClient);
    }

    /** 修改规则触发条件 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return CompletableFuture<UpdateRoutingRuleResponse> */
    public CompletableFuture<UpdateRoutingRuleResponse> updateRoutingRuleAsync(UpdateRoutingRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRoutingRule);
    }

    /** 修改规则触发条件 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> */
    public AsyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRuleAsyncInvoker(
        UpdateRoutingRuleRequest request) {
        return new AsyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse>(request,
            IoTDAMeta.updateRoutingRule, hcClient);
    }

    /** 修改规则动作 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return CompletableFuture<UpdateRuleActionResponse> */
    public CompletableFuture<UpdateRuleActionResponse> updateRuleActionAsync(UpdateRuleActionRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRuleAction);
    }

    /** 修改规则动作 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return AsyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> */
    public AsyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleActionAsyncInvoker(
        UpdateRuleActionRequest request) {
        return new AsyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse>(request, IoTDAMeta.updateRuleAction,
            hcClient);
    }

    /** 修改规则状态 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return CompletableFuture<ChangeRuleStatusResponse> */
    public CompletableFuture<ChangeRuleStatusResponse> changeRuleStatusAsync(ChangeRuleStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    /** 修改规则状态 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return AsyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> */
    public AsyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatusAsyncInvoker(
        ChangeRuleStatusRequest request) {
        return new AsyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse>(request, IoTDAMeta.changeRuleStatus,
            hcClient);
    }

    /** 创建规则 应用服务器可调用此接口在物联网平台创建一条规则。
     *
     * @param CreateRuleRequest 请求对象
     * @return CompletableFuture<CreateRuleResponse> */
    public CompletableFuture<CreateRuleResponse> createRuleAsync(CreateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.createRule);
    }

    /** 创建规则 应用服务器可调用此接口在物联网平台创建一条规则。
     *
     * @param CreateRuleRequest 请求对象
     * @return AsyncInvoker<CreateRuleRequest, CreateRuleResponse> */
    public AsyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleAsyncInvoker(CreateRuleRequest request) {
        return new AsyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, IoTDAMeta.createRule, hcClient);
    }

    /** 删除规则 应用服务器可调用此接口删除物联网平台中的指定规则。
     *
     * @param DeleteRuleRequest 请求对象
     * @return CompletableFuture<DeleteRuleResponse> */
    public CompletableFuture<DeleteRuleResponse> deleteRuleAsync(DeleteRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    /** 删除规则 应用服务器可调用此接口删除物联网平台中的指定规则。
     *
     * @param DeleteRuleRequest 请求对象
     * @return AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> */
    public AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleAsyncInvoker(DeleteRuleRequest request) {
        return new AsyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, IoTDAMeta.deleteRule, hcClient);
    }

    /** 查询规则列表 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return CompletableFuture<ListRulesResponse> */
    public CompletableFuture<ListRulesResponse> listRulesAsync(ListRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listRules);
    }

    /** 查询规则列表 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return AsyncInvoker<ListRulesRequest, ListRulesResponse> */
    public AsyncInvoker<ListRulesRequest, ListRulesResponse> listRulesAsyncInvoker(ListRulesRequest request) {
        return new AsyncInvoker<ListRulesRequest, ListRulesResponse>(request, IoTDAMeta.listRules, hcClient);
    }

    /** 查询规则 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     *
     * @param ShowRuleRequest 请求对象
     * @return CompletableFuture<ShowRuleResponse> */
    public CompletableFuture<ShowRuleResponse> showRuleAsync(ShowRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.showRule);
    }

    /** 查询规则 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     *
     * @param ShowRuleRequest 请求对象
     * @return AsyncInvoker<ShowRuleRequest, ShowRuleResponse> */
    public AsyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleAsyncInvoker(ShowRuleRequest request) {
        return new AsyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, IoTDAMeta.showRule, hcClient);
    }

    /** 修改规则 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     *
     * @param UpdateRuleRequest 请求对象
     * @return CompletableFuture<UpdateRuleResponse> */
    public CompletableFuture<UpdateRuleResponse> updateRuleAsync(UpdateRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    /** 修改规则 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     *
     * @param UpdateRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> */
    public AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleAsyncInvoker(UpdateRuleRequest request) {
        return new AsyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, IoTDAMeta.updateRule, hcClient);
    }

    /** 按标签查询资源 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return CompletableFuture<ListResourcesByTagsResponse> */
    public CompletableFuture<ListResourcesByTagsResponse> listResourcesByTagsAsync(ListResourcesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    /** 按标签查询资源 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> */
    public AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsAsyncInvoker(
        ListResourcesByTagsRequest request) {
        return new AsyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>(request,
            IoTDAMeta.listResourcesByTags, hcClient);
    }

    /** 绑定标签 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     *
     * @param TagDeviceRequest 请求对象
     * @return CompletableFuture<TagDeviceResponse> */
    public CompletableFuture<TagDeviceResponse> tagDeviceAsync(TagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    /** 绑定标签 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     *
     * @param TagDeviceRequest 请求对象
     * @return AsyncInvoker<TagDeviceRequest, TagDeviceResponse> */
    public AsyncInvoker<TagDeviceRequest, TagDeviceResponse> tagDeviceAsyncInvoker(TagDeviceRequest request) {
        return new AsyncInvoker<TagDeviceRequest, TagDeviceResponse>(request, IoTDAMeta.tagDevice, hcClient);
    }

    /** 解绑标签 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     *
     * @param UntagDeviceRequest 请求对象
     * @return CompletableFuture<UntagDeviceResponse> */
    public CompletableFuture<UntagDeviceResponse> untagDeviceAsync(UntagDeviceRequest request) {
        return hcClient.asyncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

    /** 解绑标签 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     *
     * @param UntagDeviceRequest 请求对象
     * @return AsyncInvoker<UntagDeviceRequest, UntagDeviceResponse> */
    public AsyncInvoker<UntagDeviceRequest, UntagDeviceResponse> untagDeviceAsyncInvoker(UntagDeviceRequest request) {
        return new AsyncInvoker<UntagDeviceRequest, UntagDeviceResponse>(request, IoTDAMeta.untagDevice, hcClient);
    }

}
