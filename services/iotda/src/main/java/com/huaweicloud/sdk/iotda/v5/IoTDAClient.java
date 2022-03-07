package com.huaweicloud.sdk.iotda.v5;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.iotda.v5.model.*;

public class IoTDAClient {

    protected HcClient hcClient;

    public IoTDAClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IoTDAClient> newBuilder() {
        return new ClientBuilder<>(IoTDAClient::new, "BasicCredentials,IoTDACredentials")
            .withDerivedAuthServiceName("iotdm");
    }

    /** 生成接入凭证 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return CreateAccessCodeResponse */
    public CreateAccessCodeResponse createAccessCode(CreateAccessCodeRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createAccessCode);
    }

    /** 生成接入凭证 接入凭证是用于客户端使用AMQP等协议与平台建链的一个认证凭据。只保留一条记录，如果重复调用只会重置接入凭证，使得之前的失效。
     *
     * @param CreateAccessCodeRequest 请求对象
     * @return SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> */
    public SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse> createAccessCodeInvoker(
        CreateAccessCodeRequest request) {
        return new SyncInvoker<CreateAccessCodeRequest, CreateAccessCodeResponse>(request, IoTDAMeta.createAccessCode,
            hcClient);
    }

    /** 创建AMQP队列 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     *
     * @param AddQueueRequest 请求对象
     * @return AddQueueResponse */
    public AddQueueResponse addQueue(AddQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addQueue);
    }

    /** 创建AMQP队列 应用服务器可调用此接口在物联网平台创建一个AMQP队列。每个租户只能创建100个队列，若超过规格，则创建失败，若队列名称与已有的队列名称相同，则创建失败。
     *
     * @param AddQueueRequest 请求对象
     * @return SyncInvoker<AddQueueRequest, AddQueueResponse> */
    public SyncInvoker<AddQueueRequest, AddQueueResponse> addQueueInvoker(AddQueueRequest request) {
        return new SyncInvoker<AddQueueRequest, AddQueueResponse>(request, IoTDAMeta.addQueue, hcClient);
    }

    /** 查询AMQP列表 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     *
     * @param BatchShowQueueRequest 请求对象
     * @return BatchShowQueueResponse */
    public BatchShowQueueResponse batchShowQueue(BatchShowQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.batchShowQueue);
    }

    /** 查询AMQP列表 应用服务器可调用此接口查询物联网平台中的AMQP队列信息列表。可通过队列名称作模糊查询，支持分页。
     *
     * @param BatchShowQueueRequest 请求对象
     * @return SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> */
    public SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse> batchShowQueueInvoker(
        BatchShowQueueRequest request) {
        return new SyncInvoker<BatchShowQueueRequest, BatchShowQueueResponse>(request, IoTDAMeta.batchShowQueue,
            hcClient);
    }

    /** 删除AMQP队列 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     *
     * @param DeleteQueueRequest 请求对象
     * @return DeleteQueueResponse */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteQueue);
    }

    /** 删除AMQP队列 应用服务器可调用此接口在物联网平台上删除指定AMQP队列。若当前队列正在使用，则会删除失败。
     *
     * @param DeleteQueueRequest 请求对象
     * @return SyncInvoker<DeleteQueueRequest, DeleteQueueResponse> */
    public SyncInvoker<DeleteQueueRequest, DeleteQueueResponse> deleteQueueInvoker(DeleteQueueRequest request) {
        return new SyncInvoker<DeleteQueueRequest, DeleteQueueResponse>(request, IoTDAMeta.deleteQueue, hcClient);
    }

    /** 查询单个AMQP队列 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     *
     * @param ShowQueueRequest 请求对象
     * @return ShowQueueResponse */
    public ShowQueueResponse showQueue(ShowQueueRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showQueue);
    }

    /** 查询单个AMQP队列 应用服务器可调用此接口查询物联网平台中指定队列的详细信息。
     *
     * @param ShowQueueRequest 请求对象
     * @return SyncInvoker<ShowQueueRequest, ShowQueueResponse> */
    public SyncInvoker<ShowQueueRequest, ShowQueueResponse> showQueueInvoker(ShowQueueRequest request) {
        return new SyncInvoker<ShowQueueRequest, ShowQueueResponse>(request, IoTDAMeta.showQueue, hcClient);
    }

    /** 创建资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     *
     * @param AddApplicationRequest 请求对象
     * @return AddApplicationResponse */
    public AddApplicationResponse addApplication(AddApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addApplication);
    }

    /** 创建资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口创建资源空间。
     *
     * @param AddApplicationRequest 请求对象
     * @return SyncInvoker<AddApplicationRequest, AddApplicationResponse> */
    public SyncInvoker<AddApplicationRequest, AddApplicationResponse> addApplicationInvoker(
        AddApplicationRequest request) {
        return new SyncInvoker<AddApplicationRequest, AddApplicationResponse>(request, IoTDAMeta.addApplication,
            hcClient);
    }

    /** 删除资源空间 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     *
     * @param DeleteApplicationRequest 请求对象
     * @return DeleteApplicationResponse */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteApplication);
    }

    /** 删除资源空间 删除指定资源空间。删除资源空间属于高危操作，删除资源空间后，该空间下的产品、设备等资源将不可用，请谨慎操作！
     *
     * @param DeleteApplicationRequest 请求对象
     * @return SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> */
    public SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplicationInvoker(
        DeleteApplicationRequest request) {
        return new SyncInvoker<DeleteApplicationRequest, DeleteApplicationResponse>(request,
            IoTDAMeta.deleteApplication, hcClient);
    }

    /** 查询资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     *
     * @param ShowApplicationRequest 请求对象
     * @return ShowApplicationResponse */
    public ShowApplicationResponse showApplication(ShowApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplication);
    }

    /** 查询资源空间 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询指定资源空间详情。
     *
     * @param ShowApplicationRequest 请求对象
     * @return SyncInvoker<ShowApplicationRequest, ShowApplicationResponse> */
    public SyncInvoker<ShowApplicationRequest, ShowApplicationResponse> showApplicationInvoker(
        ShowApplicationRequest request) {
        return new SyncInvoker<ShowApplicationRequest, ShowApplicationResponse>(request, IoTDAMeta.showApplication,
            hcClient);
    }

    /** 查询资源空间列表 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     *
     * @param ShowApplicationsRequest 请求对象
     * @return ShowApplicationsResponse */
    public ShowApplicationsResponse showApplications(ShowApplicationsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showApplications);
    }

    /** 查询资源空间列表 资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。应用服务器可以调用此接口查询资源空间列表。
     *
     * @param ShowApplicationsRequest 请求对象
     * @return SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> */
    public SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse> showApplicationsInvoker(
        ShowApplicationsRequest request) {
        return new SyncInvoker<ShowApplicationsRequest, ShowApplicationsResponse>(request, IoTDAMeta.showApplications,
            hcClient);
    }

    /** 下发异步设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。
     * 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等,
     * 详情参考[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)。注意：此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return CreateAsyncCommandResponse */
    public CreateAsyncCommandResponse createAsyncCommand(CreateAsyncCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createAsyncCommand);
    }

    /** 下发异步设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发异步命令，以实现对设备的控制。平台负责将命令发送给设备，并将设备执行命令结果异步通知应用服务器。
     * 命令执行结果支持灵活的数据流转，应用服务器通过调用物联网平台的创建规则触发条件（Resource:device.command.status，Event:update）、创建规则动作并激活规则后，当命令状态变更时，物联网平台会根据规则将结果发送到规则指定的服务器，如用户自定义的HTTP服务器，AMQP服务器，以及华为云的其他储存服务器等,
     * 详情参考[设备命令状态变更通知](https://support.huaweicloud.com/api-iothub/iot_06_v5_01212.html)。注意：此接口适用于NB设备异步命令下发，暂不支持其他协议类型设备命令下发。
     *
     * @param CreateAsyncCommandRequest 请求对象
     * @return SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> */
    public SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse> createAsyncCommandInvoker(
        CreateAsyncCommandRequest request) {
        return new SyncInvoker<CreateAsyncCommandRequest, CreateAsyncCommandResponse>(request,
            IoTDAMeta.createAsyncCommand, hcClient);
    }

    /** 查询指定id的命令 物联网平台可查询指定id的命令。
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return ShowAsyncDeviceCommandResponse */
    public ShowAsyncDeviceCommandResponse showAsyncDeviceCommand(ShowAsyncDeviceCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showAsyncDeviceCommand);
    }

    /** 查询指定id的命令 物联网平台可查询指定id的命令。
     *
     * @param ShowAsyncDeviceCommandRequest 请求对象
     * @return SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> */
    public SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse> showAsyncDeviceCommandInvoker(
        ShowAsyncDeviceCommandRequest request) {
        return new SyncInvoker<ShowAsyncDeviceCommandRequest, ShowAsyncDeviceCommandResponse>(request,
            IoTDAMeta.showAsyncDeviceCommand, hcClient);
    }

    /** 创建批量任务 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return CreateBatchTaskResponse */
    public CreateBatchTaskResponse createBatchTask(CreateBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createBatchTask);
    }

    /** 创建批量任务 应用服务器可调用此接口为创建批量处理任务，对多个设备进行批量操作。当前支持批量软固件升级、批量创建设备、批量删除设备、批量冻结设备、批量解冻设备、批量创建命令、批量创建消息任务。
     *
     * @param CreateBatchTaskRequest 请求对象
     * @return SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> */
    public SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse> createBatchTaskInvoker(
        CreateBatchTaskRequest request) {
        return new SyncInvoker<CreateBatchTaskRequest, CreateBatchTaskResponse>(request, IoTDAMeta.createBatchTask,
            hcClient);
    }

    /** 查询批量任务列表 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     *
     * @param ListBatchTasksRequest 请求对象
     * @return ListBatchTasksResponse */
    public ListBatchTasksResponse listBatchTasks(ListBatchTasksRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listBatchTasks);
    }

    /** 查询批量任务列表 应用服务器可调用此接口查询物联网平台中批量任务列表，每一个任务又包括具体的任务内容、任务状态、任务完成情况统计等。
     *
     * @param ListBatchTasksRequest 请求对象
     * @return SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> */
    public SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse> listBatchTasksInvoker(
        ListBatchTasksRequest request) {
        return new SyncInvoker<ListBatchTasksRequest, ListBatchTasksResponse>(request, IoTDAMeta.listBatchTasks,
            hcClient);
    }

    /** 查询批量任务 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return ShowBatchTaskResponse */
    public ShowBatchTaskResponse showBatchTask(ShowBatchTaskRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showBatchTask);
    }

    /** 查询批量任务 应用服务器可调用此接口查询物联网平台中指定批量任务的信息，包括任务内容、任务状态、任务完成情况统计以及子任务列表等。
     *
     * @param ShowBatchTaskRequest 请求对象
     * @return SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> */
    public SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse> showBatchTaskInvoker(ShowBatchTaskRequest request) {
        return new SyncInvoker<ShowBatchTaskRequest, ShowBatchTaskResponse>(request, IoTDAMeta.showBatchTask, hcClient);
    }

    /** 删除批量任务文件 应用服务器可调用此接口删除批量任务文件。
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return DeleteBatchTaskFileResponse */
    public DeleteBatchTaskFileResponse deleteBatchTaskFile(DeleteBatchTaskFileRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteBatchTaskFile);
    }

    /** 删除批量任务文件 应用服务器可调用此接口删除批量任务文件。
     *
     * @param DeleteBatchTaskFileRequest 请求对象
     * @return SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> */
    public SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse> deleteBatchTaskFileInvoker(
        DeleteBatchTaskFileRequest request) {
        return new SyncInvoker<DeleteBatchTaskFileRequest, DeleteBatchTaskFileResponse>(request,
            IoTDAMeta.deleteBatchTaskFile, hcClient);
    }

    /** 查询批量任务文件列表 应用服务器可调用此接口查询批量任务文件列表。
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return ListBatchTaskFilesResponse */
    public ListBatchTaskFilesResponse listBatchTaskFiles(ListBatchTaskFilesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listBatchTaskFiles);
    }

    /** 查询批量任务文件列表 应用服务器可调用此接口查询批量任务文件列表。
     *
     * @param ListBatchTaskFilesRequest 请求对象
     * @return SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> */
    public SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse> listBatchTaskFilesInvoker(
        ListBatchTaskFilesRequest request) {
        return new SyncInvoker<ListBatchTaskFilesRequest, ListBatchTaskFilesResponse>(request,
            IoTDAMeta.listBatchTaskFiles, hcClient);
    }

    /** 上传批量任务文件 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。 -
     * [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx) -
     * [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx) -
     * [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx) -
     * [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return UploadBatchTaskFileResponse */
    public UploadBatchTaskFileResponse uploadBatchTaskFile(UploadBatchTaskFileRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.uploadBatchTaskFile);
    }

    /** 上传批量任务文件 应用服务器可调用此接口上传批量任务文件，用于创建批量任务。当前支持批量创建设备任务、批量删除设备任务、批量冻结设备任务、批量解冻设备任务的文件上传。 -
     * [批量注册设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchCreateDevices_Template.xlsx) -
     * [批量删除设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchDeleteDevices_Template.xlsx) -
     * [批量冻结设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchFreezeDevices_Template.xlsx) -
     * [批量解冻设备模板](https://developer.obs.cn-north-4.myhuaweicloud.com/template/BatchUnfreezeDevices_Template.xlsx)
     *
     * @param UploadBatchTaskFileRequest 请求对象
     * @return SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> */
    public SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse> uploadBatchTaskFileInvoker(
        UploadBatchTaskFileRequest request) {
        return new SyncInvoker<UploadBatchTaskFileRequest, UploadBatchTaskFileResponse>(request,
            IoTDAMeta.uploadBatchTaskFile, hcClient);
    }

    /** 上传设备CA证书 应用服务器可调用此接口在物联网平台上传设备的CA证书
     *
     * @param AddCertificateRequest 请求对象
     * @return AddCertificateResponse */
    public AddCertificateResponse addCertificate(AddCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addCertificate);
    }

    /** 上传设备CA证书 应用服务器可调用此接口在物联网平台上传设备的CA证书
     *
     * @param AddCertificateRequest 请求对象
     * @return SyncInvoker<AddCertificateRequest, AddCertificateResponse> */
    public SyncInvoker<AddCertificateRequest, AddCertificateResponse> addCertificateInvoker(
        AddCertificateRequest request) {
        return new SyncInvoker<AddCertificateRequest, AddCertificateResponse>(request, IoTDAMeta.addCertificate,
            hcClient);
    }

    /** 验证设备CA证书 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     *
     * @param CheckCertificateRequest 请求对象
     * @return CheckCertificateResponse */
    public CheckCertificateResponse checkCertificate(CheckCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.checkCertificate);
    }

    /** 验证设备CA证书 应用服务器可调用此接口在物联网平台验证设备的CA证书，目的是为了验证用户持有设备CA证书的私钥
     *
     * @param CheckCertificateRequest 请求对象
     * @return SyncInvoker<CheckCertificateRequest, CheckCertificateResponse> */
    public SyncInvoker<CheckCertificateRequest, CheckCertificateResponse> checkCertificateInvoker(
        CheckCertificateRequest request) {
        return new SyncInvoker<CheckCertificateRequest, CheckCertificateResponse>(request, IoTDAMeta.checkCertificate,
            hcClient);
    }

    /** 删除设备CA证书 应用服务器可调用此接口在物联网平台删除设备的CA证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return DeleteCertificateResponse */
    public DeleteCertificateResponse deleteCertificate(DeleteCertificateRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteCertificate);
    }

    /** 删除设备CA证书 应用服务器可调用此接口在物联网平台删除设备的CA证书
     *
     * @param DeleteCertificateRequest 请求对象
     * @return SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> */
    public SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificateInvoker(
        DeleteCertificateRequest request) {
        return new SyncInvoker<DeleteCertificateRequest, DeleteCertificateResponse>(request,
            IoTDAMeta.deleteCertificate, hcClient);
    }

    /** 获取设备CA证书列表 应用服务器可调用此接口在物联网平台获取设备的CA证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return ListCertificatesResponse */
    public ListCertificatesResponse listCertificates(ListCertificatesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listCertificates);
    }

    /** 获取设备CA证书列表 应用服务器可调用此接口在物联网平台获取设备的CA证书列表
     *
     * @param ListCertificatesRequest 请求对象
     * @return SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> */
    public SyncInvoker<ListCertificatesRequest, ListCertificatesResponse> listCertificatesInvoker(
        ListCertificatesRequest request) {
        return new SyncInvoker<ListCertificatesRequest, ListCertificatesResponse>(request, IoTDAMeta.listCertificates,
            hcClient);
    }

    /** 下发设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回,
     * 如果设备没有响应，平台会返回给应用服务器超时，平台超时间是20秒。注意：此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     *
     * @param CreateCommandRequest 请求对象
     * @return CreateCommandResponse */
    public CreateCommandResponse createCommand(CreateCommandRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createCommand);
    }

    /** 下发设备命令 设备的产品模型中定义了物联网平台可向设备下发的命令，应用服务器可调用此接口向指定设备下发命令，以实现对设备的同步控制。平台负责将命令以同步方式发送给设备，并将设备执行命令结果同步返回,
     * 如果设备没有响应，平台会返回给应用服务器超时，平台超时间是20秒。注意：此接口适用于MQTT设备同步命令下发，暂不支持NB-IoT设备命令下发。
     *
     * @param CreateCommandRequest 请求对象
     * @return SyncInvoker<CreateCommandRequest, CreateCommandResponse> */
    public SyncInvoker<CreateCommandRequest, CreateCommandResponse> createCommandInvoker(CreateCommandRequest request) {
        return new SyncInvoker<CreateCommandRequest, CreateCommandResponse>(request, IoTDAMeta.createCommand, hcClient);
    }

    /** 添加设备组 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个分组，包括父分组和子分组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return AddDeviceGroupResponse */
    public AddDeviceGroupResponse addDeviceGroup(AddDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDeviceGroup);
    }

    /** 添加设备组 应用服务器可调用此接口新建设备组，一个华为云账号下最多可有1,000个分组，包括父分组和子分组。设备组的最大层级关系不超过5层，即群组形成的关系树最大深度不超过5。
     *
     * @param AddDeviceGroupRequest 请求对象
     * @return SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> */
    public SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse> addDeviceGroupInvoker(
        AddDeviceGroupRequest request) {
        return new SyncInvoker<AddDeviceGroupRequest, AddDeviceGroupResponse>(request, IoTDAMeta.addDeviceGroup,
            hcClient);
    }

    /** 管理设备组中的设备 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return CreateOrDeleteDeviceInGroupResponse */
    public CreateOrDeleteDeviceInGroupResponse createOrDeleteDeviceInGroup(CreateOrDeleteDeviceInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createOrDeleteDeviceInGroup);
    }

    /** 管理设备组中的设备 应用服务器可调用此接口管理设备组中的设备。单个设备组内最多添加20,000个设备，一个设备最多可以被添加到10个设备组中。
     *
     * @param CreateOrDeleteDeviceInGroupRequest 请求对象
     * @return SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> */
    public SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse> createOrDeleteDeviceInGroupInvoker(
        CreateOrDeleteDeviceInGroupRequest request) {
        return new SyncInvoker<CreateOrDeleteDeviceInGroupRequest, CreateOrDeleteDeviceInGroupResponse>(request,
            IoTDAMeta.createOrDeleteDeviceInGroup, hcClient);
    }

    /** 删除设备组 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return DeleteDeviceGroupResponse */
    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDeviceGroup);
    }

    /** 删除设备组 应用服务器可调用此接口删除指定设备组，如果该设备组存在子设备组或者该设备组中存在设备，必须先删除子设备组并将设备从该设备组移除，才能删除该设备组。
     *
     * @param DeleteDeviceGroupRequest 请求对象
     * @return SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> */
    public SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse> deleteDeviceGroupInvoker(
        DeleteDeviceGroupRequest request) {
        return new SyncInvoker<DeleteDeviceGroupRequest, DeleteDeviceGroupResponse>(request,
            IoTDAMeta.deleteDeviceGroup, hcClient);
    }

    /** 查询设备组列表 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return ListDeviceGroupsResponse */
    public ListDeviceGroupsResponse listDeviceGroups(ListDeviceGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceGroups);
    }

    /** 查询设备组列表 应用服务器可调用此接口查询物联网平台中的设备组信息列表。
     *
     * @param ListDeviceGroupsRequest 请求对象
     * @return SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> */
    public SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse> listDeviceGroupsInvoker(
        ListDeviceGroupsRequest request) {
        return new SyncInvoker<ListDeviceGroupsRequest, ListDeviceGroupsResponse>(request, IoTDAMeta.listDeviceGroups,
            hcClient);
    }

    /** 查询设备组 应用服务器可调用此接口查询指定设备组详情。
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return ShowDeviceGroupResponse */
    public ShowDeviceGroupResponse showDeviceGroup(ShowDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceGroup);
    }

    /** 查询设备组 应用服务器可调用此接口查询指定设备组详情。
     *
     * @param ShowDeviceGroupRequest 请求对象
     * @return SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> */
    public SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse> showDeviceGroupInvoker(
        ShowDeviceGroupRequest request) {
        return new SyncInvoker<ShowDeviceGroupRequest, ShowDeviceGroupResponse>(request, IoTDAMeta.showDeviceGroup,
            hcClient);
    }

    /** 查询设备组设备列表 应用服务器可调用此接口查询指定设备组下的设备列表。
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return ShowDevicesInGroupResponse */
    public ShowDevicesInGroupResponse showDevicesInGroup(ShowDevicesInGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevicesInGroup);
    }

    /** 查询设备组设备列表 应用服务器可调用此接口查询指定设备组下的设备列表。
     *
     * @param ShowDevicesInGroupRequest 请求对象
     * @return SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> */
    public SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse> showDevicesInGroupInvoker(
        ShowDevicesInGroupRequest request) {
        return new SyncInvoker<ShowDevicesInGroupRequest, ShowDevicesInGroupResponse>(request,
            IoTDAMeta.showDevicesInGroup, hcClient);
    }

    /** 修改设备组 应用服务器可调用此接口修改物联网平台中指定设备组。
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return UpdateDeviceGroupResponse */
    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceGroup);
    }

    /** 修改设备组 应用服务器可调用此接口修改物联网平台中指定设备组。
     *
     * @param UpdateDeviceGroupRequest 请求对象
     * @return SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> */
    public SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse> updateDeviceGroupInvoker(
        UpdateDeviceGroupRequest request) {
        return new SyncInvoker<UpdateDeviceGroupRequest, UpdateDeviceGroupResponse>(request,
            IoTDAMeta.updateDeviceGroup, hcClient);
    }

    /** 创建设备 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。 - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。 -
     * 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。 -
     * 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     *
     * @param AddDeviceRequest 请求对象
     * @return AddDeviceResponse */
    public AddDeviceResponse addDevice(AddDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.addDevice);
    }

    /** 创建设备 应用服务器可调用此接口在物联网平台创建一个设备，仅在创建后设备才可以接入物联网平台。 - 该接口支持使用gateway_id参数指定在父设备下创建一个子设备，并且支持多级子设备，当前最大支持二级子设备。 -
     * 该接口同时还支持对设备进行初始配置，接口会读取创建设备请求参数product_id对应的产品详情，如果产品的属性有定义默认值，则会将该属性默认值写入该设备的设备影子中。 -
     * 用户还可以使用创建设备请求参数shadow字段为设备指定初始配置，指定后将会根据service_id和desired设置的属性值与产品中对应属性的默认值比对，如果不同，则将以shadow字段中设置的属性值为准写入到设备影子中。
     *
     * @param AddDeviceRequest 请求对象
     * @return SyncInvoker<AddDeviceRequest, AddDeviceResponse> */
    public SyncInvoker<AddDeviceRequest, AddDeviceResponse> addDeviceInvoker(AddDeviceRequest request) {
        return new SyncInvoker<AddDeviceRequest, AddDeviceResponse>(request, IoTDAMeta.addDevice, hcClient);
    }

    /** 删除设备 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return DeleteDeviceResponse */
    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteDevice);
    }

    /** 删除设备 应用服务器可调用此接口在物联网平台上删除指定设备。若设备下连接了非直连设备，则必须把设备下的非直连设备都删除后，才能删除该设备。
     *
     * @param DeleteDeviceRequest 请求对象
     * @return SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> */
    public SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse> deleteDeviceInvoker(DeleteDeviceRequest request) {
        return new SyncInvoker<DeleteDeviceRequest, DeleteDeviceResponse>(request, IoTDAMeta.deleteDevice, hcClient);
    }

    /** 冻结设备 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。
     *
     * @param FreezeDeviceRequest 请求对象
     * @return FreezeDeviceResponse */
    public FreezeDeviceResponse freezeDevice(FreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.freezeDevice);
    }

    /** 冻结设备 应用服务器可调用此接口冻结设备，设备冻结后不能再连接上线，可以通过解冻设备接口解除设备冻结。注意，当前仅支持冻结与平台直连的设备。
     *
     * @param FreezeDeviceRequest 请求对象
     * @return SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> */
    public SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse> freezeDeviceInvoker(FreezeDeviceRequest request) {
        return new SyncInvoker<FreezeDeviceRequest, FreezeDeviceResponse>(request, IoTDAMeta.freezeDevice, hcClient);
    }

    /** 查询设备列表 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return ListDevicesResponse */
    public ListDevicesResponse listDevices(ListDevicesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDevices);
    }

    /** 查询设备列表 应用服务器可调用此接口查询物联网平台中的设备信息列表。
     *
     * @param ListDevicesRequest 请求对象
     * @return SyncInvoker<ListDevicesRequest, ListDevicesResponse> */
    public SyncInvoker<ListDevicesRequest, ListDevicesResponse> listDevicesInvoker(ListDevicesRequest request) {
        return new SyncInvoker<ListDevicesRequest, ListDevicesResponse>(request, IoTDAMeta.listDevices, hcClient);
    }

    /** 重置设备密钥 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return ResetDeviceSecretResponse */
    public ResetDeviceSecretResponse resetDeviceSecret(ResetDeviceSecretRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.resetDeviceSecret);
    }

    /** 重置设备密钥 应用服务器可调用此接口重置设备密钥，携带指定密钥时平台将设备密钥重置为指定的密钥，不携带密钥时平台将自动生成一个新的随机密钥返回。
     *
     * @param ResetDeviceSecretRequest 请求对象
     * @return SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> */
    public SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse> resetDeviceSecretInvoker(
        ResetDeviceSecretRequest request) {
        return new SyncInvoker<ResetDeviceSecretRequest, ResetDeviceSecretResponse>(request,
            IoTDAMeta.resetDeviceSecret, hcClient);
    }

    /** 查询设备 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     *
     * @param ShowDeviceRequest 请求对象
     * @return ShowDeviceResponse */
    public ShowDeviceResponse showDevice(ShowDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDevice);
    }

    /** 查询设备 应用服务器可调用此接口查询物联网平台中指定设备的详细信息。
     *
     * @param ShowDeviceRequest 请求对象
     * @return SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> */
    public SyncInvoker<ShowDeviceRequest, ShowDeviceResponse> showDeviceInvoker(ShowDeviceRequest request) {
        return new SyncInvoker<ShowDeviceRequest, ShowDeviceResponse>(request, IoTDAMeta.showDevice, hcClient);
    }

    /** 解冻设备 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return UnfreezeDeviceResponse */
    public UnfreezeDeviceResponse unfreezeDevice(UnfreezeDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.unfreezeDevice);
    }

    /** 解冻设备 应用服务器可调用此接口解冻设备，解除冻结后，设备可以连接上线。
     *
     * @param UnfreezeDeviceRequest 请求对象
     * @return SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> */
    public SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse> unfreezeDeviceInvoker(
        UnfreezeDeviceRequest request) {
        return new SyncInvoker<UnfreezeDeviceRequest, UnfreezeDeviceResponse>(request, IoTDAMeta.unfreezeDevice,
            hcClient);
    }

    /** 修改设备 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return UpdateDeviceResponse */
    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDevice);
    }

    /** 修改设备 应用服务器可调用此接口修改物联网平台中指定设备的基本信息。
     *
     * @param UpdateDeviceRequest 请求对象
     * @return SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> */
    public SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse> updateDeviceInvoker(UpdateDeviceRequest request) {
        return new SyncInvoker<UpdateDeviceRequest, UpdateDeviceResponse>(request, IoTDAMeta.updateDevice, hcClient);
    }

    /** 查询设备影子数据 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 - 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 -
     * 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return ShowDeviceShadowResponse */
    public ShowDeviceShadowResponse showDeviceShadow(ShowDeviceShadowRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceShadow);
    }

    /** 查询设备影子数据 应用服务器可调用此接口查询指定设备的设备影子信息，包括对设备的期望属性信息（desired区）和设备最新上报的属性信息（reported区）。 设备影子介绍：
     * 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 - 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 -
     * 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param ShowDeviceShadowRequest 请求对象
     * @return SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> */
    public SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse> showDeviceShadowInvoker(
        ShowDeviceShadowRequest request) {
        return new SyncInvoker<ShowDeviceShadowRequest, ShowDeviceShadowResponse>(request, IoTDAMeta.showDeviceShadow,
            hcClient);
    }

    /** 配置设备影子预期数据 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。 设备影子介绍： 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 -
     * 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return UpdateDeviceShadowDesiredDataResponse */
    public UpdateDeviceShadowDesiredDataResponse updateDeviceShadowDesiredData(
        UpdateDeviceShadowDesiredDataRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateDeviceShadowDesiredData);
    }

    /** 配置设备影子预期数据 应用服务器可调用此接口配置设备影子的预期属性（desired区），当设备上线或者设备上报属性时把属性下发给设备。 设备影子介绍： 设备影子是一个用于存储和检索设备当前状态信息的JSON文档。 -
     * 每个设备有且只有一个设备影子，由设备ID唯一标识 - 设备影子仅保存最近一次设备的上报数据和预期数据 - 无论该设备是否在线，都可以通过该影子获取和设置设备的属性 -
     * 设备上线或者设备上报属性时，如果desired区和reported区存在差异，则将差异部分下发给设备，配置的预期属性需在产品模型中定义且method具有可写属性“W”才可下发
     *
     * @param UpdateDeviceShadowDesiredDataRequest 请求对象
     * @return SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> */
    public SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse> updateDeviceShadowDesiredDataInvoker(
        UpdateDeviceShadowDesiredDataRequest request) {
        return new SyncInvoker<UpdateDeviceShadowDesiredDataRequest, UpdateDeviceShadowDesiredDataResponse>(request,
            IoTDAMeta.updateDeviceShadowDesiredData, hcClient);
    }

    /** 下发设备消息
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。注意：此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     *
     * @param CreateMessageRequest 请求对象
     * @return CreateMessageResponse */
    public CreateMessageResponse createMessage(CreateMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createMessage);
    }

    /** 下发设备消息
     * 物联网平台可向设备下发消息，应用服务器可调用此接口向指定设备下发消息，以实现对设备的控制。应用将消息下发给平台后，平台返回应用响应结果，平台再将消息发送给设备。注意：此接口适用于MQTT设备消息下发，暂不支持其他协议接入的设备消息下发。
     *
     * @param CreateMessageRequest 请求对象
     * @return SyncInvoker<CreateMessageRequest, CreateMessageResponse> */
    public SyncInvoker<CreateMessageRequest, CreateMessageResponse> createMessageInvoker(CreateMessageRequest request) {
        return new SyncInvoker<CreateMessageRequest, CreateMessageResponse>(request, IoTDAMeta.createMessage, hcClient);
    }

    /** 查询设备消息 物联网平台可查询指定设备下发的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return ListDeviceMessagesResponse */
    public ListDeviceMessagesResponse listDeviceMessages(ListDeviceMessagesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listDeviceMessages);
    }

    /** 查询设备消息 物联网平台可查询指定设备下发的消息，平台为每个设备默认最多保存20条消息，超过20条后， 后续的消息会替换下发最早的消息。
     *
     * @param ListDeviceMessagesRequest 请求对象
     * @return SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> */
    public SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse> listDeviceMessagesInvoker(
        ListDeviceMessagesRequest request) {
        return new SyncInvoker<ListDeviceMessagesRequest, ListDeviceMessagesResponse>(request,
            IoTDAMeta.listDeviceMessages, hcClient);
    }

    /** 查询指定消息id的消息 物联网平台可查询设备下发的指定消息id的消息。
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return ShowDeviceMessageResponse */
    public ShowDeviceMessageResponse showDeviceMessage(ShowDeviceMessageRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showDeviceMessage);
    }

    /** 查询指定消息id的消息 物联网平台可查询设备下发的指定消息id的消息。
     *
     * @param ShowDeviceMessageRequest 请求对象
     * @return SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> */
    public SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse> showDeviceMessageInvoker(
        ShowDeviceMessageRequest request) {
        return new SyncInvoker<ShowDeviceMessageRequest, ShowDeviceMessageResponse>(request,
            IoTDAMeta.showDeviceMessage, hcClient);
    }

    /** 创建产品 应用服务器可调用此接口创建产品。
     *
     * @param CreateProductRequest 请求对象
     * @return CreateProductResponse */
    public CreateProductResponse createProduct(CreateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createProduct);
    }

    /** 创建产品 应用服务器可调用此接口创建产品。
     *
     * @param CreateProductRequest 请求对象
     * @return SyncInvoker<CreateProductRequest, CreateProductResponse> */
    public SyncInvoker<CreateProductRequest, CreateProductResponse> createProductInvoker(CreateProductRequest request) {
        return new SyncInvoker<CreateProductRequest, CreateProductResponse>(request, IoTDAMeta.createProduct, hcClient);
    }

    /** 删除产品 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。
     *
     * @param DeleteProductRequest 请求对象
     * @return DeleteProductResponse */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteProduct);
    }

    /** 删除产品 应用服务器可调用此接口删除已导入物联网平台的指定产品模型。
     *
     * @param DeleteProductRequest 请求对象
     * @return SyncInvoker<DeleteProductRequest, DeleteProductResponse> */
    public SyncInvoker<DeleteProductRequest, DeleteProductResponse> deleteProductInvoker(DeleteProductRequest request) {
        return new SyncInvoker<DeleteProductRequest, DeleteProductResponse>(request, IoTDAMeta.deleteProduct, hcClient);
    }

    /** 查询产品列表 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     *
     * @param ListProductsRequest 请求对象
     * @return ListProductsResponse */
    public ListProductsResponse listProducts(ListProductsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProducts);
    }

    /** 查询产品列表 应用服务器可调用此接口查询已导入物联网平台的产品模型信息列表，了解产品模型的概要信息。
     *
     * @param ListProductsRequest 请求对象
     * @return SyncInvoker<ListProductsRequest, ListProductsResponse> */
    public SyncInvoker<ListProductsRequest, ListProductsResponse> listProductsInvoker(ListProductsRequest request) {
        return new SyncInvoker<ListProductsRequest, ListProductsResponse>(request, IoTDAMeta.listProducts, hcClient);
    }

    /** 查询产品 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     *
     * @param ShowProductRequest 请求对象
     * @return ShowProductResponse */
    public ShowProductResponse showProduct(ShowProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showProduct);
    }

    /** 查询产品 应用服务器可调用此接口查询已导入物联网平台的指定产品模型详细信息，包括产品模型的服务、属性、命令等。
     *
     * @param ShowProductRequest 请求对象
     * @return SyncInvoker<ShowProductRequest, ShowProductResponse> */
    public SyncInvoker<ShowProductRequest, ShowProductResponse> showProductInvoker(ShowProductRequest request) {
        return new SyncInvoker<ShowProductRequest, ShowProductResponse>(request, IoTDAMeta.showProduct, hcClient);
    }

    /** 修改产品 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。
     *
     * @param UpdateProductRequest 请求对象
     * @return UpdateProductResponse */
    public UpdateProductResponse updateProduct(UpdateProductRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProduct);
    }

    /** 修改产品 应用服务器可调用此接口修改已导入物联网平台的指定产品模型，包括产品模型的服务、属性、命令等。
     *
     * @param UpdateProductRequest 请求对象
     * @return SyncInvoker<UpdateProductRequest, UpdateProductResponse> */
    public SyncInvoker<UpdateProductRequest, UpdateProductResponse> updateProductInvoker(UpdateProductRequest request) {
        return new SyncInvoker<UpdateProductRequest, UpdateProductResponse>(request, IoTDAMeta.updateProduct, hcClient);
    }

    /** 查询设备属性 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性,
     * 并由设备将属性查询的结果同步返回给应用服务器。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param ListPropertiesRequest 请求对象
     * @return ListPropertiesResponse */
    public ListPropertiesResponse listProperties(ListPropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listProperties);
    }

    /** 查询设备属性 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向设备发送指令用以查询设备的实时属性,
     * 并由设备将属性查询的结果同步返回给应用服务器。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param ListPropertiesRequest 请求对象
     * @return SyncInvoker<ListPropertiesRequest, ListPropertiesResponse> */
    public SyncInvoker<ListPropertiesRequest, ListPropertiesResponse> listPropertiesInvoker(
        ListPropertiesRequest request) {
        return new SyncInvoker<ListPropertiesRequest, ListPropertiesResponse>(request, IoTDAMeta.listProperties,
            hcClient);
    }

    /** 修改设备属性
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return UpdatePropertiesResponse */
    public UpdatePropertiesResponse updateProperties(UpdatePropertiesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateProperties);
    }

    /** 修改设备属性
     * 设备的产品模型中定义了物联网平台可向设备下发的属性，应用服务器可调用此接口向指定设备下属性。平台负责将属性以同步方式发送给设备，并将设备执行属性结果同步返回。注意：此接口适用于MQTT设备，暂不支持NB-IoT设备。
     *
     * @param UpdatePropertiesRequest 请求对象
     * @return SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> */
    public SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse> updatePropertiesInvoker(
        UpdatePropertiesRequest request) {
        return new SyncInvoker<UpdatePropertiesRequest, UpdatePropertiesResponse>(request, IoTDAMeta.updateProperties,
            hcClient);
    }

    /** 创建规则触发条件 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return CreateRoutingRuleResponse */
    public CreateRoutingRuleResponse createRoutingRule(CreateRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRoutingRule);
    }

    /** 创建规则触发条件 应用服务器可调用此接口在物联网平台创建一条规则触发条件。
     *
     * @param CreateRoutingRuleRequest 请求对象
     * @return SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> */
    public SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse> createRoutingRuleInvoker(
        CreateRoutingRuleRequest request) {
        return new SyncInvoker<CreateRoutingRuleRequest, CreateRoutingRuleResponse>(request,
            IoTDAMeta.createRoutingRule, hcClient);
    }

    /** 创建规则动作 应用服务器可调用此接口在物联网平台创建一条规则动作。
     *
     * @param CreateRuleActionRequest 请求对象
     * @return CreateRuleActionResponse */
    public CreateRuleActionResponse createRuleAction(CreateRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRuleAction);
    }

    /** 创建规则动作 应用服务器可调用此接口在物联网平台创建一条规则动作。
     *
     * @param CreateRuleActionRequest 请求对象
     * @return SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> */
    public SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse> createRuleActionInvoker(
        CreateRuleActionRequest request) {
        return new SyncInvoker<CreateRuleActionRequest, CreateRuleActionResponse>(request, IoTDAMeta.createRuleAction,
            hcClient);
    }

    /** 删除规则触发条件 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return DeleteRoutingRuleResponse */
    public DeleteRoutingRuleResponse deleteRoutingRule(DeleteRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRoutingRule);
    }

    /** 删除规则触发条件 应用服务器可调用此接口删除物联网平台中的指定规则条件。
     *
     * @param DeleteRoutingRuleRequest 请求对象
     * @return SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> */
    public SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse> deleteRoutingRuleInvoker(
        DeleteRoutingRuleRequest request) {
        return new SyncInvoker<DeleteRoutingRuleRequest, DeleteRoutingRuleResponse>(request,
            IoTDAMeta.deleteRoutingRule, hcClient);
    }

    /** 删除规则动作 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return DeleteRuleActionResponse */
    public DeleteRuleActionResponse deleteRuleAction(DeleteRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRuleAction);
    }

    /** 删除规则动作 应用服务器可调用此接口删除物联网平台中的指定规则动作。
     *
     * @param DeleteRuleActionRequest 请求对象
     * @return SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> */
    public SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse> deleteRuleActionInvoker(
        DeleteRuleActionRequest request) {
        return new SyncInvoker<DeleteRuleActionRequest, DeleteRuleActionResponse>(request, IoTDAMeta.deleteRuleAction,
            hcClient);
    }

    /** 查询规则条件列表 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return ListRoutingRulesResponse */
    public ListRoutingRulesResponse listRoutingRules(ListRoutingRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRoutingRules);
    }

    /** 查询规则条件列表 应用服务器可调用此接口查询物联网平台中设置的规则条件列表。
     *
     * @param ListRoutingRulesRequest 请求对象
     * @return SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> */
    public SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse> listRoutingRulesInvoker(
        ListRoutingRulesRequest request) {
        return new SyncInvoker<ListRoutingRulesRequest, ListRoutingRulesResponse>(request, IoTDAMeta.listRoutingRules,
            hcClient);
    }

    /** 查询规则动作列表 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     *
     * @param ListRuleActionsRequest 请求对象
     * @return ListRuleActionsResponse */
    public ListRuleActionsResponse listRuleActions(ListRuleActionsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRuleActions);
    }

    /** 查询规则动作列表 应用服务器可调用此接口查询物联网平台中设置的规则动作列表。
     *
     * @param ListRuleActionsRequest 请求对象
     * @return SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> */
    public SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse> listRuleActionsInvoker(
        ListRuleActionsRequest request) {
        return new SyncInvoker<ListRuleActionsRequest, ListRuleActionsResponse>(request, IoTDAMeta.listRuleActions,
            hcClient);
    }

    /** 查询规则条件 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return ShowRoutingRuleResponse */
    public ShowRoutingRuleResponse showRoutingRule(ShowRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRoutingRule);
    }

    /** 查询规则条件 应用服务器可调用此接口查询物联网平台中指定规则条件的配置信息。
     *
     * @param ShowRoutingRuleRequest 请求对象
     * @return SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> */
    public SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse> showRoutingRuleInvoker(
        ShowRoutingRuleRequest request) {
        return new SyncInvoker<ShowRoutingRuleRequest, ShowRoutingRuleResponse>(request, IoTDAMeta.showRoutingRule,
            hcClient);
    }

    /** 查询规则动作 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     *
     * @param ShowRuleActionRequest 请求对象
     * @return ShowRuleActionResponse */
    public ShowRuleActionResponse showRuleAction(ShowRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRuleAction);
    }

    /** 查询规则动作 应用服务器可调用此接口查询物联网平台中指定规则动作的配置信息。
     *
     * @param ShowRuleActionRequest 请求对象
     * @return SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> */
    public SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse> showRuleActionInvoker(
        ShowRuleActionRequest request) {
        return new SyncInvoker<ShowRuleActionRequest, ShowRuleActionResponse>(request, IoTDAMeta.showRuleAction,
            hcClient);
    }

    /** 修改规则触发条件 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return UpdateRoutingRuleResponse */
    public UpdateRoutingRuleResponse updateRoutingRule(UpdateRoutingRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRoutingRule);
    }

    /** 修改规则触发条件 应用服务器可调用此接口修改物联网平台中指定规则条件的配置参数。
     *
     * @param UpdateRoutingRuleRequest 请求对象
     * @return SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> */
    public SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse> updateRoutingRuleInvoker(
        UpdateRoutingRuleRequest request) {
        return new SyncInvoker<UpdateRoutingRuleRequest, UpdateRoutingRuleResponse>(request,
            IoTDAMeta.updateRoutingRule, hcClient);
    }

    /** 修改规则动作 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return UpdateRuleActionResponse */
    public UpdateRuleActionResponse updateRuleAction(UpdateRuleActionRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRuleAction);
    }

    /** 修改规则动作 应用服务器可调用此接口修改物联网平台中指定规则动作的配置。
     *
     * @param UpdateRuleActionRequest 请求对象
     * @return SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> */
    public SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse> updateRuleActionInvoker(
        UpdateRuleActionRequest request) {
        return new SyncInvoker<UpdateRuleActionRequest, UpdateRuleActionResponse>(request, IoTDAMeta.updateRuleAction,
            hcClient);
    }

    /** 修改规则状态 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return ChangeRuleStatusResponse */
    public ChangeRuleStatusResponse changeRuleStatus(ChangeRuleStatusRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.changeRuleStatus);
    }

    /** 修改规则状态 应用服务器可调用此接口修改物联网平台中指定规则的状态，激活或者去激活规则。
     *
     * @param ChangeRuleStatusRequest 请求对象
     * @return SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> */
    public SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse> changeRuleStatusInvoker(
        ChangeRuleStatusRequest request) {
        return new SyncInvoker<ChangeRuleStatusRequest, ChangeRuleStatusResponse>(request, IoTDAMeta.changeRuleStatus,
            hcClient);
    }

    /** 创建规则 应用服务器可调用此接口在物联网平台创建一条规则。
     *
     * @param CreateRuleRequest 请求对象
     * @return CreateRuleResponse */
    public CreateRuleResponse createRule(CreateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.createRule);
    }

    /** 创建规则 应用服务器可调用此接口在物联网平台创建一条规则。
     *
     * @param CreateRuleRequest 请求对象
     * @return SyncInvoker<CreateRuleRequest, CreateRuleResponse> */
    public SyncInvoker<CreateRuleRequest, CreateRuleResponse> createRuleInvoker(CreateRuleRequest request) {
        return new SyncInvoker<CreateRuleRequest, CreateRuleResponse>(request, IoTDAMeta.createRule, hcClient);
    }

    /** 删除规则 应用服务器可调用此接口删除物联网平台中的指定规则。
     *
     * @param DeleteRuleRequest 请求对象
     * @return DeleteRuleResponse */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.deleteRule);
    }

    /** 删除规则 应用服务器可调用此接口删除物联网平台中的指定规则。
     *
     * @param DeleteRuleRequest 请求对象
     * @return SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> */
    public SyncInvoker<DeleteRuleRequest, DeleteRuleResponse> deleteRuleInvoker(DeleteRuleRequest request) {
        return new SyncInvoker<DeleteRuleRequest, DeleteRuleResponse>(request, IoTDAMeta.deleteRule, hcClient);
    }

    /** 查询规则列表 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return ListRulesResponse */
    public ListRulesResponse listRules(ListRulesRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listRules);
    }

    /** 查询规则列表 应用服务器可调用此接口查询物联网平台中设置的规则列表。
     *
     * @param ListRulesRequest 请求对象
     * @return SyncInvoker<ListRulesRequest, ListRulesResponse> */
    public SyncInvoker<ListRulesRequest, ListRulesResponse> listRulesInvoker(ListRulesRequest request) {
        return new SyncInvoker<ListRulesRequest, ListRulesResponse>(request, IoTDAMeta.listRules, hcClient);
    }

    /** 查询规则 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     *
     * @param ShowRuleRequest 请求对象
     * @return ShowRuleResponse */
    public ShowRuleResponse showRule(ShowRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.showRule);
    }

    /** 查询规则 应用服务器可调用此接口查询物联网平台中指定规则的配置信息。
     *
     * @param ShowRuleRequest 请求对象
     * @return SyncInvoker<ShowRuleRequest, ShowRuleResponse> */
    public SyncInvoker<ShowRuleRequest, ShowRuleResponse> showRuleInvoker(ShowRuleRequest request) {
        return new SyncInvoker<ShowRuleRequest, ShowRuleResponse>(request, IoTDAMeta.showRule, hcClient);
    }

    /** 修改规则 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     *
     * @param UpdateRuleRequest 请求对象
     * @return UpdateRuleResponse */
    public UpdateRuleResponse updateRule(UpdateRuleRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.updateRule);
    }

    /** 修改规则 应用服务器可调用此接口修改物联网平台中指定规则的配置。
     *
     * @param UpdateRuleRequest 请求对象
     * @return SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> */
    public SyncInvoker<UpdateRuleRequest, UpdateRuleResponse> updateRuleInvoker(UpdateRuleRequest request) {
        return new SyncInvoker<UpdateRuleRequest, UpdateRuleResponse>(request, IoTDAMeta.updateRule, hcClient);
    }

    /** 按标签查询资源 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return ListResourcesByTagsResponse */
    public ListResourcesByTagsResponse listResourcesByTags(ListResourcesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.listResourcesByTags);
    }

    /** 按标签查询资源 应用服务器可调用此接口查询绑定了指定标签的资源。当前支持标签的资源有Device(设备)。
     *
     * @param ListResourcesByTagsRequest 请求对象
     * @return SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> */
    public SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse> listResourcesByTagsInvoker(
        ListResourcesByTagsRequest request) {
        return new SyncInvoker<ListResourcesByTagsRequest, ListResourcesByTagsResponse>(request,
            IoTDAMeta.listResourcesByTags, hcClient);
    }

    /** 绑定标签 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     *
     * @param TagDeviceRequest 请求对象
     * @return TagDeviceResponse */
    public TagDeviceResponse tagDevice(TagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.tagDevice);
    }

    /** 绑定标签 应用服务器可调用此接口为指定资源绑定标签。当前支持标签的资源有Device(设备)。
     *
     * @param TagDeviceRequest 请求对象
     * @return SyncInvoker<TagDeviceRequest, TagDeviceResponse> */
    public SyncInvoker<TagDeviceRequest, TagDeviceResponse> tagDeviceInvoker(TagDeviceRequest request) {
        return new SyncInvoker<TagDeviceRequest, TagDeviceResponse>(request, IoTDAMeta.tagDevice, hcClient);
    }

    /** 解绑标签 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     *
     * @param UntagDeviceRequest 请求对象
     * @return UntagDeviceResponse */
    public UntagDeviceResponse untagDevice(UntagDeviceRequest request) {
        return hcClient.syncInvokeHttp(request, IoTDAMeta.untagDevice);
    }

    /** 解绑标签 应用服务器可调用此接口为指定资源解绑标签。当前支持标签的资源有Device(设备)。
     *
     * @param UntagDeviceRequest 请求对象
     * @return SyncInvoker<UntagDeviceRequest, UntagDeviceResponse> */
    public SyncInvoker<UntagDeviceRequest, UntagDeviceResponse> untagDeviceInvoker(UntagDeviceRequest request) {
        return new SyncInvoker<UntagDeviceRequest, UntagDeviceResponse>(request, IoTDAMeta.untagDevice, hcClient);
    }

}
