import { Component } from "@angular/core";
import { Amigo } from "./amigo";
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from "rxjs";

@Component({
    selector: 'app-amigo-list',
    templateUrl: './amigo-list.component.html'
})

export class AmigoListComponent {
    amigos: Amigo[] = [];
    amigosUrl: string = 'http://localhost:8080/amigo';
    
    constructor(private httpClient: HttpClient) {}

    ngOnInit(): void {
        this.retrieveAll().subscribe({
           next: amigos => this.amigos = amigos,
           error: err => console.log('Error', err) 
        });
    }

    retrieveAll(): Observable<Amigo[]> {
        return this.httpClient.get<Amigo[]>(this.amigosUrl);
    }

    retrieveById(id: number): Observable<Amigo> {
        return this.httpClient.get<Amigo>(`${this.amigosUrl}/${id}`);
    }
}