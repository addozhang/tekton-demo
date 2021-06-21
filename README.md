A simple Java project for tekton testing.


`http $(minikube ip):$(kubectl get svc tekton-test -o jsonpath="{.spec.ports[0].nodePort}")/hi`