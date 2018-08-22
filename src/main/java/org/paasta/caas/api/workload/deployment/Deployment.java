package org.paasta.caas.api.workload.deployment;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import org.paasta.caas.api.common.model.CommonMetaData;
import org.paasta.caas.api.workload.deployment.support.DeploymentSpec;
import org.paasta.caas.api.workload.deployment.support.DeploymentStatus;

/**
 * Deployment Model 클래스
 *
 * @author Hyungu Cho
 * @version 1.0
 * @since 2018.08.13
 */
@Data
public class Deployment {
    private String resultCode;

    private CommonMetaData metadata;
    private DeploymentSpec spec;
    private DeploymentStatus status;

//    private String kind;
//    private String apiVersion;
}
