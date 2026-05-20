def call() {

    sh """
        echo "Starting Kubernetes Deployment..."

        kubectl version --client

        kubectl apply -f k8s-Namespace.yaml
        kubectl apply -f k8s-ConfigMap.yaml
        kubectl apply -f k8s-Deployment.yaml
        kubectl apply -f k8s-Service.yaml
        kubectl apply -f k8s-Ingress.yaml
        kubectl apply -f k8s-hpa.yaml

        kubectl get all -n dev

        echo "All Kubernetes resources deployed successfully 🚀"
    """
}
