package com.example.DevopsApp_CA;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {

        return """
        <!DOCTYPE html>
        <html>

        <head>

            <title>DevOps CI/CD Pipeline 2</title>

            <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;400;500;600&display=swap" rel="stylesheet">

            <style>

                *{
                    margin:0;
                    padding:0;
                    box-sizing:border-box;
                    scroll-behavior:smooth;
                }

                body{
                    font-family:'Poppins',sans-serif;
                    background:#f8fafc;
                    color:#0f172a;
                    overflow-x:hidden;
                }

                nav{
                    width:100%;
                    position:fixed;
                    top:0;
                    background:rgba(255,255,255,0.96);
                    border-bottom:1px solid #e2e8f0;
                    padding:16px 50px;
                    display:flex;
                    justify-content:space-between;
                    align-items:center;
                    z-index:1000;
                    backdrop-filter:blur(10px);
                }

                nav h2{
                    color:#2563eb;
                    font-size:24px;
                    font-weight:600;
                }

                nav ul{
                    display:flex;
                    list-style:none;
                    gap:24px;
                }

                nav ul li a{
                    color:#0f172a;
                    text-decoration:none;
                    font-size:14px;
                    transition:0.3s;
                }

                nav ul li a:hover{
                    color:#2563eb;
                }

                section{
                    padding:100px 10%;
                }

                .hero{
                    min-height:100vh;
                    display:flex;
                    flex-direction:column;
                    justify-content:center;
                    align-items:center;
                    text-align:center;
                }

                .hero h1{
                    font-size:52px;
                    margin-bottom:20px;
                    color:#2563eb;
                }

                .hero p{
                    font-size:16px;
                    max-width:850px;
                    line-height:1.9;
                    color:#475569;
                }

                .btn{
                    margin-top:30px;
                    padding:14px 32px;
                    background:#2563eb;
                    color:white;
                    border-radius:30px;
                    text-decoration:none;
                    font-size:15px;
                    transition:0.3s;
                }

                .btn:hover{
                    background:#1d4ed8;
                    transform:translateY(-3px);
                }

                .section-title{
                    text-align:center;
                    font-size:38px;
                    margin-bottom:50px;
                    color:#0f172a;
                }

                .cards{
                    display:grid;
                    grid-template-columns:repeat(auto-fit,minmax(260px,1fr));
                    gap:25px;
                }

                .card{
                    background:white;
                    padding:28px;
                    border-radius:18px;
                    border:1px solid #e2e8f0;
                    text-align:center;
                    transition:0.3s;
                    box-shadow:0 8px 25px rgba(15,23,42,0.06);
                }

                .card:hover{
                    transform:translateY(-8px);
                }

                .card img{
                    height:65px;
                    margin-bottom:18px;
                    transition:0.3s;
                }

                .card:hover img{
                    transform:scale(1.08);
                }

                .card h2{
                    margin-bottom:16px;
                    font-size:24px;
                }

                .card p{
                    color:#475569;
                    line-height:1.8;
                    font-size:14px;
                    text-align:justify;
                }

                .workflow{
                    text-align:center;
                }

                .flow{
                    display:flex;
                    justify-content:center;
                    align-items:center;
                    flex-wrap:wrap;
                    gap:16px;
                    margin-top:40px;
                }

                .step{
                    background:white;
                    border:1px solid #cbd5e1;
                    padding:14px 24px;
                    border-radius:12px;
                    font-size:15px;
                    transition:0.3s;
                    box-shadow:0 4px 15px rgba(15,23,42,0.05);
                }

                .step:hover{
                    background:#2563eb;
                    color:white;
                    transform:scale(1.05);
                }

                .arrow{
                    font-size:24px;
                    color:#2563eb;
                }

                table{
                    width:100%;
                    border-collapse:collapse;
                    margin-top:40px;
                    background:white;
                    border-radius:18px;
                    overflow:hidden;
                    border:1px solid #e2e8f0;
                    box-shadow:0 8px 25px rgba(15,23,42,0.05);
                }

                th{
                    background:#2563eb;
                    color:white;
                    padding:16px;
                    font-size:15px;
                }

                td{
                    padding:16px;
                    border-bottom:1px solid #e2e8f0;
                    color:#475569;
                    font-size:14px;
                    text-align:center;
                }

                tr:hover{
                    background:#f1f5f9;
                }

                .status-grid{
                    display:grid;
                    grid-template-columns:repeat(auto-fit,minmax(220px,1fr));
                    gap:22px;
                    margin-top:40px;
                }

                .status-card{
                    background:white;
                    padding:26px;
                    border-radius:18px;
                    border:1px solid #e2e8f0;
                    text-align:center;
                    box-shadow:0 8px 25px rgba(15,23,42,0.05);
                    transition:0.3s;
                }

                .status-card:hover{
                    transform:translateY(-6px);
                }

                .status-card h3{
                    margin-bottom:12px;
                    font-size:20px;
                }

                .active{
                    color:#16a34a;
                    font-size:18px;
                    font-weight:600;
                }

                .gallery-grid{
                    display:grid;
                    grid-template-columns:repeat(auto-fit,minmax(300px,1fr));
                    gap:28px;
                    margin-top:40px;
                }

                .gallery-card{
                    background:white;
                    border:1px solid #e2e8f0;
                    border-radius:18px;
                    overflow:hidden;
                    transition:0.4s;
                    box-shadow:0 8px 25px rgba(15,23,42,0.06);
                }

                .gallery-card:hover{
                    transform:translateY(-8px);
                }

                .gallery-card img{
                    width:100%;
                    height:220px;
                    object-fit:cover;
                    cursor:pointer;
                    transition:0.4s;
                }

                .gallery-card img:hover{
                    transform:scale(1.03);
                }

                .gallery-card p{
                    padding:18px;
                    text-align:center;
                    font-size:15px;
                    color:#334155;
                    font-weight:500;
                }

                .modal{
                    display:none;
                    position:fixed;
                    z-index:2000;
                    left:0;
                    top:0;
                    width:100%;
                    height:100%;
                    background:rgba(0,0,0,0.92);
                    overflow:auto;
                    padding-top:40px;
                }

                .modal-content{
                    display:block;
                    margin:auto;
                    max-width:90%;
                    max-height:90vh;
                    border-radius:14px;
                    animation:zoom 0.3s ease;
                }

                .close{
                    position:absolute;
                    top:20px;
                    right:40px;
                    color:white;
                    font-size:45px;
                    font-weight:bold;
                    cursor:pointer;
                }

                @keyframes zoom{
                    from{
                        transform:scale(0.7);
                        opacity:0;
                    }
                    to{
                        transform:scale(1);
                        opacity:1;
                    }
                }

                .visual-section{
                    text-align:center;
                    padding:90px 10%;
                    background:#ffffff;
                }

                .visual-container{
                    margin-top:40px;
                    background:white;
                    padding:30px;
                    border-radius:24px;
                    box-shadow:0 8px 25px rgba(15,23,42,0.08);
                    border:1px solid #e2e8f0;
                }

                .visual-container img{
                    width:50%;
                    max-width:500px;
                    border-radius:18px;
                    transition:0.4s;
                }

                .visual-container img:hover{
                    transform:scale(1.01);
                }

                .visual-text{
                    margin-top:20px;
                    color:#475569;
                    font-size:16px;
                    line-height:1.8;
                }

                .stats-grid{
    display:grid;
    grid-template-columns:repeat(auto-fit,minmax(220px,1fr));
    gap:25px;
    margin-top:50px;
}

.stat-box{
    background:white;
    padding:35px;
    border-radius:20px;
    text-align:center;
    border:1px solid #e2e8f0;
    box-shadow:0 8px 25px rgba(15,23,42,0.05);
}

.stat-box h1{
    font-size:42px;
    color:#2563eb;
    margin-bottom:10px;
}

.stat-box p{
    color:#475569;
    font-size:15px;
}

.card,
.status-card,
.gallery-card,
.visual-container,
.stat-box{
    animation:fadeUp 0.8s ease;
}

@keyframes fadeUp{
    from{
        opacity:0;
        transform:translateY(30px);
    }
    to{
        opacity:1;
        transform:translateY(0);
    }
}

                footer{
                    text-align:center;
                    padding:30px;
                    background:white;
                    border-top:1px solid #e2e8f0;
                    color:#64748b;
                    font-size:14px;
                }

            </style>

        </head>

        <body>

            <nav>

                <h2>DevOps CI/CD</h2>

                <ul>
                    <li><a href="#about">About</a></li>
                    <li><a href="#tools">Tools</a></li>
                    <li><a href="#workflow">Workflow</a></li>
                    <li><a href="#details">Details</a></li>
                    <li><a href="#status">Status</a></li>
                    <li><a href="#gallery">Gallery</a></li>
                </ul>

            </nav>

            <section class="hero" id="about">

                <h1>DevOps CI/CD Pipeline Automation</h1>

                <p>
                    This project demonstrates a fully automated Continuous Integration
                    and Continuous Deployment pipeline using GitHub, Jenkins,
                    Maven, Docker, and Spring Boot.
                </p>

                <div style="
margin-top:25px;
display:flex;
gap:14px;
flex-wrap:wrap;
justify-content:center;
">

<span style="background:#dbeafe;color:#2563eb;padding:10px 18px;border-radius:30px;font-size:14px;">
Spring Boot
</span>

<span style="background:#dcfce7;color:#16a34a;padding:10px 18px;border-radius:30px;font-size:14px;">
Jenkins
</span>

<span style="background:#fef3c7;color:#d97706;padding:10px 18px;border-radius:30px;font-size:14px;">
Docker
</span>

<span style="background:#ede9fe;color:#7c3aed;padding:10px 18px;border-radius:30px;font-size:14px;">
GitHub
</span>

<span style="background:#fee2e2;color:#dc2626;padding:10px 18px;border-radius:30px;font-size:14px;">
Maven
</span>

</div>

                <a href="#gallery" class="btn">View Project Gallery</a>

            </section>

            <section id="tools">

                <h1 class="section-title">Technology Stack</h1>

                <div class="cards">

                    <div class="card">
                        <img src="https://cdn-icons-png.flaticon.com/512/25/25231.png">
                        <h2>GitHub</h2>
                        <p>
                            GitHub manages source code, tracks changes,
                            and automatically triggers Jenkins pipelines.
                        </p>
                    </div>

                    <div class="card">
                        <img src="https://upload.wikimedia.org/wikipedia/commons/5/52/Apache_Maven_logo.svg">
                        <h2>Maven</h2>
                        <p>
                            Maven automates dependency management,
                            project compilation and packaging.
                        </p>
                    </div>

                    <div class="card">
                        <img src="https://cdn.worldvectorlogo.com/logos/docker.svg">
                        <h2>Docker</h2>
                        <p>
                            Docker containerizes the application
                            for consistent deployment.
                        </p>
                    </div>

                    <div class="card">
                        <img src="https://cdn.worldvectorlogo.com/logos/jenkins-1.svg">
                        <h2>Jenkins</h2>
                        <p>
                            Jenkins automates CI/CD workflows,
                            builds and deployment pipelines.
                        </p>
                    </div>

                </div>

            </section>

            <section class="visual-section">

                <h1 class="section-title">CI/CD Pipeline Visualization</h1>

                <div class="visual-container">

                    <img src="images/pipeline.png">

                    <p class="visual-text">
                        This visualization demonstrates the complete CI/CD automation flow
                        integrating GitHub, Jenkins, Docker, and deployment environments.
                        The pipeline automates build, testing, packaging, containerization,
                        and deployment processes.
                    </p>

                </div>

            </section>

            <section class="workflow" id="workflow">

                <h1 class="section-title">CI/CD Workflow</h1>

                <div class="flow">

                    <div class="step">GitHub Push</div>
                    <div class="arrow">→</div>

                    <div class="step">Webhook Trigger</div>
                    <div class="arrow">→</div>

                    <div class="step">Jenkins Build</div>
                    <div class="arrow">→</div>

                    <div class="step">Maven Package</div>
                    <div class="arrow">→</div>

                    <div class="step">Docker Build</div>
                    <div class="arrow">→</div>

                    <div class="step">Deployment</div>

                </div>

            </section>

            <section class="visual-section">

                <h1 class="section-title">Deployment Workflow Architecture</h1>

                <div class="visual-container">

                    <img src="images/workflow.png">

                    <p class="visual-text">
                        The deployment workflow illustrates how GitHub source code changes
                        automatically trigger Jenkins builds, Docker image creation,
                        registry push operations, and container deployment using a
                        fully automated DevOps pipeline.
                    </p>

                </div>

            </section>

            <section>

    <h1 class="section-title">Project Overview</h1>

    <div class="card" style="max-width:1100px;margin:auto;">

        <p style="font-size:16px;line-height:2;text-align:center;">

            This project implements a complete DevOps CI/CD pipeline
            using Spring Boot, Jenkins, Docker, Maven, GitHub Webhooks,
            ngrok tunneling, and Vagrant Ubuntu virtual machines.

            The pipeline automates source integration, build processes,
            containerization, deployment workflows, and continuous delivery
            using Jenkins automation and Docker containers.

        </p>

    </div>

</section>

            <section>

    <h1 class="section-title">Pipeline Stages</h1>

    <div class="cards">

        <div class="card">
            <h2>1. Source Stage</h2>
            <p>
                Developers push source code to GitHub repository,
                automatically triggering Jenkins CI/CD workflows.
            </p>
        </div>

        <div class="card">
            <h2>2. Build Stage</h2>
            <p>
                Maven compiles the Spring Boot application
                and generates deployable artifacts.
            </p>
        </div>

        <div class="card">
            <h2>3. Docker Stage</h2>
            <p>
                Docker containerizes the application
                ensuring portability and consistency.
            </p>
        </div>

        <div class="card">
            <h2>4. Deployment Stage</h2>
            <p>
                Jenkins deploys the Docker container
                automatically to the target environment.
            </p>
        </div>

    </div>

</section>
            <section id="details">

                <h1 class="section-title">Project Details</h1>

                <table>

                    <tr>
                        <th>Component</th>
                        <th>Description</th>
                        <th>Status</th>
                    </tr>

                    <tr>
                        <td>Version Control</td>
                        <td>GitHub Repository Integration</td>
                        <td>Configured</td>
                    </tr>

                    <tr>
                        <td>Build Automation</td>
                        <td>Maven Build Lifecycle</td>
                        <td>Successful</td>
                    </tr>

                    <tr>
                        <td>CI/CD Server</td>
                        <td>Jenkins Automation Pipeline</td>
                        <td>Active</td>
                    </tr>

                    <tr>
                        <td>Containerization</td>
                        <td>Docker Image Deployment</td>
                        <td>Running</td>
                    </tr>

                </table>

            </section>

            <section>

    <h1 class="section-title">Project Statistics</h1>

    <div class="stats-grid">

        <div class="stat-box">
            <h1>100%</h1>
            <p>Pipeline Automation</p>
        </div>

        <div class="stat-box">
            <h1>55+</h1>
            <p>Project Screenshots</p>
        </div>

        <div class="stat-box">
            <h1>24/7</h1>
            <p>Deployment Availability</p>
        </div>

        <div class="stat-box">
            <h1>6+</h1>
            <p>Integrated Technologies</p>
        </div>

    </div>

</section>

            <section id="status">

                <h1 class="section-title">Deployment Status</h1>

                <div class="status-grid">

                    <div class="status-card">
                        <h3>Application Status</h3>
                        <p class="active">RUNNING</p>
                    </div>

                    <div class="status-card">
                        <h3>Pipeline Status</h3>
                        <p class="active">SUCCESS</p>
                    </div>

                    <div class="status-card">
                        <h3>Docker Container</h3>
                        <p class="active">ACTIVE</p>
                    </div>

                    <div class="status-card">
                        <h3>Webhook Status</h3>
                        <p class="active">CONNECTED</p>
                    </div>

                </div>

            </section>

            <section>

    <h1 class="section-title">Deployment Console</h1>

    <div style="
        max-width:1100px;
        margin:auto;
        background:#0f172a;
        border-radius:24px;
        overflow:hidden;
        box-shadow:0 10px 30px rgba(15,23,42,0.25);
        border:1px solid #1e293b;
    ">

        <div style="
            background:#1e293b;
            padding:14px 20px;
            display:flex;
            align-items:center;
            gap:10px;
        ">

            <div style="
                width:14px;
                height:14px;
                background:#ef4444;
                border-radius:50%;
            "></div>

            <div style="
                width:14px;
                height:14px;
                background:#f59e0b;
                border-radius:50%;
            "></div>

            <div style="
                width:14px;
                height:14px;
                background:#22c55e;
                border-radius:50%;
            "></div>

            <span style="
                color:#cbd5e1;
                margin-left:12px;
                font-size:14px;
                font-family:monospace;
            ">
                deployment-terminal.sh
            </span>

        </div>

        <div style="
    padding:35px;
    color:#22c55e;
    font-family:monospace;
    line-height:2.2;
    font-size:15px;
    overflow-x:auto;
">

<p><span style="color:#38bdf8;">$</span> git push origin main</p>

<p><span style="color:#94a3b8;">➜ Enumerating objects: 18, done.</span></p>

<p><span style="color:#94a3b8;">➜ GitHub Webhook Triggered Successfully...</span></p>

<p><span style="color:#38bdf8;">$</span> Jenkins Pipeline Started</p>

<p><span style="color:#eab308;">➜ [Pipeline] Build Stage Initiated...</span></p>

<p><span style="color:#38bdf8;">$</span> mvn clean package</p>

<p><span style="color:#22c55e;">➜ BUILD SUCCESS</span></p>

<p><span style="color:#38bdf8;">$</span> docker build -t devops-app .</p>

<p><span style="color:#22c55e;">➜ Docker Image Built Successfully</span></p>

<p><span style="color:#38bdf8;">$</span> docker push komal/devops-app</p>

<p><span style="color:#22c55e;">➜ Image Pushed To Docker Hub</span></p>

<p><span style="color:#38bdf8;">$</span> docker run -d -p 8080:8080 devops-app</p>

<p><span style="color:#22c55e;">➜ Container Deployment Successful</span></p>

<p><span style="color:#14b8a6;">➜ Application Running On http://localhost:8080</span></p>

<span class="cursor">█</span>

</div>

</section>

            <section id="gallery">

                <h1 class="section-title">Project Gallery</h1>

                <div class="gallery-grid">

                    <div class="gallery-card">
                        <img src="images/img1.png" onclick="openImage(this.src)">
                        <p>Screenshot 1</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img2.png" onclick="openImage(this.src)">
                        <p>Screenshot 2</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img3.png" onclick="openImage(this.src)">
                        <p>Screenshot 3</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img4.png" onclick="openImage(this.src)">
                        <p>Screenshot 4</p>
                    </div>
                    
                    <div class="gallery-card">
                        <img src="images/img5.png" onclick="openImage(this.src)">
                        <p>Screenshot 5</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img6.png" onclick="openImage(this.src)">
                        <p>Screenshot 6</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img7.png" onclick="openImage(this.src)">
                        <p>Screenshot 7</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img8.png" onclick="openImage(this.src)">
                        <p>Screenshot 8</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img9.png" onclick="openImage(this.src)">
                        <p>Screenshot 9</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img10.png" onclick="openImage(this.src)">
                        <p>Screenshot 10</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img11.png" onclick="openImage(this.src)">
                        <p>Screenshot 11</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img12.png" onclick="openImage(this.src)">
                        <p>Screenshot 12</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img13.png" onclick="openImage(this.src)">
                        <p>Screenshot 13</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img14.png" onclick="openImage(this.src)">
                        <p>Screenshot 14</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img15.png" onclick="openImage(this.src)">
                        <p>Screenshot 15</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img16.png" onclick="openImage(this.src)">
                        <p>Screenshot 16</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img17.png" onclick="openImage(this.src)">
                        <p>Screenshot 17</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img18.png" onclick="openImage(this.src)">
                        <p>Screenshot 18</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img19.png" onclick="openImage(this.src)">
                        <p>Screenshot 19</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img20.png" onclick="openImage(this.src)">
                        <p>Screenshot 20</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img21.png" onclick="openImage(this.src)">
                        <p>Screenshot 21</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img22.png" onclick="openImage(this.src)">
                        <p>Screenshot 22</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img23.png" onclick="openImage(this.src)">
                        <p>Screenshot 23</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img24.png" onclick="openImage(this.src)">
                        <p>Screenshot 24</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img25.png" onclick="openImage(this.src)">
                        <p>Screenshot 25</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img26.png" onclick="openImage(this.src)">
                        <p>Screenshot 26</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img27.png" onclick="openImage(this.src)">
                        <p>Screenshot 27</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img28.png" onclick="openImage(this.src)">
                        <p>Screenshot 28</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img29.png" onclick="openImage(this.src)">
                        <p>Screenshot 29</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img30.png" onclick="openImage(this.src)">
                        <p>Screenshot 30</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img31.png" onclick="openImage(this.src)">
                        <p>Screenshot 31</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img32.png" onclick="openImage(this.src)">
                        <p>Screenshot 32</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img33.png" onclick="openImage(this.src)">
                        <p>Screenshot 33</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img34.png" onclick="openImage(this.src)">
                        <p>Screenshot 34</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img35.png" onclick="openImage(this.src)">
                        <p>Screenshot 35</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img36.png" onclick="openImage(this.src)">
                        <p>Screenshot 36</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img37.png" onclick="openImage(this.src)">
                        <p>Screenshot 37</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img38.png" onclick="openImage(this.src)">
                        <p>Screenshot 38</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img39.png" onclick="openImage(this.src)">
                        <p>Screenshot 39</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img40.png" onclick="openImage(this.src)">
                        <p>Screenshot 40</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img41.png" onclick="openImage(this.src)">
                        <p>Screenshot 41</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img42.png" onclick="openImage(this.src)">
                        <p>Screenshot 42</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img43.png" onclick="openImage(this.src)">
                        <p>Screenshot 43</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img44.png" onclick="openImage(this.src)">
                        <p>Screenshot 44</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img45.png" onclick="openImage(this.src)">
                        <p>Screenshot 45</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img46.png" onclick="openImage(this.src)">
                        <p>Screenshot 46</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img47.png" onclick="openImage(this.src)">
                        <p>Screenshot 47</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img48.png" onclick="openImage(this.src)">
                        <p>Screenshot 48</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img49.png" onclick="openImage(this.src)">
                        <p>Screenshot 49</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img50.png" onclick="openImage(this.src)">
                        <p>Screenshot 50</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img51.png" onclick="openImage(this.src)">
                        <p>Screenshot 51</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img52.png" onclick="openImage(this.src)">
                        <p>Screenshot 52</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img53.png" onclick="openImage(this.src)">
                        <p>Screenshot 53</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img54.png" onclick="openImage(this.src)">
                        <p>Screenshot 54</p>
                    </div>

                    <div class="gallery-card">
                        <img src="images/img55.png" onclick="openImage(this.src)">
                        <p>Screenshot 55</p>
                    </div>
                </div>

            </section>

            <div id="imageModal" class="modal">

                <span class="close" onclick="closeImage()">&times;</span>

                <img class="modal-content" id="fullImage">

            </div>

            <footer>

                Developed by Komal Joshi | DevOps CI/CD Pipeline Project

            </footer>

            <script>

                function openImage(src){
                    document.getElementById("imageModal").style.display = "block";
                    document.getElementById("fullImage").src = src;
                }

                function closeImage(){
                    document.getElementById("imageModal").style.display = "none";
                }

            </script>

        </body>

        </html>
        """;
    }

    @GetMapping("/health")
    public String health() {
        return "APPLICATION UP";
    }

    @GetMapping("/version")
    public String version() {
        return "Version 2.0.0";
    }
}