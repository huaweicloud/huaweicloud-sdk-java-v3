package com.huaweicloud.sdk.mrs.v1;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.mrs.v1.model.*;

public class MrsClient {
    protected HcClient hcClient;

    public MrsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<MrsClient> newBuilder() {
        return new ClientBuilder<>(MrsClient::new);
    }


    /**
     * 创建集群并执行作业
     * 创建一个MRS集群，并在集群中提交一个作业。该接口不兼容Sahara。 支持同一时间并发创建10个集群。 使用接口前，您需要先获取如[表1](mrs_02_0028.xml#mrs_02_0028__tbbd2986d18874f82a8ab886ac25a57f8)所示的资源信息。 约束说明： 1.针对MRS 1.8.0以前的版本，仅当“safe_mode”配置为“1”时需要配置cluster_admin_secret。 针对MRS 1.8.0及以后版本，cluster_admin_secret为必选参数，不受参数“safe_mode”配置的影响。 2.集群登录方式有密码和密钥对两种，两者必选其一。 使用密码方式需要配置访问集群节点的root密码，即cluster_master_secret。 使用密钥对方式需要配置密钥对名称，即node_public_cert_name 3.磁盘参数可以使用volume_type和volume_size表示，也可以使用多磁盘相关的参数（master_data_volume_type、master_data_volume_size、master_data_volume_count、core_data_volume_type、core_data_volume_size和core_data_volume_count）表示。  
     *
     * @param CreateClusterRequest 请求对象
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createCluster(CreateClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.createCluster);
    }

    /**
     * 删除集群
     * 数据完成处理分析后或者集群运行异常无法提供服务时可删除集群服务。该接口兼容Sahara。  处于如下状态的集群不允许删除： scaling-out：扩容中 scaling-in：缩容中 starting：启动中 terminating：删除中 terminated：已删除 failed：失败
     *
     * @param DeleteClusterRequest 请求对象
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) {
        return hcClient.syncInvokeHttp(request, MrsMeta.deleteCluster);
    }

}